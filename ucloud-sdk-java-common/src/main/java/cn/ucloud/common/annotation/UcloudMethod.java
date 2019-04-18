package cn.ucloud.common.annotation;


import cn.ucloud.common.http.HttpContentType;
import cn.ucloud.common.http.HttpMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 17:45
 **/

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UcloudMethod {
    HttpMethod method() default HttpMethod.GET;
    HttpContentType contentType() default HttpContentType.APPLICATION_URL_ENCODED;
}
