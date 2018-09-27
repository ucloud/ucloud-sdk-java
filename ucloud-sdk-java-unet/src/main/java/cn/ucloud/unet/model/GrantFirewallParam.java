package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 14:48
 */
public class GrantFirewallParam extends BaseRequestParam {
    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 防火墙资源ID
     */
    @NotEmpty(message = "fwId can not be empty")
    @UcloudParam("FWId")
    private String fwId;

    /**
     * require 所应用资源类型，如UHost
     */
    @NotEmpty(message = "resourceType can not be empty")
    @UcloudParam("ResourceType")
    private String resourceType;

    /**
     * require 所应用资源ID
     */
    @NotEmpty(message = "resourceId can not be empty")
    @UcloudParam("ResourceId")
    private String resourceId;

    public GrantFirewallParam(@NotEmpty(message = "region can not be empty") String region,
                              @NotEmpty(message = "fwId can not be empty") String fwId,
                              @NotEmpty(message = "resourceType can not be empty") String resourceType,
                              @NotEmpty(message = "resourceId can not be empty") String resourceId) {
        super("GrantFirewall");
        this.region = region;
        this.fwId = fwId;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
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

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
