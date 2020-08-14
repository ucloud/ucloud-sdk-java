package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取预取任务状态 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 14:52
 */
public class DescribeNewUcdnPrefetchCacheTaskResult extends BaseResponseResult {

    /**
     * 预热任务的总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 预热任务信息，参考{@link TaskInfo}
     */
    @SerializedName("TaskList")
    private List<TaskInfo> taskList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<TaskInfo> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<TaskInfo> taskList) {
        this.taskList = taskList;
    }
}
