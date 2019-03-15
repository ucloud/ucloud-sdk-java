package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 获取高性能UMem升级价格 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeUDredisUpgradePriceParam extends BaseRequestParam {
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
            * 购买高性能UMem大小,单位:GB
            */
            @UcloudParam("Size")
                    @NotNull(message ="size can not be null")
                private Integer size;
            /**
            * 需要升级的空间的SpaceId
            */
            @UcloudParam("SpaceId")
                    @NotEmpty(message = "spaceId can not be empty")
                private String spaceId;


public DescribeUDredisUpgradePriceParam(                    String region
                    ,Integer size
                    ,String spaceId
){
super("DescribeUDredisUpgradePrice");
                this.region = region;
                this.size = size;
                this.spaceId = spaceId;
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
                public Integer getSize() {
                return this.size;
                }

                public void setSize(Integer size) {
                this.size = size;
                }
                public String getSpaceId() {
                return this.spaceId;
                }

                public void setSpaceId(String spaceId) {
                this.spaceId = spaceId;
                }


}