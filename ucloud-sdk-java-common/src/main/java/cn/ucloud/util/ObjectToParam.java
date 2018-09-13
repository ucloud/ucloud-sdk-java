package cn.ucloud.util;

import cn.ucloud.annotation.UcloudParam;
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
     * @param object 参数对象
     * @return 参数数组
     * @throws Exception  可能是NullPointerException或者ValidatorException
     */
    public static List<Param> objectToParams(Object object) throws Exception {
        List<Param> params = new ArrayList<>();
        if (object != null) {
            // 参数校验
            ParamValidator.validator(object);
            // 参数转化
            Class<?> objectClass = object.getClass();
            Field[] declaredFields = objectClass.getDeclaredFields();
            int len = declaredFields.length;
            for (int i = 0; i < len; i++) {
                try {
                    UcloudParam annotation = declaredFields[i].getAnnotation(UcloudParam.class);
                    if (annotation != null){
                        declaredFields[i].setAccessible(true);
                        Object value = declaredFields[i].get(object);
                        if (value != null){
                            Param param = new Param(annotation.value(),value);
                            params.add(param);
                        }
                    }
                } catch (Exception e) {}
            }
        } else {
            throw new NullPointerException("param object can not be null");
        }
        return params;
    }

}
