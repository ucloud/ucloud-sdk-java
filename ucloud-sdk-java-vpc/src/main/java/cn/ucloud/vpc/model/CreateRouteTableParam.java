package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 创建路由表 参数类
 * @author: codezhang
 * @date: 2018-09-21 18:08
 **/

public class CreateRouteTableParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;
    /**
     * require 源VPC短ID
     */
    @NotEmpty(message = "vpcId can not be empty")
    @UcloudParam("VPCId")
    private String vpcId;


    /**
     * optional 路由表名称 Default RouteTable
     */
    @UcloudParam("Name")
    private String name;

    /**
     * optional 业务组
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional  备注
     */
    @UcloudParam("Remark")
    private String remark;

    public CreateRouteTableParam(@NotEmpty(message = "region can not be empty") String region,
                                 @NotEmpty(message = "vpcId can not be empty") String vpcId) {
        super("CreateRouteTable");
        this.region = region;
        this.vpcId = vpcId;
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
}
