package cn.ucloud.ocr.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description : UAI-OCR资源类型信息
 * @Author : codezhang
 * @Date : 2019-04-19 15:29
 **/
public class UAIOcrResourceTypeInfo {

    /**
     * UAI-OCR资源类型ID
     */
    @SerializedName("ResourceTypeId")
    private Integer resourceTypeId;

    /**
     * UAI-OCR资源类型名称
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
