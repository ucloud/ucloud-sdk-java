package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 删除数据迁移任务 参数类
 * @Author : codezhang
 * @Date : 2019-03-03 14:50
 **/
public class DeleteDBTransferTaskParam extends BaseRequestParam {

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
     * 迁移任务taskid
     */
    @NotEmpty(message = "taskId can not be empty")
    @UcloudParam("TaskId")
    private String taskId;

    public DeleteDBTransferTaskParam(@NotEmpty(message = "region can not be empty") String region,
                                     @NotEmpty(message = "zone can not be empty") String zone,
                                     @NotEmpty(message = "taskId can not be empty") String taskId) {
        super("DeleteDBTransferTask");
        this.region = region;
        this.zone = zone;
        this.taskId = taskId;
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


}
