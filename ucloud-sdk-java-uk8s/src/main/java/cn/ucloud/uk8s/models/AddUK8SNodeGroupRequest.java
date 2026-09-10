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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class AddUK8SNodeGroupRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 节点池名字 */
    @NotEmpty
    @UCloudParam("NodeGroupName")
    private String nodeGroupName;

    /** 集群ID */
    @NotEmpty
    @UCloudParam("ClusterId")
    private String clusterId;

    /** 镜像ID */
    @NotEmpty
    @UCloudParam("ImageId")
    private String imageId;

    /** 云主机机型。枚举值["N", "C", "G", "O", "OS"]。参考[[api:uhost-api:uhost_type|云主机机型说明]]。 */
    @NotEmpty
    @UCloudParam("MachineType")
    private String machineType;

    /** CPU个数 */
    @NotEmpty
    @UCloudParam("CPU")
    private Integer cpu;

    /** 内存大小。单位：MB */
    @NotEmpty
    @UCloudParam("Mem")
    private Integer mem;

    /** 磁盘类型 */
    @NotEmpty
    @UCloudParam("BootDiskType")
    private String bootDiskType;

    /** 系统盘大小，单位GB。默认40。范围：[40, 500]。注意SSD本地盘无法调整。 */
    @NotEmpty
    @UCloudParam("BootDiskSize")
    private Integer bootDiskSize;

    /** 子网 ID。默认为集群创建时填写的子网ID，也可以填写集群同VPC内的子网ID。 */
    @NotEmpty
    @UCloudParam("SubnetId")
    private String subnetId;

    /**
     * 最低cpu平台，枚举值["Intel/Auto", "Intel/IvyBridge", "Intel/Haswell", "Intel/Broadwell",
     * "Intel/Skylake", "Intel/Cascadelake"；"Intel/CascadelakeR";
     * “Amd/Epyc2”,"Amd/Auto"],默认值是"Intel/Auto"
     */
    @UCloudParam("MinimalCpuPlatform")
    private String minimalCpuPlatform;

    /** GPU类型 */
    @UCloudParam("GpuType")
    private String gpuType;

    /** GPU卡核心数。仅GPU机型支持此字段（可选范围与MachineType+GpuType相关） */
    @UCloudParam("GPU")
    private Integer gpu;

    /** 数据磁盘大小 */
    @UCloudParam("DataDiskSize")
    private Integer dataDiskSize;

    /** 磁盘类型 */
    @UCloudParam("DataDiskType")
    private String dataDiskType;

    /** 业务组 */
    @UCloudParam("Tag")
    private String tag;

    /** 计费模式 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 主机规格族 */
    @UCloudParam("UHostFamily")
    private String uHostFamily;

    /** 主机安全模式。Firewall：防火墙；SecGroup：安全组；默认值：Firewall。 */
    @UCloudParam("SecurityMode")
    private String securityMode;

    /** 自定义Uhost主机名前缀。完整的自定义Uhost主机名为{NodeNamePrefix}-{NodeIP}。 */
    @UCloudParam("NodeNamePrefix")
    private String nodeNamePrefix;

    /** 重复 待删除 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("ZoneBaned")
    private String zoneBaned;

    /** 硬件隔离组id。可通过DescribeIsolationGroup获取。 */
    @UCloudParam("IsolationGroupId")
    private String isolationGroupId;

    /** 默认110，生产环境建议小于等于110。 */
    @UCloudParam("MaxPods")
    private String maxPods;

    /** 用户自定义数据。当镜像支持Cloud-init Feature时可填写此字段。注意：1、总数据量大小不超过 16K；2、使用base64编码。 */
    @UCloudParam("UserData")
    private String userData;

    /** 用户自定义Shell脚本。与UserData的区别在于InitScript在节点初始化完毕后才执行，UserData则是云主机初始化时执行。 */
    @UCloudParam("InitScript")
    private String initScript;

    /** Node节点污点，形式为key=value:effect，多组taints用”,“隔开,最多支持五组。 */
    @UCloudParam("Taints")
    private String taints;

    /** Node节点标签。key=value形式,多组用”,“隔开，最多5组。 如env=pro,type=game */
    @UCloudParam("Labels")
    private String labels;

    /**
     * 网络增强特性。枚举值：Normal，不开启; Super，开启网络增强1.0； Ultra，开启网络增强2.0；Extreme，开启网络增强3.0; Infiniband,
     * 开启网络增强4.0（详情参考主机官网文档）
     */
    @UCloudParam("NetCapability")
    private String netCapability;

    /** 弹性网卡特性。开启了弹性网卡权限位，此特性才生效，默认 false 未开启，true 开启。 */
    @UCloudParam("UNIFeature")
    private Boolean uniFeature;

    /** */
    @UCloudParam("SecGroupId")
    private List<SecGroupId> secGroupId;

    /**
     * 防火墙ID，默认：Web推荐防火墙。如何查询SecurityGroupId请参见
     * [DescribeFirewall](api/unet-api/describe_firewall.html)。
     */
    @UCloudParam("SecurityGroupId")
    private String securityGroupId;

    /** */
    @UCloudParam("NetworkInterface")
    private List<NetworkInterface> networkInterface;

    /** */
    @UCloudParam("KubeletConfiguration")
    private KubeletConfiguration kubeletConfiguration;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getNodeGroupName() {
        return nodeGroupName;
    }

    public void setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
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

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getMinimalCpuPlatform() {
        return minimalCpuPlatform;
    }

    public void setMinimalCpuPlatform(String minimalCpuPlatform) {
        this.minimalCpuPlatform = minimalCpuPlatform;
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

    public String getUHostFamily() {
        return uHostFamily;
    }

    public void setUHostFamily(String uHostFamily) {
        this.uHostFamily = uHostFamily;
    }

    public String getSecurityMode() {
        return securityMode;
    }

    public void setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
    }

    public String getNodeNamePrefix() {
        return nodeNamePrefix;
    }

    public void setNodeNamePrefix(String nodeNamePrefix) {
        this.nodeNamePrefix = nodeNamePrefix;
    }

    public String getZoneBaned() {
        return zoneBaned;
    }

    public void setZoneBaned(String zoneBaned) {
        this.zoneBaned = zoneBaned;
    }

    public String getIsolationGroupId() {
        return isolationGroupId;
    }

    public void setIsolationGroupId(String isolationGroupId) {
        this.isolationGroupId = isolationGroupId;
    }

    public String getMaxPods() {
        return maxPods;
    }

    public void setMaxPods(String maxPods) {
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

    public static class KubeletConfiguration extends Request {

        /** 容器的日志文件个数上限，需大于等于2。控制台展示为containerLogMaxFiles */
        @UCloudParam("ContainerLogMaxFiles")
        private Integer containerLogMaxFiles;

        /** 容器日志文件轮换生成新文件的最大阈值，需以Mi结尾。控制台展示为containerLogMaxSize */
        @UCloudParam("ContainerLogMaxSize")
        private String containerLogMaxSize;

        /**
         * 配置镜像的磁盘用量百分比阈值，一旦镜像用量超过此阈值，镜像垃圾收集会一直运行。
         *
         * <p>取值范围[1, 100], 同时需大于ImageGCLowThresholdPercent取值。控制台展示为imageGCHighThresholdPercent
         */
        @UCloudParam("ImageGCHighThresholdPercent")
        private Integer imageGCHighThresholdPercent;

        /**
         * 配置镜像的磁盘用量百分比阈值，镜像用量低于此阈值时不会执行镜像垃圾收集操作。 取值范围[1, 100],
         * 同时需小于imageGCHighThresholdPercent取值。控制台展示为imageGCLowThresholdPercent
         */
        @UCloudParam("ImageGCLowThresholdPercent")
        private Integer imageGCLowThresholdPercent;

        /** Node能运行的Pod最大数量。需大于0。控制台展示为maxPods */
        @UCloudParam("MaxPods")
        private Integer maxPods;

        /** */
        @UCloudParam("EvictionHard")
        private KubeletConfigurationEvictionHard evictionHard;

        /** */
        @UCloudParam("EvictionSoft")
        private KubeletConfigurationEvictionSoft evictionSoft;

        /** */
        @UCloudParam("EvictionSoftGracePeriod")
        private KubeletConfigurationEvictionSoftGracePeriod evictionSoftGracePeriod;

        /** */
        @UCloudParam("KubeReserved")
        private KubeletConfigurationKubeReserved kubeReserved;

        /** */
        @UCloudParam("SystemReserved")
        private KubeletConfigurationSystemReserved systemReserved;

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

        public Integer getMaxPods() {
            return maxPods;
        }

        public void setMaxPods(Integer maxPods) {
            this.maxPods = maxPods;
        }

        public KubeletConfigurationEvictionHard getEvictionHard() {
            return evictionHard;
        }

        public void setEvictionHard(KubeletConfigurationEvictionHard evictionHard) {
            this.evictionHard = evictionHard;
        }

        public KubeletConfigurationEvictionSoft getEvictionSoft() {
            return evictionSoft;
        }

        public void setEvictionSoft(KubeletConfigurationEvictionSoft evictionSoft) {
            this.evictionSoft = evictionSoft;
        }

        public KubeletConfigurationEvictionSoftGracePeriod getEvictionSoftGracePeriod() {
            return evictionSoftGracePeriod;
        }

        public void setEvictionSoftGracePeriod(
                KubeletConfigurationEvictionSoftGracePeriod evictionSoftGracePeriod) {
            this.evictionSoftGracePeriod = evictionSoftGracePeriod;
        }

        public KubeletConfigurationKubeReserved getKubeReserved() {
            return kubeReserved;
        }

        public void setKubeReserved(KubeletConfigurationKubeReserved kubeReserved) {
            this.kubeReserved = kubeReserved;
        }

        public KubeletConfigurationSystemReserved getSystemReserved() {
            return systemReserved;
        }

        public void setSystemReserved(KubeletConfigurationSystemReserved systemReserved) {
            this.systemReserved = systemReserved;
        }
    }

    public static class KubeletConfigurationEvictionHard extends Request {

        /** 触发Pod驱逐操作的硬性门限之内存用量: 需以Mi或Gi结尾。控制台展示为evictionHard - memory.available */
        @UCloudParam("MemoryAvailable")
        private String memoryAvailable;

        /** 触发Pod驱逐操作的硬性门限之容器镜像剩余空间: 需以%结尾。控制台展示为evictionHard - imagefs.available */
        @UCloudParam("ImagefsAvailable")
        private String imagefsAvailable;

        /** 触发Pod驱逐操作的硬性门限之节点存储剩余空间: 需以%结尾。控制台展示为evictionHard - nodefs.available */
        @UCloudParam("NodefsAvailable")
        private String nodefsAvailable;

        /** 触发Pod驱逐操作的硬性门限节点inode剩余量: 需以%结尾。控制台展示为evictionHard - nodefs.inodesFree */
        @UCloudParam("NodefsInodesFree")
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

    public static class KubeletConfigurationEvictionSoft extends Request {

        /**
         * 触发Pod驱逐操作的软性门限之内存用量:
         * 需以Mi或Gi结尾。配置此值时必须同时配置EvictionSoftGracePeriod.MemoryAvailable。控制台展示为evictionSoft -
         * memory.available
         */
        @UCloudParam("MemoryAvailable")
        private String memoryAvailable;

        /**
         * 触发Pod驱逐操作的软性门限之容器镜像剩余空间:
         * 需以%结尾。配置此值时必须同时配置EvictionSoftGracePeriod.ImagefsAvailable。控制台展示为evictionSoft -
         * imagefs.available
         */
        @UCloudParam("ImagefsAvailable")
        private String imagefsAvailable;

        /**
         * 触发Pod驱逐操作的软性门限之节点存储剩余空间:
         * 需以%结尾。配置此值时必须同时配置EvictionSoftGracePeriod.NodefsAvailable。控制台展示为evictionSoft -
         * nodefs.available
         */
        @UCloudParam("NodefsAvailable")
        private String nodefsAvailable;

        /**
         * 触发Pod驱逐操作的软性门限节点inode剩余量:
         * 需以%结尾。配置此值时必须同时配置EvictionSoftGracePeriod.NodefsInodesFree。控制台展示为evictionSoft -
         * nodefs.inodesFree
         */
        @UCloudParam("NodefsInodesFree")
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

    public static class KubeletConfigurationEvictionSoftGracePeriod extends Request {

        /** MemoryAvailable软性门限的宽限时间，必须以s结尾。控制台展示为evictionSoftGracePeriod - memory.available */
        @UCloudParam("MemoryAvailable")
        private String memoryAvailable;

        /** ImagefsAvailable软性门限的宽限时间，必须以s结尾。控制台展示为evictionSoftGracePeriod - imagefs.available */
        @UCloudParam("ImagefsAvailable")
        private String imagefsAvailable;

        /** NodefsAvailable软性门限的宽限时间，必须以s结尾。控制台展示为evictionSoftGracePeriod - nodefs.available */
        @UCloudParam("NodefsAvailable")
        private String nodefsAvailable;

        /** NodefsInodesFree软性门限的宽限时间，必须以s结尾。控制台展示为evictionSoftGracePeriod - nodefs.inodesFree */
        @UCloudParam("NodefsInodesFree")
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

    public static class KubeletConfigurationKubeReserved extends Request {

        /** kubelet预留CPU资源，以m结尾。控制台展示为kubeReserved - cpu */
        @UCloudParam("CPU")
        private String cpu;

        /** kubelet预留内存资源，以Mi结尾。控制台展示为kubeReserved - memory */
        @UCloudParam("Memory")
        private String memory;

        /** kubelet预留存储空间，以Gi结尾。控制台展示为kubeReserved - ephemeral-storage */
        @UCloudParam("EphemeralStorage")
        private String ephemeralStorage;

        /** kubelet预留pid数量，必须大于等于500, string方式提供。控制台展示为kubeReserved - pid */
        @UCloudParam("Pid")
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

    public static class KubeletConfigurationSystemReserved extends Request {

        /** 系统预留CPU资源，以m结尾。控制台展示为systemReserved - cpu */
        @UCloudParam("CPU")
        private String cpu;

        /** 系统预留内存资源，以Mi结尾。控制台展示为systemReserved - memory */
        @UCloudParam("Memory")
        private String memory;

        /** 系统预留存储空间，以Gi结尾。控制台展示为systemReserved - ephemeral-storage */
        @UCloudParam("EphemeralStorage")
        private String ephemeralStorage;

        /** 系统预留pid数量，必须大于等于500, string方式提供。控制台展示为systemReserved - pid */
        @UCloudParam("Pid")
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

    public static class NetworkInterface extends Request {

        /** */
        @UCloudParam("EIP")
        private NetworkInterfaceEIP eip;

        public NetworkInterfaceEIP getEIP() {
            return eip;
        }

        public void setEIP(NetworkInterfaceEIP eip) {
            this.eip = eip;
        }
    }

    public static class NetworkInterfaceEIP extends Request {

        /**
         * 【若绑定EIP，此参数必填】弹性IP的外网带宽, 单位为Mbps. 共享带宽模式下非必传, 非共享带宽模式必须指定非0Mbps带宽. 各地域非共享带宽的带宽范围如下：
         * 流量计费[1-300]，带宽计费[1-800]
         */
        @UCloudParam("Bandwidth")
        private Integer bandwidth;

        /**
         * 弹性IP的计费模式. 枚举值: "Traffic", 流量计费; "Bandwidth", 带宽计费; "ShareBandwidth",共享带宽模式.
         * "Free":免费带宽模式,默认为 "Bandwidth"
         */
        @UCloudParam("PayMode")
        private String payMode;

        /** 绑定的共享带宽Id，仅当PayMode为ShareBandwidth时有效 */
        @UCloudParam("ShareBandwidthId")
        private String shareBandwidthId;

        /**
         * 【若绑定EIP，此参数必填】弹性IP的线路。枚举值: 国际: International,BGP: Bgp. 各地域允许的线路参数如下: cn-sh1: Bgp cn-sh2:
         * Bgp cn-gd: Bgp cn-bj1: Bgp cn-bj2: Bgp hk: International us-ca: International th-bkk:
         * International kr-seoul:International us-ws:International ge-fra:International
         * sg:International tw-kh:International.其他海外线路均为 International
         */
        @UCloudParam("OperatorName")
        private String operatorName;

        /** 当前EIP代金券id。请通过DescribeCoupon接口查询，或登录用户中心查看。 */
        @UCloudParam("CouponId")
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

    public static class SecGroupId extends Request {

        /** 安全组 ID。至多可以同时绑定5个安全组。 */
        @UCloudParam("Id")
        private String id;

        /** 安全组优先级。取值范围[1, 5] */
        @UCloudParam("Priority")
        private String priority;

        /** 安全组名称。 */
        @UCloudParam("Name")
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
