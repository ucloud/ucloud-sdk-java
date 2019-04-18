package cn.ucloud.common.util;

import cn.ucloud.common.annotation.UcloudMethod;
import cn.ucloud.common.annotation.UcloudRestParam;
import cn.ucloud.common.http.HttpContentType;
import cn.ucloud.common.http.HttpMethod;
import cn.ucloud.common.http.ParamLocation;
import cn.ucloud.common.pojo.BaseRestRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 18:07
 **/
public class RestParamAnalyzer {

    private BaseRestRequestParam baseRestRequestParam;

    private List<Header> headers;

    private List<Param> pathParams;

    private List<Param> bodyParams;

    private List<Param> urlParams;

    private List<Param> signatureParams;

    private HttpMethod method;

    private HttpContentType contentType;

    public RestParamAnalyzer(BaseRestRequestParam baseRestRequestParam) throws Exception {
        this.baseRestRequestParam = baseRestRequestParam;
        analyzeParam();
    }

    private void analyzeParam() throws Exception {
        if (baseRestRequestParam == null) {
            return;
        }
        Class<? extends BaseRestRequestParam> clazz = baseRestRequestParam.getClass();
        UcloudMethod clazzAnnotation = clazz.getAnnotation(UcloudMethod.class);
        if (clazzAnnotation == null) {
            method = HttpMethod.GET;
        } else {
            method = clazzAnnotation.method();
            contentType = clazzAnnotation.contentType();
        }
        switch (method) {
            case GET:
            case DELETE:
                urlParams = new ArrayList<>();
                break;
            case PUT:
            case POST:
                bodyParams = new ArrayList<>();
                break;
        }
        headers = new ArrayList<>();
        pathParams = new ArrayList<>();
        signatureParams = new ArrayList<>();
        analyzeFieldParam(baseRestRequestParam.getClass(),baseRestRequestParam);
        analyzeFieldParam(baseRestRequestParam.getClass().getSuperclass(),baseRestRequestParam);
        analyzeMethodParam(baseRestRequestParam.getClass(),baseRestRequestParam);
        analyzeMethodParam(baseRestRequestParam.getClass().getSuperclass(),baseRestRequestParam);
    }

    private void analyzeFieldParam(Class clazz,BaseRestRequestParam baseRestRequestParam) throws Exception {
        if (clazz == null){
            return;
        }
        Field[] declaredFields = clazz.getDeclaredFields();
        int len = declaredFields.length;
        for (int i = 0; i < len; i++) {
            UcloudRestParam annotation = declaredFields[i].getAnnotation(UcloudRestParam.class);
            if (annotation == null) {
                continue;
            }
            declaredFields[i].setAccessible(true);
            Object value = declaredFields[i].get(baseRestRequestParam);
            String name = annotation.name();
            ParamLocation location = annotation.location();
            boolean signature = annotation.signature();
            List<Param> params = new ArrayList<>();
            if (value instanceof List) {
                for (Object obj : (List) value) {
                    params.add(new Param(name, obj));
                }
            } else {
                params.add(new Param(name, value));
            }
            switch (location) {
                case URL: {
                    if (urlParams != null) {
                        urlParams.addAll(params);
                    }
                    break;
                }
                case BODY: {
                    if (bodyParams != null) {
                        bodyParams.addAll(params);
                    }
                    break;
                }
                case PATH: {
                    if (pathParams != null) {
                        pathParams.addAll(params);
                    }
                    break;
                }
                case HEADER: {
                    if (headers != null && value != null) {
                        headers.add(new BasicHeader(name, value.toString()));
                    }
                    break;
                }
            }
            if (signature) {
                if (signatureParams != null) {
                    signatureParams.addAll(params);
                }
            }
        }
    }

    private void analyzeMethodParam(Class clazz,BaseRestRequestParam baseRestRequestParam) throws Exception {
        if (clazz == null){
            return;
        }
        Method[] declaredMethods = clazz.getDeclaredMethods();
        int len = declaredMethods.length;
        for (int i = 0; i < len; i++) {
            UcloudRestParam annotation = declaredMethods[i].getAnnotation(UcloudRestParam.class);
            if (annotation != null) {
                declaredMethods[i].setAccessible(true);
                Object invokeValue = declaredMethods[i].invoke(baseRestRequestParam);
                ParamLocation location = annotation.location();
                boolean signature = annotation.signature();
                if (invokeValue instanceof List) {
                    List<Param> params = (List<Param>) invokeValue;
                    switch (location) {
                        case URL: {
                            if (urlParams != null) {
                                urlParams.addAll(params);
                            }
                            break;
                        }
                        case BODY: {
                            if (bodyParams != null) {
                                bodyParams.addAll(params);
                            }
                            break;
                        }
                        case PATH: {
                            if (pathParams != null) {
                                pathParams.addAll(params);
                            }
                            break;
                        }
                        case HEADER: {
                            if (headers != null) {
                                for (Param param : params) {
                                    if (param.getParamValue() == null){
                                        continue;
                                    }
                                    headers.add(new BasicHeader(param.getParamKey(),
                                            param.getParamValue().toString()));
                                }
                            }
                            break;
                        }
                    }
                    if (signature) {
                        if (signatureParams != null) {
                            signatureParams.addAll(params);
                        }
                    }
                }
            }
        }
    }

    public List<Header> getHeaders() {
        return headers;
    }

    public List<Param> getPathParams() {
        return pathParams;
    }

    public List<Param> getBodyParams() {
        return bodyParams;
    }

    public List<Param> getUrlParams() {
        return urlParams;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public List<Param> getSignatureParams() {
        return signatureParams;
    }

    public HttpContentType getContentType() {
        return contentType;
    }
}
