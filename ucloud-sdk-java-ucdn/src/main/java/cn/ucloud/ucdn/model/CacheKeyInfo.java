package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/12 11:44
 */
public class CacheKeyInfo {
    /**
     * 是否忽略
     */
    @SerializedName("Ignore")
    private Boolean ignore;

    /**
     * 路径模式，支持正则
     */
    @SerializedName("PathPattern")
    private String pathPattern;

    /**
     * 自定义变量,以$符号开头，多个变量用加号(+)连接，$querystring表示所有变量
     */
    @SerializedName("QueryString")
    private String queryString;

    public Boolean getIgnore() {
        return ignore;
    }

    public void setIgnore(Boolean ignore) {
        this.ignore = ignore;
    }

    public String getPathPattern() {
        return pathPattern;
    }

    public void setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }
}
