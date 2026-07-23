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

public class ListUK8SNodeGroupResponse extends Response {

    /** 节点池列表 */
    @SerializedName("NodeGroupList")
    private List<NodeGroupSet> nodeGroupList;

    public List<NodeGroupSet> getNodeGroupList() {
        return nodeGroupList;
    }

    public void setNodeGroupList(List<NodeGroupSet> nodeGroupList) {
        this.nodeGroupList = nodeGroupList;
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

    public static class NodeGroupSet extends Response {

        /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
        @SerializedName("Zone")
        private String zone;

        /** 节点池ID */
        @SerializedName("NodeGroupId")
        private String nodeGroupId;

        /** 节点池名字 */
        @SerializedName("NodeGroupName")
        private String nodeGroupName;

        /** 自定义Uhost主机名前缀。完整的自定义Uhost主机名为{NodeNamePrefix}-{NodeIP}。 */
        @SerializedName("NodeNamePrefix")
        private String nodeNamePrefix;

        /** 镜像ID */
        @SerializedName("ImageId")
        private String imageId;

        /** 机型 */
        @SerializedName("MachineType")
        private String machineType;

        /** cpu平台 */
        @SerializedName("MinimalCpuPlatform")
        private String minimalCpuPlatform;

        /** 主机规格族 */
        @SerializedName("UHostFamily")
        private String uHostFamily;

        /** 虚拟CPU核数 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 内存大小 */
        @SerializedName("Mem")
        private Integer mem;

        /** GPU类型 */
        @SerializedName("GpuType")
        private String gpuType;

        /** GPU卡核心数 */
        @SerializedName("GPU")
        private Integer gpu;

        /** 系统盘类型 */
        @SerializedName("BootDiskType")
        private String bootDiskType;

        /** 系统盘大小 */
        @SerializedName("BootDiskSize")
        private Integer bootDiskSize;

        /** 数据盘大小 */
        @SerializedName("DataDiskSize")
        private Integer dataDiskSize;

        /** 数据盘类型 */
        @SerializedName("DataDiskType")
        private String dataDiskType;

        /** 业务组 */
        @SerializedName("Tag")
        private String tag;

        /** 付费方式 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 节点id列表 */
        @SerializedName("NodeList")
        private List<String> nodeList;

        /** 子网 ID。默认为集群创建时填写的子网ID，也可以填写集群同VPC内的子网ID。 */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 硬件隔离组id。可通过DescribeIsolationGroup获取。 */
        @SerializedName("IsolationGroupId")
        private String isolationGroupId;

        /** int 默认110，生产环境建议小于等于110。 */
        @SerializedName("MaxPods")
        private Integer maxPods;

        /** 用户自定义数据。当镜像支持Cloud-init Feature时可填写此字段。注意：1、总数据量大小不超过 16K；2、使用base64编码。 */
        @SerializedName("UserData")
        private String userData;

        /** 用户自定义Shell脚本。与UserData的区别在于InitScript在节点初始化完毕后才执行，UserData则是云主机初始化时执行。 */
        @SerializedName("InitScript")
        private String initScript;

        /** Node节点污点，形式为key=value:effect，多组taints用”,“隔开,最多支持五组。 */
        @SerializedName("Taints")
        private String taints;

        /** Node节点标签。key=value形式,多组用”,“隔开，最多5组。 如env=pro,type=game */
        @SerializedName("Labels")
        private String labels;

        /** Node所属的安全组id（最多5个） */
        @SerializedName("SecGroupId")
        private List<SecGroupId> secGroupId;

        /** 主机安全模式。Firewall：防火墙；SecGroup：安全组；默认值：Firewall。 */
        @SerializedName("SecurityMode")
        private String securityMode;

        /**
         * 防火墙ID，默认：Web推荐防火墙。如何查询SecurityGroupId请参见
         * [DescribeFirewall](api/unet-api/describe_firewall.html)。
         */
        @SerializedName("SecurityGroupId")
        private String securityGroupId;

        /** Node节点网卡配置 */
        @SerializedName("NetworkInterface")
        private List<NetworkInterface> networkInterface;

        /** KubeletConfiguration */
        @SerializedName("KubeletConfiguration")
        private KubeletConfiguration kubeletConfiguration;

        /** 镜像名称 */
        @SerializedName("ImageName")
        private String imageName;

        /** 镜像类型 */
        @SerializedName("ImageType")
        private String imageType;

        /** 操作系统类型 */
        @SerializedName("OsType")
        private String osType;

        /** 操作系统名称 */
        @SerializedName("OsName")
        private String osName;

        /** 网络配置 */
        @SerializedName("NetCapability")
        private String netCapability;

        /** 是否启用 UNI 网络特性 */
        @SerializedName("UNIFeature")
        private Boolean uniFeature;

        /** 磁盘列表 */
        @SerializedName("Disks")
        private List<DiskSet> disks;

        /** 节点池关联的弹性伸缩组ID */
        @SerializedName("RelatedAsg")
        private List<String> relatedAsg;

        /** 节点池创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 节点池更新时间 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getNodeGroupId() {
            return nodeGroupId;
        }

        public void setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
        }

        public String getNodeGroupName() {
            return nodeGroupName;
        }

        public void setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
        }

        public String getNodeNamePrefix() {
            return nodeNamePrefix;
        }

        public void setNodeNamePrefix(String nodeNamePrefix) {
            this.nodeNamePrefix = nodeNamePrefix;
        }

        public String getImageId() {
            return imageId;
        }

        public void setImageId(String imageId) {
            this.imageId = imageId;
        }

        public String getMachineType() {
            return machineType;
        }

        public void setMachineType(String machineType) {
            this.machineType = machineType;
        }

        public String getMinimalCpuPlatform() {
            return minimalCpuPlatform;
        }

        public void setMinimalCpuPlatform(String minimalCpuPlatform) {
            this.minimalCpuPlatform = minimalCpuPlatform;
        }

        public String getUHostFamily() {
            return uHostFamily;
        }

        public void setUHostFamily(String uHostFamily) {
            this.uHostFamily = uHostFamily;
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

        public String getGpuType() {
            return gpuType;
        }

        public void setGpuType(String gpuType) {
            this.gpuType = gpuType;
        }

        public Integer getGPU() {
            return gpu;
        }

        public void setGPU(Integer gpu) {
            this.gpu = gpu;
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

        public Integer getDataDiskSize() {
            return dataDiskSize;
        }

        public void setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
        }

        public String getDataDiskType() {
            return dataDiskType;
        }

        public void setDataDiskType(String dataDiskType) {
            this.dataDiskType = dataDiskType;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public List<String> getNodeList() {
            return nodeList;
        }

        public void setNodeList(List<String> nodeList) {
            this.nodeList = nodeList;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getIsolationGroupId() {
            return isolationGroupId;
        }

        public void setIsolationGroupId(String isolationGroupId) {
            this.isolationGroupId = isolationGroupId;
        }

        public Integer getMaxPods() {
            return maxPods;
        }

        public void setMaxPods(Integer maxPods) {
            this.maxPods = maxPods;
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

        public String getTaints() {
            return taints;
        }

        public void setTaints(String taints) {
            this.taints = taints;
        }

        public String getLabels() {
            return labels;
        }

        public void setLabels(String labels) {
            this.labels = labels;
        }

        public List<SecGroupId> getSecGroupId() {
            return secGroupId;
        }

        public void setSecGroupId(List<SecGroupId> secGroupId) {
            this.secGroupId = secGroupId;
        }

        public String getSecurityMode() {
            return securityMode;
        }

        public void setSecurityMode(String securityMode) {
            this.securityMode = securityMode;
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

        public String getImageName() {
            return imageName;
        }

        public void setImageName(String imageName) {
            this.imageName = imageName;
        }

        public String getImageType() {
            return imageType;
        }

        public void setImageType(String imageType) {
            this.imageType = imageType;
        }

        public String getOsType() {
            return osType;
        }

        public void setOsType(String osType) {
            this.osType = osType;
        }

        public String getOsName() {
            return osName;
        }

        public void setOsName(String osName) {
            this.osName = osName;
        }

        public String getNetCapability() {
            return netCapability;
        }

        public void setNetCapability(String netCapability) {
            this.netCapability = netCapability;
        }

        public Boolean getUNIFeature() {
            return uniFeature;
        }

        public void setUNIFeature(Boolean uniFeature) {
            this.uniFeature = uniFeature;
        }

        public List<DiskSet> getDisks() {
            return disks;
        }

        public void setDisks(List<DiskSet> disks) {
            this.disks = disks;
        }

        public List<String> getRelatedAsg() {
            return relatedAsg;
        }

        public void setRelatedAsg(List<String> relatedAsg) {
            this.relatedAsg = relatedAsg;
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
}
