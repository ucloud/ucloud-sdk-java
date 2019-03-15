package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 获取价格 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeUMemPriceParam extends BaseRequestParam {
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
            * 购买umem大小,单位:GB,范围[1~1024]
            */
            @UcloudParam("Size")
                    @NotNull(message ="size can not be null")
                private Integer size;
            /**
            * 空间类型:single(无热备),double(热备)(默认: double)
            */
            @UcloudParam("Type")
                private String type;
            /**
            * Year， Month， Dynamic，Trial 如果不指定，则一次性获取三种计费
            */
            @UcloudParam("ChargeType")
                private String chargeType;
            /**
            * 购买UMem的时长，默认值为1
            */
            @UcloudParam("Quantity")
                private Integer quantity;
            /**
            * 
            */
            @UcloudParam("RegionFlag")
                private Boolean regionFlag;


public DescribeUMemPriceParam(                    String region
                    ,String projectId
                    ,Integer size
){
super("DescribeUMemPrice");
                this.region = region;
                this.projectId = projectId;
                this.size = size;
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
                public String getType() {
                return this.type;
                }

                public void setType(String type) {
                this.type = type;
                }
                public String getChargeType() {
                return this.chargeType;
                }

                public void setChargeType(String chargeType) {
                this.chargeType = chargeType;
                }
                public Integer getQuantity() {
                return this.quantity;
                }

                public void setQuantity(Integer quantity) {
                this.quantity = quantity;
                }
                public Boolean getRegionFlag() {
                return this.regionFlag;
                }

                public void setRegionFlag(Boolean regionFlag) {
                this.regionFlag = regionFlag;
                }


}