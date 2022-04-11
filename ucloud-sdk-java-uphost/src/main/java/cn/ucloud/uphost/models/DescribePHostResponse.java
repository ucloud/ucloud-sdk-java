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
package cn.ucloud.uphost.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribePHostResponse extends Response {

    /** 满足条件的PHost总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** PHost资源列表，参见 PHostSet */
    @SerializedName("PHostSet")
    private List<PHostSet> pHostSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<PHostSet> getPHostSet() {
        return pHostSet;
    }

    public void setPHostSet(List<PHostSet> pHostSet) {
        this.pHostSet = pHostSet;
    }

    public static class PHostSet extends Response {

        /** 可用区，参见 [可用区列表](../summary/regionlist.html) */
        @SerializedName("Zone")
        private String zone;

        /** PHost资源ID */
        @SerializedName("PHostId")
        private String pHostId;

        /** 物理机序列号 */
        @SerializedName("SN")
        private String sn;

        /**
         * 物理云主机状态。枚举值：\\ > 初始化:Initializing; \\ > 启动中：Starting； \\ > 运行中：Running；\\ > 关机中：Stopping；
         * \\ > 安装失败：InstallFailed； \\ > 重启中：Rebooting；\\ > 关机：Stopped； \\ > 迁移中(裸金属云盘)：Migrating
         */
        @SerializedName("PMStatus")
        private String pmStatus;

        /** 物理机名称 */
        @SerializedName("Name")
        private String name;

        /** 物理机备注 */
        @SerializedName("Remark")
        private String remark;

        /** 业务组 */
        @SerializedName("Tag")
        private String tag;

        /** 镜像名称 */
        @SerializedName("ImageName")
        private String imageName;

        /** 操作系统名称 */
        @SerializedName("OSname")
        private String oSname;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 到期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 计费模式，枚举值为： Year，按年付费； Month，按月付费；默认为月付 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 电源状态，on 或 off */
        @SerializedName("PowerState")
        private String powerState;

        /** 物理机类型，参见DescribePHostMachineType返回值 */
        @SerializedName("PHostType")
        private String pHostType;

        /** 内存大小，单位：MB */
        @SerializedName("Memory")
        private Integer memory;

        /** CPU信息，见 PHostCPUSet */
        @SerializedName("CPUSet")
        private PHostCPUSet cpuSet;

        /** 磁盘信息，见 PHostDescDiskSet */
        @SerializedName("DiskSet")
        private List<PHostDescDiskSet> diskSet;

        /** IP信息，见 PHostIPSet */
        @SerializedName("IPSet")
        private List<PHostIPSet> ipSet;

        /** 网络环境。枚举值：千兆：1G ，万兆：10G */
        @SerializedName("Cluster")
        private String cluster;

        /** 自动续费 */
        @SerializedName("AutoRenew")
        private String autoRenew;

        /** 是否支持紧急登录 */
        @SerializedName("IsSupportKVM")
        private String isSupportKVM;

        /** 操作系统类型 */
        @SerializedName("OSType")
        private String osType;

        /** 组件信息（暂不支持） */
        @SerializedName("Components")
        private String components;

        /** 是否支持Raid。枚举值：Yes：支持；No：不支持。 */
        @SerializedName("RaidSupported")
        private String raidSupported;

        /** 物理云产品类型，枚举值：LocalDisk=>代表传统本地盘机型， CloudDisk=>云盘裸金属机型 */
        @SerializedName("PhostClass")
        private String phostClass;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getPHostId() {
            return pHostId;
        }

        public void setPHostId(String pHostId) {
            this.pHostId = pHostId;
        }

        public String getSN() {
            return sn;
        }

        public void setSN(String sn) {
            this.sn = sn;
        }

        public String getPMStatus() {
            return pmStatus;
        }

        public void setPMStatus(String pmStatus) {
            this.pmStatus = pmStatus;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getImageName() {
            return imageName;
        }

        public void setImageName(String imageName) {
            this.imageName = imageName;
        }

        public String getOSname() {
            return oSname;
        }

        public void setOSname(String oSname) {
            this.oSname = oSname;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getPowerState() {
            return powerState;
        }

        public void setPowerState(String powerState) {
            this.powerState = powerState;
        }

        public String getPHostType() {
            return pHostType;
        }

        public void setPHostType(String pHostType) {
            this.pHostType = pHostType;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public PHostCPUSet getCPUSet() {
            return cpuSet;
        }

        public void setCPUSet(PHostCPUSet cpuSet) {
            this.cpuSet = cpuSet;
        }

        public List<PHostDescDiskSet> getDiskSet() {
            return diskSet;
        }

        public void setDiskSet(List<PHostDescDiskSet> diskSet) {
            this.diskSet = diskSet;
        }

        public List<PHostIPSet> getIPSet() {
            return ipSet;
        }

        public void setIPSet(List<PHostIPSet> ipSet) {
            this.ipSet = ipSet;
        }

        public String getCluster() {
            return cluster;
        }

        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        public String getAutoRenew() {
            return autoRenew;
        }

        public void setAutoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
        }

        public String getIsSupportKVM() {
            return isSupportKVM;
        }

        public void setIsSupportKVM(String isSupportKVM) {
            this.isSupportKVM = isSupportKVM;
        }

        public String getOSType() {
            return osType;
        }

        public void setOSType(String osType) {
            this.osType = osType;
        }

        public String getComponents() {
            return components;
        }

        public void setComponents(String components) {
            this.components = components;
        }

        public String getRaidSupported() {
            return raidSupported;
        }

        public void setRaidSupported(String raidSupported) {
            this.raidSupported = raidSupported;
        }

        public String getPhostClass() {
            return phostClass;
        }

        public void setPhostClass(String phostClass) {
            this.phostClass = phostClass;
        }
    }

    public static class PHostIPSet extends Response {

        /** 国际: Internation， BGP: BGP， 内网: Private */
        @SerializedName("OperatorName")
        private String operatorName;

        /** IP资源ID(内网IP无资源ID)（待废弃） */
        @SerializedName("IPId")
        private String ipId;

        /** IP地址， */
        @SerializedName("IPAddr")
        private String ipAddr;

        /** MAC地址 */
        @SerializedName("MACAddr")
        private String macAddr;

        /** IP对应带宽，单位Mb，内网IP不显示带宽信息 */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** 子网ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /** VPC ID */
        @SerializedName("VPCId")
        private String vpcId;

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getIPId() {
            return ipId;
        }

        public void setIPId(String ipId) {
            this.ipId = ipId;
        }

        public String getIPAddr() {
            return ipAddr;
        }

        public void setIPAddr(String ipAddr) {
            this.ipAddr = ipAddr;
        }

        public String getMACAddr() {
            return macAddr;
        }

        public void setMACAddr(String macAddr) {
            this.macAddr = macAddr;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }
    }

    public static class PHostDescDiskSet extends Response {

        /** 单盘大小，单位GB */
        @SerializedName("Space")
        private Integer space;

        /** 磁盘数量 */
        @SerializedName("Count")
        private Integer count;

        /** 磁盘属性 */
        @SerializedName("Type")
        private String type;

        /** 磁盘名称，sys/data */
        @SerializedName("Name")
        private String name;

        /** 磁盘IO性能，单位MB/s（待废弃） */
        @SerializedName("IOCap")
        private Integer ioCap;

        /** 裸金属机型参数：磁盘盘符 */
        @SerializedName("Drive")
        private String drive;

        /** 裸金属机型参数：磁盘ID */
        @SerializedName("DiskId")
        private String diskId;

        /** 裸金属机型参数：是否是启动盘。True/False */
        @SerializedName("IsBoot")
        private String isBoot;

        public Integer getSpace() {
            return space;
        }

        public void setSpace(Integer space) {
            this.space = space;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getIOCap() {
            return ioCap;
        }

        public void setIOCap(Integer ioCap) {
            this.ioCap = ioCap;
        }

        public String getDrive() {
            return drive;
        }

        public void setDrive(String drive) {
            this.drive = drive;
        }

        public String getDiskId() {
            return diskId;
        }

        public void setDiskId(String diskId) {
            this.diskId = diskId;
        }

        public String getIsBoot() {
            return isBoot;
        }

        public void setIsBoot(String isBoot) {
            this.isBoot = isBoot;
        }
    }

    public static class PHostCPUSet extends Response {

        /** CPU型号 */
        @SerializedName("Model")
        private String model;

        /** CPU主频 */
        @SerializedName("Frequence")
        private Double frequence;

        /** CPU个数 */
        @SerializedName("Count")
        private Integer count;

        /** CPU核数 */
        @SerializedName("CoreCount")
        private Integer coreCount;

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public Double getFrequence() {
            return frequence;
        }

        public void setFrequence(Double frequence) {
            this.frequence = frequence;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getCoreCount() {
            return coreCount;
        }

        public void setCoreCount(Integer coreCount) {
            this.coreCount = coreCount;
        }
    }
}
