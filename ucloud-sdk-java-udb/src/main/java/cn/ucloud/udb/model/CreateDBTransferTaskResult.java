package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 创建数据迁移任务 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 17:26
 **/
public class CreateDBTransferTaskResult extends BaseResponseResult {

    /**
     * 任务ID
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
