package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 调整容量 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class ResizeURedisGroupParam extends BaseRequestParam {
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
            * 组ID
            */
            @UcloudParam("GroupId")
                    @NotEmpty(message = "groupId can not be empty")
                private String groupId;
            /**
            * 内存大小, 单位:GB (需要大于原size,且小于等于32) 目前仅支持1/2/4/8/16/32 G 六种容量规格
            */
            @UcloudParam("Size")
                    @NotNull(message ="size can not be null")
                private Integer size;
            /**
            * 
            */
            @UcloudParam("ChargeType")
                private String chargeType;
            /**
            * 空间类型:single(无热备),double(热备)(默认: double)
            */
            @UcloudParam("Type")
                private String type;
            /**
            * 代金券ID 请参考DescribeCoupon接口
            */
            @UcloudParam("CouponId")
                private Integer couponId;


public ResizeURedisGroupParam(                    String region
                    ,String groupId
                    ,Integer size
){
super("ResizeURedisGroup");
                this.region = region;
                this.groupId = groupId;
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
                public String getGroupId() {
                return this.groupId;
                }

                public void setGroupId(String groupId) {
                this.groupId = groupId;
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
                public String getType() {
                return this.type;
                }

                public void setType(String type) {
                this.type = type;
                }
                public Integer getCouponId() {
                return this.couponId;
                }

                public void setCouponId(Integer couponId) {
                this.couponId = couponId;
                }


}