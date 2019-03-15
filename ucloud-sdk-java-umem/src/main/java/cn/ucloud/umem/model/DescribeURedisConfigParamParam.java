package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 显示主备Redis配置文件参数信息 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisConfigParamParam extends BaseRequestParam {
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
     * 配置文件ID
     */
    @UcloudParam("ConfigId")
    @NotEmpty(message = "configId can not be empty")
    private String configId;
    /**
     * 是否是跨机房URedis(默认false)
     */
    @UcloudParam("RegionFlag")
    private Boolean regionFlag;


    public DescribeURedisConfigParamParam(String region
            , String zone
            , String configId
    ) {
        super("DescribeURedisConfigParam");
        this.region = region;
        this.zone = zone;
        this.configId = configId;
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

    public String getConfigId() {
        return this.configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public Boolean getRegionFlag() {
        return this.regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }


}