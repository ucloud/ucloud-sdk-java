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

public class UpdateVPNTunnelAttributeRequest extends Request {

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

    /** VPN隧道的资源ID */
    @NotEmpty
    @UCloudParam("VPNTunnelId")
    private String vpnTunnelId;

    /** 预共享密钥 */
    @UCloudParam("IKEPreSharedKey")
    private String ikePreSharedKey;

    /** IKE协商过程中使用的加密算法 */
    @UCloudParam("IKEEncryptionAlgorithm")
    private String ikeEncryptionAlgorithm;

    /** IKE协商过程中使用的认证算法 */
    @UCloudParam("IKEAuthenticationAlgorithm")
    private String ikeAuthenticationAlgorithm;

    /** IKE协商过程中使用的模式，可选“主动模式”与“野蛮模式”。IKEV2不使用该参数。 */
    @UCloudParam("IKEExchangeMode")
    private String ikeExchangeMode;

    /** 本端标识。不填时默认使用之前的参数，结合IKEversion进行校验，IKEV2时不能为auto。 */
    @UCloudParam("IKELocalId")
    private String ikeLocalId;

    /** 客户端标识。不填时默认使用之前的参数，结合IKEversion进行校验，IKEV2时不能为auto。 */
    @UCloudParam("IKERemoteId")
    private String ikeRemoteId;

    /** IKE协商过程中使用的DH组 */
    @UCloudParam("IKEDhGroup")
    private String ikeDhGroup;

    /** IKE中SA的生存时间 */
    @UCloudParam("IKESALifetime")
    private String ikesaLifetime;

    /** 使用的安全协议，ESP或AH */
    @UCloudParam("IPSecProtocol")
    private String ipSecProtocol;

    /** 指定VPN连接的本地子网的id，用逗号分隔 */
    @UCloudParam("IPSecLocalSubnetIds")
    private List<String> ipSecLocalSubnetIds;

    /** 指定VPN连接的客户网段，用逗号分隔 */
    @UCloudParam("IPSecRemoteSubnets")
    private List<String> ipSecRemoteSubnets;

    /** IPSec隧道中使用的加密算法 */
    @UCloudParam("IPSecEncryptionAlgorithm")
    private String ipSecEncryptionAlgorithm;

    /** IPSec隧道中使用的认证算法 */
    @UCloudParam("IPSecAuthenticationAlgorithm")
    private String ipSecAuthenticationAlgorithm;

    /** IPSec中SA的生存时间 */
    @UCloudParam("IPSecSALifetime")
    private String ipSecSALifetime;

    /** IPSec中SA的生存时间（以字节计） */
    @UCloudParam("IPSecSALifetimeBytes")
    private String ipSecSALifetimeBytes;

    /** IPSec中的PFS是否开启 */
    @UCloudParam("IPSecPFSDhGroup")
    private String ipSecPFSDhGroup;

    /** 枚举值："IKE V1","IKE V2" */
    @UCloudParam("IKEVersion")
    private String ikeVersion;

    /** IPSec隧道关闭后的处理动作，默认与原本一致，若原本为空，必传。枚举值：“none”,不处理（推荐为none，流量会自动触发隧道重建）；“restart”重建 */
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

    public String getVPNTunnelId() {
        return vpnTunnelId;
    }

    public void setVPNTunnelId(String vpnTunnelId) {
        this.vpnTunnelId = vpnTunnelId;
    }

    public String getIKEPreSharedKey() {
        return ikePreSharedKey;
    }

    public void setIKEPreSharedKey(String ikePreSharedKey) {
        this.ikePreSharedKey = ikePreSharedKey;
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

    public String getIKEVersion() {
        return ikeVersion;
    }

    public void setIKEVersion(String ikeVersion) {
        this.ikeVersion = ikeVersion;
    }

    public String getIPSecCloseAction() {
        return ipSecCloseAction;
    }

    public void setIPSecCloseAction(String ipSecCloseAction) {
        this.ipSecCloseAction = ipSecCloseAction;
    }
}
