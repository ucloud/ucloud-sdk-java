# 请求中间件

了解如何拦截 SDK 发起的请求，并统一添加额外的逻辑。

UCloud SDK 为请求提供了请求中间件的特性。

该特性允许在 请求/响应 的生命周期中添加自定义的逻辑。

以下是一个日志中间件的示例：

```java
package cn.ucloud.common.middlewares;

import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.common.middleware.BaseMiddleware;
import cn.ucloud.common.middleware.Context;
import cn.ucloud.common.middleware.Middleware;
import cn.ucloud.common.request.Request;
import cn.ucloud.common.response.Response;
import com.google.gson.Gson;
import org.slf4j.Logger;

public class LogMiddleware extends BaseMiddleware implements Middleware {

    @Override
    public Request handleRequest(Context context) throws UCloudException {
        Logger logger = context.getConfig().getLogger();
        logger.info(new Gson().toJson(context.getRequest().encode()));
        return super.handleRequest(context);
    }

    @Override
    public Response handleResponse(Context context) throws UCloudException {
        Logger logger = context.getConfig().getLogger();
        logger.info(String.format(
                "[%s] %s", context.getResponse().getRequestId(),
                new Gson().toJson(context.getResponse())
        ));
        return super.handleResponse(context);
    }

    @Override
    public void handleException(Context context) throws UCloudException {
        Logger logger = context.getConfig().getLogger();
        logger.error(new Gson().toJson(context.getException().getMessage()));
        super.handleException(context);
    }
}
```
