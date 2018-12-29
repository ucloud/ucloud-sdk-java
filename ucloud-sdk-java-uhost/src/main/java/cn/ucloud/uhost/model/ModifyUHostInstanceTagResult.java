package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 修改主机业务组 结果类
 * @author: codezhang
 * @date: 2018-09-17 18:32
 **/

public class ModifyUHostInstanceTagResult extends BaseResponseResult {

    /**
     * 主机实例ID
     */
    @SerializedName("UhostId")
    private String  uhostId;

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }

    @Override
    public String toString() {
        return "ModifyUHostInstanceTagResult{" +
                "uhostId='" + uhostId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
