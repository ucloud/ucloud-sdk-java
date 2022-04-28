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
