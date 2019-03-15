package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取共享带宽信息 结果类
 * @author: codezhang
 * @date: 2018-09-27 16:52
 **/

public class DescribeShareBandwidthResult extends BaseResponseResult {

    public static class ShareBandwidth {

        /**
         * 共享带宽值(预付费)/共享带宽峰值(后付费), 单位Mbps
         */
        @SerializedName("ShareBandwidth")
        private Integer shareBandwidth;

        /**
         * 共享带宽的资源ID
         */
        @SerializedName("ShareBandwidthId")
        private String shareBandwidthId;

        /**
         * 付费方式, 预付费:Year 按年,Month 按月,Dynamic 按需;后付费:PostPay(按月)
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 创建时间, 格式为Unix Timestamp
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * 过期时间, 格式为Unix Timestamp
         */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /**
         * EIP信息,详情见 EIPAddrSet
         */
        @SerializedName("EIPSet")
        private List<EIP> eips;

        /**
         * 共享带宽保底值(后付费)
         */
        @SerializedName("BandwidthGuarantee")
        private Integer bandwidthGuarantee;

        /**
         * 共享带宽后付费开始计费时间(后付费)
         */
        @SerializedName("PostPayStartTime")
        private Integer postPayStartTime;

        /**
         * 共享带宽名称
         */
        @SerializedName("Name")
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getShareBandwidth() {
            return shareBandwidth;
        }

        public void setShareBandwidth(Integer shareBandwidth) {
            this.shareBandwidth = shareBandwidth;
        }

        public String getShareBandwidthId() {
            return shareBandwidthId;
        }

        public void setShareBandwidthId(String shareBandwidthId) {
            this.shareBandwidthId = shareBandwidthId;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public List<EIP> getEips() {
            return eips;
        }

        public void setEips(List<EIP> eips) {
            this.eips = eips;
        }

        public Integer getBandwidthGuarantee() {
            return bandwidthGuarantee;
        }

        public void setBandwidthGuarantee(Integer bandwidthGuarantee) {
            this.bandwidthGuarantee = bandwidthGuarantee;
        }

        public Integer getPostPayStartTime() {
            return postPayStartTime;
        }

        public void setPostPayStartTime(Integer postPayStartTime) {
            this.postPayStartTime = postPayStartTime;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public static class EIP {
        @SerializedName("Bandwidth")
        private Integer bandWidth;

        @SerializedName("EIPId")
        private String eipId;

        @SerializedName("EIPAddr")
        private List<EIPAddr> eipAddrs;

        public Integer getBandWidth() {
            return bandWidth;
        }

        public void setBandWidth(Integer bandWidth) {
            this.bandWidth = bandWidth;
        }

        public String getEipId() {
            return eipId;
        }

        public void setEipId(String eipId) {
            this.eipId = eipId;
        }

        public List<EIPAddr> getEipAddrs() {
            return eipAddrs;
        }

        public void setEipAddrs(List<EIPAddr> eipAddrs) {
            this.eipAddrs = eipAddrs;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }


    public static class EIPAddr {

        /**
         * 运营商信息, 枚举值为: Bgp: BGP; International: 国际.
         */
        @SerializedName("OperatorName")
        private String operatorName;

        /**
         * 弹性ip地址
         */
        @SerializedName("IP")
        private String ip;

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }

    /**
     * 共享带宽信息组 参见 UnetShareBandwidthSet
     */
    @SerializedName("DataSet")
    private List<ShareBandwidth> shareBandwidths;

    /**
     * 请求UUID
     */
    @SerializedName("Request_uuid")
    private String requestUuid;

    /**
     * 总数量
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public String getRequestUuid() {
        return requestUuid;
    }

    public void setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ShareBandwidth> getShareBandwidths() {
        return shareBandwidths;
    }

    public void setShareBandwidths(List<ShareBandwidth> shareBandwidths) {
        this.shareBandwidths = shareBandwidths;
    }
}
