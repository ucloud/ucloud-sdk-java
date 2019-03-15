package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 查询主备Redis所有配置文件 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeURedisConfigParam extends BaseRequestParam {
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
            * 是否是跨机房URedis(默认false)
            */
            @UcloudParam("RegionFlag")
                    @NotNull(message ="regionFlag can not be null")
                private Boolean regionFlag;
            /**
            * Redis版本号
            */
            @UcloudParam("Version")
                private String version;
            /**
            * 配置文件ID
            */
            @UcloudParam("ConfigId")
                private String configId;
            /**
            * 页显示的起始偏移, 默认值为0
            */
            @UcloudParam("Offset")
                private Integer offset;
            /**
            * 页显示的条目数, 默认值为10
            */
            @UcloudParam("Limit")
                private Integer limit;


public DescribeURedisConfigParam(                    String region
                    ,String zone
                    ,Boolean regionFlag
){
super("DescribeURedisConfig");
                this.region = region;
                this.zone = zone;
                this.regionFlag = regionFlag;
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
                public Boolean getRegionFlag() {
                return this.regionFlag;
                }

                public void setRegionFlag(Boolean regionFlag) {
                this.regionFlag = regionFlag;
                }
                public String getVersion() {
                return this.version;
                }

                public void setVersion(String version) {
                this.version = version;
                }
                public String getConfigId() {
                return this.configId;
                }

                public void setConfigId(String configId) {
                this.configId = configId;
                }
                public Integer getOffset() {
                return this.offset;
                }

                public void setOffset(Integer offset) {
                this.offset = offset;
                }
                public Integer getLimit() {
                return this.limit;
                }

                public void setLimit(Integer limit) {
                this.limit = limit;
                }


}