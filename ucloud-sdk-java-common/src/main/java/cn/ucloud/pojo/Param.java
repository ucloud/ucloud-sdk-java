package cn.ucloud.pojo;

/**
 * @description: 参数
 * @author: codezhang
 * @date: 2018-09-12 18:55
 **/

public class Param {
    private String ParamKey;
    private Object ParamValue;

    public Param(String paramKey, Object paramValue) {
        ParamKey = paramKey;
        ParamValue = paramValue;
    }

    public String getParamKey() {
        return ParamKey;
    }

    public void setParamKey(String paramKey) {
        ParamKey = paramKey;
    }

    public Object getParamValue() {
        return ParamValue;
    }

    public void setParamValue(Object paramValue) {
        ParamValue = paramValue;
    }
}
