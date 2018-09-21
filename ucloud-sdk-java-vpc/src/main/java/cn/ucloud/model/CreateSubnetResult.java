package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 创建子网
 * @author: codezhang
 * @date: 2018-09-21 15:47
 **/

public class CreateSubnetResult extends BaseResponseResult {

    /**
     * 子网ID
     */
    @SerializedName("SubnetId")
    private String subnetId;

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    @Override
    public String toString() {
        return "CreateSubnetResult{" +
                "subnetId='" + subnetId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
