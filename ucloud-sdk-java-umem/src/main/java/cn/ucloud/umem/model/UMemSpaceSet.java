package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : DescribeUMemSpace 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class UMemSpaceSet  {
            /**
            * 内存空间ID
            */
            @SerializedName("SpaceId")
                private String spaceId;
            /**
            * 内存空间名称
            */
            @SerializedName("Name")
                private String name;
            /**
            * 可用区，参见[可用区列表](../summary/regionlist.html)
            */
            @SerializedName("Zone")
                private String zone;
            /**
            * 创建时间
            */
            @SerializedName("CreateTime")
                private Integer createTime;
            /**
            * 到期时间
            */
            @SerializedName("ExpireTime")
                private Integer expireTime;
            /**
            * 空间类型:single(无热备),double(热备)
            */
            @SerializedName("Type")
                private String type;
            /**
            * 协议类型: memcache, redis
            */
            @SerializedName("Protocol")
                private String protocol;
            /**
            * 容量单位GB
            */
            @SerializedName("Size")
                private Integer size;
            /**
            * 使用量单位MB
            */
            @SerializedName("UsedSize")
                private Integer usedSize;
            /**
            * Starting:创建中 Running:运行中 Fail:失败
            */
            @SerializedName("State")
                private String state;
            /**
            * Year, Month, Dynamic, Trial
            */
            @SerializedName("ChargeType")
                private String chargeType;
            /**
            * IP端口信息请参见 UMemSpaceAddressSet
            */
            @SerializedName("Address")
                private List<UMemSpaceAddressSet> address;


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
                public String getZone() {
                return this.zone;
                }

                public void setZone(String zone) {
                this.zone = zone;
                }
                public Integer getCreateTime() {
                return this.createTime;
                }

                public void setCreateTime(Integer createTime) {
                this.createTime = createTime;
                }
                public Integer getExpireTime() {
                return this.expireTime;
                }

                public void setExpireTime(Integer expireTime) {
                this.expireTime = expireTime;
                }
                public String getType() {
                return this.type;
                }

                public void setType(String type) {
                this.type = type;
                }
                public String getProtocol() {
                return this.protocol;
                }

                public void setProtocol(String protocol) {
                this.protocol = protocol;
                }
                public Integer getSize() {
                return this.size;
                }

                public void setSize(Integer size) {
                this.size = size;
                }
                public Integer getUsedSize() {
                return this.usedSize;
                }

                public void setUsedSize(Integer usedSize) {
                this.usedSize = usedSize;
                }
                public String getState() {
                return this.state;
                }

                public void setState(String state) {
                this.state = state;
                }
                public String getChargeType() {
                return this.chargeType;
                }

                public void setChargeType(String chargeType) {
                this.chargeType = chargeType;
                }



                public List<UMemSpaceAddressSet> getAddress() {
                return this.address;
                }

                public void setAddress(List<UMemSpaceAddressSet> address) {
                this.address = address;
                }


}