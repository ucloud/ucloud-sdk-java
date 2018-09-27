package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 创建转发策略 结果类
 * @author: codezhang
 * @date: 2018-09-19 18:02
 **/

public class CreatePolicyResult extends BaseResponseResult {

    /**
     * 内容转发策略ID
     */
    @SerializedName("PolicyId")
    private String policyId;

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    @Override
    public String toString() {
        return "CreatePolicyResult{" +
                "policyId='" + policyId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
