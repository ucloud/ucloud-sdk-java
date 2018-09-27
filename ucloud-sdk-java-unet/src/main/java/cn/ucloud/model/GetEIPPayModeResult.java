package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取弹性IP计费方式 结果类
 * @author: codezhang
 * @date: 2018-09-27 14:00
 **/

public class GetEIPPayModeResult extends BaseResponseResult {

    public static class EIPPayMode{
        /**
         * EIP的资源ID
         */
        @SerializedName("EIPId")
        private String eipId;

        /**
         * EIP的计费模式. 枚举值为：Bandwidth, 带宽计费;Traffic, 流量计费; "ShareBandwidth",共享带宽模式
         */
        @SerializedName("EIPPayMode")
        private String payMode;

        public String getEipId() {
            return eipId;
        }

        public void setEipId(String eipId) {
            this.eipId = eipId;
        }

        public String getPayMode() {
            return payMode;
        }

        public void setPayMode(String payMode) {
            this.payMode = payMode;
        }

        @Override
        public String toString() {
            return "EIPPayMode{" +
                    "eipId='" + eipId + '\'' +
                    ", payMode='" + payMode + '\'' +
                    '}';
        }
    }

    @SerializedName("EIPPayMode")
    private List<EIPPayMode> eipPayModes;

    public List<EIPPayMode> getEipPayModes() {
        return eipPayModes;
    }

    public void setEipPayModes(List<EIPPayMode> eipPayModes) {
        this.eipPayModes = eipPayModes;
    }

    @Override
    public String toString() {
        return "GetEIPPayModeResult{" +
                "eipPayModes=" + eipPayModes +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
