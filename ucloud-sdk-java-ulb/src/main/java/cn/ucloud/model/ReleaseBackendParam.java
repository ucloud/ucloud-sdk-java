package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 释放后端实例 参数类
 * 警示信息: VServer 为7层时，必须先把后端实例从转发规则中移除之后才能释放
 * BackendId 对应是 AllocateBackend 返回的 BackendId
 * 或者 DescribeULB/DescribeVServer 返回的 ULBBackendSet 里的 BackendId
 * @author: codezhang
 * @date: 2018-09-19 15:10
 **/

public class ReleaseBackendParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 负载均衡实例的ID
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

    public ReleaseBackendParam(@NotEmpty(message = "region can not be empty") String region,
                               @NotEmpty(message = "ulbId can not be empty") String ulbId,
                               @NotEmpty(message = "backendId can not be empty") String backendId) {
        super("ReleaseBackend");
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
}
