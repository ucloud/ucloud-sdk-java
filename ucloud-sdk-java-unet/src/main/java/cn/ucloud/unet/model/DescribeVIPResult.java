package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取内网虚拟IP信息 结果类
 * @author: codezhang
 * @date: 2018-09-27 14:42
 **/

public class DescribeVIPResult extends BaseResponseResult {

    public static class VIPDetail{

        /**
         * 虚拟ip id
         */
        @SerializedName("VIPId")
        private String vipId;

        /**
         * 创建时间
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * 可用区
         */
        @SerializedName("Zone")
        private String zone;

        /**
         * 真实主机ip
         */
        @SerializedName("RealIp")
        private String realIp;

        /**
         * 虚拟ip
         */
        @SerializedName("VIP")
        private String vip;

        /**
         * 子网id
         */
        @SerializedName("SubnetId")
        private String subnetId;

        /**
         * VPC id
         */
        @SerializedName("VPCId")
        private String vpcId;

        public String getVipId() {
            return vipId;
        }

        public void setVipId(String vipId) {
            this.vipId = vipId;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getRealIp() {
            return realIp;
        }

        public void setRealIp(String realIp) {
            this.realIp = realIp;
        }

        public String getVip() {
            return vip;
        }

        public void setVip(String vip) {
            this.vip = vip;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getVpcId() {
            return vpcId;
        }

        public void setVpcId(String vpcId) {
            this.vpcId = vpcId;
        }

        @Override
        public String toString() {
            return "VIPDetail{" +
                    "vipId='" + vipId + '\'' +
                    ", createTime=" + createTime +
                    ", zone='" + zone + '\'' +
                    ", realIp='" + realIp + '\'' +
                    ", vip='" + vip + '\'' +
                    ", subnetId='" + subnetId + '\'' +
                    ", vpcId='" + vpcId + '\'' +
                    '}';
        }
    }

    /**
     * 内网VIP地址列表
     */
    @SerializedName("DataSet")
    private List<String> vips;

    /**
     * vip数量
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 内网VIP详情
     */
    @SerializedName("VIPSet")
    private List<VIPDetail> vipDetails;

    public List<String> getVips() {
        return vips;
    }

    public void setVips(List<String> vips) {
        this.vips = vips;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<VIPDetail> getVipDetails() {
        return vipDetails;
    }

    public void setVipDetails(List<VIPDetail> vipDetails) {
        this.vipDetails = vipDetails;
    }

    @Override
    public String toString() {
        return "DescribeVIPResult{" +
                "vips=" + vips +
                ", totalCount=" + totalCount +
                ", vipDetails=" + vipDetails +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
