package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 取uredis价格信息 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeURedisPriceParam extends BaseRequestParam {
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
                    @NotEmpty(message = "zone can not be empty")
                private String zone;
            /**
            * 量大小,单位:GB  取值范围[1-32]
            */
            @UcloudParam("Size")
                    @NotNull(message ="size can not be null")
                private Integer size;
            /**
            * 计费模式，Year， Month， Dynamic；如果不指定，则一次性获取三种计费
            */
            @UcloudParam("ChargeType")
                private String chargeType;
            /**
            * 计费模式为Dynamic时，购买的时长, 默认为1
            */
            @UcloudParam("Quantity")
                private Integer quantity;
            /**
            * 是否是跨机房URedis(默认false)
            */
            @UcloudParam("RegionFlag")
                private Boolean regionFlag;
            /**
            * 产品类型：MS_Redis（标准主备版），S_Redis（从库），默认为MS_Redis
            */
            @UcloudParam("ProductType")
                private String productType;
            /**
            * 
            */
            @UcloudParam("Type")
                private String type;


public DescribeURedisPriceParam(                    String region
                    ,String zone
                    ,Integer size
){
super("DescribeURedisPrice");
                this.region = region;
                this.zone = zone;
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
                public String getProductType() {
                return this.productType;
                }

                public void setProductType(String productType) {
                this.productType = productType;
                }
                public String getType() {
                return this.type;
                }

                public void setType(String type) {
                this.type = type;
                }


}