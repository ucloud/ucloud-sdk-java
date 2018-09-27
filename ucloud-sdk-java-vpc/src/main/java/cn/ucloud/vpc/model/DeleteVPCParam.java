package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除VPC 参数类
 * @author: codezhang
 * @date: 2018-09-21 14:04
 **/

public class DeleteVPCParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require VPC资源Id
     */
    @UcloudParam("VPCId")
    @NotEmpty(message = "vpcId can not be empty")
    private String vpcId;

    public DeleteVPCParam( @NotEmpty(message = "region can not be empty") String region,
                           @NotEmpty(message = "vpcId can not be empty") String vpcId) {
        super("DeleteVPC");
        this.region = region;
        this.vpcId = vpcId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
}
