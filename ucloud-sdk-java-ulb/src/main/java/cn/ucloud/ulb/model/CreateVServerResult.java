package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 11:58
 **/

public class CreateVServerResult extends BaseResponseResult {

    /**
     * VServer实例的Id
     */
    @SerializedName("VServerId")
    private String vserverId;

    public String getVserverId() {
        return vserverId;
    }

    public void setVserverId(String vserverId) {
        this.vserverId = vserverId;
    }

    @Override
    public String toString() {
        return "CreateVServerResult{" +
                "vserverId='" + vserverId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
