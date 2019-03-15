package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 创建主备redis 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CreateURedisGroupResult extends BaseResponseResult {
    /**
     * 创建的组ID
     */
    @SerializedName("GroupId")
    private String groupId;


    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


}