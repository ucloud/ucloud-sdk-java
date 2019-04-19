package cn.ucloud.ocr.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description :UAI-OCR资源信息
 * @Author : codezhang
 * @Date : 2019-04-19 15:46
 **/
public class UAIOcrResourceInfo {

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
     * 资源类型
     */
    @SerializedName("ResourceType")
    private List<String> resourceType;

    /**
     * 资源备注
     */
    @SerializedName("ResourceMemo")
    private String resourceMemo;

    /**
     * 资源状态
     */
    @SerializedName("Status")
    private String status;

    /**
     * 资源创建时间
     */
    @SerializedName("CreateTime")
    private Long createTime;

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

    public List<String> getResourceType() {
        return resourceType;
    }

    public void setResourceType(List<String> resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceMemo() {
        return resourceMemo;
    }

    public void setResourceMemo(String resourceMemo) {
        this.resourceMemo = resourceMemo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
