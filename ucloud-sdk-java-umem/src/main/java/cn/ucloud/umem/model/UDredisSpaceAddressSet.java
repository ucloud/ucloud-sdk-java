package cn.ucloud.umem.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description :  模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class UDredisSpaceAddressSet {
    /**
     * UMem实例访问IP
     */
    @SerializedName("IP")
    private String iP;
    /**
     * UMem实例访问Port
     */
    @SerializedName("Port")
    private String port;


    public String getiP() {
        return this.iP;
    }

    public void setiP(String iP) {
        this.iP = iP;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
    }


}