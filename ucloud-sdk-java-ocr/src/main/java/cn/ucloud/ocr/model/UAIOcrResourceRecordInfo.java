package cn.ucloud.ocr.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description :UAI-OCR资源请求记录信息
 * @Author : codezhang
 * @Date : 2019-04-19 16:23
 **/
public class UAIOcrResourceRecordInfo {

    /**
     * 资源ID
     */
    @SerializedName("ResourceId")
    private String resourceId;

    /**
     * 资源状态
     */
    @SerializedName("Status")
    private String status;

    /**
     * OCR请求数
     */
    @SerializedName("OcrCount")
    private Integer ocrCount;

    /**
     * 最新请求记录创建时间
     */
    @SerializedName("LatestRecordTime")
    private Long latestRecordTime;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOcrCount() {
        return ocrCount;
    }

    public void setOcrCount(Integer ocrCount) {
        this.ocrCount = ocrCount;
    }

    public Long getLatestRecordTime() {
        return latestRecordTime;
    }

    public void setLatestRecordTime(Long latestRecordTime) {
        this.latestRecordTime = latestRecordTime;
    }
}
