package cn.ucloud.udpn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 描述 UDPN 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-04 10:36
 */
public class DescribeUDPNResult extends BaseResponseResult {
    /**
     * 查询到的总数量
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * UDPN详情
     */
    @SerializedName("DataSet")
    private List<UDPNData> dataSet;

    public static class UDPNData {
        /**
         * UDPN 资源短 ID
         */
        @SerializedName("UDPNId")
        private String udpnId;
        /**
         * 可用区域 1
         */
        @SerializedName("Peer1")
        private String peer1;
        /**
         * 可用区域 2
         */
        @SerializedName("Peer2")
        private String peer2;
        /**
         * 计费类型
         */
        @SerializedName("ChargeType")
        private String chargeType;
        /**
         * 带宽
         */
        @SerializedName("Bandwidth")
        private Integer bandWidth;
        /**
         * unix 时间戳 创建时间
         */
        @SerializedName("CreateTime")
        private Integer createTime;
        /**
         * unix 时间戳 到期时间
         */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        @SerializedName("PayMode")
        private String payMode;

        public String getPayMode() {
            return payMode;
        }

        public void setPayMode(String payMode) {
            this.payMode = payMode;
        }

        public String getUdpnId() {
            return udpnId;
        }

        public void setUdpnId(String udpnId) {
            this.udpnId = udpnId;
        }

        public String getPeer1() {
            return peer1;
        }

        public void setPeer1(String peer1) {
            this.peer1 = peer1;
        }

        public String getPeer2() {
            return peer2;
        }

        public void setPeer2(String peer2) {
            this.peer2 = peer2;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getBandWidth() {
            return bandWidth;
        }

        public void setBandWidth(Integer bandWidth) {
            this.bandWidth = bandWidth;
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

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UDPNData> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDPNData> dataSet) {
        this.dataSet = dataSet;
    }
}
