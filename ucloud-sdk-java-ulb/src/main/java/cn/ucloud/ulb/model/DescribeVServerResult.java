package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取VServer信息 结果类
 * @author: codezhang
 * @date: 2018-09-19 12:11
 **/

public class DescribeVServerResult extends BaseResponseResult {

    public static class ULBVServer {

        /**
         * VServer实例的Id
         */
        @SerializedName("VServerId")
        private String vserverId;

        /**
         * VServer实例的名字
         */
        @SerializedName("VServerName")
        private String vserverName;

        /**
         * VServer实例的协议。 枚举值为：HTTP，TCP，UDP，HTTPS。
         */
        @SerializedName("Protocol")
        private String protocol;


        /**
         * VServer服务端口
         */
        @SerializedName("FrontendPort")
        private Integer frontendPort;

        /**
         * VServer负载均衡的模式，枚举值：
         * Roundrobin -> 轮询;
         * Source -> 源地址；
         * ConsistentHash -> 一致性哈希；
         * SourcePort -> 源地址（计算端口）；
         * ConsistentHashPort -> 一致性哈希（计算端口）。
         */
        @SerializedName("Method")
        private String method;

        /**
         * VServer会话保持方式。枚举值为：
         * None -> 关闭会话保持；
         * ServerInsert -> 自动生成；
         * UserDefined -> 用户自定义。
         */
        @SerializedName("PersistenceType")
        private String persistenceType;

        /**
         * 根据PersistenceType确定：
         * None或ServerInsert，此字段为空；
         * UserDefined，此字段展示用户自定义会话string。
         */
        @SerializedName("PersistenceInfo")
        private String persistenceInfo;

        /**
         * 空闲连接的回收时间，单位：秒。
         */
        @SerializedName("ClientTimeout")
        private Integer clientTimeout;

        /**
         * VServer的运行状态。枚举值：
         * 0 -> rs全部运行正常;
         * 1 -> rs部分运行正常;
         * 2 -> rs全部运行异常。
         */
        @SerializedName("Status")
        private Integer status;

        /**
         * VServer绑定的SSL证书信息，具体结构见下方 ULBSSLSet
         */
        @SerializedName("SSLSet")
        private List<SSL> ssls;

        /**
         * 后端资源信息列表，具体结构见下方 ULBBackendSet
         */
        @SerializedName("BackendSet")
        private List<ULBBackend> backends;

        /**
         * 监听器类型，枚举值为:
         * RequestProxy -> 请求代理；
         * PacketsTransmit -> 报文转发
         */
        @SerializedName("ListenType")
        private String listenType;

        /**
         * 内容转发信息列表，具体结构见下方 ULBPolicySet
         */
        @SerializedName("PolicySet")
        private List<ULBPolicy> policies;

        @SerializedName("CreateTime")
        private Integer createTime;

        @SerializedName("Domain")
        private String domain;

        @SerializedName("MetricIdSet")
        private List<Metric> metrics;

        @SerializedName("MonitorType")
        private String monitorType;

        @SerializedName("Path")
        private String path;

        @SerializedName("Remark")
        private String remark;

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getMonitorType() {
            return monitorType;
        }

        public void setMonitorType(String monitorType) {
            this.monitorType = monitorType;
        }

        public List<SSL> getSsls() {
            return ssls;
        }

