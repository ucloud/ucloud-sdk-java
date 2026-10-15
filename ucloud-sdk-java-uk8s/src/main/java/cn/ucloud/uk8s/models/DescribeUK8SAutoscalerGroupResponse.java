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

public class DescribeUK8SAutoscalerGroupResponse extends Response {

    /** 伸缩器 */
    @SerializedName("Autoscaler")
    private Autoscaler autoscaler;

    /** 伸缩组列表 */
    @SerializedName("AutoScalingGroup")
    private List<AutoScalingGroup> autoScalingGroup;

    /** 0:无需更新 1:有更新 2:强制更新 */
    @SerializedName("Update")
    private Integer update;

    public Autoscaler getAutoscaler() {
        return autoscaler;
    }

    public void setAutoscaler(Autoscaler autoscaler) {
        this.autoscaler = autoscaler;
    }

    public List<AutoScalingGroup> getAutoScalingGroup() {
        return autoScalingGroup;
    }

    public void setAutoScalingGroup(List<AutoScalingGroup> autoScalingGroup) {
        this.autoScalingGroup = autoScalingGroup;
    }

    public Integer getUpdate() {
        return update;
    }

    public void setUpdate(Integer update) {
        this.update = update;
    }

    public static class AutoScalingGroup extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 伸缩组ID */
        @SerializedName("Id")
        private String id;

        /** 伸缩组名字 */
        @SerializedName("Name")
        private String name;

        /** 节点CPU */
        @SerializedName("CPU")
        private Integer cpu;

        /** 节点内存 */
        @SerializedName("Mem")
        private Integer mem;

        /** 节点数据盘类型。请参考[[api:uhost-api:disk_type|磁盘类型]]。默认为SSD云盘 */
        @SerializedName("DataDiskType")
        private String dataDiskType;

        /** 节点数据盘大小 */
        @SerializedName("DataDiskSize")
        private Integer dataDiskSize;

        /** 节点系统盘类型。请参考[[api:uhost-api:disk_type|磁盘类型]]。默认为SSD云盘 */
        @SerializedName("BootDiskType")
        private String bootDiskType;

        /** 节点系统盘大小 */
        @SerializedName("BootDiskSize")
        private Integer bootDiskSize;

        /** 云主机机型。 */
        @SerializedName("MachineType")
        private String machineType;

        /** GPU 数量。 */
        @SerializedName("GPU")
        private Integer gpu;

        /** GPU 类型。 */
        @SerializedName("GpuType")
        private String gpuType;

        /** 节点标签 key=value,多组用”,“隔开，最多5组 */
        @SerializedName("Labels")
        private String labels;

        /** Pods数量 默认110, 支持16-512 */
        @SerializedName("MaxPods")
        private Integer maxPods;

        /** 最低 CPU 平台的兼容字段，与 MinimalCpuPlatform 相同。 */
        @SerializedName("MinmalCpuPlatform")
        private String minmalCpuPlatform;

        /** 主机规格族 */
        @SerializedName("UHostFamily")
        private String uHostFamily;

        /** 最小node数量 */
        @SerializedName("Min")
        private Integer min;

        /** 最大node数量 */
        @SerializedName("Max")
        private Integer max;

        /** 当前该伸缩组管理的node数量 */
        @SerializedName("CurrentNodeNum")
        private Integer currentNodeNum;

        /** 创建时间，Unix 时间戳，单位秒。 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 更新时间，Unix 时间戳，单位秒。 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** 伸缩组的计费模式。 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 硬件隔离组id。可通过DescribeIsolationGroup获取。 */
        @SerializedName("IsolationGroup")
        private String isolationGroup;

        /** 优先级 */
        @SerializedName("Priority")
        private Integer priority;

        /** 节点CPU【兼容】 */
        @SerializedName("NodeCPU")
        private Integer nodeCPU;

        /** 节点内存【兼容】 */
        @SerializedName("NodeMem")
        private Integer nodeMem;

        /** 节点数据盘类型【兼容】 */
        @SerializedName("NodeDataDiskType")
        private String nodeDataDiskType;

        /** 节点数据盘大小【兼容】 */
        @SerializedName("NodeDataDiskSize")
        private Integer nodeDataDiskSize;

        /** 旧伸缩组的系统盘类型。 */
        @SerializedName("NodeBootDiskType")
        private String nodeBootDiskType;

