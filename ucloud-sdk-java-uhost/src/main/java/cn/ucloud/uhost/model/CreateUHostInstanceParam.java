package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.exception.ValidatorException;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.commons.codec.binary.Base64;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @description: 创建主机实例参数类
 * @author: codezhang
 * @date: 2018-09-17 15:05
 **/

public class CreateUHostInstanceParam extends BaseRequestParam {


    public static class UhostDisk {
        /**
         * require 磁盘大小，单位GB。系统盘的默认大小为镜像大小。数据盘必传。
         */
        private Integer size;


        /**
         * require
         * 磁盘类型。枚举值：
         * LOCAL_NORMAL 普通本地盘 |
         * CLOUD_NORMAL 普通云盘  |
         * LOCAL_SSD SSD本地盘    |
         * CLOUD_SSD SSD云盘     |
         * EXCLUSIVE_LOCAL_DISK 大数据，
         * 默认为LOCAL_NORMAL。
         * 磁盘仅支持有限组合，详情请查询控制台。
         */
        private String type;

        /**
         * require
         * 是否是系统盘。枚举值：True|False
         */
        private Boolean isBoot;

        /**
         * optional
         * 磁盘备份
         * NONE| DATAARK
         */
        private String backupType;

        /**
         * 加密：true, 不加密: false 加密必须传入对应的的KmsKeyId
         */
        private Boolean encrypted;

        /**
         * kms的id
         */
        private String kmsKeyId;

        /**
         * 云盘代金券id。不适用于系统盘/本地盘。请通过DescribeCoupon接口查询，或登录用户中心查看
         */
        private String couponId;


        public UhostDisk(@NotEmpty(message = "uhost.disk.size can not be empty") Integer size,
                         @NotEmpty(message = "uhost.disk.type can not be empty") String type,
                         @NotEmpty(message = "uhost.disk.isboot can not be null") Boolean isBoot) {
            this.size = size;
            this.type = type;
            this.isBoot = isBoot;
        }

        public String getCouponId() {
            return couponId;
        }

        public void setCouponId(String couponId) {
            this.couponId = couponId;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getBoot() {
            return isBoot;
        }

        public void setBoot(Boolean boot) {
            isBoot = boot;
        }

        public String getBackupType() {
            return backupType;
        }

        public void setBackupType(String backupType) {
            this.backupType = backupType;
        }


        public Boolean getEncrypted() {
            return encrypted;
        }

        public void setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
        }

        public String getKmsKeyId() {
            return kmsKeyId;
        }

