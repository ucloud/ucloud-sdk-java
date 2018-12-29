package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 修改主机配置 结果对象
 * @author: codezhang
 * @date: 2018-09-18 12:02
 **/

public class ResizeUHostInstanceResult extends BaseResponseResult {

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
        return "ResizeUHostInstanceResult{" +
                "uhostId='" + uhostId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
