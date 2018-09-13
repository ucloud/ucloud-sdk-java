package cn.ucloud.pojo;

/**
 * @description: 参数
 * @author: codezhang
 * @date: 2018-09-12 18:55
 **/

public class Param {
    private String paramKey;
    private Object paramValue;

    public Param(String paramKey, Object paramValue) {
        this.paramKey = paramKey;
        this.paramValue = paramValue;
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public Object getParamValue() {
        return paramValue;
    }

    public void setParamValue(Object paramValue) {
        this.paramValue = paramValue;
    }
}
