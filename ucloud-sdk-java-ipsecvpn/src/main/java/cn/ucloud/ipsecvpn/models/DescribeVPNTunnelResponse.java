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
package cn.ucloud.ipsecvpn.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeVPNTunnelResponse extends Response {

    /** VPN隧道总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 获取的VPN隧道信息列表，每项参数详见 VPNTunnelDataSet */
    @SerializedName("DataSet")
    private List<VPNTunnelDataSet> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<VPNTunnelDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<VPNTunnelDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class VPNTunnelDataSet extends Response {

        /** 隧道id */
        @SerializedName("VPNTunnelId")
        private String vpnTunnelId;

        /** 隧道名称 */
        @SerializedName("VPNTunnelName")
        private String vpnTunnelName;

        /** 用户组 */
        @SerializedName("Tag")
        private String tag;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 所属VPN网关id */
        @SerializedName("VPNGatewayId")
        private String vpnGatewayId;

        /** 对端网关Id */
        @SerializedName("RemoteVPNGatewayId")
        private String remoteVPNGatewayId;

        /** VPN网关名字 */
        @SerializedName("VPNGatewayName")
        private String vpnGatewayName;

        /** 对端网关名字 */
        @SerializedName("RemoteVPNGatewayName")
        private String remoteVPNGatewayName;

        /** 所属VPCId */
        @SerializedName("VPCId")
        private String vpcId;

        /** 所属VOC名字 */
        @SerializedName("VPCName")
        private String vpcName;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** IKE参数 */
        @SerializedName("IKEData")
        private IKEData ikeData;

        /** IPSec参数 */
        @SerializedName("IPSecData")
        private IPSecData ipSecData;

        public String getVPNTunnelId() {
            return vpnTunnelId;
        }

        public void setVPNTunnelId(String vpnTunnelId) {
            this.vpnTunnelId = vpnTunnelId;
        }

        public String getVPNTunnelName() {
            return vpnTunnelName;
        }

        public void setVPNTunnelName(String vpnTunnelName) {
            this.vpnTunnelName = vpnTunnelName;
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

        public String getVPNGatewayId() {
            return vpnGatewayId;
        }

        public void setVPNGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
        }

        public String getRemoteVPNGatewayId() {
            return remoteVPNGatewayId;
        }

        public void setRemoteVPNGatewayId(String remoteVPNGatewayId) {
            this.remoteVPNGatewayId = remoteVPNGatewayId;
        }

        public String getVPNGatewayName() {
            return vpnGatewayName;
        }

        public void setVPNGatewayName(String vpnGatewayName) {
            this.vpnGatewayName = vpnGatewayName;
        }

        public String getRemoteVPNGatewayName() {
            return remoteVPNGatewayName;
        }

        public void setRemoteVPNGatewayName(String remoteVPNGatewayName) {
            this.remoteVPNGatewayName = remoteVPNGatewayName;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getVPCName() {
            return vpcName;
        }

        public void setVPCName(String vpcName) {
            this.vpcName = vpcName;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public IKEData getIKEData() {
            return ikeData;
        }

        public void setIKEData(IKEData ikeData) {
            this.ikeData = ikeData;
        }

        public IPSecData getIPSecData() {
            return ipSecData;
        }

        public void setIPSecData(IPSecData ipSecData) {
            this.ipSecData = ipSecData;
        }
    }

    public static class IKEData extends Response {

        /** IKE认证算法 */
        @SerializedName("IKEAuthenticationAlgorithm")
        private String ikeAuthenticationAlgorithm;

        /** IKEDH组 */
        @SerializedName("IKEDhGroup")
        private String ikeDhGroup;

        /** IKE加密算法 */
        @SerializedName("IKEEncryptionAlgorithm")
        private String ikeEncryptionAlgorithm;

        /** IKEv1协商模式 */
        @SerializedName("IKEExchangeMode")
        private String ikeExchangeMode;

        /** IKE本地ID标识 */
        @SerializedName("IKELocalId")
        private String ikeLocalId;

        /** IKE预共享秘钥 */
        @SerializedName("IKEPreSharedKey")
        private String ikePreSharedKey;

        /** IKE对端ID标识 */
        @SerializedName("IKERemoteId")
        private String ikeRemoteId;

        /** IKE秘钥生存时间 */
        @SerializedName("IKESALifetime")
        private String ikesaLifetime;

        /** IKE版本 */
        @SerializedName("IKEVersion")
        private String ikeVersion;

        public String getIKEAuthenticationAlgorithm() {
            return ikeAuthenticationAlgorithm;
        }

        public void setIKEAuthenticationAlgorithm(String ikeAuthenticationAlgorithm) {
            this.ikeAuthenticationAlgorithm = ikeAuthenticationAlgorithm;
        }

        public String getIKEDhGroup() {
            return ikeDhGroup;
        }

        public void setIKEDhGroup(String ikeDhGroup) {
            this.ikeDhGroup = ikeDhGroup;
        }

        public String getIKEEncryptionAlgorithm() {
            return ikeEncryptionAlgorithm;
        }

        public void setIKEEncryptionAlgorithm(String ikeEncryptionAlgorithm) {
            this.ikeEncryptionAlgorithm = ikeEncryptionAlgorithm;
        }

        public String getIKEExchangeMode() {
            return ikeExchangeMode;
        }

        public void setIKEExchangeMode(String ikeExchangeMode) {
            this.ikeExchangeMode = ikeExchangeMode;
        }

        public String getIKELocalId() {
            return ikeLocalId;
        }

        public void setIKELocalId(String ikeLocalId) {
            this.ikeLocalId = ikeLocalId;
        }

        public String getIKEPreSharedKey() {
            return ikePreSharedKey;
        }

        public void setIKEPreSharedKey(String ikePreSharedKey) {
            this.ikePreSharedKey = ikePreSharedKey;
        }

        public String getIKERemoteId() {
            return ikeRemoteId;
        }

        public void setIKERemoteId(String ikeRemoteId) {
            this.ikeRemoteId = ikeRemoteId;
        }

        public String getIKESALifetime() {
            return ikesaLifetime;
        }

        public void setIKESALifetime(String ikesaLifetime) {
            this.ikesaLifetime = ikesaLifetime;
        }

        public String getIKEVersion() {
            return ikeVersion;
        }

        public void setIKEVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
        }
    }

    public static class IPSecData extends Response {

        /** IPSec通道中使用的认证算法 */
        @SerializedName("IPSecAuthenticationAlgorithm")
        private String ipSecAuthenticationAlgorithm;

        /** IPSec通道中使用的加密算法 */
        @SerializedName("IPSecEncryptionAlgorithm")
        private String ipSecEncryptionAlgorithm;

        /** 指定VPN连接的本地子网，用逗号分隔 */
        @SerializedName("IPSecLocalSubnetIds")
        private List<String> ipSecLocalSubnetIds;

        /** 使用的安全协议，ESP或AH */
        @SerializedName("IPSecProtocol")
        private String ipSecProtocol;

        /** 指定VPN连接的客户网段，用逗号分隔 */
        @SerializedName("IPSecRemoteSubnets")
        private List<String> ipSecRemoteSubnets;

        /** IPSec中SA的生存时间 */
        @SerializedName("IPSecSALifetime")
        private String ipSecSALifetime;

        /** IPSec中SA的生存时间（以字节计） */
        @SerializedName("IPSecSALifetimeBytes")
        private String ipSecSALifetimeBytes;

        /** 是否开启PFS功能,Disable表示关闭，数字表示DH组 */
        @SerializedName("IPSecPFSDhGroup")
        private String ipSecPFSDhGroup;

        public String getIPSecAuthenticationAlgorithm() {
            return ipSecAuthenticationAlgorithm;
        }

        public void setIPSecAuthenticationAlgorithm(String ipSecAuthenticationAlgorithm) {
            this.ipSecAuthenticationAlgorithm = ipSecAuthenticationAlgorithm;
        }

        public String getIPSecEncryptionAlgorithm() {
            return ipSecEncryptionAlgorithm;
        }

        public void setIPSecEncryptionAlgorithm(String ipSecEncryptionAlgorithm) {
            this.ipSecEncryptionAlgorithm = ipSecEncryptionAlgorithm;
        }

        public List<String> getIPSecLocalSubnetIds() {
            return ipSecLocalSubnetIds;
        }

        public void setIPSecLocalSubnetIds(List<String> ipSecLocalSubnetIds) {
            this.ipSecLocalSubnetIds = ipSecLocalSubnetIds;
        }

        public String getIPSecProtocol() {
            return ipSecProtocol;
        }

        public void setIPSecProtocol(String ipSecProtocol) {
            this.ipSecProtocol = ipSecProtocol;
        }

        public List<String> getIPSecRemoteSubnets() {
            return ipSecRemoteSubnets;
        }

        public void setIPSecRemoteSubnets(List<String> ipSecRemoteSubnets) {
            this.ipSecRemoteSubnets = ipSecRemoteSubnets;
        }

        public String getIPSecSALifetime() {
            return ipSecSALifetime;
        }

        public void setIPSecSALifetime(String ipSecSALifetime) {
            this.ipSecSALifetime = ipSecSALifetime;
        }

        public String getIPSecSALifetimeBytes() {
            return ipSecSALifetimeBytes;
        }

        public void setIPSecSALifetimeBytes(String ipSecSALifetimeBytes) {
            this.ipSecSALifetimeBytes = ipSecSALifetimeBytes;
        }

        public String getIPSecPFSDhGroup() {
            return ipSecPFSDhGroup;
        }

        public void setIPSecPFSDhGroup(String ipSecPFSDhGroup) {
            this.ipSecPFSDhGroup = ipSecPFSDhGroup;
        }
    }
}
