package cn.ucloud.udpn.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 获取 UDPN 价格 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-01 16:01
 */
public class GetUDPNPriceParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    private String region;

    /**
     * require 专线可用区1，
     * 支持地域：北京二：cn-bj2, 上海二：cn-sh2, 广东：cn-gd, 亚太： hk, 上海一：cn-sh1, 法兰克福：ge-fra, 新加坡：sg, 洛杉矶：us-la， 华盛顿：us-ws， 东京：jpn-tky
     */
    @UcloudParam("Peer1")
    @NotEmpty(message = "Peer1 can not be empty")
    private String peer1;

    /**
     * require 专线可用区2，
     * 支持地域：北京二：cn-bj2, 上海二：cn-sh2, 广东：cn-gd, 亚太： hk, 上海一：cn-sh1, 法兰克福：ge-fra, 新加坡：sg, 洛杉矶：us-la， 华盛顿：us-ws， 东京：jpn-tky
     */
    @UcloudParam("Peer2")
    @NotEmpty(message = "Peer2 can not be empty")
    private String peer2;

    /**
     * require 带宽
     */
    @UcloudParam("Bandwidth")
    @NotNull(message = "Bandwidth can not be empty")
    private Integer bandWidth;

    /**
     * 计费类型，枚举值为： Year，按年付费； Month，按月付费； Dynamic，按需付费
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * 计费时长，默认 1
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    public GetUDPNPriceParam(@NotEmpty(message = "Peer1 can not be empty") String peer1,
                             @NotEmpty(message = "Peer2 can not be empty") String peer2,
                             @NotNull(message = "Bandwidth can not be empty") Integer bandWidth) {
        super("GetUDPNPrice");
        this.peer1 = peer1;
        this.peer2 = peer2;
        this.bandWidth = bandWidth;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPeer1() {
        return peer1;
    }

    public void setPeer1(String peer1) {
        this.peer1 = peer1;
    }

    public String getPeer2() {
        return peer2;
    }

    public void setPeer2(String peer2) {
        this.peer2 = peer2;
    }

    public Integer getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        this.bandWidth = bandWidth;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
