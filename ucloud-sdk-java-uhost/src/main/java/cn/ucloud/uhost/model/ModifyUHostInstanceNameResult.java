package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 修改主机名 结果类
 * @author: codezhang
 * @date: 2018-09-18 14:19
 **/

public class ModifyUHostInstanceNameResult extends BaseResponseResult {

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
        return "ModifyUHostInstanceNameResult{" +
                "uhostId='" + uhostId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
