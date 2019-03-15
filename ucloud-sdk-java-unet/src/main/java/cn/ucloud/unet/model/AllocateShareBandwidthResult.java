package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 开通共享带宽 结果类
 * @author: codezhang
 * @date: 2018-09-27 16:40
 **/

public class AllocateShareBandwidthResult extends BaseResponseResult {
    /**
     * 共享带宽资源id
     */
    @SerializedName("ShareBandwidthId")
    private String shareBandwidthId;

    /**
     * 请求UUID
     */
    @SerializedName("Request_uuid")
    private String requestUuid;

    public String getShareBandwidthId() {
        return shareBandwidthId;
    }

    public void setShareBandwidthId(String shareBandwidthId) {
        this.shareBandwidthId = shareBandwidthId;
    }

    public String getRequestUuid() {
        return requestUuid;
    }

    public void setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
    }
}
