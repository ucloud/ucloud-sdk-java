package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:  更新后端实例属性
 *
 * 警示信息: 报文转发的服务节点暂不支持修改 Port；Port/Enabled 必传一个
 * BackendId 对应是 AllocateBackend 返回的 BackendId
 * 或者 DescribeULB/DescribeVServer 返回的 ULBBackendSet 里的 BackendId
 * @author: codezhang
 * @date: 2018-09-19 17:27
 **/

public class UpdateBackendAttributeParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 负载均衡资源ID
     */
    @UcloudParam("ULBId")
    @NotEmpty(message = "ulbId can not be empty")
    private String ulbId;

    /**
     * require 后端资源实例的ID(ULB后端ID，非资源自身ID)
     */
    @NotEmpty(message = "backendId can not be empty")
    @UcloudParam("BackendId")
    private String backendId;

    /**
     * optional 后端资源服务端口，取值范围[1-65535]
     */
    @UcloudParam("Port")
    private Integer port;

    /**
     * optional 后端实例状态开关
     */
    @UcloudParam("Enabled")
    private Integer enabled;

    public UpdateBackendAttributeParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "ulbId can not be empty") String ulbId,
                                       @NotEmpty(message = "backendId can not be empty") String backendId) {
        super("UpdateBackendAttribute");
        this.region = region;
        this.ulbId = ulbId;
        this.backendId = backendId;
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

    public String getBackendId() {
        return backendId;
    }

    public void setBackendId(String backendId) {
        this.backendId = backendId;
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
