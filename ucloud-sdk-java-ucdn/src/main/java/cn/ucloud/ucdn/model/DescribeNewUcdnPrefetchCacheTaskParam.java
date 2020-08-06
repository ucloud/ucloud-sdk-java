package cn.ucloud.ucdn.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import java.util.ArrayList;
import java.util.List;


/**
 * @description: 获取预取任务状态 param
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 14:52
 */
public class DescribeNewUcdnPrefetchCacheTaskParam extends BaseRequestParam {
    /**
     * 提交任务时返回的任务ID
     */
    private List<String> taskIds;

    /**
     * 查询的起始时间，格式为Unix Timestamp。如果有EndTime，BeginTime必须赋值
     */
    @UcloudParam("BeginTime")
    private Long beginTime;

    /**
     * 查询的结束时间，格式为Unix Timestamp。EndTime默认为当前时间，BeginTime默认为当前时间前一天时间。
     */
    @UcloudParam("EndTime")
    private Long endTime;

    /**
     * 需要获取的内容预热的状态，枚举值：success：成功；wait：等待处理；process：正在处理；failure：失败； unknow：未知，默认选择所有状态
     */
    @UcloudParam("Status")
    private String status;

    /**
     * 数据偏移量，默认0，非负整数
     */
    @UcloudParam("Offset")
    private Integer offset;

    /**
     * 返回数据长度，如果制定了Offset，则默认20，否则默认全部，非负整数
     */
    @UcloudParam("Limit")
    private Integer limit;

    @UcloudParam("TaskId")
    public List<Param> checkTaskIds() throws ValidationException {
        List<Param> list = new ArrayList<>();
        if (taskIds == null || taskIds.isEmpty()) {
            throw new ValidationException("taskIds can not be empty");
        } else {
            for (int i = 0, len = taskIds.size(); i < len; i++) {
                if (taskIds.get(i) == null || taskIds.get(i).length() < 1) {
                    throw new ValidationException(String.format("taskIds[%d] can not be empty", i));
                } else {
                    Param param = new Param(String.format("TaskId.%d", i), taskIds.get(i));
                    list.add(param);
                }
            }
        }
        return list;
    }

    public DescribeNewUcdnPrefetchCacheTaskParam() {
        super("DescribeNewUcdnPrefetchCacheTask");
    }

    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
