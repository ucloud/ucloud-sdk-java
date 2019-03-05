package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 开启迁移任务 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 19:31
 **/
public class StartDBTransferTaskParam extends BaseRequestParam {
    /**
     * 目标库所在地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 目标库所在可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * 任务Id
     */
    @NotEmpty(message = "taskId can not be empty")
    @UcloudParam("TaskId")
    private String taskId;

    public StartDBTransferTaskParam(@NotEmpty(message = "region can not be empty") String region,
                                    @NotEmpty(message = "zone can not be empty") String zone,
                                    @NotEmpty(message = "taskId can not be empty") String taskId) {
        super("StartDBTransferTask");
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
