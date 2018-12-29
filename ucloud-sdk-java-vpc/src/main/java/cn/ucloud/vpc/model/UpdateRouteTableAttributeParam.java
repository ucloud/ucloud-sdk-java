package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 更新路由表基本信息 参数类
 * @author: codezhang
 * @date: 2018-09-21 19:45
 **/

public class UpdateRouteTableAttributeParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;


    /**
     * require 路由表ID 通过DescribeRouteTable拿到
     */
    @UcloudParam("RouteTableId")
    @NotEmpty(message = "routeTableId can not be empty")
    private String routeTableId;

    /**
     * optional 路由表名称
     */
    @UcloudParam("Name")
    private String name;

    /**
     * optional 备注
     */
    @UcloudParam("Remark")
    private String remark;

    public UpdateRouteTableAttributeParam( @NotEmpty(message = "region can not be empty") String region,
                                          @NotEmpty(message = "routeTableId can not be empty") String routeTableId) {
        super("UpdateRouteTableAttribute");
        this.region = region;
        this.routeTableId = routeTableId;
    }

    /**
     * optional 业务组名称
     */
    @UcloudParam("Tag")
    private String tag;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


}
