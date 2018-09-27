package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取内网虚拟IP信息 参数类
 * @author: codezhang
 * @date: 2018-09-27 14:42
 **/

public class DescribeVIPParam extends BaseRequestParam {

    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * optional vpc的id,指定SubnetId时必填
     */
    @UcloudParam("VPCId")
    private String vpcId;

    /**
     * optional 子网id，不指定则获取VPCId下的所有vip
     */
    @UcloudParam("SubnetId")
    private String subnetId;

    /**
     * optional 业务组名称, 默认为 Default
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional 业务组
     */
    @UcloudParam("BusinessId")
    private String businessId;

    public DescribeVIPParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeVIP");
        this.region = region;
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

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
}
