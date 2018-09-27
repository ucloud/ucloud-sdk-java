package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 创建内容转发组  参数类
 * @author: codezhang
 * @date: 2018-09-21 09:46
 **/

public class CreatePolicyGroupParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 内容转发策略组名称，默认为空
     */
    @UcloudParam("GroupName")
    private String groupName;

    public CreatePolicyGroupParam(@NotEmpty(message = "region can not be empty") String region) {
        super("CreatePolicyGroup");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
