package cn.ucloud.common.annotation;

import cn.ucloud.common.http.ParamLocation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 17:45
 **/

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UcloudRestParam {
    String name();

    ParamLocation location() default ParamLocation.URL;

    boolean signature() default false;
}
