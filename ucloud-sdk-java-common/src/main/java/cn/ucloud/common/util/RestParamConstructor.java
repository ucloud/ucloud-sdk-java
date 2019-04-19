package cn.ucloud.common.util;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.pojo.BaseRestRequestParam;
import cn.ucloud.common.pojo.Param;
import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 19:12
 **/
public class RestParamConstructor {

    private HttpEntity entity;

    private String restHttpURLParamString;

    private List<Header> headers;

    private List<Param> pathParams;

    private Account account;

    private BaseRestRequestParam baseRestRequestParam;

    private RestParamAnalyzer analyzer;

    private String signature;

    private static final Logger logger = LoggerFactory.getLogger(RestParamConstructor.class);

    public RestParamConstructor(Account account, BaseRestRequestParam baseRestRequestParam) throws Exception {
        this.account = account;
        this.baseRestRequestParam = baseRestRequestParam;
        baseRestRequestParam.setPublicKey(account.getPublicKey());
        analyzer = new RestParamAnalyzer(baseRestRequestParam);
        this.headers = analyzer.getHeaders();
        this.pathParams = analyzer.getPathParams();
//        logger.info("body params:{}", new Gson().toJson(analyzer.getBodyParams()));
//        logger.info("path params:{}", new Gson().toJson(analyzer.getPathParams()));
//        logger.info("url params:{}", new Gson().toJson(analyzer.getUrlParams()));
//        logger.info("signature params:{}", new Gson().toJson(analyzer.getSignatureParams()));
//        logger.info("headers:{}", new Gson().toJson(headers));
        switch (analyzer.getMethod()) {
            case POST:
            case PUT:
                buildRestHttpBodyParam();
                break;
            case GET:
            case DELETE:
                buildRestHttpURLParam();
                break;
        }
        buildHeaders();
    }

    public String getRestHttpURLParamString() {
        return restHttpURLParamString;
    }

    public HttpEntity getEntity() {
        return entity;
    }

    public List<Header> getHeaders() {
        return headers;
    }

    public List<Param> getPathParams() {
        return pathParams;
    }

    private void buildRestHttpURLParam() throws Exception {
        // 获取签名字符串
        signature = Signature.getSignature(analyzer.getSignatureParams(), account);
        // 设置签名 到参数对象
        baseRestRequestParam.setSignature(signature);
        // 参数校验
        ParamValidator.validator(baseRestRequestParam);
        // url编码
        Signature.urlEncodeParams(analyzer.getUrlParams());
        baseRestRequestParam.setSignature(signature);
        // 构造url参数
        StringBuilder builder = new StringBuilder();
        for (Param param : analyzer.getUrlParams()) {
            if (StringUtils.isBlank(param.getParamKey())) {
                continue;
            }
            builder.append(param.getParamKey() + "=" + param.getParamValue() + "&");
        }
        // 设置签名
        builder.append("Signature" + "=" + signature);
        restHttpURLParamString = builder.toString();
    }

    private void buildHeaders() {
        headers.add(new BasicHeader("Signature", signature));
        //headers.add(new BasicHeader("PublicKey", account.getPublicKey()));
    }

    private void buildRestHttpBodyParam() throws Exception {
        // 获取签名字符串
        signature = Signature.getSignature(analyzer.getSignatureParams(), account);
        // 设置签名 到参数对象
        baseRestRequestParam.setSignature(signature);
        // 参数校验
        ParamValidator.validator(baseRestRequestParam);
        // url编码
        // Signature.urlEncodeParams(analyzer.getBodyParams());

        switch (analyzer.getContentType()) {
            case APPLICATION_URL_ENCODED: {
                buildURLEncodedFormData();
                break;
            }
            case MULTIPART_FORM_DATA: {
                buildMultiPartFormData();
                break;
            }
            case APPLICATION_JSON: {
                buildJSONFormData();
                break;
            }
        }
    }

    private void buildURLEncodedFormData() {
        List<BasicNameValuePair> pairs = new ArrayList<>();
        if (analyzer.getBodyParams() != null) {
            for (Param param : analyzer.getBodyParams()) {
                BasicNameValuePair pair = new BasicNameValuePair(param.getParamKey(),
                        param.getParamValue().toString());
                pairs.add(pair);
            }
        }
        entity = new UrlEncodedFormEntity(pairs, Charset.forName("UTF-8"));
    }

    private void buildJSONFormData() {
        String json = new Gson().toJson(baseRestRequestParam);
        entity = new StringEntity(json, "utf-8");
    }


    private void buildMultiPartFormData() {
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setCharset(Charset.forName("UTF-8"));
        // 添加参数
        if (analyzer.getBodyParams() != null) {
            for (Param param : analyzer.getBodyParams()) {
                if (param.getParamValue() == null) {
                    continue;
                }
                if (param.getParamValue() instanceof File) {
                    builder.addBinaryBody(param.getParamKey(), (File) param.getParamValue());
                } else {
                    builder.addTextBody(param.getParamKey(),
                            param.getParamValue().toString());
                }
            }
        }
        // 设置签名
        builder.addTextBody("Signature", signature);
        builder.addTextBody("PublicKey", account.getPublicKey());
        entity = builder.build();
    }


}
