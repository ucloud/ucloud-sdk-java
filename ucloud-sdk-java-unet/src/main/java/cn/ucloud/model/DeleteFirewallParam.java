package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 15:57
 */
public class DeleteFirewallParam extends BaseRequestParam {
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

    public DeleteFirewallParam(@NotEmpty(message = "region can not be empty") String region,
                               @NotEmpty(message = "fwId can not be empty") String fwId) {
        super("DeleteFirewall");
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
}
