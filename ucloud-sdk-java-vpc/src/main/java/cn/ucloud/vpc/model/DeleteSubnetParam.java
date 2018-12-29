package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除子网 参数类
 * @author: codezhang
 * @date: 2018-09-21 16:02
 **/

public class DeleteSubnetParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 子网ID
     */
    @NotEmpty(message = "subnetId can not be empty")
    @UcloudParam("SubnetId")
    private String subnetId;

    public DeleteSubnetParam(@NotEmpty(message = "region can not be empty") String region,
                             @NotEmpty(message = "subnetId can not be empty") String subnetId) {
        super("DeleteSubnet");
        this.region = region;
        this.subnetId = subnetId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
}
