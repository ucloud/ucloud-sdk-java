package cn.ucloud.udpn.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 修改带宽 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-01 16:01
 */
public class ModifyUDPNBandwidthParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    private String region;

    /**
     * require 专线带宽资源 Id
     */
    @UcloudParam("UDPNId")
    @NotEmpty(message = "UDPNId can not be empty")
    private String udpnId;

    /**
     * require 带宽
     */
    @UcloudParam("Bandwidth")
    @NotNull(message = "Bandwidth can not be empty")
    private Integer bandWidth;

    /**
     * 代金劵 ID
     */
    @UcloudParam("CouponId")
    private String couponId;

    public ModifyUDPNBandwidthParam(@NotEmpty(message = "UDPNId can not be empty") String udpnId,
                                    @NotNull(message = "Bandwidth can not be empty") Integer bandWidth) {
        super("ModifyUDPNBandwidth");
        this.udpnId = udpnId;
        this.bandWidth = bandWidth;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUdpnId() {
        return udpnId;
    }

    public void setUdpnId(String udpnId) {
        this.udpnId = udpnId;
    }

    public Integer getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        this.bandWidth = bandWidth;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
