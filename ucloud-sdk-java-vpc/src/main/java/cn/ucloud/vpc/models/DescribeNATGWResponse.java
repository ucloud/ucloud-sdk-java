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
package cn.ucloud.vpc.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeNATGWResponse extends Response {

    /** 满足条件的实例的总数: false */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 查到的NATGW信息列表: false */
    @SerializedName("DataSet")
    private List<NatGatewayDataSet> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<NatGatewayDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<NatGatewayDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class NatGatewayIPSet extends Response {

        /** 外网IP的 EIPId: false */
        @SerializedName("EIPId")
        private String eipId;

        /** 权重为100的为出口: false */
        @SerializedName("Weight")
        private Integer weight;

        /** EIP带宽类型: false */
        @SerializedName("BandwidthType")
        private String bandwidthType;

        /** 带宽: false */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** 外网IP信息: false */
        @SerializedName("IPResInfo")
        private List<NatGWIPResInfo> ipResInfo;

        public String getEIPId() {
            return eipId;
        }

        public void setEIPId(String eipId) {
            this.eipId = eipId;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getBandwidthType() {
            return bandwidthType;
        }

        public void setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public List<NatGWIPResInfo> getIPResInfo() {
            return ipResInfo;
        }

        public void setIPResInfo(List<NatGWIPResInfo> ipResInfo) {
            this.ipResInfo = ipResInfo;
        }
    }

    public static class NatGWIPResInfo extends Response {

        /** IP的运营商信息: false */
        @SerializedName("OperatorName")
        private String operatorName;

        /** 外网IP: false */
        @SerializedName("EIP")
        private String eip;

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
    }

    public static class NatGatewaySubnetSet extends Response {

        /** 子网id: false */
        @SerializedName("SubnetworkId")
        private String subnetworkId;

        /** 子网网段: false */
        @SerializedName("Subnet")
        private String subnet;

        /** 子网名字: false */
        @SerializedName("SubnetName")
        private String subnetName;

        public String getSubnetworkId() {
            return subnetworkId;
        }

        public void setSubnetworkId(String subnetworkId) {
            this.subnetworkId = subnetworkId;
        }

        public String getSubnet() {
            return subnet;
        }

        public void setSubnet(String subnet) {
            this.subnet = subnet;
        }

        public String getSubnetName() {
            return subnetName;
        }

        public void setSubnetName(String subnetName) {
            this.subnetName = subnetName;
        }
    }

    public static class NatGatewayDataSet extends Response {

        /** natgw id: false */
        @SerializedName("NATGWId")
        private String natgwId;

        /** natgw名称: false */
        @SerializedName("NATGWName")
        private String natgwName;

        /** natgw创建时间: false */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 业务组: false */
        @SerializedName("Tag")
        private String tag;

        /** 备注: false */
        @SerializedName("Remark")
        private String remark;

        /** 绑定的防火墙Id: false */
        @SerializedName("FirewallId")
        private String firewallId;

        /** 所属VPC Id: false */
        @SerializedName("VPCId")
        private String vpcId;

        /** 子网 Id: false */
        @SerializedName("SubnetSet")
        private List<NatGatewaySubnetSet> subnetSet;

        /** 绑定的EIP 信息: false */
        @SerializedName("IPSet")
        private List<NatGatewayIPSet> ipSet;

        /** 转发策略Id: false */
        @SerializedName("PolicyId")
        private List<String> policyId;

        public String getNATGWId() {
            return natgwId;
        }

        public void setNATGWId(String natgwId) {
            this.natgwId = natgwId;
        }

        public String getNATGWName() {
            return natgwName;
        }

        public void setNATGWName(String natgwName) {
            this.natgwName = natgwName;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
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

        public String getFirewallId() {
            return firewallId;
        }

        public void setFirewallId(String firewallId) {
            this.firewallId = firewallId;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public List<NatGatewaySubnetSet> getSubnetSet() {
            return subnetSet;
        }

        public void setSubnetSet(List<NatGatewaySubnetSet> subnetSet) {
            this.subnetSet = subnetSet;
        }

        public List<NatGatewayIPSet> getIPSet() {
            return ipSet;
        }

        public void setIPSet(List<NatGatewayIPSet> ipSet) {
            this.ipSet = ipSet;
        }

        public List<String> getPolicyId() {
            return policyId;
        }

        public void setPolicyId(List<String> policyId) {
            this.policyId = policyId;
        }
    }
}
