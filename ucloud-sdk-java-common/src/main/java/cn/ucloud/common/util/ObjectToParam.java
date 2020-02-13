package cn.ucloud.common.util;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 参数对象转param
 * @author: codezhang
 * @date: 2018-09-13 12:58
 **/

public class ObjectToParam {

    /**
     * 参数对象转param数组
     *
     * @param baseRequestParam 参数对象
     * @return 参数数组
     * @throws Exception 可能是NullPointerException或者ValidatorException
     */
    public static List<Param> objectToParams(BaseRequestParam baseRequestParam) throws Exception {
        List<Param> params = new ArrayList<>();
        if (baseRequestParam != null) {
            Class<?> objectClass = baseRequestParam.getClass();
            params.addAll(getFieldParam(objectClass, baseRequestParam));
            params.addAll(getMethodParam(objectClass, baseRequestParam));

            Class<?> superclass = objectClass.getSuperclass();
            while (!Object.class.getName().equals(superclass.getName())){
                params.addAll(getFieldParam(superclass, baseRequestParam));
                params.addAll(getMethodParam(superclass, baseRequestParam));
                superclass = superclass.getSuperclass();
            }
        } else {
            throw new NullPointerException("param object can not be null");
        }
        return params;
    }


    /**
     * 根据类对象 获取属性参数
     *
     * @param clazz            类对象的class
     * @param baseRequestParam 类对象
     * @return 属性参数列表
     * @throws Exception 不满足要求的参数  抛出异常
     */
    private static List<Param> getFieldParam(Class clazz, BaseRequestParam baseRequestParam) throws Exception {
        List<Param> list = new ArrayList<>();
        if (clazz != null) {
            Field[] declaredFields = clazz.getDeclaredFields();
            int len = clazz.getDeclaredFields().length;
            for (int i = 0; i < len; i++) {
                UcloudParam annotation = declaredFields[i].getAnnotation(UcloudParam.class);
                if (annotation != null) {
                    declaredFields[i].setAccessible(true);
                    Object value = declaredFields[i].get(baseRequestParam);
                    if (value != null) {
                        Param param = new Param(annotation.value(), value);
                        list.add(param);
                    }
                }
            }
        }
        return list;
    }


    /**
     * 根据类对象 获取方法参数
     *
     * @param clazz            类对象的class
     * @param baseRequestParam 类对象
     * @return 方法参数列表
     * @throws Exception 对不满足要求的参数  抛出异常
     */
    private static List<Param> getMethodParam(Class clazz, BaseRequestParam baseRequestParam) throws Exception {
        List<Param> list = new ArrayList<>();
        if (clazz != null) {
            Method[] declaredMethods = clazz.getDeclaredMethods();
            int len = declaredMethods.length;
            for (int i = 0; i < len; i++) {
                UcloudParam annotation = declaredMethods[i].getAnnotation(UcloudParam.class);
                if (annotation != null) {
                    declaredMethods[i].setAccessible(true);
                    Object invoke = declaredMethods[i].invoke(baseRequestParam);
                    if (invoke instanceof List) {
                        List<Param> params = (List<Param>) invoke;
                        list.addAll(params);
                    }
                }
            }
        }
        return list;
    }
}
