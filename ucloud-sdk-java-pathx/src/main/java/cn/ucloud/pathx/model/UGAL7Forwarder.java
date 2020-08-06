package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

/**
 * Author: codezhang
 * Date: 2019/10/29 3:06 下午
 * Describe: UGA实例 7层转发器信息
 **/
public class UGAL7Forwarder {


    /**
     * 接入端口
     */
    @SerializedName("Port")
    private Integer port;


    /**
     * 转发协议，枚举值["TCP"，"UDP"，"HTTPHTTP"，"HTTPSHTTP"，"HTTPSHTTPS"]。TCP和UDP代表四层转发，其余为七层转发
     */
    @SerializedName("Protocol")
    private String protocol;

    /**
     * RSPort，源站监听端口
     */
    @SerializedName("RSPort")
    private Integer rsPort;

    /**
     * 证书ID
     */
    @SerializedName("SSLId")
    private String sslId;

    /**
     * 证书名称
     */
    @SerializedName("SSLName")
    private String sslName;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Integer getRsPort() {
        return rsPort;
    }

    public void setRsPort(Integer rsPort) {
        this.rsPort = rsPort;
    }

    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
    }

    public String getSslName() {
        return sslName;
    }

    public void setSslName(String sslName) {
        this.sslName = sslName;
    }
}
