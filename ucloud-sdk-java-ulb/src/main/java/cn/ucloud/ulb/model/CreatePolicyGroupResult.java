package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 09:55
 **/

public class CreatePolicyGroupResult extends BaseResponseResult {

    /**
     * 内容转发策略组的Id
     */
    @SerializedName("GroupId")
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "CreatePolicyGroupResult{" +
                "groupId='" + groupId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
