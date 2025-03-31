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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeCompShareInstanceResponse extends Response {

    /** UHostInstance总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 云主机实例列表，每项参数可见下面 UHostInstanceSet */
    @SerializedName("UHostSet")
    private List<CompShareInstanceSet> uHostSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<CompShareInstanceSet> getUHostSet() {
        return uHostSet;
    }

    public void setUHostSet(List<CompShareInstanceSet> uHostSet) {
        this.uHostSet = uHostSet;
    }

    public static class CompShareInstanceSet extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 实例Id */
        @SerializedName("UHostId")
        private String uHostId;

        /** 机型信息 */
        @SerializedName("MachineType")
        private String machineType;

        /** CPU平台。如"Intel/Auto"、"Amd/Auto"等等 */
        @SerializedName("CpuPlatform")
        private String cpuPlatform;

        /** 镜像Id */
        @SerializedName("CompShareImageId")
        private String compShareImageId;

        /** 镜像名称 */
        @SerializedName("CompShareImageName")
        private String compShareImageName;

        /** 镜像来源 */
        @SerializedName("CompShareImageOwnerAlias")
        private String compShareImageOwnerAlias;

        /** 用于镜像计费的Id */
        @SerializedName("CompShareImageBillId")
        private String compShareImageBillId;

        /** 镜像状态 */
        @SerializedName("CompShareImageStatus")
        private String compShareImageStatus;

        /** 镜像类型 - System 系统镜像 - App 应用镜像 - Custom 自制镜像 - Community 社区镜像 */
        @SerializedName("CompShareImageType")
        private String compShareImageType;

        /** 实例类型。"UHost": 普通主机；"Container": 容器主机 */
        @SerializedName("InstanceType")
        private String instanceType;

        /** 主机密码。由Base64编码 */
        @SerializedName("Password")
        private String password;

        /** 实例名称 */
        @SerializedName("Name")
        private String name;

        /** 实例业务组 */
        @SerializedName("Tag")
        private String tag;

        /** 实例备注 */
        @SerializedName("Remark")
        private String remark;

        /**
         * 实例状态，枚举值：\\ >初始化: Initializing; \\ >启动中: Starting; \\> 运行中: Running; \\> 关机中: Stopping;
         * \\ >关机: Stopped \\ >安装失败: Install Fail; \\ >重启中: Rebooting; \\ >升级改配中: Resizing; \\ >
         * 未知(空字符串，获取状态超时或出错)：
         */
        @SerializedName("State")
        private String state;

        /** 计费模式，枚举值为： Year，按年付费； Month，按月付费； Dynamic，按时付费；Postpay，按需付费 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 虚拟CPU核数，单位: 个 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 内存大小，单位：MB */
        @SerializedName("Memory")
        private String memory;

        /** GPU类型。如: "4090" */
        @SerializedName("GpuType")
        private String gpuType;

        /** GPU个数 */
        @SerializedName("GPU")
        private Integer gpu;

        /** GPU显存信息 */
        @SerializedName("GraphicsMemory")
        private GraphicsMemory graphicsMemory;

        /** 是否自动续费，自动续费：“Yes”，不自动续费：“No” */
        @SerializedName("AutoRenew")
        private String autoRenew;

        /** 是否过期。Yes：已过期；No：未过期 */
        @SerializedName("IsExpire")
        private String isExpire;

        /** 虚机镜像的名称 */
        @SerializedName("OsName")
        private String osName;

        /** 虚机镜像操作系统类型。"Linux"\"Windows" */
        @SerializedName("OsType")
        private String osType;

        /** 总的数据盘存储空间 */
        @SerializedName("TotalDiskSpace")
        private Integer totalDiskSpace;

        /** CPU架构。"x86_64"/"i386"等 */
        @SerializedName("CpuArch")
        private String cpuArch;

        /** 详情见UHostDiskSet */
        @SerializedName("DiskSet")
        private List<UHostDiskSet> diskSet;

        /** 详情见UHostIPSet */
        @SerializedName("IPSet")
        private List<UHostIPSet> ipSet;

        /** 软件地址 */
        @SerializedName("Softwares")
        private List<SoftwareAddr> softwares;

        /** 主机价格 */
        @SerializedName("InstancePrice")
        private Double instancePrice;

        /** 镜像价格 */
        @SerializedName("CompShareImagePrice")
        private Double compShareImagePrice;

        /** 过期时间 */
        @SerializedName("ExpireTime")
        private String expireTime;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private String createTime;

        /** 【内部API返回】宿主所在Set Id */
        @SerializedName("SetId")
        private Integer setId;

        /** 【内部API返回】宿主IP */
        @SerializedName("HostIp")
        private String hostIp;

        /** 【内部API返回】udisk podId */
        @SerializedName("PodId")
        private String podId;

        /** 【内部API返回】大页内存 */
        @SerializedName("HugepageCfg")
        private String hugepageCfg;

        /** 【内部API返回】Qemu版本号 */
        @SerializedName("QemuVersion")
        private String qemuVersion;

        /** 【内部API返回】Qemu完整版本号 */
        @SerializedName("QemuFullVersion")
        private String qemuFullVersion;

        /** 【内部API返回】资源长Id */
        @SerializedName("UUID")
        private String uuid;

        /** 【内部API返回】后付费关机 */
        @SerializedName("PostPayShutdown")
        private Boolean postPayShutdown;

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

        public String getCompShareImageId() {
            return compShareImageId;
        }

        public void setCompShareImageId(String compShareImageId) {
            this.compShareImageId = compShareImageId;
        }

        public String getCompShareImageName() {
            return compShareImageName;
        }

        public void setCompShareImageName(String compShareImageName) {
            this.compShareImageName = compShareImageName;
        }

        public String getCompShareImageOwnerAlias() {
            return compShareImageOwnerAlias;
        }

        public void setCompShareImageOwnerAlias(String compShareImageOwnerAlias) {
            this.compShareImageOwnerAlias = compShareImageOwnerAlias;
        }

        public String getCompShareImageBillId() {
            return compShareImageBillId;
        }

        public void setCompShareImageBillId(String compShareImageBillId) {
            this.compShareImageBillId = compShareImageBillId;
        }

        public String getCompShareImageStatus() {
            return compShareImageStatus;
        }

        public void setCompShareImageStatus(String compShareImageStatus) {
            this.compShareImageStatus = compShareImageStatus;
        }

        public String getCompShareImageType() {
            return compShareImageType;
        }

        public void setCompShareImageType(String compShareImageType) {
            this.compShareImageType = compShareImageType;
        }

        public String getInstanceType() {
            return instanceType;
        }

        public void setInstanceType(String instanceType) {
            this.instanceType = instanceType;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
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

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
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

        public GraphicsMemory getGraphicsMemory() {
            return graphicsMemory;
        }

        public void setGraphicsMemory(GraphicsMemory graphicsMemory) {
            this.graphicsMemory = graphicsMemory;
        }

        public String getAutoRenew() {
            return autoRenew;
        }

        public void setAutoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
        }

        public String getIsExpire() {
            return isExpire;
        }

        public void setIsExpire(String isExpire) {
            this.isExpire = isExpire;
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

        public Integer getTotalDiskSpace() {
            return totalDiskSpace;
        }

        public void setTotalDiskSpace(Integer totalDiskSpace) {
            this.totalDiskSpace = totalDiskSpace;
        }

        public String getCpuArch() {
            return cpuArch;
        }

        public void setCpuArch(String cpuArch) {
            this.cpuArch = cpuArch;
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

        public List<SoftwareAddr> getSoftwares() {
            return softwares;
        }

        public void setSoftwares(List<SoftwareAddr> softwares) {
            this.softwares = softwares;
        }

        public Double getInstancePrice() {
            return instancePrice;
        }

        public void setInstancePrice(Double instancePrice) {
            this.instancePrice = instancePrice;
        }

        public Double getCompShareImagePrice() {
            return compShareImagePrice;
        }

        public void setCompShareImagePrice(Double compShareImagePrice) {
            this.compShareImagePrice = compShareImagePrice;
        }

        public String getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(String expireTime) {
            this.expireTime = expireTime;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Integer getSetId() {
            return setId;
        }

        public void setSetId(Integer setId) {
            this.setId = setId;
        }

        public String getHostIp() {
            return hostIp;
        }

        public void setHostIp(String hostIp) {
            this.hostIp = hostIp;
        }

        public String getPodId() {
            return podId;
        }

        public void setPodId(String podId) {
            this.podId = podId;
        }

        public String getHugepageCfg() {
            return hugepageCfg;
        }

        public void setHugepageCfg(String hugepageCfg) {
            this.hugepageCfg = hugepageCfg;
        }

        public String getQemuVersion() {
            return qemuVersion;
        }

        public void setQemuVersion(String qemuVersion) {
            this.qemuVersion = qemuVersion;
        }

        public String getQemuFullVersion() {
            return qemuFullVersion;
        }

        public void setQemuFullVersion(String qemuFullVersion) {
            this.qemuFullVersion = qemuFullVersion;
        }

        public String getUUID() {
            return uuid;
        }

        public void setUUID(String uuid) {
            this.uuid = uuid;
        }

        public Boolean getPostPayShutdown() {
            return postPayShutdown;
        }

        public void setPostPayShutdown(Boolean postPayShutdown) {
            this.postPayShutdown = postPayShutdown;
        }
    }

    public static class GraphicsMemory extends Response {

        /** 值，单位是GB */
        @SerializedName("Value")
        private Integer value;

        /** 交互展示参数，可忽略 */
        @SerializedName("Rate")
        private Integer rate;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Integer getRate() {
            return rate;
        }

        public void setRate(Integer rate) {
            this.rate = rate;
        }
    }

    public static class SoftwareAddr extends Response {

        /** 软件名称 */
        @SerializedName("Name")
        private String name;

        /** 软件地址 */
        @SerializedName("URL")
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getURL() {
            return url;
        }

        public void setURL(String url) {
            this.url = url;
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
}
