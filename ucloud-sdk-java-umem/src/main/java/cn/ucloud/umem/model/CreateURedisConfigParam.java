package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 创建URedis自定义配置文件 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CreateURedisConfigParam extends BaseRequestParam {
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
     * 模板配置文件ID
     */
    @UcloudParam("SourceConfigId")
    @NotEmpty(message = "sourceConfigId can not be empty")
    private String sourceConfigId;
    /**
     * 配置文件名称
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;
    /**
     * 配置文件备注
     */
    @UcloudParam("Description")
    @NotEmpty(message = "description can not be empty")
    private String description;
    /**
     * 是否是跨机房URedis(默认false)
     */
    @UcloudParam("RegionFlag")
    private Boolean regionFlag;


    public CreateURedisConfigParam(String region
            , String sourceConfigId
            , String name
            , String description
    ) {
        super("CreateURedisConfig");
        this.region = region;
        this.sourceConfigId = sourceConfigId;
        this.name = name;
        this.description = description;
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

    public String getSourceConfigId() {
        return this.sourceConfigId;
    }

    public void setSourceConfigId(String sourceConfigId) {
        this.sourceConfigId = sourceConfigId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getRegionFlag() {
        return this.regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }


}