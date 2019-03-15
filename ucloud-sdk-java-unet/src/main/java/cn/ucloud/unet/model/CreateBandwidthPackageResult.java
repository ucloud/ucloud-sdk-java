package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 创建带宽包 结果类
 * 为非共享带宽模式下, 已绑定资源实例的带宽计费弹性IP附加临时带宽包
 * @author: codezhang
 * @date: 2018-09-27 15:17
 **/

public class CreateBandwidthPackageResult extends BaseResponseResult {

    /**
     * 所创建带宽包的资源ID
     */
    @SerializedName("BandwidthPackageId")
    private String bandwidthPackageId;

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

    public String getBandwidthPackageId() {
        return bandwidthPackageId;
    }

    public void setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
    }
}
