package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-15 14:38
 */
public class DisassociateFirewallParam extends BaseRequestParam {
    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "Zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * require 防火墙资源ID
     */
    @NotEmpty(message = "fwId can not be empty")
    @UcloudParam("FWId")
    private String fwId;

    /**
     * require 资源类型：UHost 表示云主机; ULB 表示负载均衡
     */
    @NotEmpty(message = "resourceType can not be empty")
    @UcloudParam("ResourceType")
    private String resourceType;

    /**
     * require 需要解绑的资源ID
     */
    @NotEmpty(message = "resourceId can not be empty")
    @UcloudParam("ResourceId")
    private String resourceId;


    public DisassociateFirewallParam(@NotEmpty(message = "region can not be empty") String region,
                                     @NotEmpty(message = "zone can not be empty") String zone,
                                     @NotEmpty(message = "fwId can not be empty") String fwId,
                                     @NotEmpty(message = "resourceType can not be empty") String resourceType,
                                     @NotEmpty(message = "resourceId can not be empty") String resourceId) {
        super("DisassociateFirewall");
        this.region = region;
        this.zone = zone;
        this.fwId = fwId;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
    }

    protected DisassociateFirewallParam() {
        super("");
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
