

# 错误处理

了解如何处理不同类型的 SDK 异常，包括参数错误，RetCode 不为 0 的业务异常等。

```java
try {
    response = client.invoke(request, Response.class);
} catch (ValidatorException e) {
    System.out.println(e.getMessage());
} catch (RetCodeException e) {
    System.out.println(e.getRetCode());
} catch (UCloudException e) {
    e.printStackTrace();
}
```
