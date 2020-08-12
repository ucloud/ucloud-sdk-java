package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/12 11:43
 */
public class CacheAllConfig {
    /**
     * 缓存Host，不同的域名可以配置为同一个CacheHost来实现缓存共享，默认为加速域名
     */
    @SerializedName("CacheHost")
    private String cacheHost;

    /**
     * 缓存配置列表，参见{@link CacheConf}
     */
    @SerializedName("CacheList")
    private List<CacheConf> cacheList;

    /**
     * 状态码缓存配置列表，参见{@link CacheConf}
     */
    @SerializedName("HttpCodeCacheList")
    private List<CacheConf> httpCodeCacheList;

    /**
     * 忽略参数缓存配置列表，参见{@link CacheKeyInfo}
     */
    @SerializedName("CacheKeyList")
    private List<CacheKeyInfo> cacheKeyList;

    public String getCacheHost() {
        return cacheHost;
    }

    public void setCacheHost(String cacheHost) {
        this.cacheHost = cacheHost;
    }

    public List<CacheConf> getCacheList() {
        return cacheList;
    }

    public void setCacheList(List<CacheConf> cacheList) {
        this.cacheList = cacheList;
    }

    public List<CacheConf> getHttpCodeCacheList() {
        return httpCodeCacheList;
    }

    public void setHttpCodeCacheList(List<CacheConf> httpCodeCacheList) {
        this.httpCodeCacheList = httpCodeCacheList;
    }

    public List<CacheKeyInfo> getCacheKeyList() {
        return cacheKeyList;
    }

    public void setCacheKeyList(List<CacheKeyInfo> cacheKeyList) {
        this.cacheKeyList = cacheKeyList;
    }
}
