package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 批量刷新缓存 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 14:44
 */
public class BatchRefreshNewUcdnDomainCacheResult extends BaseResponseResult {
    /**
     * 本次提交url对应的任务id
     */
    @SerializedName("TaskId")
    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}
