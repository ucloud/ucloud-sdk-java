package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 修改UPath监控告警项 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class ModifyUPathTemplateParam extends BaseRequestParam {
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @UcloudParam("ProjectId")
    @NotEmpty(message = "projectId can not be empty")
    private String projectId;
    /**
     *
     */
    @UcloudParam("UPathID")
    private String uPathID;
    // TODO 需要人工接入 ModifyUPathTemplate =》 MetricName.n
    // TODO 需要人工接入 ModifyUPathTemplate =》 Threshold.n
    // TODO 需要人工接入 ModifyUPathTemplate =》 AlarmFrequency.n
    // TODO 需要人工接入 ModifyUPathTemplate =》 ContactGroupId.n
    // TODO 需要人工接入 ModifyUPathTemplate =》 Compare.n
    // TODO 需要人工接入 ModifyUPathTemplate =》 AlarmStrategy.n
    // TODO 需要人工接入 ModifyUPathTemplate =》 TriggerCount.n


    public ModifyUPathTemplateParam(String projectId
    ) {
        super("ModifyUPathTemplate");
        this.projectId = projectId;
    }


    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUPathID() {
        return this.uPathID;
    }

    public void setUPathID(String uPathID) {
        this.uPathID = uPathID;
    }


}