        public void setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
        }
    }


    public static class EIP {

        /**
         * 【单个创建该参数无效】
         * 【如果绑定EIP这个参数必填】
         * 弹性IP的线路如下:
         * 国际: International
         * BGP: Bgp
         * 各地域允许的线路参数如下:
         * cn-sh1: Bgp
         * cn-sh2: Bgp
         * cn-gd: Bgp
         * cn-bj1: Bgp
         * cn-bj2: Bgp
         * hk: International
         * us-ca: International
         * th-bkk: International
         * kr-seoul:International
         * us-ws:International
         * ge-fra:International
         * sg:International
         * tw-kh:International.
         * 其他海外线路均为 International
         */
        private String operatorName;

        /**
         * 【单个创建该参数无效】
         * 【如果绑定EIP这个参数必填】弹性IP的外网带宽, 单位为Mbps.
         * 共享带宽模式必须指定0M带宽,
         * 非共享带宽模式必须指定非0Mbps带宽.
         * 各地域非共享带宽的带宽范围如下： 流量计费[1-300]，带宽计费[1-800]
         */
        private Integer bandwidth;

        /**
         * 【单个创建该参数无效】弹性IP的计费模式.
         * 枚举值:
         * "Traffic", 流量计费;
         * "Bandwidth", 带宽计费;
         * "ShareBandwidth",共享带宽模式.
         * "Free":免费带宽模式.
         * 默认为 "Bandwidth".
         */
        private String payMode;

        /**
         * 【单个创建该参数无效】
         * 绑定的共享带宽Id，
         * 仅当PayMode为ShareBandwidth时有效
         */
        private String shareBandwidthId;

        /**
         * 填写支持SSH访问IP的地区名称，
         * 如“洛杉矶”，“新加坡”，“香港”，“东京”，“华盛顿”，“法兰克福”。
         * Area和AreaCode两者必填一个
         */
        private String globalSSHArea;

        /**
         * SSH端口，1-65535且不能使用80，443端口
         */
        private Integer globalSSHPort;

        /**
         * AreaCode, 区域航空港国际通用代码。Area和AreaCode两者必填一个
         */
        private String globalSSHAreaCode;

        /**
         * 当前EIP代金券id。请通过DescribeCoupon接口查询，或登录用户中心查看
         */
        private String couponId;

        public String getGlobalSSHArea() {
            return globalSSHArea;
        }

        public void setGlobalSSHArea(String globalSSHArea) {
            this.globalSSHArea = globalSSHArea;
        }

        public Integer getGlobalSSHPort() {
            return globalSSHPort;
        }

        public void setGlobalSSHPort(Integer globalSSHPort) {
            this.globalSSHPort = globalSSHPort;
        }

        public String getGlobalSSHAreaCode() {
            return globalSSHAreaCode;
        }

        public void setGlobalSSHAreaCode(String globalSSHAreaCode) {
            this.globalSSHAreaCode = globalSSHAreaCode;
        }

        public String getCouponId() {
            return couponId;
        }

        public void setCouponId(String couponId) {
            this.couponId = couponId;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

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
    }


    public CreateUHostInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                    @NotEmpty(message = "zone can not be empty") String zone,
                                    @NotEmpty(message = "imageId can not be empty") String imageId) {
        super("CreateUHostInstance");
        this.region = region;
        this.zone = zone;
        this.imageId = imageId;
    }

    /**
     * require 地域，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 可用区，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @UcloudParam("Zone")
    @NotEmpty(message = "zone can not be empty")
    private String zone;

    /**
     * require 镜像ID。 请通过 [DescribeImage](describe_image.html)获取
     */
    @NotEmpty(message = "imageId can not be empty")
    @UcloudParam("ImageId")
    private String imageId;

    /**
     * optional UHost密码;LoginMode为Password时此项必须
     */
    private String password;


    /**
     * 检查password
     *
     * @return
     * @throws ValidatorException
     */
    @UcloudParam("Password")
    public List<Param> checkPassword() throws ValidatorException {
        List<Param> list = new ArrayList<>();
        if (!"KeyPair".equals(this.getLoginMode())) {
            // 默认登录模式  只要不是“KeyPair”  都设置成为Password
            this.setLoginMode("Password");
        }
        if ("Password".equals(this.getLoginMode())) {
            if (this.getPassword() != null && !"".equals(this.getPassword())) {
                try {
                    list.add(new Param("Password", new String(Base64.encodeBase64((password).getBytes("utf-8")))));
                } catch (UnsupportedEncodingException e) {
                    Logger.getGlobal().log(Level.SEVERE, e.getMessage());
                }
            } else {
                throw new ValidatorException("password can not be empty with loginModel equal Password");
            }
        }
        return list;
    }


    /**
     * optional UHost实例名称。默认：UHost
     */
    @UcloudParam("Name")
    private String name;


    /**
     * optional 业务组。默认：Default（Default即为未分组）
     */
    @UcloudParam("Tag")
    private String tag;


    /**
     * optional 计费模式。枚举值为： Year，按年付费； Month，按月付费； Dynamic，按小时付费（需开启权限）。默认为月付
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * optional 购买时长。默认: 1。按小时购买(Dynamic)时无需此参数。 月付时，此参数传0，代表了购买至月末。
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * optional 云主机机型。
     * 枚举值：
     * N1：系列1标准型；
     * N2：系列2标准型；
     * I1: 系列1高IO型；
     * I2，系列2高IO型；
     * D1: 系列1大数据机型；
     * G1: 系列1GPU型，型号为K80；
     * G2：系列2GPU型，型号为P40；
     * G3：系列2GPU型，型号为V100；
     * 北京A、北京C、上海二A、香港A可用区默认N1，其他机房默认N2。
     * 不同机房的主机类型支持情况不同。详情请参考控制台。
     */
    @UcloudParam("UHostType")
    private String uhostType;

    /**
     * optional 虚拟CPU核数。 单位：个。可选参数：{1,2,4,8,12,16,24,32}。默认值: 4
     */
    @UcloudParam("CPU")
    private Integer cpu;

    /**
     * optional 内存大小。单位：MB。范围 ：[1024, 131072]， 取值为2的幂次方。默认值：8192。
     */
    @UcloudParam("Memory")
    private Integer memory;


    /**
     * require
     * 磁盘
     */
    private List<UhostDisk> disks;

    @UcloudParam("UhostDisk")
    public List<Param> checkUhostDisk() throws ValidatorException {
        List<Param> list = new ArrayList<>();
        if (this.getDisks() != null && !this.getDisks().isEmpty()) {
            List<UhostDisk> uhostDisks = this.getDisks();
            int len = uhostDisks.size();
            String exceptionFormat = "uhost.disk[%d]%s";
            String disksParamFormat = "Disks.%d.%s";
            for (int i = 0; i < len; i++) {
                UhostDisk disk = uhostDisks.get(i);
                if (disk == null) {
                    throw new ValidatorException(String.format(exceptionFormat, i, " can not be null"));
                } else {
                    if (disk.getBoot() == null) {
                        throw new ValidatorException(String.format(exceptionFormat, i, ".isBoot can not be null"));
                    }
                    if (disk.getSize() == null || disk.getSize() <= 0) {
                        throw new ValidatorException(String.format(exceptionFormat, i, ".size can not be null or size <= 0"));
                    }
                    if (disk.getType() == null || disk.getType().length() <= 0) {
                        throw new ValidatorException(String.format(exceptionFormat, i, ".type can not be null"));
                    }
                    list.add(new Param(String.format(disksParamFormat, i, "Size"), disk.getSize()));
                    list.add(new Param(String.format(disksParamFormat, i, "Type"), disk.getType()));
                    list.add(new Param(String.format(disksParamFormat, i, "IsBoot"), disk.getBoot()));
                    if (disk.backupType != null && !disk.backupType.isEmpty()) {
                        list.add(new Param(String.format(disksParamFormat, i, "BackupType"), disk.backupType));
                    }
                    if (disk.encrypted != null) {
                        list.add(new Param(String.format(disksParamFormat, i, "Encrypted"), disk.encrypted));
                    }
                    if (disk.kmsKeyId != null && !disk.kmsKeyId.isEmpty()) {
                        list.add(new Param(String.format(disksParamFormat, i, "KmsKeyId"), disk.kmsKeyId));
                    }
                    if (disk.couponId != null && !disk.couponId.isEmpty()) {
                        list.add(new Param(String.format(disksParamFormat, i, "CouponId"), disk.couponId));
                    }
                }
            }
        }
        return list;
    }


    @UcloudParam("EIP")
    public List<Param> checkEIPs() throws ValidatorException {
        List<Param> list = new ArrayList<>();
        if (eips == null || eips.isEmpty()) {
            return list;
        }
        int size = eips.size();
        for (int i = 0; i < size; i++) {
            EIP eip = eips.get(i);
            if (eip == null) {
                throw new ValidatorException(String.format("eips[%d] is null", i));
            }
            String eipParamFormat = "NetworkInterface.%d.EIP.%s";
            if (eip.operatorName != null && !eip.operatorName.isEmpty()) {
                list.add(new Param(String.format(eipParamFormat, i, "OperatorName"), eip.operatorName));
            }
            if (eip.bandwidth != null) {
                list.add(new Param(String.format(eipParamFormat, i, "Bandwidth"), eip.bandwidth));
            }
            if (eip.payMode != null && !eip.payMode.isEmpty()) {
                list.add(new Param(String.format(eipParamFormat, i, "PayMode"), eip.payMode));
            }
            if (eip.shareBandwidthId != null && !eip.shareBandwidthId.isEmpty()) {
                list.add(new Param(String.format(eipParamFormat, i, "ShareBandwidthId"), eip.shareBandwidthId));
            }
            if (eip.couponId != null && !eip.couponId.isEmpty()) {
                list.add(new Param(String.format(eipParamFormat, i, "CouponId"), eip.couponId));
            }
            if (eip.globalSSHArea != null && !eip.globalSSHArea.isEmpty()) {
                list.add(new Param(String.format(eipParamFormat, i, "GlobalSSH.Area"), eip.globalSSHArea));
            }
            if (eip.globalSSHAreaCode != null && !eip.globalSSHAreaCode.isEmpty()) {
                list.add(new Param(String.format(eipParamFormat, i, "GlobalSSH.AreaCode"), eip.globalSSHAreaCode));
            }
            if (eip.globalSSHPort != null) {
                list.add(new Param(String.format(eipParamFormat, i, "GlobalSSH.Port"), eip.globalSSHPort));
            }
        }
        return list;
    }

    /**
     * optional GPU卡核心数。仅GPU机型支持此字段；系列1可选1,2；系列2可选1,2,3,4。
     * GPU可选数量与CPU有关联，详情请参考控制台。
     */
    @UcloudParam("GPU")
    private Integer gpu;

    /**
     * optional 主机登陆模式。密码（默认选项）: Password，key: KeyPair（此项暂不支持）
     */
    @UcloudParam("LoginMode")
    private String loginMode;

    /**
     * optional【暂不支持】Keypair公钥，LoginMode为KeyPair时此项必须
     */
    private String keyPair;

    @UcloudParam("KeyPair")
    public List<Param> checkKeyPair() throws ValidatorException {
        List<Param> list = new ArrayList<>();
        if ("KeyPair".equals(this.getLoginMode())) {
            if (this.getKeyPair() != null && this.getKeyPair().length() > 0) {
                list.add(new Param("KeyPair", this.getKeyPair()));
            } else {
                throw new ValidationException("keyPair can not be empty with loginModel equals KeyPair");
            }
        }
        return list;
    }

    /**
     * optional 【待废弃，不建议调用】磁盘类型，同时设定系统盘和数据盘的磁盘类型。
     * 枚举值为：
     * LocalDisk，本地磁盘;
     * UDisk，云硬盘；
     * 默认为LocalDisk。
     * 仅部分可用区支持云硬盘方式的主机存储方式，具体请查询控制台。
     */
    @UcloudParam("StorageType")
    private String storageType;

    /**
     * optional 【待废弃，不建议调用】系统盘大小。 单位：GB， 范围[20,100]， 步长：10
     * 默认：Linux 20G,windows 40G
     */
    @UcloudParam("BootDiskSpace")
    private Integer bootDiskSpace;

    /**
     * optional
     * 【待废弃，不建议调用】数据盘大小。
     * 单位：GB， 范围[0,8000]， 步长：10，
     * 默认值：20，云盘支持0-8000；
     * 本地普通盘支持0-2000；本地SSD盘（包括所有GPU机型）支持100-1000
     */
    @UcloudParam("DiskSpace")
    private Integer diskSpace;

    /**
     * optional
     * 网络增强。目前仅Normal（不开启） 和Super（开启）可用。
     * 默认Normal。 不同机房的网络增强支持情况不同。详情请参考控制台。
     */
    @UcloudParam("NetCapAbility")
    private String netcapAbitity;

    /**
     * optional
     * 是否开启方舟特性。Yes为开启方舟，No为关闭方舟。
     * 目前仅选择普通本地盘+普通本地盘 或 SSD云盘+普通云盘的组合支持开启方舟。
     */
    @UcloudParam("TimemachineFeature")
    private String timeMachineFeature;

    /**
     * optional
     * 是否开启热升级特性。True为开启，False为未开启，默认False。
     * 仅系列1云主机需要使用此字段，系列2云主机根据镜像是否支持云主机。
     */
    @UcloudParam("HotplugFeature")
    private Boolean hotPlugFeature;

    /**
     * optional
     * 加密盘的密码。若输入此字段，自动选择加密盘。加密盘需要权限位。
     */
    @UcloudParam("DiskPassword")
    private String diskPassword;

    /**
     * optional
     * 网络ID（VPC2.0情况下无需填写）。VPC1.0情况下，若不填写，代表选择基础网络；
     * 若填写，代表选择子网。参见DescribeSubnet。
     */
    @UcloudParam("NetworkId")
    private String networkId;


    /**
     * VPC ID。VPC2.0下需要填写此字段。
     */
    @UcloudParam("VPCId")
    private String VpcId;

    /**
     * optional 子网ID。VPC2.0下需要填写此字段。
     */
    @UcloudParam("SubnetId")
    private String subnetId;

    /**
     * optional
     * 【数组】创建云主机时指定内网IP。当前只支持一个内网IP。调用方式举例：PrivateIp.0=x.x.x.x。
     */
    private List<String> privateIp;

    @UcloudParam("PrivateIp")
    public List<Param> checkPrivateIp() {
        List<Param> list = new ArrayList<>();
        if (this.getPrivateIp() != null) {
            int len = this.getPrivateIp().size();
            for (int i = 0; i < len; i++) {
                String ip = this.getPrivateIp().get(i);
                if (ip == null || ip.length() <= 0) {
                    throw new ValidationException("privateIp[" + i + "] can not be null or length <= 0");
                } else {
                    list.add(new Param("PrivateIp." + i, ip));
                }
            }
        }
        return list;
    }

    /**
     * optional
     * 创建云主机时指定Mac。调用方式举例：PrivateMac="xx:xx:xx:xx:xx:xx"。
     */
    @UcloudParam("PrivateMac")
    private String privateMac;

    /**
     * optional
     * 防火墙Id，默认：Web推荐防火墙。
     * 如何查询SecurityGroupId请参见 [DescribeSecurityGroup](../unet-api/describe_security_group.html)
     */
    @UcloudParam("SecurityGroupId")
    private String securityGroupId;

    /**
     * optional
     * 【暂不支持】cloudinit方式下，用户初始化脚本
     */
    @UcloudParam("UserDataScript")
    private String userDataScript;

    /**
     * optional
     * 【暂不支持】是否安装UGA。'yes': 安装；其他或者不填：不安装。
     */
    @UcloudParam("InstallAgent")
    private String installAgent;

    /**
     * optional
     * 代金券ID。请通过DescribeCoupon接口查询，或登录用户中心查看
     */
    @UcloudParam("CouponId")
    private String couponId;

    /**
     * optional【内部参数】资源类型
     */
    @UcloudParam("ResourceType")
    private String resourceType;

    /**
     * 硬件隔离组id。可通过DescribeIsolationGroup获取。
     */
    @UcloudParam("IsolationGroup")
    private String isolationGroup;

    /**
     * 告警模板id，如果传了告警模板id，且告警模板id正确，
     * 则绑定告警模板。绑定告警模板失败只会在后台有日志，不会影响创建主机流程，也不会在前端报错。
     */
    @UcloudParam("AlarmTemplateId")
    private String alarmTemplateId;


    /**
     * 最低cpu平台，枚举值
     * ["Intel/Auto",
     * "Intel/LvyBridge",
     * "Intel/Haswell",
     * "Intel/Broadwell",
     * "Intel/Skylake"]
     */
    @UcloudParam("MinimalCpuPlatform")
    private String minimalCpuPlatform;

    /**
     * GPU类型，枚举值["K80", "P40", "V100"]
     */
    @UcloudParam("GpuType")
    private String gpuType;

    /**
     * 云主机类型，枚举值["N", "C", "G", "O"]
     */
    @UcloudParam("MachineType")
    private String machineType;

    /**
     * 【批量创建主机时必填】最大创建主机数量，取值范围是[1,100];
     */
    @UcloudParam("MaxCount")
    private Integer maxCount;


    @UcloudParam("SetId")
    private Integer setId;

    @Deprecated
    private EIP eip;

    private List<EIP> eips;

    public List<EIP> getEips() {
        return eips;
    }

    public void setEips(List<EIP> eips) {
        this.eips = eips;
    }

    public String getIsolationGroup() {
        return isolationGroup;
    }

    public void setIsolationGroup(String isolationGroup) {
        this.isolationGroup = isolationGroup;
    }

    public String getAlarmTemplateId() {
        return alarmTemplateId;
    }

    public void setAlarmTemplateId(String alarmTemplateId) {
        this.alarmTemplateId = alarmTemplateId;
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

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public Integer getSetId() {
        return setId;
    }

    public void setSetId(Integer setId) {
        this.setId = setId;
    }

    @Deprecated
    public EIP getEip() {
        return eip;
    }

    @Deprecated
    public void setEip(EIP eip) {
        this.eip = eip;
    }

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

    public List<UhostDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<UhostDisk> disks) {
        this.disks = disks;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
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

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUhostType() {
        return uhostType;
    }

    public void setUhostType(String uhostType) {
        this.uhostType = uhostType;
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

    public Integer getGpu() {
        return gpu;
    }

    public void setGpu(Integer gpu) {
        this.gpu = gpu;
    }

    public String getLoginMode() {
        return loginMode;
    }

    public void setLoginMode(String loginMode) {
        this.loginMode = loginMode;
    }

    public String getKeyPair() {
        return keyPair;
    }

    public void setKeyPair(String keyPair) {
        this.keyPair = keyPair;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public Integer getBootDiskSpace() {
        return bootDiskSpace;
    }

    public void setBootDiskSpace(Integer bootDiskSpace) {
        this.bootDiskSpace = bootDiskSpace;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public String getNetcapAbitity() {
        return netcapAbitity;
    }

    public void setNetcapAbitity(String netcapAbitity) {
        this.netcapAbitity = netcapAbitity;
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

    public String getDiskPassword() {
        return diskPassword;
    }

    public void setDiskPassword(String diskPassword) {
        this.diskPassword = diskPassword;
    }

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public List<String> getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(List<String> privateIp) {
        this.privateIp = privateIp;
    }

    public String getPrivateMac() {
        return privateMac;
    }

    public void setPrivateMac(String privateMac) {
        this.privateMac = privateMac;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getUserDataScript() {
        return userDataScript;
    }

    public void setUserDataScript(String userDataScript) {
        this.userDataScript = userDataScript;
    }

    public String getInstallAgent() {
        return installAgent;
    }

    public void setInstallAgent(String installAgent) {
        this.installAgent = installAgent;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
