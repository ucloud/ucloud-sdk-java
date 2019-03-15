package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 获取高性能UMem实例价格信息 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeUDredisPriceParam extends BaseRequestParam {
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
            * 购买高性能umem大小,单位:GB,范围[1~1024]
            */
            @UcloudParam("Size")
                    @NotNull(message ="size can not be null")
                private Integer size;
            /**
            * 购买UMem的时长，默认值为1
            */
            @UcloudParam("Quantity")
                    @NotNull(message ="quantity can not be null")
                private Integer quantity;
            /**
            * Year， Month， Dynamic，Trial 如果不指定，则一次性获取三种计费
            */
            @UcloudParam("ChargeType")
                private String chargeType;


public DescribeUDredisPriceParam(                    String region
                    ,String zone
                    ,Integer size
                    ,Integer quantity
){
super("DescribeUDredisPrice");
                this.region = region;
                this.zone = zone;
                this.size = size;
                this.quantity = quantity;
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
                public Integer getQuantity() {
                return this.quantity;
                }

                public void setQuantity(Integer quantity) {
                this.quantity = quantity;
                }
                public String getChargeType() {
                return this.chargeType;
                }

                public void setChargeType(String chargeType) {
                this.chargeType = chargeType;
                }


}