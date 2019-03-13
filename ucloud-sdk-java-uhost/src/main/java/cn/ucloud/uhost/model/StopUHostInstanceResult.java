package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 关闭主机操作结果类
 * @author: codezhang
 * @date: 2018-09-17 14:19
 **/

public class StopUHostInstanceResult extends BaseResponseResult {

    /**
     * 主机实例编号
     */
    @SerializedName("UHostId")
    private String uhostId;

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }

}
