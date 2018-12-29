package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取路由表详细信息(包括路由策略) 参数类
 * @author: codezhang
 * @date: 2018-09-21 18:48
 **/

public class DescribeRouteTableParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;


    /**
     * optional VPC ID
     */
    @UcloudParam("VPCId")
    private String vpcId;

    /**
     * optional 路由表ID
     */
    @UcloudParam("RouteTableId")
    private String routeTableId;

    /**
     * optional 业务组ID
     */
    @UcloudParam("BusinessId")
    private String businessId;

    /**
     * optional 个数
     */
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * optional 偏移
     */
    @UcloudParam("Offset")
    private Integer offset;

    public DescribeRouteTableParam( @NotEmpty(message = "region can not be empty") String region) {
        super("DescribeRouteTable");
        this.region = region;
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

    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
