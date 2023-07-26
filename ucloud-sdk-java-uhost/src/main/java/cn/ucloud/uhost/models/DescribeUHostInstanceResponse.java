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
package cn.ucloud.uhost.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUHostInstanceResponse extends Response {

    /** UHostInstance总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 云主机实例列表，每项参数可见下面 UHostInstanceSet */
    @SerializedName("UHostSet")
    private List<UHostInstanceSet> uHostSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UHostInstanceSet> getUHostSet() {
        return uHostSet;
    }

    public void setUHostSet(List<UHostInstanceSet> uHostSet) {
        this.uHostSet = uHostSet;
    }

    public static class SpotAttribute extends Response {

        /** 回收时间 */
        @SerializedName("RecycleTime")
        private Integer recycleTime;

        public Integer getRecycleTime() {
            return recycleTime;
        }

        public void setRecycleTime(Integer recycleTime) {
            this.recycleTime = recycleTime;
        }
    }

    public static class UDSetUDHostAttribute extends Response {

        /** 私有专区宿主机 */
        @SerializedName("UDHostId")
        private String udHostId;

        /** 私有专区 */
        @SerializedName("UDSetId")
        private String udSetId;

        /** 是否绑定私有专区宿主机 */
        @SerializedName("HostBinding")
        private Boolean hostBinding;

        public String getUDHostId() {
            return udHostId;
        }

        public void setUDHostId(String udHostId) {
            this.udHostId = udHostId;
        }

        public String getUDSetId() {
            return udSetId;
        }

        public void setUDSetId(String udSetId) {
            this.udSetId = udSetId;
        }

        public Boolean getHostBinding() {
            return hostBinding;
        }

        public void setHostBinding(Boolean hostBinding) {
            this.hostBinding = hostBinding;
        }
    }

    public static class UHostDiskSet extends Response {

        /** 磁盘类型。请参考[[api:uhost-api:disk_type|磁盘类型]]。 */
        @SerializedName("DiskType")
        private String diskType;

        /** 是否是系统盘。枚举值：\\ > True，是系统盘 \\ > False，是数据盘（默认）。Disks数组中有且只能有一块盘是系统盘。 */
        @SerializedName("IsBoot")
        private String isBoot;

        /** "true": 加密盘 "false"：非加密盘 */
        @SerializedName("Encrypted")
        private String encrypted;

        /** 【建议不再使用】磁盘类型。系统盘: Boot，数据盘: Data,网络盘：Udisk */
        @SerializedName("Type")
        private String type;

        /** 磁盘ID */
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

        /** 备份方案。若开通了数据方舟，则为DATAARK */
        @SerializedName("BackupType")
        private String backupType;

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

        public String getEncrypted() {
            return encrypted;
        }

        public void setEncrypted(String encrypted) {
            this.encrypted = encrypted;
        }

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
    }

    public static class UHostIPSet extends Response {

        /** IPv4/IPv6； */
        @SerializedName("IPMode")
        private String ipMode;

        /** 内网 Private 类型下，表示是否为默认网卡。true: 是默认网卡；其他值：不是。 */
        @SerializedName("Default")
        private String fDefault;

        /** 内网 Private 类型下，当前网卡的Mac。 */
        @SerializedName("Mac")
        private String mac;

        /** 当前EIP的权重。权重最大的为当前的出口IP。 */
        @SerializedName("Weight")
        private Integer weight;

        /** 国际: Internation，BGP: Bgp，内网: Private */
        @SerializedName("Type")
        private String type;

        /** 外网IP资源ID 。(内网IP无对应的资源ID) */
        @SerializedName("IPId")
        private String ipId;

        /** IP地址 */
        @SerializedName("IP")
        private String ip;

        /** IP对应的带宽, 单位: Mb (内网IP不显示带宽信息) */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** IP地址对应的VPC ID。（北京一不支持，字段返回为空） */
        @SerializedName("VPCId")
        private String vpcId;

        /** IP地址对应的子网 ID。（北京一不支持，字段返回为空） */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 弹性网卡为默认网卡时，返回对应的 ID 值 */
        @SerializedName("NetworkInterfaceId")
        private String networkInterfaceId;

        public String getIPMode() {
            return ipMode;
        }

        public void setIPMode(String ipMode) {
            this.ipMode = ipMode;
        }

        public String getDefault() {
            return fDefault;
        }

        public void setDefault(String fDefault) {
            this.fDefault = fDefault;
        }

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

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

        public String getNetworkInterfaceId() {
            return networkInterfaceId;
        }

        public void setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
        }
    }

    public static class UHostInstanceSet extends Response {

        /** 可用区。参见 [可用区列表](../summary/regionlist.html) */
        @SerializedName("Zone")
        private String zone;

        /** UHost实例ID */
        @SerializedName("UHostId")
        private String uHostId;

        /** 【建议不再使用】云主机机型（旧）。参考[[api:uhost-api:uhost_type|云主机机型说明]]。 */
        @SerializedName("UHostType")
        private String uHostType;

        /** 云主机机型（新）。参考[[api:uhost-api:uhost_type#主机概念20版本|云主机机型说明]]。 */
        @SerializedName("MachineType")
        private String machineType;

        /** 云主机CPU平台。参考[[api:uhost-api:uhost_type#主机概念20版本|云主机机型说明]]。 */
        @SerializedName("CpuPlatform")
        private String cpuPlatform;

        /** 【建议不再使用】主机磁盘类型。 枚举值为：\\ > LocalDisk，本地磁盘; \\ > UDisk 云盘。\\只要有一块磁盘为本地盘，即返回LocalDisk。 */
        @SerializedName("StorageType")
        private String storageType;

        /** 【建议不再使用】主机的系统盘ID。 */
        @SerializedName("ImageId")
        private String imageId;

        /** 基础镜像ID（指当前自定义镜像的来源镜像） */
        @SerializedName("BasicImageId")
        private String basicImageId;

        /** 基础镜像名称（指当前自定义镜像的来源镜像） */
        @SerializedName("BasicImageName")
        private String basicImageName;

        /** 业务组名称 */
        @SerializedName("Tag")
        private String tag;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** UHost实例名称 */
        @SerializedName("Name")
        private String name;

        /**
         * 实例状态，枚举值：\\ >初始化: Initializing; \\ >启动中: Starting; \\> 运行中: Running; \\> 关机中: Stopping;
         * \\ >关机: Stopped \\ >安装失败: Install Fail; \\ >重启中: Rebooting; \\ > 未知(空字符串，获取状态超时或出错)：""
         */
        @SerializedName("State")
        private String state;

        /** 创建时间，格式为Unix时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 计费模式，枚举值为： Year，按年付费； Month，按月付费； Dynamic，按需付费（需开启权限）；Preemptive 为抢占式实例； */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 到期时间，格式为Unix时间戳 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 虚拟CPU核数，单位: 个 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 内存大小，单位: MB */
        @SerializedName("Memory")
        private Integer memory;

        /** 是否自动续费，自动续费：“Yes”，不自动续费：“No” */
        @SerializedName("AutoRenew")
        private String autoRenew;

        /** 磁盘信息见 UHostDiskSet */
        @SerializedName("DiskSet")
        private List<UHostDiskSet> diskSet;

        /** 详细信息见 UHostIPSet */
        @SerializedName("IPSet")
        private List<UHostIPSet> ipSet;

        /** 网络增强。Normal: 无；Super： 网络增强1.0； Ultra: 网络增强2.0 */
        @SerializedName("NetCapability")
        private String netCapability;

        /** 【建议不再使用】网络状态。 连接：Connected， 断开：NotConnected */
        @SerializedName("NetworkState")
        private String networkState;

        /** 【建议不再使用】数据方舟模式。枚举值：\\ > Yes: 开启方舟； \\ > no，未开启方舟 */
        @SerializedName("TimemachineFeature")
        private String timemachineFeature;

        /** 【建议不再使用】仅北京A的云主机会返回此字段。基础网络模式：Default；子网模式：Private */
        @SerializedName("SubnetType")
        private String subnetType;

        /** 创建主机的最初来源镜像的操作系统名称（若直接通过基础镜像创建，此处返回和BasicImageName一致） */
        @SerializedName("OsName")
        private String osName;

        /** 操作系统类别。返回"Linux"或者"Windows" */
        @SerializedName("OsType")
        private String osType;

        /** 【建议不再使用】主机系列：N2，表示系列2；N1，表示系列1 */
        @SerializedName("HostType")
        private String hostType;

        /** 主机的生命周期类型。目前仅支持Normal：普通； */
        @SerializedName("LifeCycle")
        private String lifeCycle;

        /** GPU个数 */
        @SerializedName("GPU")
        private Integer gpu;

        /**
         * GPU类型;枚举值["K80", "P40", "V100", "T4", "T4S","2080Ti","2080Ti-4C","1080Ti", "T4/4",
         * "MI100", "V100S"]
         */
        @SerializedName("GpuType")
        private String gpuType;

        /** 热升级支持的最大CPU个数 */
        @SerializedName("HotPlugMaxCpu")
        private Integer hotPlugMaxCpu;

        /** 系统盘状态 Normal表示初始化完成；Initializing表示在初始化。仍在初始化的系统盘无法制作镜像。 */
        @SerializedName("BootDiskState")
        private String bootDiskState;

        /** 总的数据盘存储空间。 */
        @SerializedName("TotalDiskSpace")
        private Integer totalDiskSpace;

        /** 隔离组id，不在隔离组则返回"" */
        @SerializedName("IsolationGroup")
        private String isolationGroup;

        /** RDMA集群id，仅快杰云主机返回该值；其他类型云主机返回""。当云主机的此值与RSSD云盘的RdmaClusterId相同时，RSSD可以挂载到这台云主机。 */
        @SerializedName("RdmaClusterId")
        private String rdmaClusterId;

        /** 仅抢占式实例返回，LowSpeed为低速模式，PowerOff为关机模式 */
        @SerializedName("RestrictMode")
        private String restrictMode;

        /** true: 开启热升级； false，未开启热升级 */
        @SerializedName("HotplugFeature")
        private Boolean hotplugFeature;

        /** true: 支持cloutinit方式初始化；false: 不支持 */
        @SerializedName("CloudInitFeature")
        private Boolean cloudInitFeature;

        /** true: 有ipv6特性；false，没有ipv6特性 */
        @SerializedName("IPv6Feature")
        private Boolean iPv6Feature;

        /** true: 开启 hpc 系列功能；false: 未开启 */
        @SerializedName("HpcFeature")
        private Boolean hpcFeature;

        /** true: 高性能计算主机；false: 不是 */
        @SerializedName("EpcInstance")
        private Boolean epcInstance;

        /** true: 绑定了安全组的主机；false: 不是 */
        @SerializedName("SecGroupInstance")
        private Boolean secGroupInstance;

        /** true: 开启 hidden kvm 功能；false: 不是 */
        @SerializedName("HiddenKvm")
        private Boolean hiddenKvm;

        /** 密钥信息见 UHostKeyPair */
        @SerializedName("KeyPair")
        private UHostKeyPair keyPair;

        /** 私有专区宿主机属性 */
        @SerializedName("UDHostAttribute")
        private UDSetUDHostAttribute udHostAttribute;

        /** 竞价实例信息 */
        @SerializedName("SpotAttribute")
        private SpotAttribute spotAttribute;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getUHostId() {
            return uHostId;
        }

        public void setUHostId(String uHostId) {
            this.uHostId = uHostId;
        }

        public String getUHostType() {
            return uHostType;
        }

        public void setUHostType(String uHostType) {
            this.uHostType = uHostType;
        }

        public String getMachineType() {
            return machineType;
        }

        public void setMachineType(String machineType) {
            this.machineType = machineType;
        }

        public String getCpuPlatform() {
            return cpuPlatform;
        }

        public void setCpuPlatform(String cpuPlatform) {
            this.cpuPlatform = cpuPlatform;
        }

        public String getStorageType() {
            return storageType;
        }

        public void setStorageType(String storageType) {
            this.storageType = storageType;
        }

        public String getImageId() {
            return imageId;
        }

        public void setImageId(String imageId) {
            this.imageId = imageId;
        }

        public String getBasicImageId() {
            return basicImageId;
        }

        public void setBasicImageId(String basicImageId) {
            this.basicImageId = basicImageId;
        }

        public String getBasicImageName() {
            return basicImageName;
        }

        public void setBasicImageName(String basicImageName) {
            this.basicImageName = basicImageName;
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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
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

        public String getAutoRenew() {
            return autoRenew;
        }

        public void setAutoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
        }

        public List<UHostDiskSet> getDiskSet() {
            return diskSet;
        }

        public void setDiskSet(List<UHostDiskSet> diskSet) {
            this.diskSet = diskSet;
        }

        public List<UHostIPSet> getIPSet() {
            return ipSet;
        }

        public void setIPSet(List<UHostIPSet> ipSet) {
            this.ipSet = ipSet;
        }

        public String getNetCapability() {
            return netCapability;
        }

        public void setNetCapability(String netCapability) {
            this.netCapability = netCapability;
        }

        public String getNetworkState() {
            return networkState;
        }

        public void setNetworkState(String networkState) {
            this.networkState = networkState;
        }

        public String getTimemachineFeature() {
            return timemachineFeature;
        }

        public void setTimemachineFeature(String timemachineFeature) {
            this.timemachineFeature = timemachineFeature;
        }

        public String getSubnetType() {
            return subnetType;
        }

        public void setSubnetType(String subnetType) {
            this.subnetType = subnetType;
        }

        public String getOsName() {
            return osName;
        }

        public void setOsName(String osName) {
            this.osName = osName;
        }

        public String getOsType() {
            return osType;
        }

        public void setOsType(String osType) {
            this.osType = osType;
        }

        public String getHostType() {
            return hostType;
        }

        public void setHostType(String hostType) {
            this.hostType = hostType;
        }

        public String getLifeCycle() {
            return lifeCycle;
        }

        public void setLifeCycle(String lifeCycle) {
            this.lifeCycle = lifeCycle;
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

        public Integer getHotPlugMaxCpu() {
            return hotPlugMaxCpu;
        }

        public void setHotPlugMaxCpu(Integer hotPlugMaxCpu) {
            this.hotPlugMaxCpu = hotPlugMaxCpu;
        }

        public String getBootDiskState() {
            return bootDiskState;
        }

        public void setBootDiskState(String bootDiskState) {
            this.bootDiskState = bootDiskState;
        }

        public Integer getTotalDiskSpace() {
            return totalDiskSpace;
        }

        public void setTotalDiskSpace(Integer totalDiskSpace) {
            this.totalDiskSpace = totalDiskSpace;
        }

        public String getIsolationGroup() {
            return isolationGroup;
        }

        public void setIsolationGroup(String isolationGroup) {
            this.isolationGroup = isolationGroup;
        }

        public String getRdmaClusterId() {
            return rdmaClusterId;
        }

        public void setRdmaClusterId(String rdmaClusterId) {
            this.rdmaClusterId = rdmaClusterId;
        }

        public String getRestrictMode() {
            return restrictMode;
        }

        public void setRestrictMode(String restrictMode) {
            this.restrictMode = restrictMode;
        }

        public Boolean getHotplugFeature() {
            return hotplugFeature;
        }

        public void setHotplugFeature(Boolean hotplugFeature) {
            this.hotplugFeature = hotplugFeature;
        }

        public Boolean getCloudInitFeature() {
            return cloudInitFeature;
        }

        public void setCloudInitFeature(Boolean cloudInitFeature) {
            this.cloudInitFeature = cloudInitFeature;
        }

        public Boolean getIPv6Feature() {
            return iPv6Feature;
        }

        public void setIPv6Feature(Boolean iPv6Feature) {
            this.iPv6Feature = iPv6Feature;
        }

        public Boolean getHpcFeature() {
            return hpcFeature;
        }

        public void setHpcFeature(Boolean hpcFeature) {
            this.hpcFeature = hpcFeature;
        }

        public Boolean getEpcInstance() {
            return epcInstance;
        }

        public void setEpcInstance(Boolean epcInstance) {
            this.epcInstance = epcInstance;
        }

        public Boolean getSecGroupInstance() {
            return secGroupInstance;
        }

        public void setSecGroupInstance(Boolean secGroupInstance) {
            this.secGroupInstance = secGroupInstance;
        }

        public Boolean getHiddenKvm() {
            return hiddenKvm;
        }

        public void setHiddenKvm(Boolean hiddenKvm) {
            this.hiddenKvm = hiddenKvm;
        }

        public UHostKeyPair getKeyPair() {
            return keyPair;
        }

        public void setKeyPair(UHostKeyPair keyPair) {
            this.keyPair = keyPair;
        }

        public UDSetUDHostAttribute getUDHostAttribute() {
            return udHostAttribute;
        }

        public void setUDHostAttribute(UDSetUDHostAttribute udHostAttribute) {
            this.udHostAttribute = udHostAttribute;
        }

        public SpotAttribute getSpotAttribute() {
            return spotAttribute;
        }

        public void setSpotAttribute(SpotAttribute spotAttribute) {
            this.spotAttribute = spotAttribute;
        }
    }

    public static class UHostKeyPair extends Response {

        /** 密钥对ID */
        @SerializedName("KeyPairId")
        private String keyPairId;

        /** 主机密钥对状态，Normal 正常，Deleted 删除 */
        @SerializedName("KeyPairState")
        private String keyPairState;

        public String getKeyPairId() {
            return keyPairId;
        }

        public void setKeyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
        }

        public String getKeyPairState() {
            return keyPairState;
        }

        public void setKeyPairState(String keyPairState) {
            this.keyPairState = keyPairState;
        }
    }
}
