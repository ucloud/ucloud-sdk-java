package cn.ucloud.common.http;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.BaseResponseResult;
import cn.ucloud.common.pojo.UcloudConfig;
import cn.ucloud.common.util.ParamConstructor;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: UcloudHttp实现类
 * @author: codezhang
 * @date: 2018-09-14 11:53
 **/

public class UcloudHttpImpl implements UcloudHttp {


    private Class<? extends BaseResponseResult> resultClass;

    public UcloudHttpImpl(Class<? extends BaseResponseResult> resultClass) {
        this.resultClass = resultClass;
    }

    private static Logger logger = LoggerFactory.getLogger(UcloudHttpImpl.class.getName());

    @Override
    public Object doGet(BaseRequestParam param,
                        UcloudConfig config,
                        UcloudHandler handler,
                        Boolean... asyncFlag) throws Exception {
        BaseResponseResult result = null;
        try {
            String httpGetParamString = ParamConstructor.getHttpGetParamString(param, config.getAccount());
            final HttpGet get = new HttpGet(config.getApiServerAddr() + "?" + httpGetParamString);
            Http http = new Http(resultClass);
            result = http.doHttp(get, handler, async(asyncFlag));
        } catch (Exception e) {
            handlerException(handler, e, async(asyncFlag));
        }
        return result;
    }

    @Override
    public Object doPost(BaseRequestParam param, UcloudConfig config,
                         UcloudHandler handler, Boolean... asyncFlag) throws Exception {
        BaseResponseResult result = null;
        try {
            String httpPostParamString = ParamConstructor.getHttpPostParamString(param, config.getAccount());
            HttpPost post = new HttpPost(config.getApiServerAddr());
            //application/json
            post.setHeader("Content-Type", "application/json; charset=utf-8");
            //post
            StringEntity entity = new StringEntity(httpPostParamString);
            entity.setContentEncoding("UTF-8");
            post.setEntity(entity);
            Http http = new Http(resultClass);
            result = http.doHttp(post, handler, async(asyncFlag));
        } catch (Exception e) {
            handlerException(handler, e, async(asyncFlag));
        }
        return result;
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

    private Boolean async(Boolean... asyncFlag) {
        Boolean async = null;
        if (asyncFlag != null && asyncFlag.length > 0) {
            async = asyncFlag[0];
        }
        return async;
    }

//    @Override
//    public Object doGet(BaseRequestParam param, UcloudConfig config, final UcloudHandler handler,
//                        Boolean... asyncFlag) throws Exception {
//        Object result = null;
//        try {
//            // 创建http GET请求
//            String httpGetParamString = ParamConstructor.getHttpGetParamString(param, config.getAccount());
//            final HttpGet httpGet = new HttpGet(config.getApiServerAddr() + "?" + httpGetParamString);
//            result = preHttp(httpGet, handler, asyncFlag);
//        } catch (Exception e) {
//            if (handler == null) {
//                throw e;
//            } else {
//                handler.error(e);
//            }
//        }
//        return result;
//    }
//
//
//    @Override
//    public Object doPost(BaseRequestParam param, UcloudConfig config, UcloudHandler handler, Boolean... asyncFlag)
//            throws Exception {
//        Object result = null;
//        try {
//            // 创建http POST请求
//            String httpPostParamString = ParamConstructor.getHttpPostParamString(param, config.getAccount());
//            final HttpPost httpPost = new HttpPost(config.getApiServerAddr());
//            //application/json
//            httpPost.setHeader("Content-Type", "application/json; charset=utf-8");
//            //设置参数
//            StringEntity entity = new StringEntity(httpPostParamString);
//            entity.setContentEncoding("UTF-8");
//            httpPost.setEntity(entity);
//            result = preHttp(httpPost, handler, asyncFlag);
//        } catch (Exception e) {
//            if (handler == null) {
//                throw e;
//            } else {
//                handler.error(e);
//            }
//        }
//        return result;
//    }
//
//    private Object preHttp(HttpUriRequest request, UcloudHandler handler, Boolean... asyncFlag) throws Exception {
//        //result 对象
//        Object responseResult = null;
//        if (handler != null) {
//            if (isSync(asyncFlag)) {
//                // 同步回调
//                doHttp(request, handler);
//            } else {
//                // 异步回调
//                Thread thread = new Thread() {
//                    @Override
//                    public void run() {
//                        try {
//                            doHttp(request, handler);
//                        } catch (Exception e) {
//                            logger.error(e.getMessage());
//                        }
//                    }
//                };
//                thread.start();
//            }
//        } else {
//            // 同步
//            responseResult = doHttp(request, null);
//        }
//        return responseResult;
//    }
//
//    private BaseResponseResult doHttp(HttpUriRequest request, UcloudHandler handler) throws Exception {
//        CloseableHttpResponse response = null;
//        BaseResponseResult responseResult = null;
//        // 创建Httpclient对象
//        final CloseableHttpClient client = HttpClients.createDefault();
//        try {
//            request.addHeader("User-Agent", "Java/1.8.0_191 Java-SDK/0.8.2.3-release");
//            // 执行http get请求
//            logger.info("request line:{}",request.getRequestLine());
//            response = client.execute(request);
//            if (response != null) {
//                // 正常响应
//                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
//                logger.info("response content:{}",content);
//                if (statusOK(response)) {
//                    Gson gson = new Gson();
//                    responseResult = gson.fromJson(content, resultClass);
//                    responseResult.setResponseContent(content);
//                    if (handler != null) {
//                        handleResult(handler, responseResult);
//                    }
//                } else {
//                    // 非200则认为是个异常
//                    if (handler != null) {
//                        handler.error(new HttpException(content));
//                    } else {
//                        throw new HttpException(content);
//                    }
//                }
//            } else {
//                handleException(handler, new NullPointerException("response is null"));
//            }
//        } catch (Exception e) {
//            if (handler != null) {
//                //异常
//                handler.error(e);
//            } else {
//                throw e;
//            }
//        } finally {
//            try {
//                if (response != null) {
//                    response.close();
//                }
//            } catch (IOException e) {
//                logger.error(e.getMessage());
//            }
//            try {
//                client.close();
//            } catch (IOException e) {
//                logger.error(e.getMessage());
//            }
//        }
//        return responseResult;
//    }
//
//    private boolean isSync(Boolean[] asyncFlag) {
//        return asyncFlag != null && asyncFlag.length > 0 && asyncFlag[0] != null && !asyncFlag[0];
//    }
//
//
//    private void handleException(UcloudHandler handler, Exception e) {
//        if (handler != null) {
//            handler.error(e);
//        }
//    }
//
//    private void handleResult(UcloudHandler handler, BaseResponseResult responseResult) {
//        if (handler != null) {
//            if (isSuccess(responseResult)) {
//                handler.success(responseResult);
//            } else {
//                handler.failed(responseResult);
//            }
//        }
//    }
//
//    private boolean isSuccess(BaseResponseResult responseResult) {
//        boolean success = false;
//        if (responseResult != null) {
//            success = responseResult.getRetCode() == 0;
//        }
//        return success;
//    }
//
//
//    private boolean statusOK(CloseableHttpResponse response) {
//        boolean ok = false;
//        if (response != null) {
//            ok = response.getStatusLine().getStatusCode() == 200;
//        }
//        return ok;
//    }



}
