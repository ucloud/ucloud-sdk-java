#!/usr/bin/env bash
# ci-syntax 的编译闸：mvn -B -DskipTests compile，仅在「依赖解析失败」时重试。
#
# ── 为什么需要这个包装 ────────────────────────────────────────────────────────
# 2026-08-21 的 codegen PR #180，ci-syntax 红了，原因不是代码：
#     Unresolveable build extension: Plugin org.sonatype.central:
#     central-publishing-maven-plugin:0.8.0 or one of its dependencies could not be resolved
#     Failed to read artifact descriptor for ...:jar:0.8.0
# 是 Maven 没能从中央仓库拉到那个插件。它在 pom 里带 <extensions>true</extensions>，
# Maven 即使只跑 compile 也必须在「读取项目」阶段先解析它——所以一次网络抖动
# 就能打断一个纯编译的闸门。同期 7 个 codegen PR 里坏了这一个。
#
# 门禁红的代价不只是要人重跑：codegen PR 的自动合并要求 mergeable_state == clean，
# 一次抖动会让那一轮发布退回人工，并发一条「自动合并受阻」告警——为一个瞬时故障。
#
# ── 为什么不是加 -Dmaven.wagon.http.retryHandler.count ───────────────────────
# 那个参数**在这里是空转的**。Maven 3.9 起默认传输实现是 maven-resolver 的
# HttpTransporter，不是 wagon；实测 `mvn -X` 输出里是
#     [DEBUG] Using transporter HttpTransporter with priority 5.0
# wagon 的参数根本不会被读到。native transport 有自己的
# aether.connector.http.retryHandler.count（默认已开启重试），而 #180 仍然失败，
# 说明那次不是一个可重试的 HTTP 条件。所以只能在命令这一层重试。
#
# ── 判据：只对解析类失败重试，编译错误立刻失败 ───────────────────────────────
# 无差别重试会让一个真实的编译错误跑三遍（本仓 50 个 module，每遍一两分钟），
# 把最该快速反馈的那种失败拖慢三倍。故只在输出命中解析类失败特征时才重试。

set -uo pipefail

ATTEMPTS=3
BACKOFF=(10 30)          # 第 1、2 次失败后各等多久
LOG="$(mktemp -t mvn-compile.XXXXXX)"
trap 'rm -f "$LOG"' EXIT

# 解析类失败的特征。这些都是「拿不到构件」而非「代码不对」，重试有意义。
RESOLUTION_ERRORS='Unresolveable build extension|Failed to read artifact descriptor|Could not resolve dependencies|Could not transfer artifact|Non-resolvable parent POM|Could not find artifact|Connection reset|Connection timed out|Read timed out'

for i in $(seq 1 "$ATTEMPTS"); do
	# tee 保证日志照常输出到 CI 界面，同时留一份供判据匹配。
	# 用 PIPESTATUS 取 mvn 自己的退出码——管道默认给的是 tee 的。
	mvn -B -DskipTests compile 2>&1 | tee "$LOG"
	code="${PIPESTATUS[0]}"

	if [ "$code" -eq 0 ]; then
		[ "$i" -gt 1 ] && echo "==> 第 $i 次尝试成功（前 $((i - 1)) 次为依赖解析失败）"
		exit 0
	fi

	if ! grep -qE "$RESOLUTION_ERRORS" "$LOG"; then
		echo "==> 编译失败（非依赖解析问题），不重试。退出码 $code" >&2
		exit "$code"
	fi

	if [ "$i" -eq "$ATTEMPTS" ]; then
		echo "==> 依赖解析连续失败 $ATTEMPTS 次，判定为真实故障而非抖动。退出码 $code" >&2
		exit "$code"
	fi

	wait_s="${BACKOFF[$((i - 1))]}"
	echo "==> 第 $i 次失败于依赖解析，${wait_s}s 后重试（共 $ATTEMPTS 次）" >&2
	sleep "$wait_s"
done
