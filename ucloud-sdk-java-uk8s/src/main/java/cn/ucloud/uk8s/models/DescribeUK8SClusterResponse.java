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
package cn.ucloud.uk8s.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUK8SClusterResponse extends Response {

    /** 资源名字 */
    @SerializedName("ClusterName")
    private String clusterName;

    /** 集群ID */
    @SerializedName("ClusterId")
    private String clusterId;

    /** 所属VPC */
    @SerializedName("VPCId")
    private String vpcId;

    /** 所属子网 */
    @SerializedName("SubnetId")
    private String subnetId;

    /** Pod网段 */
    @SerializedName("PodCIDR")
    private String podCIDR;

    /** 服务网段 */
    @SerializedName("ServiceCIDR")
    private String serviceCIDR;

    /** Master 节点数量 */
    @SerializedName("MasterCount")
    private Integer masterCount;

    /** Master节点配置信息，具体参考UhostInfo。托管版不返回该信息 */
    @SerializedName("MasterList")
    private List<UhostInfo> masterList;

    /** Node节点配置信息,具体参考UhostInfo */
    @SerializedName("NodeList")
    private List<UhostInfo> nodeList;

    /** 创建时间 */
    @SerializedName("CreateTime")
    private Integer createTime;

    /** Node节点数量 */
    @SerializedName("NodeCount")
    private Integer nodeCount;

    /** 集群apiserver地址 */
    @SerializedName("ApiServer")
    private String apiServer;

    /** 状态 */
    @SerializedName("Status")
    private String status;

    /** 集群外部apiserver地址 */
    @SerializedName("ExternalApiServer")
    private String externalApiServer;

    /** kube-proxy配置 */
    @SerializedName("KubeProxy")
    private KubeProxy kubeProxy;

    /** K8S版本 */
    @SerializedName("Version")
    private String version;

    /** 自定义或者默认的clusterdomain */
    @SerializedName("ClusterDomain")
    private String clusterDomain;

    /** 集群etcd服务证书 */
    @SerializedName("EtcdCert")
    private String etcdCert;

    /** 集群etcd服务密钥 */
    @SerializedName("EtcdKey")
    private String etcdKey;

    /** 集群CA根证书 */
    @SerializedName("CACert")
    private String caCert;

    /** Master配置预警：Normal正常； Warning 需要升级； Error 需要紧急升级； */
    @SerializedName("MasterResourceStatus")
    private String masterResourceStatus;

    /** CNI模式，可选值VPC/Calico */
    @SerializedName("CNIMode")
    private String cniMode;

    /** 集群的监控类型：no无监控；cloudwatch统一监控平台；prometheus内置监控 */
    @SerializedName("MonitorType")
    private String monitorType;

    /** 集群的节点伸缩(CA)配置 */
    @SerializedName("Autoscaler")
    private Autoscaler autoscaler;

    /** 是否开启了授权管理功能 */
    @SerializedName("EnableUserAuth")
    private Boolean enableUserAuth;

    /** Pod是否使用独立子网 */
    @SerializedName("DedicatedPodSubnet")
    private Boolean dedicatedPodSubnet;

    /** Pod使用的独立子网列表 */
    @SerializedName("PodSubnetIds")
    private List<String> podSubnetIds;

    /** 删除保护开关。0表示不开启，1表示开启。默认不开启 */
    @SerializedName("DeleteProtection")
    private Integer deleteProtection;

    /** Pod独立子网内的ip使用的安全组 */
    @SerializedName("PodSubnetSecGroups")
    private List<String> podSubnetSecGroups;

    /** 节点网段 */
    @SerializedName("NodeCIDR")
    private String nodeCIDR;

    /** 外部 API Server 负载均衡实例 ID */
    @SerializedName("ExternalUlb")
    private String externalUlb;

    /** 内部 API Server 负载均衡实例 ID */
    @SerializedName("InternalUlb")
    private String internalUlb;

    /** 更新时间 */
    @SerializedName("UpdateTime")
    private Integer updateTime;

    /** 负载均衡类型 */
    @SerializedName("LbClass")
    private String lbClass;

    /** 容器运行时名称 */
    @SerializedName("RuntimeName")
    private String runtimeName;

    /** 容器运行时版本 */
    @SerializedName("RuntimeVersion")
    private String runtimeVersion;

    /** 集群版本 */
    @SerializedName("ClusterType")
    private String clusterType;

    /** API Server 回环客户端证书 */
    @SerializedName("LoopbackClientCert")
    private LoopbackClientCert loopbackClientCert;

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
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

    public String getPodCIDR() {
        return podCIDR;
    }

    public void setPodCIDR(String podCIDR) {
        this.podCIDR = podCIDR;
    }

    public String getServiceCIDR() {
        return serviceCIDR;
    }

    public void setServiceCIDR(String serviceCIDR) {
        this.serviceCIDR = serviceCIDR;
    }

    public Integer getMasterCount() {
        return masterCount;
    }

    public void setMasterCount(Integer masterCount) {
        this.masterCount = masterCount;
    }

    public List<UhostInfo> getMasterList() {
        return masterList;
    }

    public void setMasterList(List<UhostInfo> masterList) {
        this.masterList = masterList;
    }

    public List<UhostInfo> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<UhostInfo> nodeList) {
        this.nodeList = nodeList;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public String getApiServer() {
        return apiServer;
    }

    public void setApiServer(String apiServer) {
        this.apiServer = apiServer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExternalApiServer() {
        return externalApiServer;
    }

    public void setExternalApiServer(String externalApiServer) {
        this.externalApiServer = externalApiServer;
    }

    public KubeProxy getKubeProxy() {
        return kubeProxy;
    }

    public void setKubeProxy(KubeProxy kubeProxy) {
        this.kubeProxy = kubeProxy;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getClusterDomain() {
        return clusterDomain;
    }

    public void setClusterDomain(String clusterDomain) {
        this.clusterDomain = clusterDomain;
    }

    public String getEtcdCert() {
        return etcdCert;
    }

    public void setEtcdCert(String etcdCert) {
        this.etcdCert = etcdCert;
    }

    public String getEtcdKey() {
        return etcdKey;
    }

    public void setEtcdKey(String etcdKey) {
        this.etcdKey = etcdKey;
    }

    public String getCACert() {
        return caCert;
    }

    public void setCACert(String caCert) {
        this.caCert = caCert;
    }

    public String getMasterResourceStatus() {
        return masterResourceStatus;
    }

    public void setMasterResourceStatus(String masterResourceStatus) {
        this.masterResourceStatus = masterResourceStatus;
    }

    public String getCNIMode() {
        return cniMode;
    }

    public void setCNIMode(String cniMode) {
        this.cniMode = cniMode;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    public Autoscaler getAutoscaler() {
        return autoscaler;
    }

    public void setAutoscaler(Autoscaler autoscaler) {
        this.autoscaler = autoscaler;
    }

    public Boolean getEnableUserAuth() {
        return enableUserAuth;
    }

    public void setEnableUserAuth(Boolean enableUserAuth) {
        this.enableUserAuth = enableUserAuth;
    }

    public Boolean getDedicatedPodSubnet() {
        return dedicatedPodSubnet;
    }

    public void setDedicatedPodSubnet(Boolean dedicatedPodSubnet) {
        this.dedicatedPodSubnet = dedicatedPodSubnet;
    }

    public List<String> getPodSubnetIds() {
        return podSubnetIds;
    }

    public void setPodSubnetIds(List<String> podSubnetIds) {
        this.podSubnetIds = podSubnetIds;
    }

    public Integer getDeleteProtection() {
        return deleteProtection;
    }

    public void setDeleteProtection(Integer deleteProtection) {
        this.deleteProtection = deleteProtection;
    }

    public List<String> getPodSubnetSecGroups() {
        return podSubnetSecGroups;
    }

    public void setPodSubnetSecGroups(List<String> podSubnetSecGroups) {
        this.podSubnetSecGroups = podSubnetSecGroups;
    }

    public String getNodeCIDR() {
        return nodeCIDR;
    }

    public void setNodeCIDR(String nodeCIDR) {
        this.nodeCIDR = nodeCIDR;
    }

    public String getExternalUlb() {
        return externalUlb;
    }

    public void setExternalUlb(String externalUlb) {
        this.externalUlb = externalUlb;
    }

    public String getInternalUlb() {
        return internalUlb;
    }

    public void setInternalUlb(String internalUlb) {
        this.internalUlb = internalUlb;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getLbClass() {
        return lbClass;
    }

    public void setLbClass(String lbClass) {
        this.lbClass = lbClass;
    }

    public String getRuntimeName() {
        return runtimeName;
    }

    public void setRuntimeName(String runtimeName) {
        this.runtimeName = runtimeName;
    }

    public String getRuntimeVersion() {
        return runtimeVersion;
    }

    public void setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public LoopbackClientCert getLoopbackClientCert() {
        return loopbackClientCert;
    }

    public void setLoopbackClientCert(LoopbackClientCert loopbackClientCert) {
        this.loopbackClientCert = loopbackClientCert;
    }

    public static class Autoscaler extends Response {

        /** 缩容触发延时 */
        @SerializedName("ScaleDownUnneededTime")
        private String scaleDownUnneededTime;

        /** CPU缩容阈值 */
        @SerializedName("ScaleDownUtilizationThreshold")
        private String scaleDownUtilizationThreshold;

        /** 静默时间 */
        @SerializedName("ScaleDownDelayAfterAdd")
        private String scaleDownDelayAfterAdd;

        /** 打开/关闭 */
        @SerializedName("Enabled")
        private Integer enabled;

        /** 伸缩器版本 */
        @SerializedName("Version")
        private String version;

        /** */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** GPU缩容阈值 */
        @SerializedName("ScaleDownGpuUtilizationThreshold")
        private String scaleDownGpuUtilizationThreshold;

        public String getScaleDownUnneededTime() {
            return scaleDownUnneededTime;
        }

        public void setScaleDownUnneededTime(String scaleDownUnneededTime) {
            this.scaleDownUnneededTime = scaleDownUnneededTime;
        }

        public String getScaleDownUtilizationThreshold() {
            return scaleDownUtilizationThreshold;
        }

        public void setScaleDownUtilizationThreshold(String scaleDownUtilizationThreshold) {
            this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
        }

        public String getScaleDownDelayAfterAdd() {
            return scaleDownDelayAfterAdd;
        }

        public void setScaleDownDelayAfterAdd(String scaleDownDelayAfterAdd) {
            this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
        }

        public Integer getEnabled() {
            return enabled;
        }

        public void setEnabled(Integer enabled) {
            this.enabled = enabled;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public String getScaleDownGpuUtilizationThreshold() {
            return scaleDownGpuUtilizationThreshold;
        }

        public void setScaleDownGpuUtilizationThreshold(String scaleDownGpuUtilizationThreshold) {
            this.scaleDownGpuUtilizationThreshold = scaleDownGpuUtilizationThreshold;
        }
    }

    public static class DiskSet extends Response {

        /** 磁盘类型。系统盘: Boot，数据盘: Data,网络盘：Udisk */
        @SerializedName("Type")
        private String type;

        /** 磁盘长ID */
        @SerializedName("DiskId")
        private String diskId;

        /** UDisk名字（仅当磁盘是UDisk时返回） */
        @SerializedName("Name")
        private String name;

        /** 磁盘盘符 */
        @SerializedName("Drive")
        private String drive;

        /** 磁盘大小，单位: GB */
        @SerializedName("Size")
        private Integer size;

        /** 备份方案，枚举类型：BASIC_SNAPSHOT,普通快照；DATAARK,方舟。无快照则不返回该字段。 */
        @SerializedName("BackupType")
        private String backupType;

        /** 当前主机的IOPS值 */
        @SerializedName("IOPS")
        private Integer iops;

        /** Yes: 加密 No: 非加密 */
        @SerializedName("Encrypted")
        private String encrypted;

        /** LOCAL_NOMAL| CLOUD_NORMAL| LOCAL_SSD| CLOUD_SSD|EXCLUSIVE_LOCAL_DISK */
        @SerializedName("DiskType")
        private String diskType;

        /** True| False */
        @SerializedName("IsBoot")
        private String isBoot;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDiskId() {
            return diskId;
        }

        public void setDiskId(String diskId) {
            this.diskId = diskId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDrive() {
            return drive;
        }

        public void setDrive(String drive) {
            this.drive = drive;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getBackupType() {
            return backupType;
        }

        public void setBackupType(String backupType) {
            this.backupType = backupType;
        }

        public Integer getIOPS() {
            return iops;
        }

        public void setIOPS(Integer iops) {
            this.iops = iops;
        }

        public String getEncrypted() {
            return encrypted;
        }

        public void setEncrypted(String encrypted) {
            this.encrypted = encrypted;
        }

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }

        public String getIsBoot() {
            return isBoot;
        }

        public void setIsBoot(String isBoot) {
            this.isBoot = isBoot;
        }
    }

    public static class IPSet extends Response {

        /** 国际: Internation，BGP: Bgp，内网: Private */
        @SerializedName("Type")
        private String type;

        /** IP资源ID (内网IP无对应的资源ID) */
        @SerializedName("IPId")
        private String ipId;

        /** IP地址 */
        @SerializedName("IP")
        private String ip;

        /** IP对应的带宽, 单位: Mb (内网IP不显示带宽信息) */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** 是否默认的弹性网卡的信息。true: 是默认弹性网卡；其他值：不是。 */
        @SerializedName("Default")
        private String fDefault;

        /** IP 地址分配模式 */
        @SerializedName("IPMode")
        private String ipMode;

        /** IP 所属的 VPC Id */
        @SerializedName("VPCId")
        private String vpcId;

        /** IP 所在的 子网 Id */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 网卡的 MAC 地址 */
        @SerializedName("Mac")
        private String mac;

        /** 虚拟网卡 Id */
        @SerializedName("NetworkInterfaceId")
        private String networkInterfaceId;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getIPId() {
            return ipId;
        }

        public void setIPId(String ipId) {
            this.ipId = ipId;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getDefault() {
            return fDefault;
        }

        public void setDefault(String fDefault) {
            this.fDefault = fDefault;
        }

        public String getIPMode() {
            return ipMode;
        }

        public void setIPMode(String ipMode) {
            this.ipMode = ipMode;
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

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }

        public String getNetworkInterfaceId() {
            return networkInterfaceId;
        }

        public void setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
        }
    }

    public static class KubeProxy extends Response {

        /** KubeProxy模式，枚举值为[ipvs,iptables] */
        @SerializedName("Mode")
        private String mode;

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }
    }

    public static class LoopbackClientCert extends Response {

        /** 证书到期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 证书是否进入过期告警状态 */
        @SerializedName("Warn")
        private Boolean warn;

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public Boolean getWarn() {
            return warn;
        }

        public void setWarn(Boolean warn) {
            this.warn = warn;
        }
    }

    public static class SecGroupId extends Response {

        /** 安全组名称 */
        @SerializedName("Id")
        private String id;

        /** 安全组id */
        @SerializedName("Name")
        private String name;

        /** 安全组优先级 */
        @SerializedName("Priority")
        private String priority;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }
    }

    public static class UhostInfo extends Response {

        /** 所在机房 */
        @SerializedName("Zone")
        private String zone;

        /** 主机名称 */
        @SerializedName("Name")
        private String name;

        /** Cpu数量 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 内存 */
        @SerializedName("Memory")
        private Integer memory;

        /** 节点IP信息 */
        @SerializedName("IPSet")
        private List<IPSet> ipSet;

        /** 节点磁盘信息 */
        @SerializedName("DiskSet")
        private List<DiskSet> diskSet;

        /** 主机ID */
        @SerializedName("NodeId")
        private String nodeId;

        /** 镜像信息 */
        @SerializedName("OsName")
        private String osName;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 到期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 主机状态 */
        @SerializedName("State")
        private String state;

        /** 节点类型：uhost表示云主机;uphost表示物理云主机 */
        @SerializedName("NodeType")
        private String nodeType;

        /** GPU 数量 */
        @SerializedName("GPU")
        private Integer gpu;

        /** GPU 型号 */
        @SerializedName("GpuType")
        private String gpuType;

        /** 基础镜像名称 */
        @SerializedName("BasicImageName")
        private String basicImageName;

        /** 操作系统类型 */
        @SerializedName("OsType")
        private String osType;

        /** 节点总磁盘空间 */
        @SerializedName("TotalDiskSpace")
        private Integer totalDiskSpace;

        /** 主机机型类别 */
        @SerializedName("MachineType")
        private String machineType;

        /** 节点关联的安全组列表 */
        @SerializedName("SecGroupId")
        private List<SecGroupId> secGroupId;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public List<IPSet> getIPSet() {
            return ipSet;
        }

        public void setIPSet(List<IPSet> ipSet) {
            this.ipSet = ipSet;
        }

        public List<DiskSet> getDiskSet() {
            return diskSet;
        }

        public void setDiskSet(List<DiskSet> diskSet) {
            this.diskSet = diskSet;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getOsName() {
            return osName;
        }

        public void setOsName(String osName) {
            this.osName = osName;
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

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getNodeType() {
            return nodeType;
        }

        public void setNodeType(String nodeType) {
            this.nodeType = nodeType;
        }

        public Integer getGPU() {
            return gpu;
        }

        public void setGPU(Integer gpu) {
            this.gpu = gpu;
        }

        public String getGpuType() {
            return gpuType;
        }

        public void setGpuType(String gpuType) {
            this.gpuType = gpuType;
        }

        public String getBasicImageName() {
            return basicImageName;
        }

        public void setBasicImageName(String basicImageName) {
            this.basicImageName = basicImageName;
        }

        public String getOsType() {
            return osType;
        }

        public void setOsType(String osType) {
            this.osType = osType;
        }

        public Integer getTotalDiskSpace() {
            return totalDiskSpace;
        }

        public void setTotalDiskSpace(Integer totalDiskSpace) {
            this.totalDiskSpace = totalDiskSpace;
        }

        public String getMachineType() {
            return machineType;
        }

        public void setMachineType(String machineType) {
            this.machineType = machineType;
        }

        public List<SecGroupId> getSecGroupId() {
            return secGroupId;
        }

        public void setSecGroupId(List<SecGroupId> secGroupId) {
            this.secGroupId = secGroupId;
        }
    }
}
