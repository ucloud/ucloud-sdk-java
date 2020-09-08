package cn.ucloud.common.http;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.BaseResponseResult;
import cn.ucloud.common.pojo.UcloudConfig;
import cn.ucloud.common.util.ParamConstructor;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

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
            Http http = new Http(resultClass,config.isEnableLog());
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
            post.setHeader(HTTP.CONTENT_TYPE, "application/json");
            //post
            StringEntity entity = new StringEntity(httpPostParamString, StandardCharsets.UTF_8);
            entity.setContentType("application/json");
            post.setEntity(entity);
            Http http = new Http(resultClass,config.isEnableLog());
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
}
