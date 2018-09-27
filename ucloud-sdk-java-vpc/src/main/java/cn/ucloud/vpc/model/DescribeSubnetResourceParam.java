package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取子网资源信息  参数类
 * @author: codezhang
 * @date: 2018-09-21 16:40
 **/

public class DescribeSubnetResourceParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require  子网ID
     */
    @NotEmpty(message = "subnetId can not be empty")
    @UcloudParam("SubnetId")
    private String subnetId;

    /**
     * optional 资源类型
     */
    @UcloudParam("ResourceType")
    private String resourceType;

    /**
     * optional 默认为20
     */
    @UcloudParam("Limit")
    private Integer limit;


    /**
     * optional 默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;

    public DescribeSubnetResourceParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "subnetId can not be empty") String subnetId) {
        super("DescribeSubnetResource");
        this.region = region;
        this.subnetId = subnetId;
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

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
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
