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
package cn.ucloud.ulb.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeULBSimpleResponse extends Response {

    /** 满足条件的ULB总数: false */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** ULB列表，每项参数详见 ULBSimpleSet: false */
    @SerializedName("DataSet")
    private List<ULBSimpleSet> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ULBSimpleSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<ULBSimpleSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class FirewallSet extends Response {

        /** 防火墙名称: false */
        @SerializedName("FirewallName")
        private String firewallName;

        /** 防火墙ID: false */
        @SerializedName("FirewallId")
        private String firewallId;

        public String getFirewallName() {
            return firewallName;
        }

        public void setFirewallName(String firewallName) {
            this.firewallName = firewallName;
        }

        public String getFirewallId() {
            return firewallId;
        }

        public void setFirewallId(String firewallId) {
            this.firewallId = firewallId;
        }
    }

    public static class ULBIPSet extends Response {

        /** 弹性IP的运营商信息，枚举值为： Bgp：BGP IP International：国际IP: false */
        @SerializedName("OperatorName")
        private String operatorName;

        /** 弹性IP地址: false */
        @SerializedName("EIP")
        private String eip;

        /** 弹性IP的ID: false */
        @SerializedName("EIPId")
        private String eipId;

        /** 弹性IP的带宽类型，枚举值：1 表示是共享带宽，0 普通带宽类型（暂未对外开放）: false */
        @SerializedName("BandwidthType")
        private Integer bandwidthType;

        /** 弹性IP的带宽值（暂未对外开放）: false */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getEIP() {
            return eip;
        }

        public void setEIP(String eip) {
            this.eip = eip;
        }

        public String getEIPId() {
            return eipId;
        }

        public void setEIPId(String eipId) {
            this.eipId = eipId;
        }

        public Integer getBandwidthType() {
            return bandwidthType;
        }

        public void setBandwidthType(Integer bandwidthType) {
            this.bandwidthType = bandwidthType;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }
    }

    public static class ULBSimpleSet extends Response {

        /**
         * ULB 监听器类型，枚举值：RequestProxy，请求代理； PacketsTransmit ，报文转发；Comprehensive，兼容型；Pending，未定型:
         * false
         */
        @SerializedName("ListenType")
        private String listenType;

        /** ULB提供服务的IP类型。枚举值，“IPv4”,"IPv6"。默认为“IPv4”: false */
        @SerializedName("IPVersion")
        private String ipVersion;

        /** 负载均衡的资源ID : false */
        @SerializedName("ULBId")
        private String ulbId;

        /** 负载均衡的资源名称: false */
        @SerializedName("Name")
        private String name;

        /** 负载均衡的业务组名称: false */
        @SerializedName("Tag")
        private String tag;

        /** 负载均衡的备注: false */
        @SerializedName("Remark")
        private String remark;

        /** ULB的创建时间，格式为Unix Timestamp: false */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** ULB所在的VPC的ID: false */
        @SerializedName("VPCId")
        private String vpcId;

        /** ULB 为 InnerMode 时，ULB 所属的子网ID: false */
        @SerializedName("SubnetId")
        private String subnetId;

        /** ULB 所属的业务组ID: false */
        @SerializedName("BusinessId")
        private String businessId;

        /** ULB的内网IP，当ULBType为OuterMode时，该值为空 : false */
        @SerializedName("PrivateIP")
        private String privateIP;

        /** 带宽类型，枚举值为： 0，非共享带宽； 1，共享带宽 : false */
        @SerializedName("BandwidthType")
        private Integer bandwidthType;

        /** 带宽: false */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** ULB的详细信息列表，具体结构见下方 ULBIPSet: false */
        @SerializedName("IPSet")
        private List<ULBIPSet> ipSet;

        /** ulb下vserver数量: false */
        @SerializedName("VServerCount")
        private Integer vServerCount;

        /** ULB 的类型（InnerMode or OuterMode）: false */
        @SerializedName("ULBType")
        private String ulbType;

        /** 防火墙信息，具体结构见下方 FirewallSet: false */
        @SerializedName("FirewallSet")
        private List<FirewallSet> firewallSet;

        /** ULB是否开启日志功能。0，关闭；1，开启: false */
        @SerializedName("EnableLog")
        private Integer enableLog;

        /** 日志功能相关信息，仅当EnableLog为true时会返回，具体结构见下方 LoggerSet: false */
        @SerializedName("LogSet")
        private LoggerSet logSet;

        public String getListenType() {
            return listenType;
        }

        public void setListenType(String listenType) {
            this.listenType = listenType;
        }

        public String getIPVersion() {
            return ipVersion;
        }

        public void setIPVersion(String ipVersion) {
            this.ipVersion = ipVersion;
        }

        public String getULBId() {
            return ulbId;
        }

        public void setULBId(String ulbId) {
            this.ulbId = ulbId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getBusinessId() {
            return businessId;
        }

        public void setBusinessId(String businessId) {
            this.businessId = businessId;
        }

        public String getPrivateIP() {
            return privateIP;
        }

        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        public Integer getBandwidthType() {
            return bandwidthType;
        }

        public void setBandwidthType(Integer bandwidthType) {
            this.bandwidthType = bandwidthType;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public List<ULBIPSet> getIPSet() {
            return ipSet;
        }

        public void setIPSet(List<ULBIPSet> ipSet) {
            this.ipSet = ipSet;
        }

        public Integer getVServerCount() {
            return vServerCount;
        }

        public void setVServerCount(Integer vServerCount) {
            this.vServerCount = vServerCount;
        }

        public String getULBType() {
            return ulbType;
        }

        public void setULBType(String ulbType) {
            this.ulbType = ulbType;
        }

        public List<FirewallSet> getFirewallSet() {
            return firewallSet;
        }

        public void setFirewallSet(List<FirewallSet> firewallSet) {
            this.firewallSet = firewallSet;
        }

        public Integer getEnableLog() {
            return enableLog;
        }

        public void setEnableLog(Integer enableLog) {
            this.enableLog = enableLog;
        }

        public LoggerSet getLogSet() {
            return logSet;
        }

        public void setLogSet(LoggerSet logSet) {
            this.logSet = logSet;
        }
    }

    public static class LoggerSet extends Response {

        /** ulb日志上传的bucket: false */
        @SerializedName("BucketName")
        private String bucketName;

        /** 上传到bucket使用的token的tokenid: false */
        @SerializedName("TokenID")
        private String tokenID;

        /** bucket的token名称: false */
        @SerializedName("TokenName")
        private String tokenName;

        public String getBucketName() {
            return bucketName;
        }

        public void setBucketName(String bucketName) {
            this.bucketName = bucketName;
        }

        public String getTokenID() {
            return tokenID;
        }

        public void setTokenID(String tokenID) {
            this.tokenID = tokenID;
        }

        public String getTokenName() {
            return tokenName;
        }

        public void setTokenName(String tokenName) {
            this.tokenName = tokenName;
        }
    }
}
