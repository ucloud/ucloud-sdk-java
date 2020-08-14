package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 15:00
 */
public class UrlProgressInfo {
    /**
     * 刷新的单条url
     */
    @SerializedName("Url")
    private String url;

    /**
     * 刷新任务创建的时间。格式为Unix Timestamp
     */
    @SerializedName("CreateTime")
    private Long createTime;

    /**
     * 任务完成时间。格式为Unix Timestamp
     */
    @SerializedName("FinishTime")
    private Long finishTime;

    /**
     * 刷新任务的当前状态，枚举值：success：成功；wait：排队中；process：处理中；failure：失败； unknow：未知
     */
    @SerializedName("Status")
    private String status;

    /**
     * 刷新进度，单位%
     */
    @SerializedName("Progress")
    private Integer progress;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Long finishTime) {
        this.finishTime = finishTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }
}
