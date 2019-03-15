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
public class ModifyURedisGroupNameParam extends BaseRequestParam {
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
            * 组的ID
            */
            @UcloudParam("GroupId")
                    @NotEmpty(message = "groupId can not be empty")
                private String groupId;
            /**
            * Redis组名称 (范围[6-63],只能包含英文、数字以及符号-和_)
            */
            @UcloudParam("Name")
                    @NotEmpty(message = "name can not be empty")
                private String name;


public ModifyURedisGroupNameParam(                    String region
                    ,String groupId
                    ,String name
){
super("ModifyURedisGroupName");
                this.region = region;
                this.groupId = groupId;
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
                public String getGroupId() {
                return this.groupId;
                }

                public void setGroupId(String groupId) {
                this.groupId = groupId;
                }
                public String getName() {
                return this.name;
                }

                public void setName(String name) {
                this.name = name;
                }


}