package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 15:26
 */
public class DescribeFirewallResourceParam extends BaseRequestParam {
    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 防火墙ID，默认为返回所有防火墙
     */
    @NotEmpty(message = "fwId can not be empty")
    @UcloudParam("FWId")
    private String fwId;

    /**
     * require 返回数据长度，默认为20，最大10000000
     */
    @UcloudParam("Limit")
    private Integer limit = 20;

    /**
     * require 列表起始位置偏移量，默认为0
     */
    @UcloudParam("Offset")
    private Integer offset = 0;

    public DescribeFirewallResourceParam(@NotEmpty(message = "region can not be empty") String region,
                                         @NotEmpty(message = "fwId can not be empty") String fwId) {
        super("DescribeFirewallResource");
        this.region = region;
        this.fwId = fwId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getFwId() {
        return fwId;
    }

    public void setFwId(String fwId) {
        this.fwId = fwId;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
