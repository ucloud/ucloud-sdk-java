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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;
import java.util.List;

public class CreateUHostInstanceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 镜像ID。 请通过 [DescribeImage](describe_image.html)获取 */
    @NotEmpty
    @UCloudParam("ImageId")
    private String imageId;

    /** */
    @UCloudParam("Disks")
    private List<Disks> disks;

    /** 主机登陆模式。密码（默认选项）: Password，密钥：KeyPair。 */
    @NotEmpty
    @UCloudParam("LoginMode")
    private String loginMode;

    /**
     * UHost密码。请遵照[[api:uhost-api:specification|字段规范]]设定密码。密码需使用base64进行编码，举例如下：# echo -n Password1
     * | base64UGFzc3dvcmQx。
     */
    @UCloudParam("Password")
    private String password;

    /** UHost实例名称。默认：UHost。请遵照[[api:uhost-api:specification|字段规范]]设定实例名称。 */
    @UCloudParam("Name")
    private String name;

    /** 业务组。默认：Default（Default即为未分组）。请遵照[[api:uhost-api:specification|字段规范]]设定业务组。 */
    @UCloudParam("Tag")
    private String tag;

    /**
     * 计费模式。枚举值为： \\ > Year，按年付费； \\ > Month，按月付费；\\ > Dynamic，按小时预付费 \\ >
     * Postpay，按小时后付费（支持关机不收费，目前仅部分可用区支持，请联系您的客户经理） \\Preemptive计费为抢占式实例(内测阶段) \\ 默认为月付
     */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长。默认:值 1。按小时购买（Dynamic/Postpay）时无需此参数。 月付时，此参数传0，代表购买至月末。 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /**
     * 【建议后续不再使用】云主机机型（V1.0），在本字段和字段MachineType中，仅需要其中1个字段即可。参考[[api:uhost-api:uhost_type|云主机机型说明]]。
     */
    @UCloudParam("UHostType")
    private String uHostType;

    /** 虚拟CPU核数。可选参数：1-64（具体机型与CPU的对应关系参照控制台）。默认值: 4。 */
    @UCloudParam("CPU")
    private Integer cpu;

    /** 内存大小。单位：MB。范围 ：[1024, 262144]，取值为1024的倍数（可选范围参考控制台）。默认值：8192 */
    @UCloudParam("Memory")
    private Integer memory;

    /**
     * GPU类型，枚举值["K80", "P40", "V100", "T4", "T4S","2080Ti","2080Ti-4C","1080Ti", "T4/4", "MI100",
     * "V100S"]，MachineType为G时必填
     */
    @UCloudParam("GpuType")
    private String gpuType;

    /** GPU卡核心数。仅GPU机型支持此字段（可选范围与MachineType+GpuType相关） */
    @UCloudParam("GPU")
    private Integer gpu;

    /** 网络增强特性。枚举值：Normal（默认），不开启; Super，开启网络增强1.0； Ultra，开启网络增强2.0（仅支持部分可用区，请参考控制台） */
    @UCloudParam("NetCapability")
    private String netCapability;

    /** 热升级特性。True为开启，False为未开启，默认False。 */
    @UCloudParam("HotplugFeature")
    private Boolean hotplugFeature;

    /** VPC ID。默认为当前地域的默认VPC。 */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 子网 ID。默认为当前地域的默认子网。 */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 【数组】创建云主机时指定内网IP。若不传值，则随机分配当前子网下的IP。调用方式举例：PrivateIp.0=x.x.x.x。当前只支持一个内网IP。 */
    @UCloudParam("PrivateIp")
    private List<String> privateIp;

    /**
     * 防火墙ID，默认：Web推荐防火墙。如何查询SecurityGroupId请参见
     * [DescribeFirewall](api/unet-api/describe_firewall.html)。
     */
    @UCloudParam("SecurityGroupId")
    private String securityGroupId;

    /** 硬件隔离组id。可通过DescribeIsolationGroup获取。 */
    @UCloudParam("IsolationGroup")
    private String isolationGroup;

    /** 告警模板id，如果传了告警模板id，且告警模板id正确，则绑定告警模板。绑定告警模板失败只会在后台有日志，不会影响创建主机流程，也不会在前端报错。 */
    @UCloudParam("AlarmTemplateId")
    private Integer alarmTemplateId;

    /**
     * 云主机机型（V2.0），在本字段和字段UHostType中，仅需要其中1个字段即可。枚举值["N", "C", "G", "O", "OS", "OM", "OPRO", "OMAX",
     * "O.BM", "O.EPC"]。参考[[api:uhost-api:uhost_type|云主机机型说明]]。
     */
    @UCloudParam("MachineType")
    private String machineType;

    /**
     * 最低cpu平台，枚举值["Intel/Auto", "Intel/IvyBridge", "Intel/Haswell", "Intel/Broadwell",
     * "Intel/Skylake", "Intel/Cascadelake", "Intel/CascadelakeR", "Intel/IceLake", "Amd/Epyc2",
     * "Amd/Auto"],默认值是"Intel/Auto"。
     */
    @UCloudParam("MinimalCpuPlatform")
    private String minimalCpuPlatform;

    /** 本次最大创建主机数量，取值范围是[1,100]，默认值为1。 */
    @UCloudParam("MaxCount")
    private Integer maxCount;

    /** */
    @UCloudParam("NetworkInterface")
    private List<NetworkInterface> networkInterface;

    /** 用户自定义数据。当镜像支持Cloud-init Feature时可填写此字段。注意：1、总数据量大小不超过 16K；2、使用base64编码 */
    @UCloudParam("UserData")
    private String userData;

    /** 数据盘是否需要自动分区挂载。当镜像支持“Cloud-init”Feature时可填写此字段。取值 >“On” 自动挂载（默认值）> “Off” 不自动挂载。 */
    @UCloudParam("AutoDataDiskInit")
    private String autoDataDiskInit;

    /** */
    @UCloudParam("Volumes")
    private List<Volumes> volumes;

    /** KeypairId 密钥对ID，LoginMode为KeyPair时此项必须 */
    @UCloudParam("KeyPairId")
    private String keyPairId;

    /** */
    @UCloudParam("Features")
    private Features features;

    /** 主机代金券ID。请通过DescribeCoupon接口查询，或登录用户中心查看 */
    @UCloudParam("CouponId")
    private String couponId;

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

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public List<Disks> getDisks() {
        return disks;
    }

    public void setDisks(List<Disks> disks) {
        this.disks = disks;
    }

    public String getLoginMode() {
        return loginMode;
    }

    public void setLoginMode(String loginMode) {
        this.loginMode = loginMode;
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

    public String getUHostType() {
        return uHostType;
    }

    public void setUHostType(String uHostType) {
        this.uHostType = uHostType;
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

    public String getNetCapability() {
        return netCapability;
    }

    public void setNetCapability(String netCapability) {
        this.netCapability = netCapability;
    }

    public Boolean getHotplugFeature() {
        return hotplugFeature;
    }

    public void setHotplugFeature(Boolean hotplugFeature) {
        this.hotplugFeature = hotplugFeature;
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

    public List<String> getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(List<String> privateIp) {
        this.privateIp = privateIp;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getIsolationGroup() {
        return isolationGroup;
    }

    public void setIsolationGroup(String isolationGroup) {
        this.isolationGroup = isolationGroup;
    }

    public Integer getAlarmTemplateId() {
        return alarmTemplateId;
    }

    public void setAlarmTemplateId(Integer alarmTemplateId) {
        this.alarmTemplateId = alarmTemplateId;
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

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public List<NetworkInterface> getNetworkInterface() {
        return networkInterface;
    }

    public void setNetworkInterface(List<NetworkInterface> networkInterface) {
        this.networkInterface = networkInterface;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public String getAutoDataDiskInit() {
        return autoDataDiskInit;
    }

    public void setAutoDataDiskInit(String autoDataDiskInit) {
        this.autoDataDiskInit = autoDataDiskInit;
    }

    public List<Volumes> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volumes> volumes) {
        this.volumes = volumes;
    }

    public String getKeyPairId() {
        return keyPairId;
    }

    public void setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public static class Disks extends Request {

        /** 是否是系统盘。枚举值：\\ > True，是系统盘 \\ > False，是数据盘（默认）。Disks数组中有且只能有一块盘是系统盘。 */
        @NotEmpty
        @UCloudParam("IsBoot")
        private String isBoot;

        /** 磁盘类型。请参考[[api:uhost-api:disk_type|磁盘类型]]。 */
        @NotEmpty
        @UCloudParam("Type")
        private String type;

        /** 磁盘大小，单位GB，必须是10GB的整数倍。请参考[[api:uhost-api:disk_type|磁盘类型]]。 */
        @NotEmpty
        @UCloudParam("Size")
        private Integer size;

        /**
         * 磁盘备份方案。枚举值：\\ > NONE，无备份 \\ > DATAARK，数据方舟 \\ > SNAPSHOT，快照 \\当前磁盘支持的备份模式参考
         * [[api:uhost-api:disk_type|磁盘类型]],默认值:NONE
         */
        @UCloudParam("BackupType")
        private String backupType;

        /** 【功能仅部分可用区开放，详询技术支持】磁盘是否加密。加密：true, 不加密: false 加密必须传入对应的的KmsKeyId,默认值false */
        @UCloudParam("Encrypted")
        private Boolean encrypted;

        /** 【功能仅部分可用区开放，详询技术支持】kms key id。选择加密盘时必填。 */
        @UCloudParam("KmsKeyId")
        private String kmsKeyId;

        /** 云盘代金券id。不适用于系统盘/本地盘。请通过DescribeCoupon接口查询，或登录用户中心查看 */
        @UCloudParam("CouponId")
        private String couponId;

        public String getIsBoot() {
            return isBoot;
        }

        public void setIsBoot(String isBoot) {
            this.isBoot = isBoot;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
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

        public String getCouponId() {
            return couponId;
        }

        public void setCouponId(String couponId) {
            this.couponId = couponId;
        }
    }

    public static class NetworkInterface extends Request {

        /** */
        @UCloudParam("EIP")
        private NetworkInterfaceEIP eip;

        /** */
        @UCloudParam("IPv6")
        private NetworkInterfaceIPv6 iPv6;

        /** 申请并绑定一个教育网EIP。True为申请并绑定，False为不会申请绑定，默认False。当前只支持具有HPC特性的机型。 */
        @UCloudParam("CreateCernetIp")
        private Boolean createCernetIp;

        public NetworkInterfaceEIP getEIP() {
            return eip;
        }

        public void setEIP(NetworkInterfaceEIP eip) {
            this.eip = eip;
        }

        public NetworkInterfaceIPv6 getIPv6() {
            return iPv6;
        }

        public void setIPv6(NetworkInterfaceIPv6 iPv6) {
            this.iPv6 = iPv6;
        }

        public Boolean getCreateCernetIp() {
            return createCernetIp;
        }

        public void setCreateCernetIp(Boolean createCernetIp) {
            this.createCernetIp = createCernetIp;
        }
    }

    public static class NetworkInterfaceEIP extends Request {

        /**
         * 【若绑定EIP，此参数必填】弹性IP的外网带宽, 单位为Mbps. 共享带宽模式必须指定0M带宽, 非共享带宽模式必须指定非0Mbps带宽. 各地域非共享带宽的带宽范围如下：
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
         * 【若绑定EIP，此参数必填】弹性IP的线路。枚举值: 国际: International BGP: Bgp 各地域允许的线路参数如下: cn-sh1: Bgp cn-sh2:
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

    public static class Volumes extends Request {}

    public static class NetworkInterfaceIPv6 extends Request {}

    public static class Features extends Request {

        /** 弹性网卡特性。开启了弹性网卡权限位，此特性才生效，默认 false 未开启，true 开启，仅与 NetCapability Normal 兼容。 */
        @UCloudParam("UNI")
        private Boolean uni;

        public Boolean getUNI() {
            return uni;
        }

        public void setUNI(Boolean uni) {
            this.uni = uni;
        }
    }
}
