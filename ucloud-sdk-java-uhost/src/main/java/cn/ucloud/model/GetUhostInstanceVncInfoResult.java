package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 获取指定UHost实例的管理VNC配置详细信息 结果类
 * @author: codezhang
 * @date: 2018-09-13 11:04
 **/

public class GetUhostInstanceVncInfoResult extends BaseResponseResult {
    /**
     * UHost实例ID
     */
    @SerializedName("UHostId")
    private String uHostId;
    /**
     * VNC登录IP
     */
    @SerializedName("VncIP")
    private String vncIP;
    /**
     * VNC登录端口
     */
    @SerializedName("VncPort")
    private Integer vncPort;
    /**
     * VNC登录密码
     */
    @SerializedName("VncPassword")
    private String vncPassword;



    public String getuHostId() {
        return uHostId;
    }

    public void setuHostId(String uHostId) {
        this.uHostId = uHostId;
    }


    public String getVncIP() {
        return vncIP;
    }

    public void setVncIP(String vncIP) {
        this.vncIP = vncIP;
    }

    public Integer getVncPort() {
        return vncPort;
    }

    public void setVncPort(Integer vncPort) {
        this.vncPort = vncPort;
    }

    public String getVncPassword() {
        return vncPassword;
    }

    public void setVncPassword(String vncPassword) {
        this.vncPassword = vncPassword;
    }

    @Override
    public String toString() {
        return "GetUhostInstanceVncInfoResult{" +
                "uHostId='" + uHostId + '\'' +
                ", vncIP='" + vncIP + '\'' +
                ", vncPort=" + vncPort +
                ", vncPassword='" + vncPassword + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
