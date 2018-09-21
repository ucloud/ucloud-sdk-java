package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 绑定子网的路由表 参数类
 * @author: codezhang
 * @date: 2018-09-21 18:16
 **/

public class AssociateRouteTableParam extends BaseRequestParam {
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

    /**
     * require 路由表ID，仅限自定义路由表
     */
    @NotEmpty(message = "routeTableId can not be empty")
    @UcloudParam("RouteTableId")
    private String routeTableId;

    public AssociateRouteTableParam(@NotEmpty(message = "region can not be empty") String region,
                                    @NotEmpty(message = "subnetId can not be empty") String subnetId,
                                    @NotEmpty(message = "routeTableId can not be empty") String routeTableId) {
        super("AssociateRouteTable");
        this.region = region;
        this.subnetId = subnetId;
        this.routeTableId = routeTableId;
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

    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }
}
