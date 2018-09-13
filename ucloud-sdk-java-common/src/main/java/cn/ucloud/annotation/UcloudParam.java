package cn.ucloud.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description: 属性和参数映射注解
 * @author: codezhang
 * @date: 2018-09-13 13:28
 **/


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UcloudParam {
    String value();
}
