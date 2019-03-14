package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : 用户在UGAA实例下配置的多端口任务 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class UGAATask {
    /**
     * 端口
     */
    @SerializedName("Port")
    private Integer port;
    /**
     * 协议Tcp/Udp
     */
    @SerializedName("Protocol")
    private String protocol;


    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }


    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }


}