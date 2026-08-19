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
package cn.ucloud.uwsc.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeCETunnelResponse extends Response {

    /** 总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 隧道信息 */
    @SerializedName("VPNTunnelInfos")
    private List<VPNTunnelInfo> vpnTunnelInfos;

    /** 请求 ID */
    @SerializedName("RequestId")
    private String requestId;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<VPNTunnelInfo> getVPNTunnelInfos() {
        return vpnTunnelInfos;
    }

    public void setVPNTunnelInfos(List<VPNTunnelInfo> vpnTunnelInfos) {
        this.vpnTunnelInfos = vpnTunnelInfos;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public static class BGPConf extends Response {

        /** BGP隧道网段 */
        @SerializedName("TunnelCidr")
        private String tunnelCidr;

        /** 本端自治系统号 */
        @SerializedName("LocalAsn")
        private Integer localAsn;

        /** 对端自治系统号 */
        @SerializedName("PeerAsn")
        private Integer peerAsn;

        /** 云端BGP地址 */
        @SerializedName("LocalIp")
        private String localIp;

        /** 用户端BGP地址 */
        @SerializedName("PeerIp")
        private String peerIp;

        public String getTunnelCidr() {
            return tunnelCidr;
        }

        public void setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
        }

        public Integer getLocalAsn() {
            return localAsn;
        }

        public void setLocalAsn(Integer localAsn) {
            this.localAsn = localAsn;
        }

        public Integer getPeerAsn() {
            return peerAsn;
        }

        public void setPeerAsn(Integer peerAsn) {
            this.peerAsn = peerAsn;
        }

        public String getLocalIp() {
            return localIp;
        }

        public void setLocalIp(String localIp) {
            this.localIp = localIp;
        }

        public String getPeerIp() {
            return peerIp;
        }

        public void setPeerIp(String peerIp) {
            this.peerIp = peerIp;
        }
    }

    public static class DPDConf extends Response {

        /** 是否开启 DPD */
        @SerializedName("Enabled")
        private Integer enabled;

        /** DPD 行为 */
        @SerializedName("Action")
        private String action;

        /** DPD 探测间隔时间 */
        @SerializedName("Delay")
        private Integer delay;

        /** DPD 探测超时时间 */
        @SerializedName("Timeout")
        private Integer timeout;

        public Integer getEnabled() {
            return enabled;
        }

        public void setEnabled(Integer enabled) {
            this.enabled = enabled;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Integer getDelay() {
            return delay;
        }

        public void setDelay(Integer delay) {
            this.delay = delay;
        }

        public Integer getTimeout() {
            return timeout;
        }

        public void setTimeout(Integer timeout) {
            this.timeout = timeout;
        }
    }

    public static class IKEConf extends Response {

        /** 预共享密钥 */
        @SerializedName("PreSharedKey")
        private String preSharedKey;

        /** 版本 */
        @SerializedName("Version")
        private String version;

        /** 协商模式 */
        @SerializedName("ExchangeMode")
        private String exchangeMode;

        /** 加密算法 */
        @SerializedName("EncryptionAlgorithm")
        private String encryptionAlgorithm;

        /** 认证算法 */
        @SerializedName("AuthenticationAlgorithm")
        private String authenticationAlgorithm;

        /** 分组信息 */
        @SerializedName("DhGroup")
        private String dhGroup;

        /** 本端标识 */
        @SerializedName("LocalId")
        private String localId;

        /** 对端标识 */
        @SerializedName("RemoteId")
        private String remoteId;

        /** IKE SA的生存周期 */
        @SerializedName("SALifeTime")
        private String saLifeTime;

        public String getPreSharedKey() {
            return preSharedKey;
        }

        public void setPreSharedKey(String preSharedKey) {
            this.preSharedKey = preSharedKey;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getExchangeMode() {
            return exchangeMode;
        }

        public void setExchangeMode(String exchangeMode) {
            this.exchangeMode = exchangeMode;
        }

        public String getEncryptionAlgorithm() {
            return encryptionAlgorithm;
        }

        public void setEncryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
        }

        public String getAuthenticationAlgorithm() {
            return authenticationAlgorithm;
        }

        public void setAuthenticationAlgorithm(String authenticationAlgorithm) {
            this.authenticationAlgorithm = authenticationAlgorithm;
        }

        public String getDhGroup() {
            return dhGroup;
        }

        public void setDhGroup(String dhGroup) {
            this.dhGroup = dhGroup;
        }

        public String getLocalId() {
            return localId;
        }

        public void setLocalId(String localId) {
            this.localId = localId;
        }

        public String getRemoteId() {
            return remoteId;
        }

        public void setRemoteId(String remoteId) {
            this.remoteId = remoteId;
        }

        public String getSALifeTime() {
            return saLifeTime;
        }

        public void setSALifeTime(String saLifeTime) {
            this.saLifeTime = saLifeTime;
        }
    }

    public static class IPSecConf extends Response {

        /** 客户网段 */
        @SerializedName("CENetwork")
        private List<String> ceNetwork;

        /** 安全协议 */
        @SerializedName("Protocol")
        private String protocol;

        /** 加密算法 */
        @SerializedName("EncryptionAlgorithm")
        private String encryptionAlgorithm;

        /** 认证算法 */
        @SerializedName("AuthenticationAlgorithm")
        private String authenticationAlgorithm;

        /** 第二阶段协商使用的 Diffie-Hellman 密钥交换算法 */
        @SerializedName("PFSDhGroup")
        private String pfsDhGroup;

        /** 第二阶段的 SA 的生存周期 */
        @SerializedName("SALifeTime")
        private String saLifeTime;

        /** 第二阶段的 SA 的生存周期 */
        @SerializedName("SALifetimeBytes")
        private String saLifetimeBytes;

        public List<String> getCENetwork() {
            return ceNetwork;
        }

        public void setCENetwork(List<String> ceNetwork) {
            this.ceNetwork = ceNetwork;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getEncryptionAlgorithm() {
            return encryptionAlgorithm;
        }

        public void setEncryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
        }

        public String getAuthenticationAlgorithm() {
            return authenticationAlgorithm;
        }

        public void setAuthenticationAlgorithm(String authenticationAlgorithm) {
            this.authenticationAlgorithm = authenticationAlgorithm;
        }

        public String getPFSDhGroup() {
            return pfsDhGroup;
        }

        public void setPFSDhGroup(String pfsDhGroup) {
            this.pfsDhGroup = pfsDhGroup;
        }

        public String getSALifeTime() {
            return saLifeTime;
        }

        public void setSALifeTime(String saLifeTime) {
            this.saLifeTime = saLifeTime;
        }

        public String getSALifetimeBytes() {
            return saLifetimeBytes;
        }

        public void setSALifetimeBytes(String saLifetimeBytes) {
            this.saLifetimeBytes = saLifetimeBytes;
        }
    }

    public static class VPNTunnelInfo extends Response {

        /** 地域 */
        @SerializedName("Region")
        private String region;

        /** CE 网关 ID */
        @SerializedName("VPNId")
        private String vpnId;

        /** 隧道 ID */
        @SerializedName("VPNTunnelId")
        private String vpnTunnelId;

        /** 隧道名称 */
        @SerializedName("Name")
        private String name;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** IKE 配置信息 */
        @SerializedName("IKEConf")
        private IKEConf ikeConf;

        /** IPSec 配置信息 */
        @SerializedName("IPSecConf")
        private IPSecConf ipSecConf;

        /** 隧道关闭后动作 */
        @SerializedName("CloseAction")
        private String closeAction;

        /** BGP 配置信息 */
        @SerializedName("BGPConf")
        private BGPConf bgpConf;

        /** 路由模式 */
        @SerializedName("Mode")
        private String mode;

        /** DPD 配置信息 */
        @SerializedName("DPDConf")
        private DPDConf dpdConf;

        /** 隧道协商动作 */
        @SerializedName("StartAction")
        private String startAction;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getVPNId() {
            return vpnId;
        }

        public void setVPNId(String vpnId) {
            this.vpnId = vpnId;
        }

        public String getVPNTunnelId() {
            return vpnTunnelId;
        }

        public void setVPNTunnelId(String vpnTunnelId) {
            this.vpnTunnelId = vpnTunnelId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public IKEConf getIKEConf() {
            return ikeConf;
        }

        public void setIKEConf(IKEConf ikeConf) {
            this.ikeConf = ikeConf;
        }

        public IPSecConf getIPSecConf() {
            return ipSecConf;
        }

        public void setIPSecConf(IPSecConf ipSecConf) {
            this.ipSecConf = ipSecConf;
        }

        public String getCloseAction() {
            return closeAction;
        }

        public void setCloseAction(String closeAction) {
            this.closeAction = closeAction;
        }

        public BGPConf getBGPConf() {
            return bgpConf;
        }

        public void setBGPConf(BGPConf bgpConf) {
            this.bgpConf = bgpConf;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public DPDConf getDPDConf() {
            return dpdConf;
        }

        public void setDPDConf(DPDConf dpdConf) {
            this.dpdConf = dpdConf;
        }

        public String getStartAction() {
            return startAction;
        }

        public void setStartAction(String startAction) {
            this.startAction = startAction;
        }
    }
}
