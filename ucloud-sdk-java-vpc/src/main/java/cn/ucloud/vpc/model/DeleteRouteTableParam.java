package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除自定义路由表 参数类
 * @author: codezhang
 * @date: 2018-09-21 18:42
 **/

public class DeleteRouteTableParam extends BaseRequestParam {

    /**
     * require  地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;


    /**
     * require 被克隆的路由表ID
     */
    @UcloudParam("RouteTableId")
    @NotEmpty(message = "routeTableId can not be empty")
    private String routeTableId;

    public DeleteRouteTableParam(@NotEmpty(message = "region can not be empty") String region,
                                 @NotEmpty(message = "routeTableId can not be empty") String routeTableId) {
        super("DeleteRouteTable");
        this.region = region;
        this.routeTableId = routeTableId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }
}
