# 快速开始

## 安装

使用 `maven` 安装（推荐），配置 `pom.xml`:

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<project
    xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
>
    <parent>
        <artifactId>ucloud-sdk-java</artifactId>
        <groupId>cn.ucloud</groupId>
        <version>1.0.0-SNAPSHOT</version>
    </parent>

    <modelVersion>4.0.0</modelVersion>
    <artifactId>ucloud-sdk-example-uhost</artifactId>
    <version>0.1.0</version>

    <dependencies>
        <dependency>
            <groupId>cn.ucloud</groupId>
            <artifactId>ucloud-sdk-java-uhost</artifactId>
            <version>1.0.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
</project>
```

## 初次使用

目前，SDK 使用 PublicKey/PrivateKey 作为唯一的鉴权方式，该公私钥可以从以下途径获取：

- [账号密钥管理](https://console.ucloud.cn/uaccount/api_manage)

下面提供一个简单的示例（详细的示例可以在 `examples/uhost` 中获取）：

之后编辑源码：

```java
package cn.ucloud.example;

import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uhost.client.UHostClient;
import cn.ucloud.uhost.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Config config = new Config();
        config.setRegion("cn-bj2");

        config.setLogger(logger);
        Credential credential = new Credential(
                System.getenv("UCLOUD_PUBLIC_KEY"),
                System.getenv("UCLOUD_PRIVATE_KEY")
        );
        UHostClient client = new UHostClient(config, credential);

        CreateUHostInstanceRequest createUHostInstanceRequest = new CreateUHostInstanceRequest();
        createUHostInstanceRequest.setName("sdk-java-example");
        createUHostInstanceRequest.setZone("cn-bj2-05");
        createUHostInstanceRequest.setImageId("uimage-xxx");
        createUHostInstanceRequest.setLoginMode("Password");
        createUHostInstanceRequest.setPassword(
                Base64.getEncoder().encodeToString("UCloud1234!".getBytes(StandardCharsets.UTF_8)));
        createUHostInstanceRequest.setCPU(1);
        createUHostInstanceRequest.setMemory(1024);

        List<CreateUHostInstanceRequest.Disks> disks = new ArrayList<>();
        CreateUHostInstanceRequest.Disks disk = new CreateUHostInstanceRequest.Disks();
        disk.setSize(40);
        disk.setType("CLOUD_SSD");
        disk.setIsBoot("True");
        createUHostInstanceRequest.setDisks(disks);

        CreateUHostInstanceResponse createUHostInstanceResponse = null;
        try {
            createUHostInstanceResponse = client.createUHostInstance(createUHostInstanceRequest);
        } catch (UCloudException e) {
            e.printStackTrace();
            return;
        }
        System.out.println(createUHostInstanceResponse.getUHostIds());
    }
}
```

将上述代码中 client 相关配置，以及主机的 image id 等，替换成自己的配置，即可创建一台云主机。

在该示例中，使用 SDK 完成了一个创建云主机的请求。至此，已经涵盖了 SDK 的基本核心用法，可以构建自己的脚本啦！

SDK 中的每一个 api 调用都有详细的注释文档，
可以通过 Editor/IDE 跳转到具体的方法中查看（也可以 [查看接口文档](https://docs.ucloud.cn/api/summary/README) ），
并根据 IDE 自动补全和报错信息继续探索 SDK 的用法。

如果需要了解这段代码提及但未完全覆盖的使用技巧，请参考：

- [通用配置](configure.md)，了解如何配置 SDK，如日志、重试、服务访问端点（公有云、专有云）等
- [错误处理](error.md)，了解如何处理不同类型的 SDK 异常，包括参数错误，RetCode 不为 0 的业务异常等
- [请求中间件](middleware.md)，了解如何拦截 SDK 发起的请求，并统一添加额外的逻辑。
- [泛化调用](generic.md)，如何调用 SDK 尚未支持的 API（不建议使用此类 API，因为没有兼容性保证）

## 获取更多示例

### 基于场景的示例

SDK 提供了部分基于场景的示例，并提供了对应的资源销毁逻辑，可以点击以下链接查看源码：

- [创建云主机](../examples/uhost)
