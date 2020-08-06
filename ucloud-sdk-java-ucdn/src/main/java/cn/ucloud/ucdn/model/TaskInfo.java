package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 14:57
 */
public class TaskInfo {
    /**
     * 提交任务时返回的任务ID
     */
    @SerializedName("TaskId")
    private String taskId;

    /**
     * 任务url的信息列表，参考UrlProgressInfo
     */
    @SerializedName("UrlLists")
    private List<UrlProgressInfo> urlLists;

    /**
     * file/dir 刷新任务会返回Type，预取任务没有
     */
    @SerializedName("Type")
    private String type;

    /**
     * 刷新任务创建的时间。格式为Unix Timestamp
     */
    @SerializedName("CreateTime")
    private Long createTime;

    /**
     * 刷新任务的当前状态，枚举值：success：成功；wait：排队中；process：处理中；failure：失败； unknow：未知
     */
    @SerializedName("Status")
    private String status;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public List<UrlProgressInfo> getUrlLists() {
        return urlLists;
    }

    public void setUrlLists(List<UrlProgressInfo> urlLists) {
        this.urlLists = urlLists;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
