package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/12 11:47
 */
public class AdvancedConf {
    /**
     * 客户端响应http头列表
     */
    @SerializedName("HttpClientHeader")
    private List<String> httpClientHeader;

    /**
     * 源站http头列表
     */
    @SerializedName("HttpOriginHeader")
    private List<String> httpOriginHeader;

    /**
     * http转https回源 true是，false否
     */
    @SerializedName("Http2Https")
    private Boolean http2Https;

    public List<String> getHttpClientHeader() {
        return httpClientHeader;
    }

    public void setHttpClientHeader(List<String> httpClientHeader) {
        this.httpClientHeader = httpClientHeader;
    }

    public List<String> getHttpOriginHeader() {
        return httpOriginHeader;
    }

    public void setHttpOriginHeader(List<String> httpOriginHeader) {
        this.httpOriginHeader = httpOriginHeader;
    }

    public Boolean getHttp2Https() {
        return http2Https;
    }

    public void setHttp2Https(Boolean http2Https) {
        this.http2Https = http2Https;
    }
}
