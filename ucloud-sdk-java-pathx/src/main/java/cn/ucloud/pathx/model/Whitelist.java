package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : 白名单规则 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class Whitelist {
    /**
     * IP或IP段
     */
    @SerializedName("SrcIP")
    private String srcIP;
    /**
     * 端口协议（TCP/UDP）
     */
    @SerializedName("ProtocolType")
    private String protocolType;
    /**
     * 端口或端口范围（ ':' 隔开）
     */
    @SerializedName("DstPort")
    private String dstPort;


    public String getSrcIP() {
        return this.srcIP;
    }

    public void setSrcIP(String srcIP) {
        this.srcIP = srcIP;
    }

    public String getProtocolType() {
        return this.protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public String getDstPort() {
        return this.dstPort;
    }

    public void setDstPort(String dstPort) {
        this.dstPort = dstPort;
    }


}