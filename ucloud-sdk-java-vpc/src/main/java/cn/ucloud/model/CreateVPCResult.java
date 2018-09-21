package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 创建VPC 结果类
 * @author: codezhang
 * @date: 2018-09-21 11:35
 **/

public class CreateVPCResult extends BaseResponseResult {

    /**
     * VPC资源Id
     */
    @SerializedName("VPCId")
    private  String vpcId;

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public String toString() {
        return "CreateVPCResult{" +
                "vpcId='" + vpcId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
