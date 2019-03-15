package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 更换Redis配置文件 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class ChangeURedisConfigParam extends BaseRequestParam {
            /**
            * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
            */
            @UcloudParam("Region")
                    @NotEmpty(message = "region can not be empty")
                private String region;
            /**
            * 可用区。参见 [可用区列表](../summary/regionlist.html)
            */
            @UcloudParam("Zone")
                private String zone;
            /**
            * 资源ID
            */
            @UcloudParam("GroupId")
                    @NotEmpty(message = "groupId can not be empty")
                private String groupId;
            /**
            * 配置文件ID
            */
            @UcloudParam("ConfigId")
                    @NotEmpty(message = "configId can not be empty")
                private String configId;


public ChangeURedisConfigParam(                    String region
                    ,String groupId
                    ,String configId
){
super("ChangeURedisConfig");
                this.region = region;
                this.groupId = groupId;
                this.configId = configId;
}


                public String getRegion() {
                return this.region;
                }

                public void setRegion(String region) {
                this.region = region;
                }
                public String getZone() {
                return this.zone;
                }

                public void setZone(String zone) {
                this.zone = zone;
                }
                public String getGroupId() {
                return this.groupId;
                }

                public void setGroupId(String groupId) {
                this.groupId = groupId;
                }
                public String getConfigId() {
                return this.configId;
                }

                public void setConfigId(String configId) {
                this.configId = configId;
                }


}