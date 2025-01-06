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
package cn.ucloud.nlb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeNetworkLoadBalancersResponse extends Response {

    /** 满足条件的负载均衡实例总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 返回的负载均衡实例列表 */
    @SerializedName("NLBs")
    private List<NetworkLoadBalancer> nlBs;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<NetworkLoadBalancer> getNLBs() {
        return nlBs;
    }

    public void setNLBs(List<NetworkLoadBalancer> nlBs) {
        this.nlBs = nlBs;
    }

    public static class HealthCheckConfig extends Response {

        /** 是否开启健康检查功能。 */
        @SerializedName("Enabled")
        private Boolean enabled;

        /** 健康检查探测端口 说明： 限定取值：[1-65535] */
        @SerializedName("Port")
        private Integer port;

        /** 健康检查方式 限定取值："Port"/"UDP"/"Ping" /"HTTP" 默认值：“Port” */
        @SerializedName("Type")
        private String type;

        /** 健康检查间隔时间 限定取值：[1-60] 单位秒 默认 2s */
        @SerializedName("Interval")
        private Integer interval;

        /** 健康检查最小成功数 限定取值：[1-10] 默认 3 */
        @SerializedName("MinSuccess")
        private Integer minSuccess;

        /** 健康检查最大失败数 限定取值：[1-10] 默认 3 */
        @SerializedName("MaxFail")
        private Integer maxFail;

        /** UDP" 检查模式的请求字符串 "HTTP" 检查模式的请求 json 字符串 */
        @SerializedName("ReqMsg")
        private String reqMsg;

        /** "UDP" 检查模式的预期响应字符串 "HTTP" 检查模式的响应状态码 */
        @SerializedName("ResMsg")
        private String resMsg;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getInterval() {
            return interval;
        }

        public void setInterval(Integer interval) {
            this.interval = interval;
        }

        public Integer getMinSuccess() {
            return minSuccess;
        }

        public void setMinSuccess(Integer minSuccess) {
            this.minSuccess = minSuccess;
        }

        public Integer getMaxFail() {
            return maxFail;
        }

        public void setMaxFail(Integer maxFail) {
            this.maxFail = maxFail;
        }

        public String getReqMsg() {
            return reqMsg;
        }

        public void setReqMsg(String reqMsg) {
            this.reqMsg = reqMsg;
        }

        public String getResMsg() {
            return resMsg;
        }

        public void setResMsg(String resMsg) {
            this.resMsg = resMsg;
        }
    }

    public static class IPInfo extends Response {

        /** 唯一标识 ID */
        @SerializedName("Id")
        private String id;

        /** IP 地址 */
        @SerializedName("IP")
        private String ip;

        /** IP 类型，1（前向 IP）/ 2（后向 IP） */
        @SerializedName("Type")
        private Integer type;

        /** IP协议版本，限定枚举值："IPv4" / "IPv6" */
        @SerializedName("IPVersion")
        private String ipVersion;

        /** 网络模式，限定枚举值："Internet" / "Intranet" */
        @SerializedName("AddressType")
        private String addressType;

        /**
         * 外网IP的运营商信息，限定枚举值："Telecom" /
         * "Unicom"/"International"/"Bgp"/"Duplet"/"BGPPro"/"China-mobile"/"Anycast"
         */
        @SerializedName("OperatorName")
        private String operatorName;

        /** 带宽类型，限定枚举值：0（普通带宽）/ 1（共享带宽） */
        @SerializedName("BandwidthType")
        private Integer bandwidthType;

        /** 带宽值。单位 M */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getIPVersion() {
            return ipVersion;
        }

        public void setIPVersion(String ipVersion) {
            this.ipVersion = ipVersion;
        }

        public String getAddressType() {
            return addressType;
        }

        public void setAddressType(String addressType) {
            this.addressType = addressType;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
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

        /** 端口范围的起始端口 */
        @SerializedName("StartPort")
        private Integer startPort;

        /** 端口范围的结束端口 */
        @SerializedName("EndPort")
        private Integer endPort;

        /** 监听协议，限定取值："TCP"/"UDP" */
        @SerializedName("Protocol")
        private String protocol;

        /**
         * 负载均衡算法，限定取值："RoundRobin"/"SourceHash"/"LeastConn"/"WeightLeastConn "/"WeightRoundRobin "
         */
        @SerializedName("Scheduler")
        private String scheduler;

        /** 会话保持超时时间。单位：秒，0表示不开启会话保持 */
        @SerializedName("StickinessTimeout")
        private Integer stickinessTimeout;

        /** 传递源 IP 方法。限定取值："" / "None" / "Toa"，空字符串和 None 代表关闭。 */
        @SerializedName("ForwardSrcIPMethod")
        private String forwardSrcIPMethod;

        /** 健康检查相关配置 */
        @SerializedName("HealthCheckConfig")
        private HealthCheckConfig healthCheckConfig;

        /** 服务节点信息 */
        @SerializedName("Targets")
        private List<Target> targets;

        /** listener 健康状态，"Healthy"/"Unhealthy"/"PartialHealth"/"None" */
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

        public Integer getStartPort() {
            return startPort;
        }

        public void setStartPort(Integer startPort) {
            this.startPort = startPort;
        }

        public Integer getEndPort() {
            return endPort;
        }

        public void setEndPort(Integer endPort) {
            this.endPort = endPort;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getScheduler() {
            return scheduler;
        }

        public void setScheduler(String scheduler) {
            this.scheduler = scheduler;
        }

        public Integer getStickinessTimeout() {
            return stickinessTimeout;
        }

        public void setStickinessTimeout(Integer stickinessTimeout) {
            this.stickinessTimeout = stickinessTimeout;
        }

        public String getForwardSrcIPMethod() {
            return forwardSrcIPMethod;
        }

        public void setForwardSrcIPMethod(String forwardSrcIPMethod) {
            this.forwardSrcIPMethod = forwardSrcIPMethod;
        }

        public HealthCheckConfig getHealthCheckConfig() {
            return healthCheckConfig;
        }

        public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
        }

        public List<Target> getTargets() {
            return targets;
        }

        public void setTargets(List<Target> targets) {
            this.targets = targets;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    public static class NetworkLoadBalancer extends Response {

        /** 负载均衡实例的ID */
        @SerializedName("NLBId")
        private String nlbId;

        /** 负载均衡实例的名称 */
        @SerializedName("Name")
        private String name;

        /** 负载均衡实例所属的业务组ID */
        @SerializedName("Tag")
        private String tag;

        /** 负载均衡实例的备注信息 */
        @SerializedName("Remark")
        private String remark;

        /** 负载均衡实例支持的IP协议版本 */
        @SerializedName("IPVersion")
        private String ipVersion;

        /** 负载均衡实例所属的VPC资源ID */
        @SerializedName("VPCId")
        private String vpcId;

        /** 负载均衡实例所属的子网资源ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 绑定的IP信息 */
        @SerializedName("IPInfos")
        private List<IPInfo> ipInfos;

        /** 负载均衡实例的转发模式 */
        @SerializedName("ForwardingMode")
        private String forwardingMode;

        /** 付费模式 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 有效期（计费） */
        @SerializedName("PurchaseValue")
        private Integer purchaseValue;

        /** 负载均衡实例创建时间。格式为 Unix Timestamp */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** */
        @SerializedName("Listeners")
        private List<Listener> listeners;

        /** NLB 状态：Normal-正常；Closed-欠费停服；Deleted 已删除 */
        @SerializedName("Status")
        private String status;

        /** 是否开启自动续费 */
        @SerializedName("AutoRenewEnabled")
        private Boolean autoRenewEnabled;

        public String getNLBId() {
            return nlbId;
        }

        public void setNLBId(String nlbId) {
            this.nlbId = nlbId;
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

        public String getIPVersion() {
            return ipVersion;
        }

        public void setIPVersion(String ipVersion) {
            this.ipVersion = ipVersion;
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

        public List<IPInfo> getIPInfos() {
            return ipInfos;
        }

        public void setIPInfos(List<IPInfo> ipInfos) {
            this.ipInfos = ipInfos;
        }

        public String getForwardingMode() {
            return forwardingMode;
        }

        public void setForwardingMode(String forwardingMode) {
            this.forwardingMode = forwardingMode;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getPurchaseValue() {
            return purchaseValue;
        }

        public void setPurchaseValue(Integer purchaseValue) {
            this.purchaseValue = purchaseValue;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public List<Listener> getListeners() {
            return listeners;
        }

        public void setListeners(List<Listener> listeners) {
            this.listeners = listeners;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Boolean getAutoRenewEnabled() {
            return autoRenewEnabled;
        }

        public void setAutoRenewEnabled(Boolean autoRenewEnabled) {
            this.autoRenewEnabled = autoRenewEnabled;
        }
    }

    public static class Target extends Response {

        /** 服务节点所在地域 */
        @SerializedName("Region")
        private String region;

        /** 服务节点的类型 */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 服务节点的资源ID。在非IP类型时，必传 */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 服务节点的资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 服务节点的VPC资源ID。在IP类型时，必传 */
        @SerializedName("VPCId")
        private String vpcId;

        /** 服务节点的子网资源ID。在IP类型时，必传 */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 服务节点的IP。在IP类型时，必传 */
        @SerializedName("ResourceIP")
        private String resourceIP;

        /** 服务节点的端口 */
        @SerializedName("Port")
        private Integer port;

        /** 服务节点的权重。支持更新 */
        @SerializedName("Weight")
        private Integer weight;

        /** 服务节点是否开启 */
        @SerializedName("Enabled")
        private Boolean enabled;

        /** 服务节点的标识 ID 说明： 添加服务节点的时候无需传 更新服务节点属性时必传 */
        @SerializedName("Id")
        private String id;

        /** 服务节点的健康检查状态 说明： 描述服务节点信息时显示 限定枚举值："Healthy"/"Unhealthy" */
        @SerializedName("State")
        private String state;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
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
