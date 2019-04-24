package cn.ucloud.censor.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : UAI内容审查资源信息
 * @Author : codezhang
 * @Date : 2019-04-17 14:12
 **/
public class UAICensorResourceInfo {

    /**
     * 资源ID
     */
    @SerializedName("ResourceId")
    private String resourceId;

    /**
     * 资源名称
     */
    @SerializedName("ResourceName")
    private String resourceName;

    /**
     * 资源备注
     */
    @SerializedName("ResourceMemo")
    private String resourceMemo;

    /**
     * 资源类型
     */
    @SerializedName("ResourceType")
    private List<String> resourceType;

    /**
     * 资源状态
     */
    @SerializedName("Status")
    private String status;

    /**
     * 资源创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceMemo() {
        return resourceMemo;
    }

    public void setResourceMemo(String resourceMemo) {
        this.resourceMemo = resourceMemo;
    }

    public List<String> getResourceType() {
        return resourceType;
    }

    public void setResourceType(List<String> resourceType) {
        this.resourceType = resourceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}
