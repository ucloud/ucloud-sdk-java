package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;
import com.google.gson.annotations.SerializedName;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除内容转发组 参数类
 * @author: codezhang
 * @date: 2018-09-21 10:17
 **/

public class DeletePolicyGroupParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;


    @NotEmpty(message = "groupId can not be empty")
    @SerializedName("GroupId")
    private String groupId;

    public DeletePolicyGroupParam(@NotEmpty(message = "region can not be empty") String region,
                                  @NotEmpty(message = "groupId can not be empty") String groupId) {
        super("DeletePolicyGroup");
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
}