        public void setSsls(List<SSL> ssls) {
            this.ssls = ssls;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public List<Metric> getMetrics() {
            return metrics;
        }

        public void setMetrics(List<Metric> metrics) {
            this.metrics = metrics;
        }

        public String getVserverId() {
            return vserverId;
        }

        public void setVserverId(String vserverId) {
            this.vserverId = vserverId;
        }

        public String getVserverName() {
            return vserverName;
        }

        public void setVserverName(String vserverName) {
            this.vserverName = vserverName;
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

        public String getPersistenceType() {
            return persistenceType;
        }

        public void setPersistenceType(String persistenceType) {
            this.persistenceType = persistenceType;
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

        public List<SSL> getUlbssls() {
            return ssls;
        }

        public void setUlbssls(List<SSL> ulbssls) {
            this.ssls = ulbssls;
        }

        public List<ULBBackend> getBackends() {
            return backends;
        }

        public void setBackends(List<ULBBackend> backends) {
            this.backends = backends;
        }

        public String getListenType() {
            return listenType;
        }

        public void setListenType(String listenType) {
            this.listenType = listenType;
        }

        public List<ULBPolicy> getPolicies() {
            return policies;
        }

        public void setPolicies(List<ULBPolicy> policies) {
            this.policies = policies;
        }

    }

    public static class SSL {

        /**
         * SSL证书的Id
         */
        @SerializedName("SSLId")
        private String sslId;

        /**
         * SSL证书的名字
         */
        @SerializedName("SSLName")
        private String sslName;

        /**
         * SSL证书类型，暂时只有 Pem 一种类型
         */
        @SerializedName("SSLType")
        private String sslType;


        /**
         * SSL证书的内容
         */
        @SerializedName("SSLContent")
        private String sslContent;

        /**
         * SSL证书的创建时间
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * SSL证书绑定到的对象
         */
        @SerializedName("SSLBindedTargetSet")
        private List<SSLBingedTarget> sslBingedTargets;

        public String getSslId() {
            return sslId;
        }

        public void setSslId(String sslId) {
            this.sslId = sslId;
        }

        public String getSslName() {
            return sslName;
        }

        public void setSslName(String sslName) {
            this.sslName = sslName;
        }

        public String getSslType() {
            return sslType;
        }

        public void setSslType(String sslType) {
            this.sslType = sslType;
        }

        public String getSslContent() {
            return sslContent;
        }

        public void setSslContent(String sslContent) {
            this.sslContent = sslContent;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public List<SSLBingedTarget> getSslBingedTargets() {
            return sslBingedTargets;
        }

        public void setSslBingedTargets(List<SSLBingedTarget> sslBingedTargets) {
            this.sslBingedTargets = sslBingedTargets;
        }

    }

    public static class SSLBingedTarget {

        /**
         * SSL证书绑定到的VServer的资源ID
         */
        @SerializedName("VServerId")
        private String vserverId;

        /**
         * 对应的VServer的名字
         */
        @SerializedName("VServerName")
        private String vserverName;

        /**
         * VServer 所属的ULB实例的资源ID
         */
        @SerializedName("ULBId")
        private String ulbId;

        /**
         * ULB实例的名称
         */
        @SerializedName("ULBName")
        private String ulbName;

        public String getVserverId() {
            return vserverId;
        }

        public void setVserverId(String vserverId) {
            this.vserverId = vserverId;
        }

        public String getVserverName() {
            return vserverName;
        }

        public void setVserverName(String vserverName) {
            this.vserverName = vserverName;
        }

        public String getUlbId() {
            return ulbId;
        }

        public void setUlbId(String ulbId) {
            this.ulbId = ulbId;
        }

        public String getUlbName() {
            return ulbName;
        }

        public void setUlbName(String ulbName) {
            this.ulbName = ulbName;
        }

    }

    public static class ULBBackend {
        /**
         * 后端资源实例的Id
         */
        @SerializedName("BackendId")
        private String backendId;

        /**
         * 后端资源实例的类型
         */
        @SerializedName("ResourceType")
        private String resourceType;

        /**
         * 后端资源实例的资源Id
         */
        @SerializedName("ResourceId")
        private String resourceId;

        /**
         * 后端资源实例的资源名字
         */
        @SerializedName("ResourceName")
        private String resourceName;

        /**
         * 后端资源实例的内网IP
         */
        @SerializedName("PrivateIP")
        private String privateIp;


        /**
         * 后端资源实例服务的端口
         */
        @SerializedName("Port")
        private Integer port;

        /**
         * 后端资源实例的启用与否
         */
        @SerializedName("Enabled")
        private Integer enabled;

        /**
         * 后端资源实例的运行状态
         */
        @SerializedName("Status")
        private Integer status;

        /**
         * 后端资源实例的资源所在的子网的ID
         */
        @SerializedName("SubnetId")
        private String subnetId;

        @SerializedName("Weight")
        private Integer weight;

        @SerializedName("SubResourceId")
        private String subResourceId;

        @SerializedName("SubResourceName")
        private String subResourceName;

        @SerializedName("SubResourceType")
        private String subResourceType;

        public String getSubResourceType() {
            return subResourceType;
        }

        public void setSubResourceType(String subResourceType) {
            this.subResourceType = subResourceType;
        }

        public String getSubResourceName() {
            return subResourceName;
        }

        public void setSubResourceName(String subResourceName) {
            this.subResourceName = subResourceName;
        }

        public String getSubResourceId() {
            return subResourceId;
        }

        public void setSubResourceId(String subResourceId) {
            this.subResourceId = subResourceId;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

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

        public String getPrivateIp() {
            return privateIp;
        }

        public void setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
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

    }

    public static class ULBPolicy {

        /**
         * 内容转发Id，默认内容转发类型下为空。
         */
        @SerializedName("PolicyId")
        private String policyId;

        /**
         * 内容类型，枚举值：Custom -> 客户自定义；Default -> 默认内容转发
         */
        @SerializedName("PolicyType")
        private String policyType;

        /**
         * 内容转发匹配字段的类型，枚举值：
         * Domain -> 域名；
         * Path -> 路径；
         * 默认内容转发类型下为空
         */
        @SerializedName("Type")
        private String type;

        /**
         * 内容转发匹配字段;默认内容转发类型下为空。
         */
        @SerializedName("Match")
        private String match;

        /**
         * 内容转发优先级，范围[1,9999]，数字越大优先级越高。默认内容转发规则下为0。
         */
        @SerializedName("PolicyPriority")
        private Integer policyPriority;

        /**
         * 所属VServerId
         */
        @SerializedName("VServerId")
        private String vserverId;

        /**
         * 默认内容转发类型下返回当前rs总数
         */
        @SerializedName("TotalCount")
        private Integer totalCount;

        /**
         * 内容转发下rs的详细信息，参考PolicyBackendSet
         */
        @SerializedName("BackendSet")
        private List<PolicyBackend> backends;

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

        public String getVserverId() {
            return vserverId;
        }

        public void setVserverId(String vserverId) {
            this.vserverId = vserverId;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public List<PolicyBackend> getBackends() {
            return backends;
        }

        public void setBackends(List<PolicyBackend> backends) {
            this.backends = backends;
        }

    }

    public static class PolicyBackend {
        /**
         * 所添加的后端资源在ULB中的对象ID，
         * （为ULB系统中使用，与资源自身ID无关)
         */
        @SerializedName("BackendId")
        private String backendId;

        /**
         * 后端资源的对象ID
         */
        @SerializedName("ObjectId")
        private String objectId;

        /**
         * 所添加的后端资源服务端口
         */
        @SerializedName("Port")
        private Integer port;

        /**
         * 后端资源的内网IP
         */
        @SerializedName("PrivateIP")
        private String privateIp;

        /**
         * 后端资源的实例名称
         */
        @SerializedName("ResourceName")
        private String resourceName;

        @SerializedName("Weight")
        private Integer weight;

        @SerializedName("SubResourceId")
        private String subResourceId;

        @SerializedName("SubResourceName")
        private String subResourceName;

        @SerializedName("SubResourceType")
        private String subResourceType;

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

        public String getSubResourceId() {
            return subResourceId;
        }

        public void setSubResourceId(String subResourceId) {
            this.subResourceId = subResourceId;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getBackendId() {
            return backendId;
        }

        public void setBackendId(String backendId) {
            this.backendId = backendId;
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

        public String getPrivateIp() {
            return privateIp;
        }

        public void setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

    }

    public static class Metric {

        @SerializedName("MetricId")
        private String metricId;

        @SerializedName("Type")
        private String type;

        public String getMetricId() {
            return metricId;
        }

        public void setMetricId(String metricId) {
            this.metricId = metricId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }


    /**
     * 满足条件的VServer总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * VServer列表，每项参数详见 ULBVServerSet
     */
    @SerializedName("DataSet")
    private List<ULBVServer> ulbvServers;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ULBVServer> getUlbvServers() {
        return ulbvServers;
    }

    public void setUlbvServers(List<ULBVServer> ulbvServers) {
        this.ulbvServers = ulbvServers;
    }

}
