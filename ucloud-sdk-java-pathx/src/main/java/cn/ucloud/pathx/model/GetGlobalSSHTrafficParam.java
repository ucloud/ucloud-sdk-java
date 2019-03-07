package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 获取全球运维通道流量统计数据 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class GetGlobalSSHTrafficParam extends BaseRequestParam {
    /**
     * 项目ID,如org-xxxx。请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
    /**
     * 资源ID，如uga-as5daw
     */
    @UcloudParam("UGAId")
    @NotEmpty(message = "uGAId can not be empty")
    private String uGAId;
    /**
     * 查询起始时间，如1525017600
     */
    @UcloudParam("BeginTime")
    @NotNull(message = "beginTime can not be null")
    private Integer beginTime;
    /**
     * 查询结束时间，如1525103999
     */
    @UcloudParam("EndTime")
    @NotNull(message = "endTime can not be null")
    private Integer endTime;


    public GetGlobalSSHTrafficParam(String projectId
            , String uGAId
            , Integer beginTime
            , Integer endTime
    ) {
        super("GetGlobalSSHTraffic");
        this.projectId = projectId;
        this.uGAId = uGAId;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }


    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUGAId() {
        return this.uGAId;
    }

    public void setUGAId(String uGAId) {
        this.uGAId = uGAId;
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