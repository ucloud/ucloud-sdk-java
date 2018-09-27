package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 获取弹性IP带宽改动价格 参数类
 * @author: codezhang
 * @date: 2018-09-27 13:52
 **/

public class GetEIPUpgradePriceParam extends BaseRequestParam {

    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require EIP资源ID
     */
    @NotEmpty(message = "eipId can not be empty")
    @UcloudParam("EIPId")
    private String eipId;
    /**
     * require 弹性IP的外网带宽, 单位为Mbps, 范围 [0-800]
     */
    @NotNull(message = "bandwidth can not be null")
    @UcloudParam("Bandwidth")
    private Integer bandwidth;

    public GetEIPUpgradePriceParam(@NotEmpty(message = "region can not be empty") String region,
                                   @NotEmpty(message = "eipId can not be empty") String eipId,
                                   @NotNull(message = "bandwidth can not be null") Integer bandwidth) {
        super("GetEIPUpgradePrice");
        this.region = region;
        this.eipId = eipId;
        this.bandwidth = bandwidth;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }
}
