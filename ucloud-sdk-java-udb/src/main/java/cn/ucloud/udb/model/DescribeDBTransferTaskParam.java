package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 获取迁移任务信息 参数类
 * 获取Task信息，支持两类操作：
 * （1）指定TaskId用于获取该Task的信息；
 * （2）指定Offset、Limit用于列表操作，查询某一个任务。
 * @Author : codezhang
 * @Date : 2019-03-03 16:31
 **/
public class DescribeDBTransferTaskParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * 任务id，如果指定则获取描述，否则为列表操作， 指定Offset/Limit/ClassType
     */
    @UcloudParam("TaskId")
    private String taskId;

    /**
     * 分页显示起始偏移位置，列表操作则指定
     */
    @UcloudParam("Limit")
    private Integer limit;


    /**
     * 分页显示数量，列表操作则指定
     */
    @UcloudParam("Offset")
    private Integer offset;

    public DescribeDBTransferTaskParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "zone can not be empty") String zone) {
        super("DescribeDBTransferTask");
        this.region = region;
        this.zone = zone;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

}
