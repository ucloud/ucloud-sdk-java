package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 申请内网虚拟IP 参数类
 * 根据提供信息，申请内网VIP(Virtual IP），多用于高可用程序作为漂移IP。
 * @author: codezhang
 * @date: 2018-09-27 14:54
 **/

public class AllocateVIPParam extends BaseRequestParam {
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
     * require vpc的id,指定vip所属的VPC
     */
    @NotEmpty(message = "VPCId can not be empty")
    @UcloudParam("VPCId")
    private String vpcId;

    /**
     * require 子网id
     */
    @NotEmpty(message = "subnetId can not be empty")
    @UcloudParam("SubnetId")
    private String subnetId;

    /**
     * optional 申请数量，默认: 1
     */
    @UcloudParam("Count")
    private Integer count;

    /**
     * optional vip名，默认为VIP
     */
    @UcloudParam("Name")
    private String name;

    /**
     * optional 业务组名称, 默认为 Default
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional 备注
     */
    @UcloudParam("Remark")
    private String remark;

    /**
     * optional 业务组
     */
    @UcloudParam("BusinessId")
    private String businessId;


    public AllocateVIPParam( @NotEmpty(message = "region can not be empty") String region,
                             @NotEmpty(message = "VPCId can not be empty") String vpcId,
                             @NotEmpty(message = "subnetId can not be empty") String subnetId) {
        super("AllocateVIP");
        this.region = region;
        this.vpcId = vpcId;
        this.subnetId = subnetId;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
}
