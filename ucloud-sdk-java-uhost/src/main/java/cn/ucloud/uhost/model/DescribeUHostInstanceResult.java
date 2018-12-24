package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取主机信息结果类
 * @author: codezhang
 * @date: 2018-09-18 09:40
 **/

public class DescribeUHostInstanceResult extends BaseResponseResult {


    public static class UHostElement {
        /**
         * UHost实例ID
         */
        @SerializedName("UHostId")
        private String uhostId;

        /**
         * UHost类型，枚举为：
         * N1:标准型系列1；
         * N2：标准型系列2 ；
         * I1：高IO型系列1；
         * I2：高IO型系列2；
         * D1：大数据型系列1；
         * G1：GPU型系列1；
         * G2：GPU型系列2
         */
        @SerializedName("UHostType")
        private String uhostType;

        /**
         * 可用区。参见 [可用区列表](../summary/regionlist.html)
         */
        @SerializedName("Zone")
        private String zone;

        /**
         * 系统盘与数据盘的磁盘类型。
         * 枚举值为：LocalDisk，本地磁盘; UDisk，云硬盘
         */
        @SerializedName("StorageType")
        private String storageType;

        /**
         * 镜像ID
         */
        @SerializedName("ImageId")
        private String imageId;

        @SerializedName("IsExpire")
        private String isExpire;

        @SerializedName("IsolationGroup")
        private String isolationGroup;

        /**
         * 基础镜像ID（指当前自定义镜像的来源镜像）
         */
        @SerializedName("BasicImageId")
        private String basicImageId;

        /**
         * 基础镜像名称（指当前自定义镜像的来源镜像）
         */
        @SerializedName("BasicImageName")
        private String basicImageName;

        @SerializedName("BootDiskState")
        private String bootDiskState;

        /**
         * 业务组名称
         */
        @SerializedName("Tag")
        private String tag;

        /**
         * 备注
         */
        @SerializedName("Remark")
        private String remark;

        /**
         * 实例名称
         */
        @SerializedName("Name")
        private String name;

        /**
         * 实例状态，
         * 初始化: Initializing;
         * 启动中: Starting;
         * 运行中: Running;
         * 关机中: Stopping;
         * 关机: Stopped ;
         * 安装失败: Install Fail;
         * 重启中: Rebooting
         */
        @SerializedName("State")
        private String state;

        /**
         * 创建时间，格式为Unix时间戳
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * 计费模式，枚举值为： Year，按年付费； Month，按月付费； Dynamic，按需付费（需开启权限）；
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 到期时间，格式为Unix时间戳
         */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /**
         * 虚拟CPU核数，单位: 个
         */
        @SerializedName("CPU")
        private Integer cpu;

        /**
         * 虚拟GPU核数，单位: 个
         */
        @SerializedName("GPU")
        private Integer gpu;

        /**
         * 内存大小，单位: MB
         */
        @SerializedName("Memory")
        private Integer memory;

        /**
         * 是否自动续费，自动续费：“Yes”，不自动续费：“No”
         */
        @SerializedName("AuthRenew")
        private String autoRenew;

        /**
         * 磁盘信息见 UHostDiskElement
         */
        @SerializedName("DiskSet")
        private List<UHostDiskElement> uhostDisks;

        /**
         * 详细信息见 UHostIpElement
         */
        @SerializedName("IPSet")
        private List<UHostIpElement> uhostIps;

        /**
         * 网络增强。目前仅支持Normal和Super
         */
        @SerializedName("NetCapability")
        private String netCapAbility;

        /**
         * 网络状态 连接：Connected， 断开：NotConnected
         */
        @SerializedName("NetworkState")
        private String networkState;

        /**
         * yes: 开启方舟； no，未开启方舟
         */
        @SerializedName("TimemachineFeature")
        private String timeMachineFeature;

        @SerializedName("TotalDiskSpace")
        private Integer totalDiskSpace;

        /**
         * true: 开启热升级； false，未开启热升级
         */
        @SerializedName("HotplugFeature")
        private Boolean hotPlugFeature;

        /**
         * 基础网络：Default；子网：Private
         */
        @SerializedName("SubnetType")
        private String subnetType;

        /**
         * 内网或者子网的IP地址
         */
        @SerializedName("IPs")
        private List<String> ips;

        /**
         * Os名称
         */
        @SerializedName("OsName")
        private String osName;

        /**
         * "Linux"或者"Windows"
         */
        @SerializedName("OsType")
        private String osType;

        /**
         * 删除时间，格式为Unix时间戳
         */
        @SerializedName("DeleteTime")
        private Integer deleteTime;

        /**
         * 主机系列：N2，表示系列2；N1，表示系列1
         */
        @SerializedName("HostType")
        private String hostType;

        /**
         * 主机的生命周期类型。目前仅支持Normal：普通；
         */
        @SerializedName("LifeCycle")
        private String lifeCycle;

        public String getUhostId() {
            return uhostId;
        }

        public void setUhostId(String uhostId) {
            this.uhostId = uhostId;
        }

        public String getUhostType() {
            return uhostType;
        }

        public void setUhostType(String uhostType) {
            this.uhostType = uhostType;
        }

        public String getZone() {
            return zone;
        }

        public List<UHostDiskElement> getUhostDisks() {
            return uhostDisks;
        }

        public void setUhostDisks(List<UHostDiskElement> uhostDisks) {
            this.uhostDisks = uhostDisks;
        }

        public List<UHostIpElement> getUhostIps() {
            return uhostIps;
        }

