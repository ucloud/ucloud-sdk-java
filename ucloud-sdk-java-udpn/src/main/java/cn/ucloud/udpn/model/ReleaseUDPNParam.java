package cn.ucloud.udpn.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 释放 UDPN 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-01 16:01
 */
public class ReleaseUDPNParam extends BaseRequestParam {

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

    public ReleaseUDPNParam(@NotEmpty(message = "UDPNId can not be empty") String udpnId) {
        super("ReleaseUDPN");
        this.udpnId = udpnId;
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
}
