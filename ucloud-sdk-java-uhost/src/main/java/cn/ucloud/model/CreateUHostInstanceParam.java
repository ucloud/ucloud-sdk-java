package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.exception.ValidatorException;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.Param;
import com.sun.xml.internal.messaging.saaj.util.Base64;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 创建主机实例参数类
 * @author: codezhang
 * @date: 2018-09-17 15:05
 **/

public class CreateUHostInstanceParam extends BaseRequestParam {


    public class UhostDisk {
        /**
         * require 磁盘大小，单位GB。系统盘的默认大小为镜像大小。数据盘必传。
         */
        //@NotEmpty(message = "uhost.disk.size can not be empty")
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
        //@NotEmpty(message = "uhost.disk.type can not be empty")
        private String type;

        /**
         * require
         * 是否是系统盘。枚举值：True|False
         */
        //@NotEmpty(message = "uhost.disk.isboot can not be null")
        private Boolean isBoot;

        /**
         * optional
         * 磁盘备份
         * NONE| DATAARK
         */
        private String backupType;

        public UhostDisk(@NotEmpty(message = "uhost.disk.size can not be empty") Integer size,
                         @NotEmpty(message = "uhost.disk.type can not be empty") String type,
                         @NotEmpty(message = "uhost.disk.isboot can not be null") Boolean isBoot) {
            this.size = size;
            this.type = type;
            this.isBoot = isBoot;
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
                    list.add(new Param("LoginMode","Password"));
                    list.add(new Param("Password",  new String(Base64.encode((password).getBytes("utf-8")))));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
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
    private Integer memory;


    /**
     * require
     * 磁盘
     */
    private List<UhostDisk> disks;

    @UcloudParam("UhostDisk")
    public List<Param> checkUhostDisk() throws ValidatorException {
        List<Param> list = new ArrayList<>();
        if (this.getDisks() != null && this.getDisks().size() > 0) {
            List<UhostDisk> uhostDisks = this.getDisks();
            int len = uhostDisks.size();
            for (int i = 0; i < len; i++) {
                UhostDisk disk = uhostDisks.get(i);
                if (disk == null) {
                    throw new ValidatorException("uhost.disk[" + i + "] can not be null");
                } else {
                    if (disk.getSize() == null || disk.getSize() <= 0) {
                        throw new ValidatorException("uhost.disk[" + i + "].size can not be null or size <= 0");
                    }
                    if (disk.getBoot() == null) {
                        throw new ValidatorException("uhost.disk[" + i + "].isBoot can not be null");
                    }
                    if (disk.getType() == null || disk.getType().length() <= 0) {
                        throw new ValidatorException("uhost.disk[" + i + "].type can not be null");
                    }
                    list.add(new Param("Disks." + i + ".Size", disk.getSize()));
                    list.add(new Param("Disks." + i + ".Type", disk.getType()));
                    list.add(new Param("Disks." + i + ".IsBoot", disk.getBoot()));
                    if (disk.backupType != null && disk.getBackupType().length() > 0) {
                        list.add(new Param("Disks." + i + ".BackupType", disk.getBackupType()));
                    }
                }
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
                list.add(new Param("LoginMode","KeyPair"));
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
