package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 创建带宽包 参数类
 * 为非共享带宽模式下, 已绑定资源实例的带宽计费弹性IP附加临时带宽包
 * @author: codezhang
 * @date: 2018-09-27 15:17
 **/

public class CreateBandwidthPackageParam extends BaseRequestParam {

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
     * require 带宽大小(单位Mbps), 取值范围[2,800] (最大值受地域限制)
     */
    @UcloudParam("Bandwidth")
    @NotNull(message = "bandwidth can not be null")
    private Integer bandwidth;

    /**
     * require 带宽包有效时长, 取值范围为大于0的整数,
     * 即该带宽包在EnableTime到 EnableTime+TimeRange时间段内生效
     */
    @NotNull(message = "timeRange can not be null")
    @UcloudParam("TimeRange")
    private Integer timeRange;

    /**
     * optional 生效时间, 格式为 Unix timestamp, 默认为立即开通
     */
    @UcloudParam("EnableTime")
    private Integer enableTime;

    /**
     * optional 代金券ID
     */
    @UcloudParam("CouponId")
    private String couponId;

    public CreateBandwidthPackageParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "eipId can not be empty") String eipId,
                                       @NotNull(message = "bandwidth can not be null") Integer bandwidth,
                                       @NotNull(message = "timeRange can not be null") Integer timeRange) {
        super("CreateBandwidthPackage");
        this.region = region;
        this.eipId = eipId;
        this.bandwidth = bandwidth;
        this.timeRange = timeRange;
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

    public Integer getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
    }

    public Integer getEnableTime() {
        return enableTime;
    }

    public void setEnableTime(Integer enableTime) {
        this.enableTime = enableTime;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
