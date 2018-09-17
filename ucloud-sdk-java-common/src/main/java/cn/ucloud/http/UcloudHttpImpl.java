package cn.ucloud.http;

import cn.ucloud.exception.HttpException;
import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.UcloudConfig;
import cn.ucloud.util.ParamConstructor;
import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @description: UcloudHttp实现类
 * @author: codezhang
 * @date: 2018-09-14 11:53
 **/

public class UcloudHttpImpl implements UcloudHttp {

    @Override
    public Object doGet(BaseRequestParam param, UcloudConfig config, final UcloudHandler handler,final BaseResponseResult result, Boolean... asyncFlag) throws Exception {
        // 创建Httpclient对象
        final CloseableHttpClient client = HttpClients.createDefault();
        // 创建http GET请求
        String httpGetParamString = ParamConstructor.getHttpGetParamString(param, config.getAccount());
        final HttpGet httpGet = new HttpGet(config.getApiServerAddr() + "?" + httpGetParamString);

        // response对象
        CloseableHttpResponse responseSync = null;
        //result 对象
        BaseResponseResult responseResult = null;
        try {
            if (handler != null) {
                // 回调
                Thread thread = new Thread() {
                    @Override
                    public void run() {
                        CloseableHttpResponse responseAsync = null;
                        try {
                            // 执行http get请求
                            responseAsync = client.execute(httpGet);
                            // 正常响应
                            String content = EntityUtils.toString(responseAsync.getEntity(), "UTF-8");
                            if (responseAsync.getStatusLine().getStatusCode() == 200) {
                                Gson gson = new Gson();
                                BaseResponseResult responseResult = gson.fromJson(content, result.getClass());
                                if (responseResult.getRetCode() == 0) {
                                    handler.success(responseResult);
                                } else {
                                    handler.failed(responseResult);
                                }
                            } else {
                                handler.error(new HttpException(content));
                            }
                        } catch (Exception e) {
                            //异常
                            handler.error(e);
                        }finally {
                            try {
                                responseAsync.close();
                                client.close();
                            }catch (Exception e){

                            }
                        }
                    }
                };
                if (asyncFlag.length > 0 && asyncFlag[0] != null && !asyncFlag[0]) {
                    // 同步回调
                    thread.run();
                } else {
                    // 异步回调
                    thread.start();
                }
            } else {
                // 同步非回调
                responseSync = client.execute(httpGet);
                String content = EntityUtils.toString(responseSync.getEntity(), "UTF-8");
                if (responseSync.getStatusLine().getStatusCode() == 200) {
                    // 正常响应
                    Gson gson = new Gson();
                    responseResult  = gson.fromJson(content, result.getClass());
                }else {
                    // 非200则认为是个异常
                    throw new HttpException(content);
                }
            }
        } finally {
            try{
                responseSync.close();
                client.close();
            }catch (Exception e){}
        }
        return responseResult;
    }
}
