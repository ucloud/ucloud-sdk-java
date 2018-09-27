package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 创建负载均衡 结果类
 * @author: codezhang
 * @date: 2018-09-19 09:52
 **/

public class CreateULBResult extends BaseResponseResult {

    /**
     * 负载均衡实例的Id
     */
    @SerializedName("ULBId")
    private String ulbId;

    @Override
    public String toString() {
        return "CreateULBResult{" +
                "ulbId='" + ulbId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getUlbId() {
        return ulbId;
    }

    public void setUlbId(String ulbId) {
        this.ulbId = ulbId;
    }
}