        /** 节点云主机机型【兼容】 */
        @SerializedName("NodeUHostType")
        private String nodeUHostType;

        /** 节点所属节点池id */
        @SerializedName("NodeGroupId")
        private String nodeGroupId;

        /** 节点子网id 【兼容】 */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 节点登录方式：Password 或 KeyPair。 */
        @SerializedName("LoginMode")
        private String loginMode;

        /** 登录密钥对 ID。 */
        @SerializedName("KeyPairId")
        private String keyPairId;

        /** 最低 CPU 平台。 */
        @SerializedName("MinimalCpuPlatform")
        private String minimalCpuPlatform;

        /** 节点污点配置。 */
        @SerializedName("Taints")
        private String taints;

        /** 业务组。 */
        @SerializedName("Tag")
        private String tag;

        /** 镜像 ID。 */
        @SerializedName("ImageId")
        private String imageId;

        /** 操作系统名称。 */
        @SerializedName("OsName")
        private String osName;

        /** Base64 编码的 cloud-init 用户数据。 */
        @SerializedName("UserData")
        private String userData;

        /** Base64 编码的节点初始化后脚本。 */
        @SerializedName("InitScript")
        private String initScript;

        /** 节点安全模式：Firewall 或 SecGroup。 */
        @SerializedName("SecurityMode")
        private String securityMode;

        /** 安全组配置列表。 */
        @SerializedName("SecGroupId")
        private List<SecGroupId> secGroupId;

        /** 防火墙 ID。 */
        @SerializedName("SecurityGroupId")
        private String securityGroupId;

        /** 网卡配置列表。 */
        @SerializedName("NetworkInterface")
        private List<NetworkInterface> networkInterface;

        /** Kubelet 自定义配置。 */
        @SerializedName("KubeletConfiguration")
        private KubeletConfiguration kubeletConfiguration;

        /** Base64 编码的节点登录密码。 */
        @SerializedName("Password")
        private String password;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

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

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public Integer getMem() {
            return mem;
        }

        public void setMem(Integer mem) {
            this.mem = mem;
        }

        public String getDataDiskType() {
            return dataDiskType;
        }

        public void setDataDiskType(String dataDiskType) {
            this.dataDiskType = dataDiskType;
        }

        public Integer getDataDiskSize() {
            return dataDiskSize;
        }

