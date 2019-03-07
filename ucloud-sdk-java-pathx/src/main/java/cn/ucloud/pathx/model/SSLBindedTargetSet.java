package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : Describle SSL Bind UAG Info 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class SSLBindedTargetSet {
    /**
     * SSL证书绑定到的UGA实例ID
     */
    @SerializedName("UGAId")
    private String uGAId;
    /**
     * SSL证书绑定到的UGA实例名称
     */
    @SerializedName("UGAName")
    private String uGAName;


    public String getUGAId() {
        return this.uGAId;
    }

    public void setUGAId(String uGAId) {
        this.uGAId = uGAId;
    }


    public String getUGAName() {
        return this.uGAName;
    }

    public void setUGAName(String uGAName) {
        this.uGAName = uGAName;
    }


}