package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 创建负载均衡 参数类
 * 创建负载均衡实例，可以选择内网或者外网
 * 警示信息: OuterMode 与 InnerMode 同时传 Yes 时，以 OuterMode 为准
 * 当传了 InnerMode: Yes 之后，需要传一个 SubnetId 来表示用户选择了哪个子网
 * @author: codezhang
 * @date: 2018-09-19 09:36
 **/

public class CreateULBParam extends BaseRequestParam  {


    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * optional 负载均衡的名字，默认值为“ULB”
     */
    @UcloudParam("ULBName")
    private String ulbName;

    /**
     * optional 业务组
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional 备注
     */
    @UcloudParam("Remark")
    private String remark;

    /**
     * optional 创建的ULB是否为外网模式，默认即为外网模式
     */
    @UcloudParam("OuterMode")
    private String outerMode;

    /**
     * optional 创建的ULB是否为内网模式
     */
    @UcloudParam("InnerMode")
    private String innerMode;

    /**
     * optional 付费方式
     */
    @UcloudParam("ChargeType")
    private String chargeType;


    /**
     * optional ULB所在的VPC的ID, 如果不传则使用默认的VPC
     */
    @UcloudParam("VPCId")
    private String vpcId;

    /**
     * optional 内网ULB 所属的子网ID，如果不传则使用默认的子网
     */
    @UcloudParam("SubnetId")
    private String subnetId;

    /**
     * optional ULB 所属的业务组ID，如果不传则使用默认的业务组
     */
    @UcloudParam("BusinessId")
    private String businessId;

    public CreateULBParam( @NotEmpty(message = "region can not be empty") String region) {
        super("CreateULB");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUlbName() {
        return ulbName;
    }

    public void setUlbName(String ulbName) {
        this.ulbName = ulbName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOuterMode() {
        return outerMode;
    }

    public void setOuterMode(String outerMode) {
        this.outerMode = outerMode;
    }

    public String getInnerMode() {
        return innerMode;
    }

    public void setInnerMode(String innerMode) {
        this.innerMode = innerMode;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
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

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
}
