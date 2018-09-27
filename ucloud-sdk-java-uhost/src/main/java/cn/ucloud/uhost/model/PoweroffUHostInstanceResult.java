package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 模拟主机掉电 结果对象
 * @author: codezhang
 * @date: 2018-09-18 15:12
 **/

public class PoweroffUHostInstanceResult extends BaseResponseResult {

    /**
     * UHost实例ID
     */
    @SerializedName("UHostId")
    private String uhostId;

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }

    @Override
    public String toString() {
        return "PoweroffUHostInstanceResult{" +
                "uhostId='" + uhostId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
