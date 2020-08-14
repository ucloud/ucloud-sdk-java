package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 14:10
 */
public class CacheConf {
    /**
     * 状态码模式，非200，206状态码，多个状态码用竖线(|)分隔，该属性仅仅在状态码缓存配置列表中返回
     */
    @SerializedName("HttpCodePattern")
    private String httpCodePattern;

    /**
     * 路径模式，支持正则
     */
    @SerializedName("PathPattern")
    private String pathPattern;

    /**
     * 缓存规则描述
     */
    @SerializedName("Description")
    private String description;

    /**
     * 缓存时间
     */
    @SerializedName("CacheTTL")
    private Integer cacheTTL;

    /**
     * 缓存时间的单位。sec（秒），min（分钟），hour（小时），day（天）。上限1年
     */
    @SerializedName("CacheUnit")
    private String cacheUnit;

    /**
     * 是否缓存，true为缓存，flase为不缓存。为flase的情况下，CacheTTL和CacheUnit强制不生效
     */
    @SerializedName("CacheBehavior")
    private Boolean cacheBehavior;

    /**
     * 是否优先遵循源站头部缓存策略，0为不优先遵循源站，1为优先遵循源站缓存头部。默认为0
     */
    @SerializedName("FollowOriginRule")
    private Boolean followOriginRule;

    public String getHttpCodePattern() {
        return httpCodePattern;
    }

    public void setHttpCodePattern(String httpCodePattern) {
        this.httpCodePattern = httpCodePattern;
    }

    public String getPathPattern() {
        return pathPattern;
    }

    public void setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCacheTTL() {
        return cacheTTL;
    }

    public void setCacheTTL(Integer cacheTTL) {
        this.cacheTTL = cacheTTL;
    }

    public String getCacheUnit() {
        return cacheUnit;
    }

    public void setCacheUnit(String cacheUnit) {
        this.cacheUnit = cacheUnit;
    }

    public Boolean getCacheBehavior() {
        return cacheBehavior;
    }

    public void setCacheBehavior(Boolean cacheBehavior) {
        this.cacheBehavior = cacheBehavior;
    }

    public Boolean getFollowOriginRule() {
        return followOriginRule;
    }

    public void setFollowOriginRule(Boolean followOriginRule) {
        this.followOriginRule = followOriginRule;
    }
}
