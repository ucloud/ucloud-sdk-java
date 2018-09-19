package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除VServer
 *警示信息: VServerId 对应 CreateVServer 返回的 VServerId
 *  或者 DescribeVServer / DescribeULB 返回的 ULBVServerSet 中的 VServerId
 * @author: codezhang
 * @date: 2018-09-19 14:14
 **/

public class DeleteVServerParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 负载均衡实例ID
     */
    @UcloudParam("ULBId")
    @NotEmpty(message = "ulbId can not be empty")
    private String ulbId;

    /**
     * require VServer实例ID
     */
    @NotEmpty(message = "vserverId can be empty")
    @UcloudParam("VServerId")
    private String vserverId;

    public DeleteVServerParam(@NotEmpty(message = "region can not be empty") String region,
                              @NotEmpty(message = "ulbId can not be empty") String ulbId,
                              @NotEmpty(message = "vserverId can be empty") String vserverId) {
        super("DeleteVServer");
        this.region = region;
        this.ulbId = ulbId;
        this.vserverId = vserverId;
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
}
