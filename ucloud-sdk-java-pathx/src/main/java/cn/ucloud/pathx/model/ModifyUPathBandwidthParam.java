package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 修改加速线路带宽 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class ModifyUPathBandwidthParam extends BaseRequestParam {
            /**
            * 加速线路Id
            */
            @UcloudParam("UPathId")
                    @NotEmpty(message = "uPathId can not be empty")
                private String uPathId;
            /**
            * 带宽
            */
            @UcloudParam("Bandwidth")
                    @NotEmpty(message = "bandwidth can not be empty")
                private String bandwidth;


public ModifyUPathBandwidthParam(                    String projectId
                    ,String uPathId
                    ,String bandwidth
){
    super("ModifyUPathBandwidth");
                this.projectId = projectId;
                this.uPathId = uPathId;
                this.bandwidth = bandwidth;
}


                public String getUPathId() {
                return this.uPathId;
                }

                public void setUPathId(String uPathId) {
                this.uPathId = uPathId;
                }

                public String getBandwidth() {
                return this.bandwidth;
                }

                public void setBandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                }



}