package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 检查URedis资源是否足够 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CheckURedisAllowanceParam extends BaseRequestParam {
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
     * 创建实例的容量大小, 单位:GB 目前仅支持1/2/4/8/16/32六种规格
     */
    @UcloudParam("Size")
    @NotEmpty(message = "size can not be empty")
    private String size;
    /**
     * 创建实例的数量，[1-10]
     */
    @UcloudParam("Count")
    @NotNull(message = "count can not be null")
    private Integer count;
    /**
     *
     */
    @UcloudParam("Protocol")
    private String protocol;
    /**
     * 是否是跨机房URedis(默认false)
     */
    @UcloudParam("RegionFlag")
    private Boolean regionFlag;


    public CheckURedisAllowanceParam(String region
            , String zone
            , String size
            , Integer count
    ) {
        super("CheckURedisAllowance");
        this.region = region;
        this.zone = zone;
        this.size = size;
        this.count = count;
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

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Boolean getRegionFlag() {
        return this.regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }


}