package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 申请内网虚拟IP 结果类
 * 根据提供信息，申请内网VIP(Virtual IP），多用于高可用程序作为漂移IP。
 * @author: codezhang
 * @date: 2018-09-27 14:55
 **/

public class AllocateVIPResult extends BaseResponseResult {

    public static class VIPInfo{

        /**
         * 虚拟ip
         */
        @SerializedName("VIP")
        private String vip;

        /**
         * 虚拟ip id
         */
        @SerializedName("VIPId")
        private String vipId;

        /**
         * VPC id
         */
        @SerializedName("VPCId")
        private String vpcId;

        public String getVip() {
            return vip;
        }

        public void setVip(String vip) {
            this.vip = vip;
        }

        public String getVipId() {
            return vipId;
        }

        public void setVipId(String vipId) {
            this.vipId = vipId;
        }

        public String getVpcId() {
            return vpcId;
        }

        public void setVpcId(String vpcId) {
            this.vpcId = vpcId;
        }

        @Override
        public String toString() {
            return "VIPInfo{" +
                    "vip='" + vip + '\'' +
                    ", vipId='" + vipId + '\'' +
                    ", vpcId='" + vpcId + '\'' +
                    '}';
        }
    }

    /**
     * 申请到的VIP地址
     */
    @SerializedName("DataSet")
    private List<String> vips;

    /**
     * 申请到的VIP资源相关信息
     */
    @SerializedName("VIPSet")
    private List<VIPInfo> vipInfos;



    public List<String> getVips() {
        return vips;
    }

    public void setVips(List<String> vips) {
        this.vips = vips;
    }

    public List<VIPInfo> getVipInfos() {
        return vipInfos;
    }

    public void setVipInfos(List<VIPInfo> vipInfos) {
        this.vipInfos = vipInfos;
    }

    @Override
    public String toString() {
        return "AllocateVIPResult{" +
                "vips=" + vips +
                ", vipInfos=" + vipInfos +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
