package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;


/**
 * @Description : 修改UPath监控告警项 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class ModifyUPathTemplateParam extends BaseRequestParam {
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


    public String getuPathID() {
        return this.uPathID;
    }

    public void setuPathID(String uPathID) {
        this.uPathID = uPathID;
    }


}