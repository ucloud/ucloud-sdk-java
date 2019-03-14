package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
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

}
