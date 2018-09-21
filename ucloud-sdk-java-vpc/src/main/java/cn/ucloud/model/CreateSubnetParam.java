package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 创建子网 参数类
 * @author: codezhang
 * @date: 2018-09-21 15:42
 **/

public class CreateSubnetParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require VPC资源ID
     */
    @UcloudParam("VPCId")
    @NotEmpty(message = "vpcId can not be empty")
    private String vpcId;

    /**
     * require 子网网络地址，例如192.168.0.0
     */
    @NotEmpty(message = "subnet can not be empty")
    @UcloudParam("Subnet")
    private String subnet;

    /**
     * optional 子网网络号位数，默认为24
     */
    @UcloudParam("Netmask")
    private Integer netmask;

    /**
     * optional 子网名称，默认为Subnet
     */
    @UcloudParam("SubnetName")
    private String subnetNmae;

    /**
     * optional 业务组名称，默认为Default
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional 备注
     */
    @UcloudParam("Remark")
    private String remark;


    public CreateSubnetParam(@NotEmpty(message = "region can not be empty") String region,
                             @NotEmpty(message = "vpcId can not be empty") String vpcId,
                             @NotEmpty(message = "subnet can not be empty") String subnet) {
        super("CreateSubnet");
        this.region = region;
        this.vpcId = vpcId;
        this.subnet = subnet;
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

    public String getSubnet() {
        return subnet;
    }

    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }

    public Integer getNetmask() {
        return netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

    public String getSubnetNmae() {
        return subnetNmae;
    }

    public void setSubnetNmae(String subnetNmae) {
        this.subnetNmae = subnetNmae;
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
}
