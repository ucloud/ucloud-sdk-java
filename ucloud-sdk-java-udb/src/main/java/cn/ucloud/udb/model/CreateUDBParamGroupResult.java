package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 从已有配置文件创建新配置文件 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 22:36
 **/
public class CreateUDBParamGroupResult extends BaseResponseResult {

    /**
     * 新配置参数组id
     */
    @SerializedName("GroupId")
    private String groupId;


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
