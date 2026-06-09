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

public class CheckUHostResourceCapacityRequest extends Request {

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

    /**
     * 计费模式。枚举值为： \\ > Year，按年付费； \\ > Month，按月付费；\\ > Dynamic，按小时预付费 \\ >
     * Postpay，按小时后付费（支持关机不收费，目前仅部分可用区支持，请联系您的客户经理） \\ > Spot计费为抢占式实例(内测阶段) \\ 默认为月付
     */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 虚拟CPU核数。可选参数：1-64（具体机型与CPU的对应关系参照控制台）。默认值: 4。 */
    @UCloudParam("CPU")
    private Integer cpu;

    /** 内存大小。单位：MB。范围 ：[1024, 262144]，取值为1024的倍数（可选范围参考控制台）。默认值：8192 */
    @UCloudParam("Memory")
    private Integer memory;

    /**
     * GPU类型，枚举值["K80", "P40", "V100", "T4","T4A", "T4S","2080Ti","2080Ti-4C","1080Ti", "T4/4",
     * "MI100", "V100S",2080","2080TiS","2080TiPro","3090","A100", "4090", "4090Pro", "4090_48G",
     * "5090"]，MachineType为G时必填
     */
    @UCloudParam("GpuType")
    private String gpuType;

    /** GPU卡核心数。仅GPU机型支持此字段（可选范围与MachineType+GpuType相关） */
    @UCloudParam("GPU")
    private Integer gpu;

    /** 网络增强特性。枚举值：Normal，不开启; Super，开启网络增强1.0； Ultra，开启网络增强2.0（详情参考官网文档） */
    @UCloudParam("NetCapability")
    private String netCapability;

    /** 热升级特性。True为开启，False为未开启，默认False。 */
    @UCloudParam("HotplugFeature")
    private Boolean hotplugFeature;

    /** 硬件隔离组id。可通过DescribeIsolationGroup获取。 */
    @UCloudParam("IsolationGroup")
    private String isolationGroup;

    /**
     * 云主机机型（V2.0），在本字段和字段UHostType中，仅需要其中1个字段即可。枚举值["N", "C", "G", "O", "OS", "OM", "OPRO", "OMAX",
     * "O.BM", "O.EPC"]。参考[[api:uhost-api:uhost_type|云主机机型说明]]。
     */
    @UCloudParam("MachineType")
    private String machineType;

    /**
     * 最低cpu平台，枚举值["Intel/Auto", "Intel/IvyBridge", "Intel/Haswell", "Intel/Broadwell",
     * "Intel/Skylake", "Intel/Cascadelake", "Intel/CascadelakeR", "Intel/IceLake", "Amd/Epyc2",
     * "Amd/Auto","Ampere/Auto","Ampere/Altra"],默认值是"Intel/Auto"。
     */
    @UCloudParam("MinimalCpuPlatform")
    private String minimalCpuPlatform;

    /** 本次最大创建主机数量，取值范围是[1,100]，默认值为1。 */
    @UCloudParam("MaxCount")
    private Integer maxCount;

    /** */
    @UCloudParam("Features")
    private Features features;

    /** 主机安全模式。Firewall：防火墙；SecGroup：安全组；默认值：Firewall。 */
    @UCloudParam("SecurityMode")
    private String securityMode;

    /**
     * 规格族。 由机型代号和 CPU 平台组成，用于指定云主机的硬件类型与处理器平台。 当 MachineType 为 "O"（快杰型）时，支持以下取值： o1i：快杰型 O1 代，Intel
     * 平台 o1a：快杰型 O1 代，AMD 平台 o1r：快杰型 O1 代，ARM 平台 o2i：快杰型 O2 代，Intel 平台 默认值：o1i 或 o1a（系统将根据资源情况自动选择）
     * 当 MachineType 为 "OM"（快杰共享型）时，支持以下取值： om1i：快杰内存增强型 OM1 代，Intel 平台 om2i：快杰内存增强型 OM2 代，Intel 平台
     * ⚠️ 注意：规格族必须与 MachineType 匹配，否则请求将被拒绝。
     */
    @UCloudParam("UHostFamily")
    private String uHostFamily;

    /** 本次最小创建主机数量，取值范围是[1,100]，默认值为1。 */
    @UCloudParam("MinCount")
    private Integer minCount;

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

    public String getIsolationGroup() {
        return isolationGroup;
    }

    public void setIsolationGroup(String isolationGroup) {
        this.isolationGroup = isolationGroup;
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

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public String getSecurityMode() {
        return securityMode;
    }

    public void setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
    }

    public String getUHostFamily() {
        return uHostFamily;
    }

    public void setUHostFamily(String uHostFamily) {
        this.uHostFamily = uHostFamily;
    }

    public Integer getMinCount() {
        return minCount;
    }

    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
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

        /** 磁盘大小，单位GB。请参考[[api:uhost-api:disk_type|磁盘类型]]。 */
        @NotEmpty
        @UCloudParam("Size")
        private Integer size;

        /**
         * 磁盘备份方案。枚举值：\\ > NONE，无备份 \\ > DATAARK，数据方舟 \\ > SNAPSHOT，快照 \\当前磁盘支持的备份模式参考
         * [[api:uhost-api:disk_type|磁盘类型]],默认值:NONE
         */
        @UCloudParam("BackupType")
        private String backupType;

        /** 云盘代金券id。不适用于系统盘/本地盘。请通过DescribeCoupon接口查询，或登录用户中心查看 */
        @UCloudParam("CouponId")
        private String couponId;

        /**
         * 指定快照备份策略。当Disks.N.BackupType为"SNAPSHOT"时此参数生效。枚举值："Lite"：轻量版，"Base"：基础版，"Ultimate"：旗舰版，"Custom"：自定义备份链；默认值："Base"
         */
        @UCloudParam("BackupMode")
        private String backupMode;

        /** */
        @UCloudParam("CustomBackup")
        private DisksCustomBackup customBackup;

        /** 从快照创建盘时所用快照id，目前仅支持数据盘 */
        @UCloudParam("SnapshotId")
        private String snapshotId;

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

        public String getCouponId() {
            return couponId;
        }

        public void setCouponId(String couponId) {
            this.couponId = couponId;
        }

        public String getBackupMode() {
            return backupMode;
        }

        public void setBackupMode(String backupMode) {
            this.backupMode = backupMode;
        }

        public DisksCustomBackup getCustomBackup() {
            return customBackup;
        }

        public void setCustomBackup(DisksCustomBackup customBackup) {
            this.customBackup = customBackup;
        }

        public String getSnapshotId() {
            return snapshotId;
        }

        public void setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
        }
    }

    public static class DisksCustomBackup extends Request {

        /** Disks.N.BackupMode为"Custom"时，进行设置, 以12小时秒级为基础进行倍数扩增，如12、24、36、48。 */
        @UCloudParam("Journal")
        private String journal;

        /** Disks.N.BackupMode为"Custom"时，进行设置, 以24小时级为基础进行倍数扩增，如24、48、72、96。 */
        @UCloudParam("Hour")
        private String hour;

        /** Disks.N.BackupMode为"Custom"时，进行设置, 以5天级为基础进行倍数扩增，如5、10、15、20、25、30。 */
        @UCloudParam("Day")
        private String day;

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getHour() {
            return hour;
        }

        public void setHour(String hour) {
            this.hour = hour;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }
    }

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
