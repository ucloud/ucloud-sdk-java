package cn.ucloud.util;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.Param;

import java.lang.reflect.Field;
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
     * @param baseRequestParam 参数对象
     * @return 参数数组
     * @throws Exception  可能是NullPointerException或者ValidatorException
     */
    public static List<Param> objectToParams(BaseRequestParam baseRequestParam) throws Exception {
        List<Param> params = new ArrayList<>();
        if (baseRequestParam != null) {
            // 参数校验
            ParamValidator.validator(baseRequestParam);
            // 参数转化
            Class<?> objectClass = baseRequestParam.getClass();
            Class<?> superclass = objectClass.getSuperclass();
            if (superclass != null){
                params.addAll(getParam(superclass,baseRequestParam));
            }
            params.addAll(getParam(objectClass,baseRequestParam));
            // 参数编码
            Signature.urlEncodeParams(params);
        } else {
            throw new NullPointerException("param object can not be null");
        }
        return params;
    }


    /**
     * 根据类对象 获取参数
     * @param clazz 类对象的class
     * @param baseRequestParam  类对象
     * @return 参数
     */
    private static List<Param> getParam(Class clazz,BaseRequestParam baseRequestParam){
        List<Param> list = new ArrayList<>();
        if (clazz != null){
            Field[] declaredFields = clazz.getDeclaredFields();
            int len = clazz.getDeclaredFields().length;
            for (int i = 0; i < len; i++) {
                try {
                    UcloudParam annotation = declaredFields[i].getAnnotation(UcloudParam.class);
                    if (annotation != null){
                        declaredFields[i].setAccessible(true);
                        Object value = declaredFields[i].get(baseRequestParam);
                        if (value != null){
                            Param param = new Param(annotation.value(),value);
                            list.add(param);
                        }
                    }
                } catch (Exception e) {}
            }
        }
        return list;
    }

}
