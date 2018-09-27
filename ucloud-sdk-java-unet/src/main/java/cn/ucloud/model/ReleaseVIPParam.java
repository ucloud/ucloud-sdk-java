package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:  释放内网虚拟IP
 * @author: codezhang
 * @date: 2018-09-27 15:09
 **/

public class ReleaseVIPParam extends BaseRequestParam {
    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 可用区
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * require 内网VIP的id
     */
    @NotEmpty(message = "vipId can not be empty")
    @UcloudParam("VIPId")
    private String vipId;

    public ReleaseVIPParam(@NotEmpty(message = "region can not be empty") String region,
                           @NotEmpty(message = "vipId can not be empty") String vipId) {
        super("ReleaseVIP");
        this.region = region;
        this.vipId = vipId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }
}
