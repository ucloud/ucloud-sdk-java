package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 导入配置 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 20:05
 **/
public class UploadUDBParamGroupResult extends BaseResponseResult {

    /**
     * 配置参数组id
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
        return "UploadUDBParamGroupResult{" +
                "groupId='" + groupId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
