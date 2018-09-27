package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除转发策略 参数类
 * @author: codezhang
 * @date: 2018-09-19 18:44
 **/

public class DeletePolicyParam extends BaseRequestParam {
    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;


    /**
     * require 转发规则的ID
     */
    @NotEmpty(message = "policy can not be empty")
    @UcloudParam("PolicyId")
    private String policyId;

    /**
     * optional VServer实例的ID
     */
    @UcloudParam("VServerId")
    private String vserverId;

    /**
     * optional 内容转发策略组ID
     */
    @UcloudParam("GroupId")
    private String groupId;


    public DeletePolicyParam(@NotEmpty(message = "region can not be empty") String region,
                             @NotEmpty(message = "policy can not be empty") String policyId) {
        super("DeletePolicy");
        this.region = region;
        this.policyId = policyId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getVserverId() {
        return vserverId;
    }

    public void setVserverId(String vserverId) {
        this.vserverId = vserverId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
