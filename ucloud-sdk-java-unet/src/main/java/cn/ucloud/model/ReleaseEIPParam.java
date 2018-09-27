package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 释放弹性IP资源, 所释放弹性IP必须为非绑定状态. 参数类
 * @author: codezhang
 * @date: 2018-09-27 11:15
 **/

public class ReleaseEIPParam extends BaseRequestParam {
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

    public ReleaseEIPParam(@NotEmpty(message = "region can not be empty") String region,
                           @NotEmpty(message = "eipId can not be empty") String eipId) {
        super("ReleaseEIP");
        this.region = region;
        this.eipId = eipId;
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
}
