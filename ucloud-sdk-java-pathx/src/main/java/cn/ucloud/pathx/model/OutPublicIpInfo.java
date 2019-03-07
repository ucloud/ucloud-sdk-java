package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : 出口IP信息 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class OutPublicIpInfo {
    /**
     *
     */
    @SerializedName("IP")
    private String iP;
    /**
     *
     */
    @SerializedName("Area")
    private String area;


    public String getIP() {
        return this.iP;
    }

    public void setIP(String iP) {
        this.iP = iP;
    }


    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }


}