        public void setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
        }

        public String getBootDiskType() {
            return bootDiskType;
        }

        public void setBootDiskType(String bootDiskType) {
            this.bootDiskType = bootDiskType;
        }

        public Integer getBootDiskSize() {
            return bootDiskSize;
        }

        public void setBootDiskSize(Integer bootDiskSize) {
            this.bootDiskSize = bootDiskSize;
        }

        public String getMachineType() {
            return machineType;
        }

        public void setMachineType(String machineType) {
            this.machineType = machineType;
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

        public String getLabels() {
            return labels;
        }

        public void setLabels(String labels) {
            this.labels = labels;
        }

        public Integer getMaxPods() {
            return maxPods;
        }

        public void setMaxPods(Integer maxPods) {
            this.maxPods = maxPods;
        }

        public String getMinmalCpuPlatform() {
            return minmalCpuPlatform;
        }

        public void setMinmalCpuPlatform(String minmalCpuPlatform) {
            this.minmalCpuPlatform = minmalCpuPlatform;
        }

        public String getUHostFamily() {
            return uHostFamily;
        }

        public void setUHostFamily(String uHostFamily) {
            this.uHostFamily = uHostFamily;
        }

        public Integer getMin() {
            return min;
        }

        public void setMin(Integer min) {
            this.min = min;
        }

        public Integer getMax() {
            return max;
        }

        public void setMax(Integer max) {
            this.max = max;
        }

        public Integer getCurrentNodeNum() {
            return currentNodeNum;
        }

        public void setCurrentNodeNum(Integer currentNodeNum) {
            this.currentNodeNum = currentNodeNum;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getIsolationGroup() {
            return isolationGroup;
        }

        public void setIsolationGroup(String isolationGroup) {
            this.isolationGroup = isolationGroup;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public Integer getNodeCPU() {
            return nodeCPU;
        }

        public void setNodeCPU(Integer nodeCPU) {
            this.nodeCPU = nodeCPU;
        }

        public Integer getNodeMem() {
            return nodeMem;
        }

        public void setNodeMem(Integer nodeMem) {
            this.nodeMem = nodeMem;
        }

        public String getNodeDataDiskType() {
            return nodeDataDiskType;
        }

        public void setNodeDataDiskType(String nodeDataDiskType) {
            this.nodeDataDiskType = nodeDataDiskType;
        }

        public Integer getNodeDataDiskSize() {
            return nodeDataDiskSize;
        }

        public void setNodeDataDiskSize(Integer nodeDataDiskSize) {
            this.nodeDataDiskSize = nodeDataDiskSize;
        }

        public String getNodeBootDiskType() {
            return nodeBootDiskType;
        }

        public void setNodeBootDiskType(String nodeBootDiskType) {
            this.nodeBootDiskType = nodeBootDiskType;
        }

        public String getNodeUHostType() {
            return nodeUHostType;
        }

        public void setNodeUHostType(String nodeUHostType) {
            this.nodeUHostType = nodeUHostType;
        }

        public String getNodeGroupId() {
            return nodeGroupId;
        }

        public void setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getLoginMode() {
            return loginMode;
        }

        public void setLoginMode(String loginMode) {
            this.loginMode = loginMode;
        }

        public String getKeyPairId() {
            return keyPairId;
        }

        public void setKeyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
        }

        public String getMinimalCpuPlatform() {
            return minimalCpuPlatform;
        }

        public void setMinimalCpuPlatform(String minimalCpuPlatform) {
            this.minimalCpuPlatform = minimalCpuPlatform;
        }

        public String getTaints() {
            return taints;
        }

        public void setTaints(String taints) {
            this.taints = taints;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getImageId() {
            return imageId;
        }

        public void setImageId(String imageId) {
            this.imageId = imageId;
        }

        public String getOsName() {
            return osName;
        }

        public void setOsName(String osName) {
            this.osName = osName;
        }

        public String getUserData() {
            return userData;
        }

        public void setUserData(String userData) {
            this.userData = userData;
        }

        public String getInitScript() {
            return initScript;
        }

        public void setInitScript(String initScript) {
            this.initScript = initScript;
        }

        public String getSecurityMode() {
            return securityMode;
        }

        public void setSecurityMode(String securityMode) {
            this.securityMode = securityMode;
        }

        public List<SecGroupId> getSecGroupId() {
            return secGroupId;
        }

        public void setSecGroupId(List<SecGroupId> secGroupId) {
            this.secGroupId = secGroupId;
        }

        public String getSecurityGroupId() {
            return securityGroupId;
        }

        public void setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
        }

        public List<NetworkInterface> getNetworkInterface() {
            return networkInterface;
        }

        public void setNetworkInterface(List<NetworkInterface> networkInterface) {
            this.networkInterface = networkInterface;
        }

        public KubeletConfiguration getKubeletConfiguration() {
            return kubeletConfiguration;
        }

        public void setKubeletConfiguration(KubeletConfiguration kubeletConfiguration) {
            this.kubeletConfiguration = kubeletConfiguration;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public static class Autoscaler extends Response {

        /** 节点持续不需要后触发缩容的等待时间，单位分钟。 */
        @SerializedName("ScaleDownUnneededTime")
        private Integer scaleDownUnneededTime;

        /** 节点缩容利用率阈值，单位百分比，范围 0–100。 */
        @SerializedName("ScaleDownUtilizationThreshold")
        private Integer scaleDownUtilizationThreshold;

        /** 添加节点后等待缩容的时间，单位分钟。 */
        @SerializedName("ScaleDownDelayAfterAdd")
        private Integer scaleDownDelayAfterAdd;

        /** 打开/关闭 */
        @SerializedName("Enabled")
        private Integer enabled;

        /** 伸缩器版本 */
        @SerializedName("Version")
        private String version;

        /** 配置更新时间，Unix 时间戳，单位秒。 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** GPU 缩容利用率阈值，单位百分比，范围 0–100。 */
        @SerializedName("ScaleDownGpuUtilizationThreshold")
        private Integer scaleDownGpuUtilizationThreshold;

        public Integer getScaleDownUnneededTime() {
            return scaleDownUnneededTime;
        }

        public void setScaleDownUnneededTime(Integer scaleDownUnneededTime) {
            this.scaleDownUnneededTime = scaleDownUnneededTime;
        }

        public Integer getScaleDownUtilizationThreshold() {
            return scaleDownUtilizationThreshold;
        }

        public void setScaleDownUtilizationThreshold(Integer scaleDownUtilizationThreshold) {
            this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
        }

        public Integer getScaleDownDelayAfterAdd() {
            return scaleDownDelayAfterAdd;
        }

        public void setScaleDownDelayAfterAdd(Integer scaleDownDelayAfterAdd) {
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

        public Integer getScaleDownGpuUtilizationThreshold() {
            return scaleDownGpuUtilizationThreshold;
        }

        public void setScaleDownGpuUtilizationThreshold(Integer scaleDownGpuUtilizationThreshold) {
            this.scaleDownGpuUtilizationThreshold = scaleDownGpuUtilizationThreshold;
        }
    }

    public static class EIP extends Response {

        /**
         * 【若绑定EIP，此参数必填】弹性IP的外网带宽, 单位为Mbps. 共享带宽模式下非必传, 非共享带宽模式必须指定非0Mbps带宽. 各地域非共享带宽的带宽范围如下：
         * 流量计费[1-300]，带宽计费[1-800]
         */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /**
         * 弹性IP的计费模式. 枚举值: "Traffic", 流量计费; "Bandwidth", 带宽计费; "ShareBandwidth",共享带宽模式.
         * "Free":免费带宽模式,默认为 "Bandwidth"
         */
        @SerializedName("PayMode")
        private String payMode;

        /** 绑定的共享带宽Id，仅当PayMode为ShareBandwidth时有效 */
        @SerializedName("ShareBandwidthId")
        private String shareBandwidthId;

        /**
         * 【若绑定EIP，此参数必填】弹性IP的线路。枚举值: 国际: International，BGP: Bgp。 各地域允许的线路参数如下: cn-sh1: Bgp cn-sh2:
         * Bgp cn-gd: Bgp cn-bj1: Bgp cn-bj2: Bgp hk: International us-ca: International th-bkk:
         * International kr-seoul:International us-ws:International ge-fra:International
         * sg:International tw-kh:International.其他海外线路均为 International
         */
        @SerializedName("OperatorName")
        private String operatorName;

        /** 当前EIP代金券id。请通过DescribeCoupon接口查询，或登录用户中心查看。 */
        @SerializedName("CouponId")
        private String couponId;

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getPayMode() {
            return payMode;
        }

        public void setPayMode(String payMode) {
            this.payMode = payMode;
        }

        public String getShareBandwidthId() {
            return shareBandwidthId;
        }

        public void setShareBandwidthId(String shareBandwidthId) {
            this.shareBandwidthId = shareBandwidthId;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getCouponId() {
            return couponId;
        }

        public void setCouponId(String couponId) {
            this.couponId = couponId;
        }
    }

    public static class EvictionCondition extends Response {

        /** 内存相关驱逐条件或宽限时间。 */
        @SerializedName("MemoryAvailable")
        private String memoryAvailable;

        /** 镜像文件系统存储相关驱逐条件或宽限时间。 */
        @SerializedName("ImagefsAvailable")
        private String imagefsAvailable;

        /** 节点存储余量相关驱逐条件或宽限时间。 */
        @SerializedName("NodefsAvailable")
        private String nodefsAvailable;

        /** 节点剩余inodes驱逐条件或宽限时间。 */
        @SerializedName("NodefsInodesFree")
        private String nodefsInodesFree;

        public String getMemoryAvailable() {
            return memoryAvailable;
        }

        public void setMemoryAvailable(String memoryAvailable) {
            this.memoryAvailable = memoryAvailable;
        }

        public String getImagefsAvailable() {
            return imagefsAvailable;
        }

        public void setImagefsAvailable(String imagefsAvailable) {
            this.imagefsAvailable = imagefsAvailable;
        }

        public String getNodefsAvailable() {
            return nodefsAvailable;
        }

        public void setNodefsAvailable(String nodefsAvailable) {
            this.nodefsAvailable = nodefsAvailable;
        }

        public String getNodefsInodesFree() {
            return nodefsInodesFree;
        }

        public void setNodefsInodesFree(String nodefsInodesFree) {
            this.nodefsInodesFree = nodefsInodesFree;
        }
    }

    public static class KubeletConfiguration extends Response {

        /** 最大日志文件数量 */
        @SerializedName("ContainerLogMaxFiles")
        private Integer containerLogMaxFiles;

        /** 最大日志文件大小 */
        @SerializedName("ContainerLogMaxSize")
        private String containerLogMaxSize;

        /** 硬性驱逐条件，EvictionCondition类型 */
        @SerializedName("EvictionHard")
        private EvictionCondition evictionHard;

        /** 软性驱逐条件，EvictionCondition类型 */
        @SerializedName("EvictionSoft")
        private EvictionCondition evictionSoft;

        /** 软性驱逐宽限时间，EvictionCondition类型 */
        @SerializedName("EvictionSoftGracePeriod")
        private EvictionCondition evictionSoftGracePeriod;

        /** 镜像垃圾收集阈值 */
        @SerializedName("ImageGCHighThresholdPercent")
        private Integer imageGCHighThresholdPercent;

        /** 停止镜像垃圾收集阈值 */
        @SerializedName("ImageGCLowThresholdPercent")
        private Integer imageGCLowThresholdPercent;

        /** kubelet预留资源，ReservedResource类型 */
        @SerializedName("KubeReserved")
        private ReservedResource kubeReserved;

        /** 系统预留资源，ReservedResource类型 */
        @SerializedName("SystemReserved")
        private ReservedResource systemReserved;

        /** 最大Pod数量 */
        @SerializedName("MaxPods")
        private Integer maxPods;

        public Integer getContainerLogMaxFiles() {
            return containerLogMaxFiles;
        }

        public void setContainerLogMaxFiles(Integer containerLogMaxFiles) {
            this.containerLogMaxFiles = containerLogMaxFiles;
        }

        public String getContainerLogMaxSize() {
            return containerLogMaxSize;
        }

        public void setContainerLogMaxSize(String containerLogMaxSize) {
            this.containerLogMaxSize = containerLogMaxSize;
        }

        public EvictionCondition getEvictionHard() {
            return evictionHard;
        }

        public void setEvictionHard(EvictionCondition evictionHard) {
            this.evictionHard = evictionHard;
        }

        public EvictionCondition getEvictionSoft() {
            return evictionSoft;
        }

        public void setEvictionSoft(EvictionCondition evictionSoft) {
            this.evictionSoft = evictionSoft;
        }

        public EvictionCondition getEvictionSoftGracePeriod() {
            return evictionSoftGracePeriod;
        }

        public void setEvictionSoftGracePeriod(EvictionCondition evictionSoftGracePeriod) {
            this.evictionSoftGracePeriod = evictionSoftGracePeriod;
        }

        public Integer getImageGCHighThresholdPercent() {
            return imageGCHighThresholdPercent;
        }

        public void setImageGCHighThresholdPercent(Integer imageGCHighThresholdPercent) {
            this.imageGCHighThresholdPercent = imageGCHighThresholdPercent;
        }

        public Integer getImageGCLowThresholdPercent() {
            return imageGCLowThresholdPercent;
        }

        public void setImageGCLowThresholdPercent(Integer imageGCLowThresholdPercent) {
            this.imageGCLowThresholdPercent = imageGCLowThresholdPercent;
        }

        public ReservedResource getKubeReserved() {
            return kubeReserved;
        }

        public void setKubeReserved(ReservedResource kubeReserved) {
            this.kubeReserved = kubeReserved;
        }

        public ReservedResource getSystemReserved() {
            return systemReserved;
        }

        public void setSystemReserved(ReservedResource systemReserved) {
            this.systemReserved = systemReserved;
        }

        public Integer getMaxPods() {
            return maxPods;
        }

        public void setMaxPods(Integer maxPods) {
            this.maxPods = maxPods;
        }
    }

    public static class NetworkInterface extends Response {

        /** EIP */
        @SerializedName("EIP")
        private EIP eip;

        public EIP getEIP() {
            return eip;
        }

        public void setEIP(EIP eip) {
            this.eip = eip;
        }
    }

    public static class ReservedResource extends Response {

        /** CPU */
        @SerializedName("CPU")
        private String cpu;

        /** 内存 */
        @SerializedName("Memory")
        private String memory;

        /** 存储 */
        @SerializedName("EphemeralStorage")
        private String ephemeralStorage;

        /** Pid */
        @SerializedName("Pid")
        private String pid;

        public String getCPU() {
            return cpu;
        }

        public void setCPU(String cpu) {
            this.cpu = cpu;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }

        public String getEphemeralStorage() {
            return ephemeralStorage;
        }

        public void setEphemeralStorage(String ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }
    }

    public static class SecGroupId extends Response {

        /** 安全组 ID */
        @SerializedName("Id")
        private String id;

        /** 安全组名称 */
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
}
