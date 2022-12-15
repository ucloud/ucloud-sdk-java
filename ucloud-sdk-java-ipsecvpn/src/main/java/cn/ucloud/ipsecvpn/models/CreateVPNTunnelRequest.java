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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreateVPNTunnelRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** VPN隧道名称 */
    @NotEmpty
    @UCloudParam("VPNTunnelName")
    private String vpnTunnelName;

    /** VPN网关的资源ID */
    @NotEmpty
    @UCloudParam("VPNGatewayId")
    private String vpnGatewayId;

    /** 客户VPN网关的资源ID */
    @NotEmpty
    @UCloudParam("RemoteVPNGatewayId")
    private String remoteVPNGatewayId;

    /** 预共享密钥 */
    @NotEmpty
    @UCloudParam("IKEPreSharedKey")
    private String ikePreSharedKey;

    /** vpcId */
    @NotEmpty
    @UCloudParam("VPCId")
    private String vpcId;

    /** ike版本，枚举值： "IKE V1"，"IKE V2"，默认v1 */
    @NotEmpty
    @UCloudParam("IKEVersion")
    private String ikeVersion;

    /** 指定VPN连接的本地子网的资源ID，最多可填写10个。 */
    @NotEmpty
    @UCloudParam("IPSecLocalSubnetIds")
    private List<String> ipSecLocalSubnetIds;

    /** 指定VPN连接的客户网段，最多可填写20个。 */
    @NotEmpty
    @UCloudParam("IPSecRemoteSubnets")
    private List<String> ipSecRemoteSubnets;

    /** 业务组，默认为“Default” */
    @UCloudParam("Tag")
    private String tag;

    /** 备注，默认为空 */
    @UCloudParam("Remark")
    private String remark;

    /** IKE协商过程中使用的加密算法，枚举值，"aes128", "aes192", "aes256", "aes512", "3des"。默认值为“aes128” */
    @UCloudParam("IKEEncryptionAlgorithm")
    private String ikeEncryptionAlgorithm;

    /** IKE协商过程中使用的认证算法，"md5", "sha1", "sha2-256"。默认值为“sha1” */
    @UCloudParam("IKEAuthenticationAlgorithm")
    private String ikeAuthenticationAlgorithm;

    /** IKE协商过程中使用的模式，枚举值，主模式，“main”；野蛮模式，“aggressive”。IKEV1默认为主模式“main”，IKEV2时不使用该参数。 */
    @UCloudParam("IKEExchangeMode")
    private String ikeExchangeMode;

    /** 本端标识。枚举值，自动识别，“auto”；IP地址或域名。默认为自动识别“auto”。IKEV2必填该参数 */
    @UCloudParam("IKELocalId")
    private String ikeLocalId;

    /** 客户端标识。枚举值，自动识别，“auto”；IP地址或域名。默认为“自动识别“auto”。IKEV2必填该参数 */
    @UCloudParam("IKERemoteId")
    private String ikeRemoteId;

    /** IKE协商过程中使用的DH组，枚举值，"1", "2", "5", "14", "15", "16"。默认为“15” */
    @UCloudParam("IKEDhGroup")
    private String ikeDhGroup;

    /** IKE中SA的生存时间，可填写范围为600-604800。默认为86400。 */
    @UCloudParam("IKESALifetime")
    private String ikesaLifetime;

    /** 使用的安全协议，枚举值，“esp”，“ah”。默认为“esp” */
    @UCloudParam("IPSecProtocol")
    private String ipSecProtocol;

    /** IPSec隧道中使用的加密算法，枚举值，"aes128", "aes192", "aes256", "aes512", "3des"。默认值为“aes128” */
    @UCloudParam("IPSecEncryptionAlgorithm")
    private String ipSecEncryptionAlgorithm;

    /** IPSec隧道中使用的认证算法，枚举值，"md5", "sha1","sha2-256"。默认值为“sha1” */
    @UCloudParam("IPSecAuthenticationAlgorithm")
    private String ipSecAuthenticationAlgorithm;

    /** IPSec中SA的生存时间，可填写范围为1200 - 604800。默认为3600 */
    @UCloudParam("IPSecSALifetime")
    private String ipSecSALifetime;

    /** IPSec中SA的生存时间（以字节计）。可选为8000 – 20000000。默认使用SA生存时间， */
    @UCloudParam("IPSecSALifetimeBytes")
    private String ipSecSALifetimeBytes;

    /** IPSec的PFS是否开启，枚举值，，不开启，"disable"；数字表示DH组, "1", "2", "5", "14", "15", "16"。默认为“disable”。 */
    @UCloudParam("IPSecPFSDhGroup")
    private String ipSecPFSDhGroup;

    /** IPSec隧道关闭后的处理动作，枚举值：“none”，流量触发；“restart”，自动重联，默认为none */
    @UCloudParam("IPSecCloseAction")
    private String ipSecCloseAction;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getVPNTunnelName() {
        return vpnTunnelName;
    }

    public void setVPNTunnelName(String vpnTunnelName) {
        this.vpnTunnelName = vpnTunnelName;
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

    public String getIKEPreSharedKey() {
        return ikePreSharedKey;
    }

    public void setIKEPreSharedKey(String ikePreSharedKey) {
        this.ikePreSharedKey = ikePreSharedKey;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getIKEVersion() {
        return ikeVersion;
    }

    public void setIKEVersion(String ikeVersion) {
        this.ikeVersion = ikeVersion;
    }

    public List<String> getIPSecLocalSubnetIds() {
        return ipSecLocalSubnetIds;
    }

    public void setIPSecLocalSubnetIds(List<String> ipSecLocalSubnetIds) {
        this.ipSecLocalSubnetIds = ipSecLocalSubnetIds;
    }

    public List<String> getIPSecRemoteSubnets() {
        return ipSecRemoteSubnets;
    }

    public void setIPSecRemoteSubnets(List<String> ipSecRemoteSubnets) {
        this.ipSecRemoteSubnets = ipSecRemoteSubnets;
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

    public String getIKEEncryptionAlgorithm() {
        return ikeEncryptionAlgorithm;
    }

    public void setIKEEncryptionAlgorithm(String ikeEncryptionAlgorithm) {
        this.ikeEncryptionAlgorithm = ikeEncryptionAlgorithm;
    }

    public String getIKEAuthenticationAlgorithm() {
        return ikeAuthenticationAlgorithm;
    }

    public void setIKEAuthenticationAlgorithm(String ikeAuthenticationAlgorithm) {
        this.ikeAuthenticationAlgorithm = ikeAuthenticationAlgorithm;
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

    public String getIKERemoteId() {
        return ikeRemoteId;
    }

    public void setIKERemoteId(String ikeRemoteId) {
        this.ikeRemoteId = ikeRemoteId;
    }

    public String getIKEDhGroup() {
        return ikeDhGroup;
    }

    public void setIKEDhGroup(String ikeDhGroup) {
        this.ikeDhGroup = ikeDhGroup;
    }

    public String getIKESALifetime() {
        return ikesaLifetime;
    }

    public void setIKESALifetime(String ikesaLifetime) {
        this.ikesaLifetime = ikesaLifetime;
    }

    public String getIPSecProtocol() {
        return ipSecProtocol;
    }

    public void setIPSecProtocol(String ipSecProtocol) {
        this.ipSecProtocol = ipSecProtocol;
    }

    public String getIPSecEncryptionAlgorithm() {
        return ipSecEncryptionAlgorithm;
    }

    public void setIPSecEncryptionAlgorithm(String ipSecEncryptionAlgorithm) {
        this.ipSecEncryptionAlgorithm = ipSecEncryptionAlgorithm;
    }

    public String getIPSecAuthenticationAlgorithm() {
        return ipSecAuthenticationAlgorithm;
    }

    public void setIPSecAuthenticationAlgorithm(String ipSecAuthenticationAlgorithm) {
        this.ipSecAuthenticationAlgorithm = ipSecAuthenticationAlgorithm;
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

    public String getIPSecCloseAction() {
        return ipSecCloseAction;
    }

    public void setIPSecCloseAction(String ipSecCloseAction) {
        this.ipSecCloseAction = ipSecCloseAction;
    }
}
