package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 修改主备Redis配置文件参数 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class ModifyURedisConfigParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;
    /**
     * 配置文件的ID
     */
    @UcloudParam("ConfigId")
    @NotEmpty(message = "configId can not be empty")
    private String configId;
    /**
     * 参数名称
     */
    @UcloudParam("Key")
    @NotEmpty(message = "key can not be empty")
    private String key;
    /**
     * 对应参数的值
     */
    @UcloudParam("Value")
    @NotEmpty(message = "value can not be empty")
    private String value;
    /**
     * 是否是跨机房URedis(默认false)
     */
    @UcloudParam("RegionFlag")
    private Boolean regionFlag;


    public ModifyURedisConfigParam(String region
            , String zone
            , String configId
            , String key
            , String value
    ) {
        super("ModifyURedisConfig");
        this.region = region;
        this.zone = zone;
        this.configId = configId;
        this.key = key;
        this.value = value;
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

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getRegionFlag() {
        return this.regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }


}