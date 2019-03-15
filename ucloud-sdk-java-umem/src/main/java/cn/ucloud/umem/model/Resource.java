package cn.ucloud.umem.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-15 13:34
 **/
public class Resource {
    @SerializedName("ResourceType")
    private String resourceType;

    @SerializedName("ResourceAvailable")
    private Integer resourceAvailable;

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Integer getResourceAvailable() {
        return resourceAvailable;
    }

    public void setResourceAvailable(Integer resourceAvailable) {
        this.resourceAvailable = resourceAvailable;
    }
}
