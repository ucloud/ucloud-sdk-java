package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 路由策略增、删、改 参数类
 * @author: codezhang
 * @date: 2018-09-21 19:38
 **/

public class ModifyRouteRuleParam extends BaseRequestParam {


    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;


    /**
     * require 路由表ID
     */
    @UcloudParam("RouteTableId")
    @NotEmpty(message = "routeTableId can not be empty")
    private String routeTableId;

    public ModifyRouteRuleParam() {
        super("ModifyRouteRule");
    }
}
