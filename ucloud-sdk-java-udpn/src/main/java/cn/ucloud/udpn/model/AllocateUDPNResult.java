package cn.ucloud.udpn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 分配 UDPN 专线 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-01 17:52
 */
public class AllocateUDPNResult extends BaseResponseResult {
    /**
     * 资源名称
     */
    @SerializedName("UDPNId")
    private String udpnId;

    public String getUdpnId() {
        return udpnId;
    }

    public void setUdpnId(String udpnId) {
        this.udpnId = udpnId;
    }
}
