package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 修改UPath监控告警项 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
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


public ModifyUPathTemplateParam(                    String projectId
){
    super("ModifyUPathTemplate");
                this.projectId = projectId;
}


                public String getUPathID() {
                return this.uPathID;
                }

                public void setUPathID(String uPathID) {
                this.uPathID = uPathID;
                }



}