package cn.ucloud.common.http;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.BaseResponseResult;
import cn.ucloud.common.pojo.BaseRestRequestParam;
import cn.ucloud.common.pojo.UcloudConfig;
import cn.ucloud.common.util.RestParamConstructor;
import com.google.gson.Gson;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 17:41
 **/
public class UcloudRestHttpImpl implements UcloudRestHttp {

    private Class<? extends BaseResponseResult> resultClass;

    public UcloudRestHttpImpl(Class<? extends BaseResponseResult> resultClass) {
        this.resultClass = resultClass;
    }

    private static Logger logger = LoggerFactory.getLogger(UcloudRestHttpImpl.class.getName());

    @Override
    public Object doGet(BaseRestRequestParam param, UcloudConfig config, String restURL,
                        UcloudHandler handler, Boolean... asyncFlag) throws Exception {
        BaseResponseResult result = null;
        try {
            RestParamConstructor constructor = new RestParamConstructor(config.getAccount(), param);
            Header[] headers = (Header[]) constructor.getHeaders().toArray();
            String restHttpURLParamString = constructor.getRestHttpURLParamString();
            HttpGet get = new HttpGet(String.format("%s?%s", restURL, restHttpURLParamString));
            get.setHeaders(headers);
            Http http = new Http(resultClass);
            result = http.doHttp(get, handler, async(asyncFlag));
        } catch (Exception e) {
            handlerException(handler, e, async(asyncFlag));
        }
        return result;
    }

    @Override
    public Object doPost(BaseRestRequestParam param, UcloudConfig config, String restURL,
                         UcloudHandler handler, Boolean... asyncFlag) throws Exception {
        BaseResponseResult result = null;
        try {
            HttpPost post = new HttpPost(restURL);
            RestParamConstructor constructor = new RestParamConstructor(config.getAccount(), param);
            List<Header> headerList = constructor.getHeaders();
            Header[] headers = new Header[headerList.size()];
            headers = headerList.toArray(headers);
            HttpEntity entity = constructor.getEntity();
            post.setEntity(entity);
            post.setHeaders(headers);
            logger.info("post:{}",new Gson().toJson(post));
            Http http = new Http(resultClass);
            result = http.doHttp(post, handler, async(asyncFlag));
        } catch (Exception e) {
            handlerException(handler, e, async(asyncFlag));
        }
        return result;
    }

    private Boolean async(Boolean... asyncFlag) {
        Boolean async = false;
        if (asyncFlag != null && asyncFlag.length > 0) {
            async = asyncFlag[0];
        }
        return async;
    }

    private void handlerException(UcloudHandler handler, Exception e, Boolean async) throws Exception {
        if (handler == null) {
            if (async) {
                logger.error("handler is null and async is true,but get an error:{}", e.getMessage());
            } else {
                throw e;
            }
        } else {
            handler.error(e);
        }
    }

}
