package cn.ucloud.censor.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description : UAI安全审查资源请求记录信息
 * @Author : codezhang
 * @Date : 2019-04-18 16:45
 **/
public class UAICensorResourceRecordInfo {

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
     * 审查请求数
     */
    @SerializedName("CensorCount")
    private Integer censorCount;

    /**
     * 最新请求记录创建时间，Unix时间戳形式
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

    public Integer getCensorCount() {
        return censorCount;
    }

    public void setCensorCount(Integer censorCount) {
        this.censorCount = censorCount;
    }

    public Long getLatestRecordTime() {
        return latestRecordTime;
    }

    public void setLatestRecordTime(Long latestRecordTime) {
        this.latestRecordTime = latestRecordTime;
    }
}
