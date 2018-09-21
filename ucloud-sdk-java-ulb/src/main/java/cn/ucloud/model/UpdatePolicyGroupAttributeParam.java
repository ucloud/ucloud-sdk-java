package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;
import com.google.gson.annotations.SerializedName;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 更新内容转发组属性 参数类
 * @author: codezhang
 * @date: 2018-09-21 10:24
 **/

public class UpdatePolicyGroupAttributeParam extends BaseRequestParam {



    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;


    /**
     * require  内容转发策略组ID
     */
    @NotEmpty(message = "groupId can not be empty")
    @SerializedName("GroupId")
    private String groupId;

    /**
     * optional 修改策略转发组名称
     */
    @SerializedName("GroupName")
    private String groupName;

    public UpdatePolicyGroupAttributeParam( @NotEmpty(message = "region can not be empty") String region,
                                            @NotEmpty(message = "groupId can not be empty") String groupId) {
        super("UpdatePolicyGroupAttribute");
        this.region = region;
        this.groupId = groupId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
