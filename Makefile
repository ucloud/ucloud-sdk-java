# build：制品构建脚本
# test-cov：单元测试覆盖率基线
# fmt：格式化

JAVA_FILES=$$(find ./ -name "*.java")

build:
	mvn clean package -DskipTests=true

fmt:
	java -jar ./cache/google-java-format-1.7-all-deps.jar --aosp -r ${JAVA_FILES}

lint:
	@echo ""

test-cov:
	mvn test

dev:
	mkdir -p cache
	curl -sLo ./cache/google-java-format-1.7-all-deps.jar https://github.com/google/google-java-format/releases/download/google-java-format-1.7/google-java-format-1.7-all-deps.jar

install:
	mvn clean install -DskipTests=true
