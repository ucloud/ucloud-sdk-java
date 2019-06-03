package cn.ucloud.common.http;

import cn.ucloud.common.exception.HttpException;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 23:13
 **/
public class Http {

    private Class<? extends BaseResponseResult> resultClass;

    public Http(Class<? extends BaseResponseResult> resultClass) {
        this.resultClass = resultClass;
    }

    private static Logger logger = LoggerFactory.getLogger(Http.class);

    public BaseResponseResult doHttp(HttpUriRequest request, UcloudHandler handler, Boolean async) throws Exception {
        CloseableHttpResponse response = null;
        BaseResponseResult responseResult = null;
        // 创建HttpClient对象
        final CloseableHttpClient client = HttpClients.createDefault();
        request.addHeader("User-Agent", "Java/1.8.0_191 Java-SDK/0.8.2.3-release");
        // 执行http get请求
        String requestJson = new Gson().toJson(request);
        logger.info("request :{}", requestJson);
        try {
            response = client.execute(request);
            if (response != null) {
                // 正常响应
                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
                logger.info("response content:{}", content);
                if (statusOK(response)) {
                    Gson gson = new Gson();
                    responseResult = gson.fromJson(content, resultClass);
                    responseResult.setResponseContent(content);
                    if (handler != null) {
                        handlerResult(handler, responseResult);
                    }
                } else {
                    // 非200则认为是个异常
                    handlerException(handler, new HttpException(content), async);
                }
            } else {
                handlerException(handler, new NullPointerException("response is null"), async);
            }
        } catch (Exception e) {
            handlerException(handler, e, async);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                logger.error("response close error:{}", e.getMessage());
            }
            try {
                client.close();
            } catch (IOException e) {
                logger.error("httpClient close error:{}", e.getMessage());
            }
        }
        return responseResult;
    }

    private void handlerResult(UcloudHandler handler, BaseResponseResult result) {
        if (result.getRetCode() != 0) {
            handler.failed(result);
        } else {
            handler.success(result);
        }
    }

    private boolean statusOK(CloseableHttpResponse response) {
        boolean ok = false;
        if (response != null) {
            ok = response.getStatusLine().getStatusCode() == 200;
        }
        return ok;
    }

    private void handlerException(UcloudHandler handler, Exception e, Boolean async) throws Exception {
        if (handler == null) {
            if (async != null) {
                logger.error("handler is null and async is not null,but get an error:{}", e.getMessage());
            } else {
                throw e;
            }
        } else {
            handler.error(e);
        }
    }
}
