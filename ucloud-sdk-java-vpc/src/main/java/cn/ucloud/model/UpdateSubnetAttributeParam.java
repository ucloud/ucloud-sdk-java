package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 更新子网信息 参数类
 * @author: codezhang
 * @date: 2018-09-21 17:06
 **/

public class UpdateSubnetAttributeParam extends BaseRequestParam {

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
     * optional 子网名称(如果Name不填写，Tag必须填写)
     */
    @UcloudParam("Name")
    private String name;

    /**
     * optional 业务组名称(如果Tag不填写，Name必须填写)
     */
    @UcloudParam("Tag")
    private String tag;

    public UpdateSubnetAttributeParam(@NotEmpty(message = "region can not be empty") String region,
                                      @NotEmpty(message = "subnetId can not be empty") String subnetId) {
        super("UpdateSubnetAttribute");
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
}
