/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.unet.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeShareBandwidthResponse extends Response {

    /** 共享带宽信息组 参见 UnetShareBandwidthSet */
    @SerializedName("DataSet")
    private List<UnetShareBandwidthSet> dataSet;

    /** 符合条件的共享带宽总数，大于等于返回DataSet长度 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<UnetShareBandwidthSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UnetShareBandwidthSet> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class UnetShareBandwidthSet extends Response {

        /** 共享带宽类型 */
        @SerializedName("IPVersion")
        private String ipVersion;

        /** 共享带宽值(预付费)/共享带宽峰值(后付费), 单位Mbps */
        @SerializedName("ShareBandwidth")
        private Integer shareBandwidth;

        /** 共享带宽的资源ID */
        @SerializedName("ShareBandwidthId")
        private String shareBandwidthId;

        /** 付费方式, 预付费:Year 按年,Month 按月,Dynamic 按需;后付费:PostPay(按月) */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 创建时间, 格式为Unix Timestamp */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 过期时间, 格式为Unix Timestamp */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** EIP信息,详情见 EIPSetData */
        @SerializedName("EIPSet")
        private List<EIPSetData> eipSet;

        /** 共享带宽名称 */
        @SerializedName("Name")
        private String name;

        public String getIPVersion() {
            return ipVersion;
        }

        public void setIPVersion(String ipVersion) {
            this.ipVersion = ipVersion;
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

        public List<EIPSetData> getEIPSet() {
            return eipSet;
        }

        public void setEIPSet(List<EIPSetData> eipSet) {
            this.eipSet = eipSet;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class EIPSetData extends Response {

        /** EIP带宽值 */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** EIP的IP信息，详情见EIPAddrSet */
        @SerializedName("EIPAddr")
        private List<EIPAddrSet> eipAddr;

        /** EIP资源Id */
        @SerializedName("EIPId")
        private String eipId;

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public List<EIPAddrSet> getEIPAddr() {
            return eipAddr;
        }

        public void setEIPAddr(List<EIPAddrSet> eipAddr) {
            this.eipAddr = eipAddr;
        }

        public String getEIPId() {
            return eipId;
        }

        public void setEIPId(String eipId) {
            this.eipId = eipId;
        }
    }

    public static class EIPAddrSet extends Response {

        /** 运营商信息, 枚举值为: BGP: BGP; International: 国际. */
        @SerializedName("OperatorName")
        private String operatorName;

        /** 弹性IP地址 */
        @SerializedName("IP")
        private String ip;

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }
    }
}
