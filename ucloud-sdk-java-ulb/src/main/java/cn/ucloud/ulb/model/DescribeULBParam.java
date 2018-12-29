package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取负载均衡信息
 * @author: codezhang
 * @date: 2018-09-19 10:12
 **/

public class DescribeULBParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */

    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional
     * 负载均衡实例的Id。
     * 若指定则返回指定的负载均衡实例的信息；
     * 若不指定则返回当前数据中心中所有的负载均衡实例的信息
     */
    @UcloudParam("ULBId")
    private String ulbId;

    /**
     * optional ULB所属的VPC
     */
    @UcloudParam("VPCId")
    private String vpcId;

    /**
     * optional ULB所属的子网ID
     */
    @UcloudParam("SubnetId")
    private String subnetId;


    /**
     * optional ULB所属的业务组ID
     */
    @UcloudParam("BusinessId")
    private String businessId;


    /**
     * optional
     * 数据偏移量，默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;

    /**
     * optional
     * 数据分页值，默认为20
     */
    @UcloudParam("Limit")
    private Integer limit;


    public DescribeULBParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeULB");
        this.region = region;
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

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
