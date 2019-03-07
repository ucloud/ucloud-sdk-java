package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 获取GlobalSSH出入带宽数据 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class GetGlobalSSHMetricParam extends BaseRequestParam {
    /**
     * 项目ID,如org-xxxx。请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    private String projectId;
    /**
     * 实例ID，资源唯一标识
     */
    @UcloudParam("InstanceId")
    @NotEmpty(message = "instanceId can not be empty")
    private String instanceId;
    /**
     * 起始时间戳（unix格式，如1531834598）
     */
    @UcloudParam("BeginTime")
    @NotNull(message = "beginTime can not be null")
    private Integer beginTime;
    /**
     * 结束时间戳（unix格式，如1531886362）
     */
    @UcloudParam("EndTime")
    @NotNull(message = "endTime can not be null")
    private Integer endTime;


    public GetGlobalSSHMetricParam(String instanceId
            , Integer beginTime
            , Integer endTime
    ) {
        super("GetGlobalSSHMetric");
        this.instanceId = instanceId;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }


    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Integer getBeginTime() {
        return this.beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }


}