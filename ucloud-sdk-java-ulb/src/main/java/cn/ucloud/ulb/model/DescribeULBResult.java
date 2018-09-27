package cn.ucloud.ulb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取ULB信息
 * @author: codezhang
 * @date: 2018-09-19 10:18
 **/

public class DescribeULBResult extends BaseResponseResult {

    public static class ULB{
        /**
         * 负载均衡的资源ID
         */
        @SerializedName("ULBId")
        private String ulbId;

        /**
         * 负载均衡的资源名称（资源系统中），缺省值“ULB”
         */
        @SerializedName("Name")
        private String name;

        /**
         * 负载均衡的业务组名称，缺省值“Default”
         */
        @SerializedName("Tag")
        private String tag;

        /**
         * 负载均衡的备注，缺省值“”
         */
        @SerializedName("Remark")
        private String remark;

        /**
         * 带宽类型，枚举值为： 0，非共享带宽； 1，共享带宽
         */
        @SerializedName("BandwidthType")
        private Integer bandwidthType;

        /**
         * 带宽
         */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /**
         * ULB的创建时间，格式为Unix Timestamp
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * ULB的到期时间，格式为Unix Timestamp
         */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /**
         * ULB的详细信息列表，具体结构见下方 ULBIPSet
         */
        @SerializedName("IPSet")
        private List<ULBIP> ips;

        /**
         * 负载均衡实例中存在的VServer实例列表，具体结构见下方 ULBVServerSet
         */
        @SerializedName("VServerSet")
        private List<ULBVServer> ulbvServers;

        /**
         * ULB 的类型
         */
        @SerializedName("ULBType")
        private String ulbType;

        /**
         * ULB 为 InnerMode 时，ULB 所属的子网ID，默认为空
         */
        @SerializedName("SubnetId")
        private String subnetId;

        /**
         * ULB 所属的业务组ID
         */
        @SerializedName("BusinessId")
        private String businessId;

        @SerializedName("PrivateIP")
        private String privateIp;

        public String getUlbId() {
            return ulbId;
        }

        public void setUlbId(String ulbId) {
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

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public List<ULBIP> getIps() {
            return ips;
        }

        public void setIps(List<ULBIP> ips) {
            this.ips = ips;
        }

        public List<ULBVServer> getUlbvServers() {
            return ulbvServers;
        }

        public void setUlbvServers(List<ULBVServer> ulbvServers) {
            this.ulbvServers = ulbvServers;
        }

        public String getUlbType() {
            return ulbType;
        }

        public void setUlbType(String ulbType) {
            this.ulbType = ulbType;
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

        public String getPrivateIp() {
            return privateIp;
        }

        public void setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
        }

        @Override
        public String toString() {
            return "ULB{" +
                    "ulbId='" + ulbId + '\'' +
                    ", name='" + name + '\'' +
                    ", tag='" + tag + '\'' +
                    ", remark='" + remark + '\'' +
                    ", bandwidthType=" + bandwidthType +
                    ", bandwidth=" + bandwidth +
                    ", createTime=" + createTime +
                    ", expireTime=" + expireTime +
                    ", ips=" + ips +
                    ", ulbvServers=" + ulbvServers +
                    ", ulbType='" + ulbType + '\'' +
                    ", subnetId='" + subnetId + '\'' +
                    ", businessId='" + businessId + '\'' +
                    ", privateIp='" + privateIp + '\'' +
                    '}';
        }
    }

    public static class ULBIP{
        /**
         * 弹性IP的运营商信息，枚举值为： Bgp：BGP IP International：国际IP
         */
        @SerializedName("OperatorName")
        private String operatorName;

        /**
         * 弹性IP地址
         */
        @SerializedName("EIP")
        private String eip;

        /**
         * 弹性IP的ID
         */
        @SerializedName("EIPId")
        private String eipId;

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getEip() {
            return eip;
        }

        public void setEip(String eip) {
            this.eip = eip;
        }

        public String getEipId() {
            return eipId;
        }

        public void setEipId(String eipId) {
            this.eipId = eipId;
        }

        @Override
        public String toString() {
            return "ULBIP{" +
                    "operatorName='" + operatorName + '\'' +
                    ", eip='" + eip + '\'' +
                    ", eipId='" + eipId + '\'' +
                    '}';
        }
    }


    public static class ULBVServer{

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
         *
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
        private List<ULBSSL> ulbssls;

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

        public List<ULBSSL> getUlbssls() {
            return ulbssls;
        }

        public void setUlbssls(List<ULBSSL> ulbssls) {
            this.ulbssls = ulbssls;
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

        @Override
        public String toString() {
            return "ULBVServer{" +
                    "vserverId='" + vserverId + '\'' +
                    ", vserverName='" + vserverName + '\'' +
                    ", protocol='" + protocol + '\'' +
                    ", frontendPort=" + frontendPort +
                    ", method='" + method + '\'' +
                    ", persistenceType='" + persistenceType + '\'' +
                    ", persistenceInfo='" + persistenceInfo + '\'' +
                    ", clientTimeout=" + clientTimeout +
                    ", status=" + status +
                    ", ulbssls=" + ulbssls +
                    ", backends=" + backends +
                    ", listenType='" + listenType + '\'' +
                    ", policies=" + policies +
                    '}';
        }
    }


    public  static class ULBSSL{

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

        @Override
        public String toString() {
            return "ULBSSL{" +
                    "vserverId='" + vserverId + '\'' +
                    ", vserverName='" + vserverName + '\'' +
                    ", ulbId='" + ulbId + '\'' +
                    ", ulbName='" + ulbName + '\'' +
                    '}';
        }
    }


    public static  class ULBBackend{
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
        private Integer status;

        /**
         * 后端资源实例的资源所在的子网的ID
         */
        private String subnetId;

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

        @Override
        public String toString() {
            return "ULBBackend{" +
                    "backendId='" + backendId + '\'' +
                    ", resourceType='" + resourceType + '\'' +
                    ", resourceId='" + resourceId + '\'' +
                    ", resourceName='" + resourceName + '\'' +
                    ", privateIp='" + privateIp + '\'' +
                    ", port=" + port +
                    ", enabled=" + enabled +
                    ", status=" + status +
                    ", subnetId='" + subnetId + '\'' +
                    '}';
        }
    }


    public static class ULBPolicy{

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

        @Override
        public String toString() {
            return "ULBPolicy{" +
                    "policyId='" + policyId + '\'' +
                    ", policyType='" + policyType + '\'' +
                    ", type='" + type + '\'' +
                    ", match='" + match + '\'' +
                    ", policyPriority=" + policyPriority +
                    ", vserverId='" + vserverId + '\'' +
                    ", totalCount=" + totalCount +
                    ", backends=" + backends +
                    '}';
        }
    }

    public static class PolicyBackend{
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

        @Override
        public String toString() {
            return "PolicyBackend{" +
                    "backendId='" + backendId + '\'' +
                    ", objectId='" + objectId + '\'' +
                    ", port=" + port +
                    ", privateIp='" + privateIp + '\'' +
                    ", resourceName='" + resourceName + '\'' +
                    '}';
        }
    }


    /**
     * 满足条件的ULB总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;


    /**
     * ULB列表，每项参数详见 ULBSet
     */
    @SerializedName("DataSet")
    private List<ULB> ulbs;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ULB> getUlbs() {
        return ulbs;
    }

    public void setUlbs(List<ULB> ulbs) {
        this.ulbs = ulbs;
    }

    @Override
    public String toString() {
        return "DescribeULBResult{" +
                "totalCount=" + totalCount +
                ", ulbs=" + ulbs +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