        public void setUhostIps(List<UHostIpElement> uhostIps) {
            this.uhostIps = uhostIps;
        }

        public void setZone(String zone) {
            this.zone = zone;
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

        public Integer getCpu() {
            return cpu;
        }

        public void setCpu(Integer cpu) {
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

        public String getNetCapAbility() {
            return netCapAbility;
        }

        public void setNetCapAbility(String netCapAbility) {
            this.netCapAbility = netCapAbility;
        }

        public String getNetworkState() {
            return networkState;
        }

        public void setNetworkState(String networkState) {
            this.networkState = networkState;
        }

        public String getTimeMachineFeature() {
            return timeMachineFeature;
        }

        public void setTimeMachineFeature(String timeMachineFeature) {
            this.timeMachineFeature = timeMachineFeature;
        }

        public Boolean getHotPlugFeature() {
            return hotPlugFeature;
        }

        public void setHotPlugFeature(Boolean hotPlugFeature) {
            this.hotPlugFeature = hotPlugFeature;
        }

        public String getSubnetType() {
            return subnetType;
        }

        public void setSubnetType(String subnetType) {
            this.subnetType = subnetType;
        }

        public List<String> getIps() {
            return ips;
        }

        public void setIps(List<String> ips) {
            this.ips = ips;
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

        public Integer getDeleteTime() {
            return deleteTime;
        }

        public void setDeleteTime(Integer deleteTime) {
            this.deleteTime = deleteTime;
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

        public String getIsExpire() {
            return isExpire;
        }

        public UHostElement setIsExpire(String isExpire) {
            this.isExpire = isExpire;
            return this;
        }

        public String getIsolationGroup() {
            return isolationGroup;
        }

        public UHostElement setIsolationGroup(String isolationGroup) {
            this.isolationGroup = isolationGroup;
            return this;
        }

        public String getBootDiskState() {
            return bootDiskState;
        }

        public UHostElement setBootDiskState(String bootDiskState) {
            this.bootDiskState = bootDiskState;
            return this;
        }

        public Integer getGpu() {
            return gpu;
        }

        public UHostElement setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }

        public Integer getTotalDiskSpace() {
            return totalDiskSpace;
        }

        public UHostElement setTotalDiskSpace(Integer totalDiskSpace) {
            this.totalDiskSpace = totalDiskSpace;
            return this;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }

    }


    public static class UHostDiskElement {
        /**
         * 磁盘类型。系统盘: Boot，数据盘: Data,网络盘：Udisk
         */
        @SerializedName("Type")
        private String type;

        /**
         * 磁盘长ID
         */
        @SerializedName("DiskId")
        private String diskId;

        /**
         * UDisk名字（仅当磁盘是UDisk时返回）
         */
        @SerializedName("Name")
        private String name;

        @SerializedName("NetCapFeature")
        private String netCapFeature;

        /**
         * 磁盘盘符
         */
        @SerializedName("Drive")
        private String drive;

        /**
         * 磁盘大小，单位GB
         */
        @SerializedName("Size")
        private Integer size;

        /**
         * 备份方案，枚举类型：BASIC_SNAPSHOT,普通快照；DATAARK,方舟。无快照则不返回该字段。
         */
        @SerializedName("BackupType")
        private String backupType;

        /**
         * 当前主机的IOPS值
         */
        @SerializedName("IOPS")
        private Integer iops;

        /**
         * 磁盘短ID
         */
        @SerializedName("DiskShortId")
        private String diskShortId;

        /**
         * Yes: 加密 No: 非加密
         */
        @SerializedName("Encrypted")
        private String encrypted;

        /**
         * LOCAL_NOMAL| CLOUD_NORMAL| LOCAL_SSD| CLOUD_SSD|EXCLUSIVE_LOCAL_DISK
         */
        @SerializedName("DiskType")
        private String diskType;

        /**
         * True| False
         */
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

        public Integer getIops() {
            return iops;
        }

        public void setIops(Integer iops) {
            this.iops = iops;
        }

        public String getDiskShortId() {
            return diskShortId;
        }

        public void setDiskShortId(String diskShortId) {
            this.diskShortId = diskShortId;
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

        public String getNetCapFeature() {
            return netCapFeature;
        }

        public UHostDiskElement setNetCapFeature(String netCapFeature) {
            this.netCapFeature = netCapFeature;
            return this;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }


    public static class UHostIpElement {
        /**
         * 国际: Internation，BGP: Bgp，内网: Private
         */
        @SerializedName("Type")
        private String type;

        /**
         * Mac地址
         */
        @SerializedName("Mac")
        private String mac;

        /**
         * ip地址
         */
        @SerializedName("IP")
        private String ip;
        /**
         * IP对应的带宽, 单位: Mb (内网IP不显示带宽信息)
         */
        @SerializedName("SubnetId")
        private String subnetId;

        /**
         * 是否默认的弹性网卡的信息。true: 是默认弹性网卡；其他值：不是。
         */
        @SerializedName("VPCId")
        private String vpcId;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getVpcId() {
            return vpcId;
        }

        public void setVpcId(String vpcId) {
            this.vpcId = vpcId;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }


    /**
     * 满足查询条件的UHostInstance总数
     */
    @SerializedName("TotalCount")
    private String totalCount;

    /**
     * 云主机实例列表，每项参数可见下面 UHostElement
     */
    @SerializedName("UHostSet")
    private List<UHostElement> uhosts;


    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public List<UHostElement> getUhosts() {
        return uhosts;
    }

    public void setUhosts(List<UHostElement> uhosts) {
        this.uhosts = uhosts;
    }
}
