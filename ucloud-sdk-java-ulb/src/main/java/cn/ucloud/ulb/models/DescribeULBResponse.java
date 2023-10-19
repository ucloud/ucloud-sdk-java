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

public class DescribeULBResponse extends Response {

    /** 满足条件的CLB总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** CLB列表，每项参数详见 ULBSet */
    @SerializedName("DataSet")
    private List<ULBSet> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ULBSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<ULBSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class BindSecurityPolicy extends Response {

        /** 安全策略组ID */
        @SerializedName("SecurityPolicyId")
        private String securityPolicyId;

        /** 安全策略组名称 */
        @SerializedName("SecurityPolicyName")
        private String securityPolicyName;

        /** TLS最低版本 */
        @SerializedName("TLSVersion")
        private String tlsVersion;

        /** 加密套件 */
        @SerializedName("SSLCiphers")
        private List<String> sslCiphers;

        /** 安全策略类型 0：预定义 1：自定义 */
        @SerializedName("SecurityPolicyType")
        private Integer securityPolicyType;

        public String getSecurityPolicyId() {
            return securityPolicyId;
        }

        public void setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
        }

        public String getSecurityPolicyName() {
            return securityPolicyName;
        }

        public void setSecurityPolicyName(String securityPolicyName) {
            this.securityPolicyName = securityPolicyName;
        }

        public String getTLSVersion() {
            return tlsVersion;
        }

        public void setTLSVersion(String tlsVersion) {
            this.tlsVersion = tlsVersion;
        }

        public List<String> getSSLCiphers() {
            return sslCiphers;
        }

        public void setSSLCiphers(List<String> sslCiphers) {
            this.sslCiphers = sslCiphers;
        }

        public Integer getSecurityPolicyType() {
            return securityPolicyType;
        }

