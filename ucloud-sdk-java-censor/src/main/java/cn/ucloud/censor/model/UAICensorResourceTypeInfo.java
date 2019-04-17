package cn.ucloud.censor.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description : UAI安全审查资源类型信息
 * @Author : codezhang
 * @Date : 2019-04-17 10:44
 **/
public class UAICensorResourceTypeInfo {


    /**
     * 资源类型ID
     */
    @SerializedName("ResourceTypeId")
    private Integer resourceTypeId;

    /**
     * 资源类型名称
     */
    @SerializedName("ResourceTypeName")
    private String resourceTypeName;

    public Integer getResourceTypeId() {
        return resourceTypeId;
    }

    public void setResourceTypeId(Integer resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }
}
