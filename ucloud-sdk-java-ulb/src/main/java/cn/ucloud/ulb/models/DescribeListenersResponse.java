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

public class DescribeListenersResponse extends Response {

    /** 满足条件的负载均衡监听器总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 负载均衡监听器信息 */
    @SerializedName("Listeners")
    private List<Listener> listeners;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Listener> getListeners() {
        return listeners;
    }

    public void setListeners(List<Listener> listeners) {
        this.listeners = listeners;
    }

    public static class Certificate extends Response {

        /** 证书ID */
        @SerializedName("SSLId")
        private String sslId;

        /** 是否为默认证书 */
        @SerializedName("IsDefault")
        private Boolean isDefault;

        public String getSSLId() {
            return sslId;
        }

        public void setSSLId(String sslId) {
            this.sslId = sslId;
        }

        public Boolean getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
        }
    }

    public static class ForwardConfigSet extends Response {

        /** 转发的后端服务节点。限定在监听器的服务节点池里；数组长度可以为0。具体结构详见 ForwardTargetSet */
        @SerializedName("Targets")
        private List<ForwardTargetSet> targets;

        public List<ForwardTargetSet> getTargets() {
            return targets;
        }

        public void setTargets(List<ForwardTargetSet> targets) {
            this.targets = targets;
        }
    }

    public static class ForwardTargetSet extends Response {

        /** 服务节点的标识ID */
        @SerializedName("Id")
        private String id;

        /** 权重。仅监听器负载均衡算法是加权轮询是有效；取值范围[1-100]，默认值为1 */
        @SerializedName("Weight")
        private Integer weight;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }
    }

    public static class HealthCheckConfigSet extends Response {

        /** 是否开启健康检查功能。暂时不支持关闭。 默认值为：true */
        @SerializedName("Enabled")
        private Boolean enabled;

        /** 健康检查方式。应用型限定取值： Port -> 端口检查；HTTP -> HTTP检查； 默认值：Port */
        @SerializedName("Type")
        private String type;

        /** （应用型专用）HTTP检查域名。 当Type为HTTP时，此字段有意义，代表HTTP检查域名 */
        @SerializedName("Domain")
        private String domain;

        /** （应用型专用）HTTP检查路径。当Type为HTTP时，此字段有意义，代表HTTP检查路径 */
        @SerializedName("Path")
        private String path;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
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
    }

    public static class HostConfigSet extends Response {

        /** 取值。暂时只支持数组长度为1； 取值需符合相关匹配方式的条件 */
        @SerializedName("Values")
        private List<String> values;

        /** 匹配方式。限定枚举值：Regular-正则，Wildcard-泛域名； 默认值：Regular */
        @SerializedName("MatchMode")
        private String matchMode;

        public List<String> getValues() {
            return values;
        }

        public void setValues(List<String> values) {
            this.values = values;
        }

        public String getMatchMode() {
            return matchMode;
        }

        public void setMatchMode(String matchMode) {
            this.matchMode = matchMode;
        }
    }

    public static class Listener extends Response {

        /** 监听器的ID */
        @SerializedName("ListenerId")
        private String listenerId;

        /** 监听器的名称 */
        @SerializedName("Name")
        private String name;

        /** 监听器的备注信息 */
        @SerializedName("Remark")
        private String remark;

        /** 监听器的监听端口 */
        @SerializedName("ListenerPort")
        private Integer listenerPort;

        /** 监听协议。应用型限定取值： HTTP、HTTPS */
        @SerializedName("ListenerProtocol")
        private String listenerProtocol;

        /** （应用型专用）服务器默认证书ID。仅HTTPS监听支持。具体接口详见 Certificate */
        @SerializedName("Certificates")
        private List<Certificate> certificates;

        /** （应用型专用）安全策略组ID。仅HTTPS监听支持绑定；Default -> 原生策略 */
        @SerializedName("SecurityPolicyId")
        private String securityPolicyId;

        /** 连接空闲超时时间。单位：秒 */
        @SerializedName("IdleTimeout")
        private Integer idleTimeout;

        /**
         * 负载均衡算法。应用型限定取值：Roundrobin -> 轮询;Source -> 源地址； WeightRoundrobin -> 加权轮询; Leastconn ->
         * 最小连接数；Backup ->主备模式
         */
        @SerializedName("Scheduler")
        private String scheduler;

        /** 会话保持相关配置。具体结构详见 StickinessConfigSet */
        @SerializedName("StickinessConfig")
        private StickinessConfigSet stickinessConfig;

        /** 健康检查相关配置。具体结构详见 HealthCheckConfigSet */
        @SerializedName("HealthCheckConfig")
        private HealthCheckConfigSet healthCheckConfig;

        /** （应用型专用）是否开启数据压缩功能。目前只支持使用gzip对特定文件类型进行压缩 */
        @SerializedName("CompressionEnabled")
        private Boolean compressionEnabled;

        /** （应用型专用）是否开启HTTP/2特性。仅HTTPS监听支持开启 */
        @SerializedName("HTTP2Enabled")
        private Boolean http2Enabled;

        /** （应用型专用）是否开启HTTP重定向到HTTPS。仅HTTP监听支持开启 */
        @SerializedName("RedirectEnabled")
        private Boolean redirectEnabled;

        /** （应用型专用）重定向端口 */
        @SerializedName("RedirectPort")
        private Integer redirectPort;

        /** 添加的服务节点信息。具体结构详见 Target */
        @SerializedName("Targets")
        private List<Target> targets;

        /** （应用型专用）转发规则信息 */
        @SerializedName("Rules")
        private List<Rule> rules;

        /** listener健康状态。限定枚举值：Healthy -> 健康，Unhealthy -> 不健康，PartialHealth -> 部分健康，None -> 无节点状态 */
        @SerializedName("State")
        private String state;

        public String getListenerId() {
            return listenerId;
        }

        public void setListenerId(String listenerId) {
            this.listenerId = listenerId;
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

        public Integer getListenerPort() {
            return listenerPort;
        }

        public void setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
        }

        public String getListenerProtocol() {
            return listenerProtocol;
        }

        public void setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
        }

        public List<Certificate> getCertificates() {
            return certificates;
        }

        public void setCertificates(List<Certificate> certificates) {
            this.certificates = certificates;
        }

        public String getSecurityPolicyId() {
            return securityPolicyId;
        }

        public void setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
        }

        public Integer getIdleTimeout() {
            return idleTimeout;
        }

        public void setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
        }

        public String getScheduler() {
            return scheduler;
        }

        public void setScheduler(String scheduler) {
            this.scheduler = scheduler;
        }

        public StickinessConfigSet getStickinessConfig() {
            return stickinessConfig;
        }

        public void setStickinessConfig(StickinessConfigSet stickinessConfig) {
            this.stickinessConfig = stickinessConfig;
        }

        public HealthCheckConfigSet getHealthCheckConfig() {
            return healthCheckConfig;
        }

        public void setHealthCheckConfig(HealthCheckConfigSet healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
        }

        public Boolean getCompressionEnabled() {
            return compressionEnabled;
        }

        public void setCompressionEnabled(Boolean compressionEnabled) {
            this.compressionEnabled = compressionEnabled;
        }

        public Boolean getHTTP2Enabled() {
            return http2Enabled;
        }

        public void setHTTP2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
        }

        public Boolean getRedirectEnabled() {
            return redirectEnabled;
        }

        public void setRedirectEnabled(Boolean redirectEnabled) {
            this.redirectEnabled = redirectEnabled;
        }

        public Integer getRedirectPort() {
            return redirectPort;
        }

        public void setRedirectPort(Integer redirectPort) {
            this.redirectPort = redirectPort;
        }

        public List<Target> getTargets() {
            return targets;
        }

        public void setTargets(List<Target> targets) {
            this.targets = targets;
        }

        public List<Rule> getRules() {
            return rules;
        }

        public void setRules(List<Rule> rules) {
            this.rules = rules;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    public static class PathConfigSet extends Response {

        /** 取值。暂时只支持数组长度为1； 取值需符合相关匹配方式的条件 */
        @SerializedName("Values")
        private List<String> values;

        public List<String> getValues() {
            return values;
        }

        public void setValues(List<String> values) {
            this.values = values;
        }
    }

    public static class Rule extends Response {

        /** 转发规则的ID */
        @SerializedName("RuleId")
        private String ruleId;

        /** 转发规则匹配条件。具体结构详见 RuleCondition */
        @SerializedName("RuleConditions")
        private List<RuleCondition> ruleConditions;

        /** 转发动作。具体规则详见RuleAction */
        @SerializedName("RuleActions")
        private List<RuleAction> ruleActions;

        /** 是否为默认转发规则 */
        @SerializedName("IsDefault")
        private Boolean isDefault;

        /** 当转发的服务节点为空时，规则是否忽略 */
        @SerializedName("Pass")
        private Boolean pass;

        public String getRuleId() {
            return ruleId;
        }

        public void setRuleId(String ruleId) {
            this.ruleId = ruleId;
        }

        public List<RuleCondition> getRuleConditions() {
            return ruleConditions;
        }

        public void setRuleConditions(List<RuleCondition> ruleConditions) {
            this.ruleConditions = ruleConditions;
        }

        public List<RuleAction> getRuleActions() {
            return ruleActions;
        }

        public void setRuleActions(List<RuleAction> ruleActions) {
            this.ruleActions = ruleActions;
        }

        public Boolean getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
        }

        public Boolean getPass() {
            return pass;
        }

        public void setPass(Boolean pass) {
            this.pass = pass;
        }
    }

    public static class RuleAction extends Response {

        /** 动作类型。限定枚举值：Forward */
        @SerializedName("Type")
        private String type;

        /** 转发服务节点相关配置。 具体结构详见 ForwardConfigSet */
        @SerializedName("ForwardConfig")
        private ForwardConfigSet forwardConfig;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public ForwardConfigSet getForwardConfig() {
            return forwardConfig;
        }

        public void setForwardConfig(ForwardConfigSet forwardConfig) {
            this.forwardConfig = forwardConfig;
        }
    }

    public static class RuleCondition extends Response {

        /** 匹配条件类型。限定枚举值：Host，Path */
        @SerializedName("Type")
        private String type;

        /** 域名相关配置。Type为Host时必填。具体结构详见 HostConfigSet */
        @SerializedName("HostConfig")
        private HostConfigSet hostConfig;

        /** 路径相关配置。Type为Path时必填。具体结构详见 PathConfigSet */
        @SerializedName("PathConfig")
        private PathConfigSet pathConfig;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public HostConfigSet getHostConfig() {
            return hostConfig;
        }

        public void setHostConfig(HostConfigSet hostConfig) {
            this.hostConfig = hostConfig;
        }

        public PathConfigSet getPathConfig() {
            return pathConfig;
        }

        public void setPathConfig(PathConfigSet pathConfig) {
            this.pathConfig = pathConfig;
        }
    }

    public static class StickinessConfigSet extends Response {

        /** 是否开启会话保持功能。应用型负载均衡实例基于Cookie实现 */
        @SerializedName("Enabled")
        private Boolean enabled;

        /** （应用型专用）Cookie处理方式。限定枚举值： ServerInsert -> 自动生成KEY；UserDefined -> 用户自定义KEY */
        @SerializedName("Type")
        private String type;

        /** （应用型专用）自定义Cookie。当StickinessType取值"UserDefined"时有效 */
        @SerializedName("CookieName")
        private String cookieName;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCookieName() {
            return cookieName;
        }

        public void setCookieName(String cookieName) {
            this.cookieName = cookieName;
        }
    }

    public static class Target extends Response {

        /**
         * 服务节点的类型。限定枚举值：UHost -> 云主机，UNI -> 虚拟网卡，UPM -> 物理云主机，IP -> IP类型； 默认值："UHost"；
         * 非IP类型，如果该资源有多个IP，将只能添加主IP； 非IP类型，展示时，会显示相关资源信息，IP类型只展示IP信息。
         * 在相关资源被删除时，非IP类型会把相关资源从lb中剔除，IP类型不保证这个逻辑
         */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 服务节点的资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 服务节点的资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 服务节点的VPC资源ID */
        @SerializedName("VPCId")
        private String vpcId;

        /** 服务节点的子网资源ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 服务节点的IP */
        @SerializedName("ResourceIP")
        private String resourceIP;

        /** 服务节点的端口 */
        @SerializedName("Port")
        private Integer port;

        /** 服务节点的权重。仅在加权轮询算法时有效 */
        @SerializedName("Weight")
        private Integer weight;

        /** 服务节点是否启用 */
        @SerializedName("Enabled")
        private Boolean enabled;

        /** 服务节点是否为备节点 */
        @SerializedName("IsBackup")
        private Boolean isBackup;

        /** 服务节点的标识ID。为ALB/NLB中使用，与资源自身ID无关，可用于UpdateTargetsAttribute/RemoveTargets */
        @SerializedName("Id")
        private String id;

        /** 服务节点的健康检查状态。限定枚举值：Healthy -> 健康，Unhealthy -> 不健康 */
        @SerializedName("State")
        private String state;

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

        public String getResourceIP() {
            return resourceIP;
        }

        public void setResourceIP(String resourceIP) {
            this.resourceIP = resourceIP;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Boolean getIsBackup() {
            return isBackup;
        }

        public void setIsBackup(Boolean isBackup) {
            this.isBackup = isBackup;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
