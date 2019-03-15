package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 释放弹性IP资源, 所释放弹性IP必须为非绑定状态. 结果类
 * @author: codezhang
 * @date: 2018-09-27 11:16
 **/

public class ReleaseEIPResult extends BaseResponseResult {
    /**
     * 请求UUID
     */
    @SerializedName("Request_uuid")
    private String requestUuid;

    public String getRequestUuid() {
        return requestUuid;
    }

    public void setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
    }
}
