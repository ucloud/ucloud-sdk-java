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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreateCETunnelRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 所属CE网关资源ID */
    @NotEmpty
    @UCloudParam("VPNId")
    private String vpnId;

    /** */
    @UCloudParam("IKEConf")
    private IKEConf ikeConf;

    /** */
    @UCloudParam("IPSecConf")
    private IPSecConf ipSecConf;

    /** IPSec 关闭后动作，枚举值：restart、trap、none */
    @NotEmpty
    @UCloudParam("CloseAction")
    private String closeAction;

    /** */
    @UCloudParam("DPDConf")
    private DPDConf dpdConf;

    /** 路由模式，枚举值： 感兴趣流(FLow) | BGP(BGP) */
    @NotEmpty
    @UCloudParam("Mode")
    private String mode;

    /** */
    @UCloudParam("BGPConf")
    private BGPConf bgpConf;

    /** 资源名称 */
    @UCloudParam("Name")
    private String name;

    /** 备注 */
    @UCloudParam("Remark")
    private String remark;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getVPNId() {
        return vpnId;
    }

    public void setVPNId(String vpnId) {
        this.vpnId = vpnId;
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

    public DPDConf getDPDConf() {
        return dpdConf;
    }

    public void setDPDConf(DPDConf dpdConf) {
        this.dpdConf = dpdConf;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public BGPConf getBGPConf() {
        return bgpConf;
    }

    public void setBGPConf(BGPConf bgpConf) {
        this.bgpConf = bgpConf;
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

    public static class BGPConf extends Request {

        /** BGP隧道网段。该网段需是一个在 169.254.0.0/16 内的掩码长度为 30 的网段。 */
        @UCloudParam("TunnelCidr")
        private String tunnelCidr;

        /** Ucloud侧的自治系统号。 */
        @UCloudParam("LocalAsn")
        private String localAsn;

        /** 对端BGP ASN号。 */
        @UCloudParam("PeerAsn")
        private String peerAsn;

        /** 云端BGP地址。必须从BGP隧道网段内分配。 */
        @UCloudParam("LocalIp")
        private String localIp;

        /** 用户端BGP地址。必须从BGP隧道网段内分配。 */
        @UCloudParam("PeerIp")
        private String peerIp;

        public String getTunnelCidr() {
            return tunnelCidr;
        }

        public void setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
        }

        public String getLocalAsn() {
            return localAsn;
        }

        public void setLocalAsn(String localAsn) {
            this.localAsn = localAsn;
        }

        public String getPeerAsn() {
            return peerAsn;
        }

        public void setPeerAsn(String peerAsn) {
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

    public static class DPDConf extends Request {

        /** 是否开启 DPD（对等体存活检测）功能。取值：0（关闭）、1（开启） */
        @NotEmpty
        @UCloudParam("Enabled")
        private Integer enabled;

        /** DPD超时后的动作,Enable为1（开启）时有效。可取值为clear（断开）、restart（重试）和 trap（流量触发） */
        @UCloudParam("Action")
        private String action;

        /** DPD探测间隔时间。dpdEnable为1（开启）时有效。单位为秒，默认为 10 */
        @UCloudParam("Delay")
        private Integer delay;

        /** DPD超时时间。即探测确认对端不存在需要的时间。dpdEnable为1（开启）时有效。单位为秒。取值范围为 30-60（IKEv2 默认为 0） */
        @UCloudParam("Timeout")
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

    public static class IKEConf extends Request {

        /** IKE 共享密钥 */
        @NotEmpty
        @UCloudParam("PreSharedKey")
        private String preSharedKey;

        /** IKE 版本，取值： "ike v1"，"ike v2" */
        @NotEmpty
        @UCloudParam("Version")
        private String version;

        /** IKE 协商模式，主模式(main)/野蛮模式(aggressive)，IKE V2时不使用该参数 */
        @NotEmpty
        @UCloudParam("ExchangeMode")
        private String exchangeMode;

        /** IKE 加密算法，取值："aes128", "aes192", "aes256", "aes512", "3des" */
        @NotEmpty
        @UCloudParam("EncryptionAlgorithm")
        private String encryptionAlgorithm;

        /** IKE 认证算法，取值："md5", "sha1", "sha2-256" */
        @NotEmpty
        @UCloudParam("AuthenticationAlgorithm")
        private String authenticationAlgorithm;

        /** DH group，指定IKE交换密钥时使用的DH组。取值："1", "2", "5", "14", "15", "16" */
        @NotEmpty
        @UCloudParam("DhGroup")
        private String dhGroup;

        /** 本端标识，取值：“auto”，“<ip-address>” */
        @NotEmpty
        @UCloudParam("LocalId")
        private String localId;

        /** 对端标识，取值：“auto”，“<ip-address>” */
        @NotEmpty
        @UCloudParam("RemoteId")
        private String remoteId;

        /** IKE SA的生存周期，取值范围：600-604800 */
        @NotEmpty
        @UCloudParam("SALifeTime")
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

    public static class IPSecConf extends Request {

        /** 需要和 VPC 互通的本地数据中心侧的网段，用于第二阶段协商。 */
        @NotEmpty
        @UCloudParam("CENetwork")
        private List<String> ceNetwork;

        /** IPSec 安全协议，取值：“esp”，“ah” */
        @NotEmpty
        @UCloudParam("Protocol")
        private String protocol;

        /** IPSec 加密算法，取值："aes128", "aes192", "aes256", "aes512", "3des" */
        @NotEmpty
        @UCloudParam("EncryptionAlgorithm")
        private String encryptionAlgorithm;

        /** 第二阶段协商的认证算法。取值：md5、sha1、sha2-256。 */
        @NotEmpty
        @UCloudParam("AuthenticationAlgorithm")
        private String authenticationAlgorithm;

        /** 第二阶段协商使用的 Diffie-Hellman 密钥交换算法。取值：disabled、1、2、5、14、15、16。 */
        @NotEmpty
        @UCloudParam("PFSDhGroup")
        private String pfsDhGroup;

        /** 第二阶段协商出的 SA 的生存周期。单位：秒。取值范围：1200~604800 */
        @NotEmpty
        @UCloudParam("SALifeTime")
        private String saLifeTime;

        /** 第二阶段协商出的 SA 的生存周期。单位：字节 KB。取值范围：8000 – 20000000，默认使用SA超时时间 */
        @UCloudParam("SALifetimeBytes")
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
}
