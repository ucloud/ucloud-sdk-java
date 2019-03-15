package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 调整共享带宽的带宽值 结果类
 * @author: codezhang
 * @date: 2018-09-27 17:33
 **/

public class ResizeShareBandwidthResult extends BaseResponseResult {
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
