package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 启动主机结果类
 * @author: codezhang
 * @date: 2018-09-14 16:33
 **/

public class RebootUHostInstanceResult extends BaseResponseResult {

    /**
     * 主机实例ID
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
        return "RebootUHostInstanceResult{" +
                "uhostId='" + uhostId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
