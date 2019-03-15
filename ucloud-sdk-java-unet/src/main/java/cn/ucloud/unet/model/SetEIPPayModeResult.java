package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 设置弹性IP计费方式 参数类
 * 设置弹性IP计费模式, 切换时会涉及付费/退费.
 * @author: codezhang
 * @date: 2018-09-27 14:25
 **/

public class SetEIPPayModeResult extends BaseResponseResult  {
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
