JAVA_FILES=$$(find ./ -name "*.java")

.PHONY: help
help:
	@echo "build 制品构建脚"
	@echo "test-cov 单元测试覆盖率基线"
	@echo "fmt 格式化"

.PHONY: build
build:
	mvn clean package -DskipTests=true

.PHONY: fmt
fmt:
	google-java-format --aosp -r ${JAVA_FILES}

# CI 语法闸。只保两件事，都由 mvn compile 一次覆盖全部产品 module：
#   G1 生成的代码能被编译 —— 编译不过直接失败。
#   G2 生成的代码没有重复项 —— 重复方法、重复 <module> 都是编译期错误，天然被抓住。
# 已知缺口（如实记录，不要以为这条闸是全的）：
#   重复的 <dependency> 在 maven 里只有 WARNING、不会让构建失败，本 target 对它无闸。
#   要补需引入 maven-enforcer-plugin 的 banDuplicatePomDependencyVersions，
#   经评估后决定不引入，故该缺口保留。
.PHONY: ci-syntax
ci-syntax:
	mvn -B -DskipTests compile

# 警告：当前是空壳，exit 0 但什么都没检查，不要把它的通过当成风格已过检。
# 填实需要先跑一次全仓 google-java-format（见 fmt），是个独立的大 diff，不在 CI 改造范围内。
.PHONY: lint
lint:
	echo "skipped"

.PHONY: test-cov
test-cov:
	mvn test

.PHONY: dev
dev:
	mkdir -p cache
	curl -sLo ./cache/google-java-format-1.7-all-deps.jar https://github.com/google/google-java-format/releases/download/google-java-format-1.7/google-java-format-1.7-all-deps.jar

.PHONY: install
install:
	mvn clean install -DskipTests=true
