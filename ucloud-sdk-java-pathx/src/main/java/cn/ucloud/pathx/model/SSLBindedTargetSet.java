package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : Describle SSL Bind UAG Info 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class SSLBindedTargetSet {
    /**
     * SSL证书绑定到的实例ID
     */
    @SerializedName("ResourceId")
    private String resourceId;
    /**
     * SSL证书绑定到的实例名称
     */
    @SerializedName("ResourceName")
    private String resourceName;


    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    public String getResourceName() {
        return this.resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }


}