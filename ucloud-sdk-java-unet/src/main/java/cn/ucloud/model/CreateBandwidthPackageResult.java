package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
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

    public String getBandwidthPackageId() {
        return bandwidthPackageId;
    }

    public void setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
    }

    @Override
    public String toString() {
        return "CreateBandwidthPackageResult{" +
                "bandwidthPackageId='" + bandwidthPackageId + '\'' +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