        public void setSecurityPolicyType(Integer securityPolicyType) {
            this.securityPolicyType = securityPolicyType;
        }
    }

    public static class FirewallSet extends Response {

        /** 防火墙名称 */
        @SerializedName("FirewallName")
        private String firewallName;

        /** 防火墙ID */
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

    public static class LoggerSet extends Response {

        /** ulb日志上传的bucket */
        @SerializedName("BucketName")
        private String bucketName;

        /** 上传到bucket使用的token的tokenid */
        @SerializedName("TokenID")
        private String tokenID;

        /** bucket的token名称 */
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

    public static class PolicyBackendSet extends Response {

        /** 所添加的后端资源在ULB中的对象ID，（为ULB系统中使用，与资源自身ID无关 */
        @SerializedName("BackendId")
        private String backendId;

        /**
         * 所添加的后端资源的类型，枚举值：UHost -> 云主机；UPM -> 物理云主机； UDHost -> 私有专区主机；UDocker ->
         * 容器；UHybrid->混合云主机；CUBE->Cube；UNI -> 虚拟网卡
         */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 后端资源的实例名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 如果资源绑定了弹性网卡，则展示弹性网卡的资源ID */
        @SerializedName("SubResourceId")
        private String subResourceId;

        /** 如果资源绑定了弹性网卡，则展示弹性网卡的资源名称 */
        @SerializedName("SubResourceName")
        private String subResourceName;

        /** "UNI"或者为空 */
        @SerializedName("SubResourceType")
        private String subResourceType;

        /** 后端资源的对象ID */
        @SerializedName("ObjectId")
        private String objectId;

        /** 所添加的后端资源服务端口 */
        @SerializedName("Port")
        private Integer port;

        /** 后端资源的内网IP */
        @SerializedName("PrivateIP")
        private String privateIP;

        public String getBackendId() {
            return backendId;
        }

        public void setBackendId(String backendId) {
            this.backendId = backendId;
        }

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public String getSubResourceId() {
            return subResourceId;
        }

        public void setSubResourceId(String subResourceId) {
            this.subResourceId = subResourceId;
        }

        public String getSubResourceName() {
            return subResourceName;
        }

        public void setSubResourceName(String subResourceName) {
            this.subResourceName = subResourceName;
        }

        public String getSubResourceType() {
            return subResourceType;
        }

        public void setSubResourceType(String subResourceType) {
            this.subResourceType = subResourceType;
        }

        public String getObjectId() {
            return objectId;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getPrivateIP() {
            return privateIP;
        }

        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }
    }

    public static class SSLBindedTargetSet extends Response {

        /** SSL证书绑定到的VServer的资源ID */
        @SerializedName("VServerId")
        private String vServerId;

        /** 对应的VServer的名字 */
        @SerializedName("VServerName")
        private String vServerName;

        /** VServer 所属的ULB实例的资源ID */
        @SerializedName("ULBId")
        private String ulbId;

        /** ULB实例的名称 */
        @SerializedName("ULBName")
        private String ulbName;

        public String getVServerId() {
            return vServerId;
        }

        public void setVServerId(String vServerId) {
            this.vServerId = vServerId;
        }

        public String getVServerName() {
            return vServerName;
        }

        public void setVServerName(String vServerName) {
            this.vServerName = vServerName;
        }

        public String getULBId() {
            return ulbId;
        }

        public void setULBId(String ulbId) {
            this.ulbId = ulbId;
        }

        public String getULBName() {
            return ulbName;
        }

        public void setULBName(String ulbName) {
            this.ulbName = ulbName;
        }
    }

    public static class ULBBackendSet extends Response {

        /** 后端资源实例的Id */
        @SerializedName("BackendId")
        private String backendId;

        /** 资源实例的类型 */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 资源实例的资源Id */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源实例的资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 资源绑定的虚拟网卡实例的类型 */
        @SerializedName("SubResourceType")
        private String subResourceType;

        /** 资源绑定的虚拟网卡实例的资源Id */
        @SerializedName("SubResourceId")
        private String subResourceId;

        /** 资源绑定的虚拟网卡实例的资源名称 */
        @SerializedName("SubResourceName")
        private String subResourceName;

        /** 后端提供服务的内网IP */
        @SerializedName("PrivateIP")
        private String privateIP;

        /** 后端提供服务的端口 */
        @SerializedName("Port")
        private Integer port;

        /** 后端提供服务的实例启用与否，枚举值：0 禁用 1 启用 */
        @SerializedName("Enabled")
        private Integer enabled;

        /** 后端提供服务的实例运行状态，枚举值：0健康检查健康状态 1 健康检查异常 */
        @SerializedName("Status")
        private Integer status;

        /** 后端提供服务的资源所在的子网的ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /**
         * 是否为backup，只有当vserver的Backup属性为1时才会有此字段，说明：
         *
         * <p>0：主rs 1：备rs
         */
        @SerializedName("IsBackup")
        private Integer isBackup;

        /** 后端RS权重（在加权轮询算法下有效） */
        @SerializedName("Weight")
        private Integer weight;

        /** 后端服务器所在的VPC */
        @SerializedName("VPCId")
        private String vpcId;

        public String getBackendId() {
            return backendId;
        }

        public void setBackendId(String backendId) {
            this.backendId = backendId;
        }

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public String getSubResourceType() {
            return subResourceType;
        }

        public void setSubResourceType(String subResourceType) {
            this.subResourceType = subResourceType;
        }

        public String getSubResourceId() {
            return subResourceId;
        }

        public void setSubResourceId(String subResourceId) {
            this.subResourceId = subResourceId;
        }

        public String getSubResourceName() {
            return subResourceName;
        }

        public void setSubResourceName(String subResourceName) {
            this.subResourceName = subResourceName;
        }

        public String getPrivateIP() {
            return privateIP;
        }

        public void setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Integer getEnabled() {
            return enabled;
        }

        public void setEnabled(Integer enabled) {
            this.enabled = enabled;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public Integer getIsBackup() {
            return isBackup;
        }

        public void setIsBackup(Integer isBackup) {
            this.isBackup = isBackup;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }
    }

    public static class ULBIPSet extends Response {

        /** 弹性IP的运营商信息，枚举值为： Bgp：BGP IP International：国际IP */
        @SerializedName("OperatorName")
        private String operatorName;

        /** 弹性IP地址 */
        @SerializedName("EIP")
        private String eip;

        /** 弹性IP的ID */
        @SerializedName("EIPId")
        private String eipId;

        /** 弹性IP的带宽类型，枚举值：1 表示是共享带宽，0 普通带宽类型（暂未对外开放） */
        @SerializedName("BandwidthType")
        private Integer bandwidthType;

        /** 弹性IP的带宽值（暂未对外开放） */
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

    public static class ULBPolicySet extends Response {

        /** 内容转发规则中域名的匹配方式。枚举值：Regular，正则；Wildcard，泛域名 */
        @SerializedName("DomainMatchMode")
        private String domainMatchMode;

        /** 内容转发Id，默认内容转发类型下为空。 */
        @SerializedName("PolicyId")
        private String policyId;

        /** 内容类型，枚举值：Custom -> 客户自定义；Default -> 默认内容转发 */
        @SerializedName("PolicyType")
        private String policyType;

        /** 内容转发匹配字段的类型，枚举值：Domain -> 域名；Path -> 路径； 默认内容转发类型下为空 */
        @SerializedName("Type")
        private String type;

        /** 内容转发匹配字段;默认内容转发类型下为空。 */
        @SerializedName("Match")
        private String match;

        /** 内容转发优先级，范围[1,9999]，数字越大优先级越高。默认内容转发规则下为0。 */
        @SerializedName("PolicyPriority")
        private Integer policyPriority;

        /** 所属VServerId */
        @SerializedName("VServerId")
        private String vServerId;

        /** 默认内容转发类型下返回当前rs总数 */
        @SerializedName("TotalCount")
        private Integer totalCount;

        /** 内容转发下rs的详细信息，参考PolicyBackendSet */
        @SerializedName("BackendSet")
        private List<PolicyBackendSet> backendSet;

        public String getDomainMatchMode() {
            return domainMatchMode;
        }

        public void setDomainMatchMode(String domainMatchMode) {
            this.domainMatchMode = domainMatchMode;
        }

        public String getPolicyId() {
            return policyId;
        }

        public void setPolicyId(String policyId) {
            this.policyId = policyId;
        }

        public String getPolicyType() {
            return policyType;
        }

        public void setPolicyType(String policyType) {
            this.policyType = policyType;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getMatch() {
            return match;
        }

        public void setMatch(String match) {
            this.match = match;
        }

        public Integer getPolicyPriority() {
            return policyPriority;
        }

        public void setPolicyPriority(Integer policyPriority) {
            this.policyPriority = policyPriority;
        }

        public String getVServerId() {
            return vServerId;
        }

        public void setVServerId(String vServerId) {
            this.vServerId = vServerId;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public List<PolicyBackendSet> getBackendSet() {
            return backendSet;
        }

        public void setBackendSet(List<PolicyBackendSet> backendSet) {
            this.backendSet = backendSet;
        }
    }

    public static class ULBSSLSet extends Response {

        /** SSL证书的Id */
        @SerializedName("SSLId")
        private String sslId;

        /** SSL证书的名字 */
        @SerializedName("SSLName")
        private String sslName;

        /** SSL证书类型，暂时只有 Pem 一种类型 */
        @SerializedName("SSLType")
        private String sslType;

        /** SSL证书的内容 */
        @SerializedName("SSLContent")
        private String sslContent;

        /** SSL证书的创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** SSL证书的HASH值 */
        @SerializedName("HashValue")
        private String hashValue;

        /** SSL证书绑定到的对象 */
        @SerializedName("BindedTargetSet")
        private List<SSLBindedTargetSet> bindedTargetSet;

        /** SSL证书来源，SSL证书来源，0代表证书来自于ULB平台，1代表证书来自于USSL平台 */
        @SerializedName("SSLSource")
        private Integer sslSource;

        /** USSL证书平台的编号,只有当SSLSource为1时才出现 */
        @SerializedName("USSLId")
        private String usslId;

        /** USSL证书平台的域名,只有当SSLSource为1时才出现 */
        @SerializedName("Domains")
        private String domains;

        /** 证书颁发时间,只有当SSLSource为1时才出现 */
        @SerializedName("NotBefore")
        private Integer notBefore;

        /** 证书过期时间,只有当SSLSource为1时才出现 */
        @SerializedName("NotAfter")
        private Integer notAfter;

        public String getSSLId() {
            return sslId;
        }

        public void setSSLId(String sslId) {
            this.sslId = sslId;
        }

        public String getSSLName() {
            return sslName;
        }

        public void setSSLName(String sslName) {
            this.sslName = sslName;
        }

        public String getSSLType() {
            return sslType;
        }

        public void setSSLType(String sslType) {
            this.sslType = sslType;
        }

        public String getSSLContent() {
            return sslContent;
        }

        public void setSSLContent(String sslContent) {
            this.sslContent = sslContent;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getHashValue() {
            return hashValue;
        }

        public void setHashValue(String hashValue) {
            this.hashValue = hashValue;
        }

        public List<SSLBindedTargetSet> getBindedTargetSet() {
            return bindedTargetSet;
        }

        public void setBindedTargetSet(List<SSLBindedTargetSet> bindedTargetSet) {
            this.bindedTargetSet = bindedTargetSet;
        }

        public Integer getSSLSource() {
            return sslSource;
        }

        public void setSSLSource(Integer sslSource) {
            this.sslSource = sslSource;
        }

        public String getUSSLId() {
            return usslId;
        }

        public void setUSSLId(String usslId) {
            this.usslId = usslId;
        }

        public String getDomains() {
            return domains;
        }

        public void setDomains(String domains) {
            this.domains = domains;
        }

        public Integer getNotBefore() {
            return notBefore;
        }

        public void setNotBefore(Integer notBefore) {
            this.notBefore = notBefore;
        }

        public Integer getNotAfter() {
            return notAfter;
        }

        public void setNotAfter(Integer notAfter) {
            this.notAfter = notAfter;
        }
    }

    public static class ULBSet extends Response {

        /** 负载均衡的资源ID */
        @SerializedName("ULBId")
        private String ulbId;

        /** 负载均衡的资源名称 */
        @SerializedName("Name")
        private String name;

        /** 负载均衡的业务组名称 */
        @SerializedName("Tag")
        private String tag;

        /** 负载均衡的备注 */
        @SerializedName("Remark")
        private String remark;

        /** 带宽类型，枚举值为： 0，非共享带宽； 1，共享带宽 */
        @SerializedName("BandwidthType")
        private Integer bandwidthType;

        /** 带宽 */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** ULB的创建时间，格式为Unix Timestamp */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** ULB的详细信息列表，具体结构见下方 ULBIPSet */
        @SerializedName("IPSet")
        private List<ULBIPSet> ipSet;

        /** 负载均衡实例中存在的VServer实例列表，具体结构见下方 ULBVServerSet */
        @SerializedName("VServerSet")
        private List<ULBVServerSet> vServerSet;

        /** ULB 的类型 */
        @SerializedName("ULBType")
        private String ulbType;

        /** ULB ip类型，枚举值：IPv6 / IPv4 （内部测试，暂未对外开放） */
        @SerializedName("IPVersion")
        private String ipVersion;

        /** ULB后向代理IP，仅当有代理IP时返回 否 */
        @SerializedName("SnatIps")
        private List<String> snatIps;

        /** ULB 监听器类型，枚举值：RequestProxy，请求代理； PacketsTransmit ，报文转发；Comprehensive，兼容型；Pending，未定型 */
        @SerializedName("ListenType")
        private String listenType;

        /** ULB所在的VPC的ID */
        @SerializedName("VPCId")
        private String vpcId;

        /** ULB 为 InnerMode 时，ULB 所属的子网ID，默认为空 */
        @SerializedName("SubnetId")
        private String subnetId;

        /** ULB 所属的业务组ID */
        @SerializedName("BusinessId")
        private String businessId;

        /** ULB的内网IP，当ULBType为OuterMode时，该值为空 */
        @SerializedName("PrivateIP")
        private String privateIP;

        /** 防火墙信息，具体结构见下方 FirewallSet */
        @SerializedName("FirewallSet")
        private List<FirewallSet> firewallSet;

        /** ULB是否开启日志功能。0，关闭；1，开启 */
        @SerializedName("EnableLog")
        private Integer enableLog;

        /** 日志功能相关信息，仅当EnableLog为true时会返回，具体结构见下方 LoggerSet */
        @SerializedName("LogSet")
        private LoggerSet logSet;

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

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public List<ULBIPSet> getIPSet() {
            return ipSet;
        }

        public void setIPSet(List<ULBIPSet> ipSet) {
            this.ipSet = ipSet;
        }

        public List<ULBVServerSet> getVServerSet() {
            return vServerSet;
        }

        public void setVServerSet(List<ULBVServerSet> vServerSet) {
            this.vServerSet = vServerSet;
        }

        public String getULBType() {
            return ulbType;
        }

        public void setULBType(String ulbType) {
            this.ulbType = ulbType;
        }

        public String getIPVersion() {
            return ipVersion;
        }

        public void setIPVersion(String ipVersion) {
            this.ipVersion = ipVersion;
        }

        public List<String> getSnatIps() {
            return snatIps;
        }

        public void setSnatIps(List<String> snatIps) {
            this.snatIps = snatIps;
        }

        public String getListenType() {
            return listenType;
        }

        public void setListenType(String listenType) {
            this.listenType = listenType;
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

    public static class ULBVServerSet extends Response {

        /**
         * 健康检查类型，枚举值：Port -> 端口检查；Path -> 路径检查；Ping -> Ping探测， Customize -> UDP检查
         *
         * <p>请求代理型默认值为Port，其中TCP协议仅支持Port，其他协议支持Port和Path;
         * 报文转发型TCP协议仅支持Port，UDP协议支持Ping、Port和Customize
         */
        @SerializedName("MonitorType")
        private String monitorType;

        /** VServer会话保持方式。枚举值为： None -> 关闭会话保持； ServerInsert -> 自动生成； UserDefined -> 用户自定义。 */
        @SerializedName("PersistenceType")
        private String persistenceType;

        /** 负载均衡实例的Id */
        @SerializedName("ULBId")
        private String ulbId;

        /** 根据MonitorType确认； 当MonitorType为Port时，此字段无意义。当MonitorType为Path时，代表HTTP检查域名 */
        @SerializedName("Domain")
        private String domain;

        /** 根据MonitorType确认； 当MonitorType为Port时，此字段无意义。当MonitorType为Path时，代表HTTP检查路径 */
        @SerializedName("Path")
        private String path;

        /** 根据MonitorType确认； 当MonitorType为Customize时，此字段有意义，代表UDP检查发出的请求报文 */
        @SerializedName("RequestMsg")
        private String requestMsg;

        /** 根据MonitorType确认； 当MonitorType为Customize时，此字段有意义，代表UDP检查请求应收到的响应报文 */
        @SerializedName("ResponseMsg")
        private String responseMsg;

        /** VServer实例的Id */
        @SerializedName("VServerId")
        private String vServerId;

        /** VServer实例的名字 */
        @SerializedName("VServerName")
        private String vServerName;

        /** VServer实例的协议。 枚举值为：HTTP，TCP，UDP，HTTPS。 */
        @SerializedName("Protocol")
        private String protocol;

        /** VServer服务端口 */
        @SerializedName("FrontendPort")
        private Integer frontendPort;

        /**
         * VServer负载均衡的模式，枚举值：Roundrobin -> 轮询;Source -> 源地址；ConsistentHash -> 一致性哈希；SourcePort ->
         * 源地址（计算端口）；ConsistentHashPort -> 一致性哈希（计算端口）。
         */
        @SerializedName("Method")
        private String method;

        /** 根据PersistenceType确定： None或ServerInsert，此字段为空； UserDefined，此字段展示用户自定义会话string。 */
        @SerializedName("PersistenceInfo")
        private String persistenceInfo;

        /** 空闲连接的回收时间，单位：秒。 */
        @SerializedName("ClientTimeout")
        private Integer clientTimeout;

        /** VServer的运行状态。枚举值： 0 -> rs全部运行正常;1 -> rs全部运行异常；2 -> rs部分运行异常。 */
        @SerializedName("Status")
        private Integer status;

        /** VServer绑定的SSL证书信息，具体结构见下方 ULBSSLSet。 */
        @SerializedName("SSLSet")
        private List<ULBSSLSet> sslSet;

        /** 后端资源信息列表，具体结构见下方 ULBBackendSet */
        @SerializedName("BackendSet")
        private List<ULBBackendSet> backendSet;

        /** 监听器类型，枚举值为: RequestProxy -> 请求代理；PacketsTransmit -> 报文转发 */
        @SerializedName("ListenType")
        private String listenType;

        /** 内容转发信息列表，具体结构见下方 ULBPolicySet */
        @SerializedName("PolicySet")
        private List<ULBPolicySet> policySet;

        /** 数据压缩开关，0:关闭 1:开启 */
        @SerializedName("EnableCompression")
        private Integer enableCompression;

        /** VServer绑定的安全策略,具体结构见BindSecurityPolicy */
        @SerializedName("SecurityPolicy")
        private BindSecurityPolicy securityPolicy;

        /** 重定向端口，取值范围[0-65535]；默认值为0，代表关闭；仅HTTP协议支持开启重定向功能 */
        @SerializedName("ForwardPort")
        private Integer forwardPort;

        /** 0:关闭 1:开启，用于开启http2功能；默认值为0 */
        @SerializedName("EnableHTTP2")
        private Integer enableHTTP2;

        public String getMonitorType() {
            return monitorType;
        }

        public void setMonitorType(String monitorType) {
            this.monitorType = monitorType;
        }

        public String getPersistenceType() {
            return persistenceType;
        }

        public void setPersistenceType(String persistenceType) {
            this.persistenceType = persistenceType;
        }

        public String getULBId() {
            return ulbId;
        }

        public void setULBId(String ulbId) {
            this.ulbId = ulbId;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getRequestMsg() {
            return requestMsg;
        }

        public void setRequestMsg(String requestMsg) {
            this.requestMsg = requestMsg;
        }

        public String getResponseMsg() {
            return responseMsg;
        }

        public void setResponseMsg(String responseMsg) {
            this.responseMsg = responseMsg;
        }

        public String getVServerId() {
            return vServerId;
        }

        public void setVServerId(String vServerId) {
            this.vServerId = vServerId;
        }

        public String getVServerName() {
            return vServerName;
        }

        public void setVServerName(String vServerName) {
            this.vServerName = vServerName;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public Integer getFrontendPort() {
            return frontendPort;
        }

        public void setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getPersistenceInfo() {
            return persistenceInfo;
        }

        public void setPersistenceInfo(String persistenceInfo) {
            this.persistenceInfo = persistenceInfo;
        }

        public Integer getClientTimeout() {
            return clientTimeout;
        }

        public void setClientTimeout(Integer clientTimeout) {
            this.clientTimeout = clientTimeout;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public List<ULBSSLSet> getSSLSet() {
            return sslSet;
        }

        public void setSSLSet(List<ULBSSLSet> sslSet) {
            this.sslSet = sslSet;
        }

        public List<ULBBackendSet> getBackendSet() {
            return backendSet;
        }

        public void setBackendSet(List<ULBBackendSet> backendSet) {
            this.backendSet = backendSet;
        }

        public String getListenType() {
            return listenType;
        }

        public void setListenType(String listenType) {
            this.listenType = listenType;
        }

        public List<ULBPolicySet> getPolicySet() {
            return policySet;
        }

        public void setPolicySet(List<ULBPolicySet> policySet) {
            this.policySet = policySet;
        }

        public Integer getEnableCompression() {
            return enableCompression;
        }

        public void setEnableCompression(Integer enableCompression) {
            this.enableCompression = enableCompression;
        }

        public BindSecurityPolicy getSecurityPolicy() {
            return securityPolicy;
        }

        public void setSecurityPolicy(BindSecurityPolicy securityPolicy) {
            this.securityPolicy = securityPolicy;
        }

        public Integer getForwardPort() {
            return forwardPort;
        }

        public void setForwardPort(Integer forwardPort) {
            this.forwardPort = forwardPort;
        }

        public Integer getEnableHTTP2() {
            return enableHTTP2;
        }

        public void setEnableHTTP2(Integer enableHTTP2) {
            this.enableHTTP2 = enableHTTP2;
        }
    }
}
