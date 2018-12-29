package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 添加后端实例
 * @author: codezhang
 * @date: 2018-09-19 14:54
 **/

public class AllocateBackendParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 负载均衡实例的ID
     */
    @NotEmpty(message = "ulbId can not be empty")
    @UcloudParam("ULBId")
    private String ulbId;

    /**
     * require VServer实例的ID
     */
    @UcloudParam("VServerId")
    @NotEmpty(message = "vserverId can not be empty")
    private String vserverId;

    /**
     * require
     * 所添加的后端资源的类型，枚举值：
     * UHost -> 云主机；
     * UPM -> 物理云主机；
     * UDHost -> 私有专区主机；
     * UDocker -> 容器，默认值为“UHost”
     */
    @NotEmpty(message = "resourceType can not be empty")
    @UcloudParam("ResourceType")
    private String resourceType;

    /**
     * require 所添加的后端资源的资源ID
     */
    @UcloudParam("ResourceId")
    @NotEmpty(message = "resourceId can not be empty")
    private String resourceId;

    /**
     * optional 所添加的后端资源服务端口，取值范围[1-65535]，默认80
     */
    @UcloudParam("Port")
    private Integer port;

    /**
     * optional 后端实例状态开关，枚举值： 1：启用； 0：禁用 默认为启用
     */
    @UcloudParam("Enabled")
    private Integer enabled;

    public AllocateBackendParam( @NotEmpty(message = "region can not be empty") String region,
                                 @NotEmpty(message = "ulbId can not be empty") String ulbId,
                                 @NotEmpty(message = "vserverId can not be empty") String vserverId,
                                 @NotEmpty(message = "resourceType can not be empty") String resourceType,
                                 @NotEmpty(message = "resourceId can not be empty") String resourceId) {
        super("AllocateBackend");
        this.region = region;
        this.ulbId = ulbId;
        this.vserverId = vserverId;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUlbId() {
        return ulbId;
    }

    public void setUlbId(String ulbId) {
        this.ulbId = ulbId;
    }

    public String getVserverId() {
        return vserverId;
    }

    public void setVserverId(String vserverId) {
        this.vserverId = vserverId;
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

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
