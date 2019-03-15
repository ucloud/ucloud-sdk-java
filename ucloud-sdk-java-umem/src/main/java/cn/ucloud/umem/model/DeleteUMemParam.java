package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 删除UMem资源 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DeleteUMemParam extends BaseRequestParam {
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
            * 
            */
            @UcloudParam("ResourceId")
                    @NotEmpty(message = "resourceId can not be empty")
                private String resourceId;
            /**
            * 
            */
            @UcloudParam("ResourceType")
                    @NotEmpty(message = "resourceType can not be empty")
                private String resourceType;


public DeleteUMemParam(                    String region
                    ,String resourceId
                    ,String resourceType
){
super("DeleteUMem");
                this.region = region;
                this.resourceId = resourceId;
                this.resourceType = resourceType;
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
                public String getResourceId() {
                return this.resourceId;
                }

                public void setResourceId(String resourceId) {
                this.resourceId = resourceId;
                }
                public String getResourceType() {
                return this.resourceType;
                }

                public void setResourceType(String resourceType) {
                this.resourceType = resourceType;
                }


}