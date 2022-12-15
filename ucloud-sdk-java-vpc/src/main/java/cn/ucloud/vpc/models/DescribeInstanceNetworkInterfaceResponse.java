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

public class DescribeInstanceNetworkInterfaceResponse extends Response {

    /** 虚拟网卡信息 */
    @SerializedName("NetworkInterfaceSet")
    private List<InstanceNetworkInterface> networkInterfaceSet;

    public List<InstanceNetworkInterface> getNetworkInterfaceSet() {
        return networkInterfaceSet;
    }

    public void setNetworkInterfaceSet(List<InstanceNetworkInterface> networkInterfaceSet) {
        this.networkInterfaceSet = networkInterfaceSet;
    }

    public static class InstanceNetworkInterface extends Response {

        /** 虚拟网卡资源ID */
        @SerializedName("InterfaceId")
        private String interfaceId;

        /** 所属VPC */
        @SerializedName("VPCId")
        private String vpcId;

        /** 所属子网 */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 关联内网IP。当前一个网卡仅支持绑定一个内网IP */
        @SerializedName("PrivateIpSet")
        private List<String> privateIpSet;

        /** 关联Mac */
        @SerializedName("MacAddress")
        private String macAddress;

        /** 绑定状态 */
        @SerializedName("Status")
        private Integer status;

        /** 虚拟网卡名称 */
        @SerializedName("Name")
        private String name;

        /** 内网IP掩码 */
        @SerializedName("Netmask")
        private String netmask;

        /** 默认网关 */
        @SerializedName("Gateway")
        private String gateway;

        /** 绑定实例资源ID */
        @SerializedName("AttachInstanceId")
        private String attachInstanceId;

        /** 是否是绑定实例的默认网卡 false:不是 true:是 */
        @SerializedName("Default")
        private Boolean fDefault;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 业务组 */
        @SerializedName("Tag")
        private String tag;

        /** 虚拟网卡绑定的EIP ID信息 */
        @SerializedName("EIPIdSet")
        private List<String> eipIdSet;

        /** 虚拟网卡绑定的防火墙ID信息 */
        @SerializedName("FirewallIdSet")
        private List<String> firewallIdSet;

        public String getInterfaceId() {
            return interfaceId;
        }

        public void setInterfaceId(String interfaceId) {
            this.interfaceId = interfaceId;
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

        public List<String> getPrivateIpSet() {
            return privateIpSet;
        }

        public void setPrivateIpSet(List<String> privateIpSet) {
            this.privateIpSet = privateIpSet;
        }

        public String getMacAddress() {
            return macAddress;
        }

        public void setMacAddress(String macAddress) {
            this.macAddress = macAddress;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNetmask() {
            return netmask;
        }

        public void setNetmask(String netmask) {
            this.netmask = netmask;
        }

        public String getGateway() {
            return gateway;
        }

        public void setGateway(String gateway) {
            this.gateway = gateway;
        }

        public String getAttachInstanceId() {
            return attachInstanceId;
        }

        public void setAttachInstanceId(String attachInstanceId) {
            this.attachInstanceId = attachInstanceId;
        }

        public Boolean getDefault() {
            return fDefault;
        }

        public void setDefault(Boolean fDefault) {
            this.fDefault = fDefault;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public List<String> getEIPIdSet() {
            return eipIdSet;
        }

        public void setEIPIdSet(List<String> eipIdSet) {
            this.eipIdSet = eipIdSet;
        }

        public List<String> getFirewallIdSet() {
            return firewallIdSet;
        }

        public void setFirewallIdSet(List<String> firewallIdSet) {
            this.firewallIdSet = firewallIdSet;
        }
    }
}
