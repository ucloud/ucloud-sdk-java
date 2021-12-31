

# 通用配置

了解如何配置 SDK，如日志、重试、服务访问端点（公有云、专有云）等。

## 配置项清单

| 配置            | 类型 | 描述                                                         |
| --------------- | ---- | ------------------------------------------------------------ |
| **region**      | String  | （必填）服务所在地域，可参考 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) |
| **projectId**  | String  | （选填）项目的唯一标识，用于组织资源，大多数资源都需要 ProjectId，如果是主账号或财务账号，默认值为默认 ProjectId，如果是子账号非财务账号，则该字段必须填写。 |
| **baseUrl**    | String  |  (选填) API 服务的访问端点，默认是 https://api.ucloud.cn                            |
| **userAgent**  | String  | （选填）UserAgent 是 SDK 客户端特有的属性，用于区分使用 SDK 的版本。User-Agent 的定义请参考 [MDN](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/User-Agent)。用户自定义的 UserAgent 将追加到 SDK 版本号的末尾。例如， “MyAPP/0.10.1” -> “PHP/8.0.6 PHP-SDK/0.1.0 MyAPP/0.10.1” |
| **timeout**     | Integer  | （选填）请求超时时间，默认 30s                               |
| **maxRetries** | Integer  | （选填）最大重试次数. 默认重试 3 次。设置该值大于 0 将对网络和服务可用性问题进行自动重试，使用指数退避的重试间隔，并自动跳过资源创建类的接口。 |
| **logger**   | org.slf4j.Logger  | （选填）自定义 Logger，可参考 [SLF4J](https://www.slf4j.org/) SLF4J 的定义                |

## 进阶配置选项

### 访问专有云/渠道云或其它网关

```java
Config config = new Config();
config.setRegion("cn-bj2"); // 设置专有云地域
config.setBaseUrl("foo.api.ucloud.cn"); // 设置专有云网关地址
```
