package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 修改名称 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class ModifyUMemSpaceNameParam extends BaseRequestParam {
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
            * UMem内存空间ID
            */
            @UcloudParam("SpaceId")
                    @NotEmpty(message = "spaceId can not be empty")
                private String spaceId;
            /**
            * 新的名称,长度(6<=size<=63)
            */
            @UcloudParam("Name")
                    @NotEmpty(message = "name can not be empty")
                private String name;


public ModifyUMemSpaceNameParam(                    String region
                    ,String spaceId
                    ,String name
){
super("ModifyUMemSpaceName");
                this.region = region;
                this.spaceId = spaceId;
                this.name = name;
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
                public String getSpaceId() {
                return this.spaceId;
                }

                public void setSpaceId(String spaceId) {
                this.spaceId = spaceId;
                }
                public String getName() {
                return this.name;
                }

                public void setName(String name) {
                this.name = name;
                }


}