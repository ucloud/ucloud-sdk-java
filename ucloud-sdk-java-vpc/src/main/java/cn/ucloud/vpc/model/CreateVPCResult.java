package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;
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

}
