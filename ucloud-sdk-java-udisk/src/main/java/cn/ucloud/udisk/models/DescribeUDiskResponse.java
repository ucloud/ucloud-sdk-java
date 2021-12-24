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
package cn.ucloud.udisk.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeUDiskResponse extends Response {

    /** JSON 格式的UDisk数据列表, 每项参数可见下面 UDiskDataSet: false */
    @SerializedName("DataSet")
    private List<UDiskDataSet> dataSet;

    /** 根据过滤条件得到的总数: false */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<UDiskDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDiskDataSet> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class UDiskDataSet extends Response {

        /** 可用区: false */
        @SerializedName("Zone")
        private String zone;

        /** UDisk实例Id: false */
        @SerializedName("UDiskId")
        private String uDiskId;

        /** 实例名称: false */
        @SerializedName("Name")
        private String name;

        /** 容量单位GB: false */
        @SerializedName("Size")
        private Integer size;

        /**
         * 状态:Available(可用),Attaching(挂载中), InUse(已挂载), Detaching(卸载中), Initializating(分配中),
         * Failed(创建失败),Cloning(克隆中),Restoring(恢复中),RestoreFailed(恢复失败),: false
         */
        @SerializedName("Status")
        private String status;

        /** 创建时间: false */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 过期时间: false */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /** 挂载的UHost的Id。【即将废弃，建议使用HostId】: false */
        @SerializedName("UHostId")
        private String uHostId;

        /** 挂载的UHost的Name。【即将废弃，建议使用HostName】: false */
        @SerializedName("UHostName")
        private String uHostName;

        /** 挂载的UHost的IP。【即将废弃，建议使用HostIP】: false */
        @SerializedName("UHostIP")
        private String uHostIP;

        /** 挂载的Host的Id: false */
        @SerializedName("HostId")
        private String hostId;

        /** 挂载的Host的Name: false */
        @SerializedName("HostName")
        private String hostName;

        /** 挂载的Host的IP: false */
        @SerializedName("HostIP")
        private String hostIP;

        /** 挂载的设备名称: false */
        @SerializedName("DeviceName")
        private String deviceName;

        /** Year,Month,Dynamic,Trial,Postpay: false */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 业务组名称: false */
        @SerializedName("Tag")
        private String tag;

        /** 资源是否过期，过期:"Yes", 未过期:"No": false */
        @SerializedName("IsExpire")
        private String isExpire;

        /** 是否支持数据方舟，支持:"2.0", 不支持:"1.0": false */
        @SerializedName("Version")
        private String version;

        /** 是否开启数据方舟，开启:"Yes", 不支持:"No": false */
        @SerializedName("UDataArkMode")
        private String uDataArkMode;

        /** 该盘快照个数: false */
        @SerializedName("SnapshotCount")
        private Integer snapshotCount;

        /** 该盘快照上限: false */
        @SerializedName("SnapshotLimit")
        private Integer snapshotLimit;

        /**
         * 请求中的ProtocolVersion字段为1时，需结合IsBoot确定具体磁盘类型:普通数据盘：DiskType:"CLOUD_NORMAL",IsBoot:"False"；
         * 普通系统盘：DiskType:"CLOUD_NORMAL",IsBoot:"True"；SSD数据盘：DiskType:"CLOUD_SSD",IsBoot:"False"；SSD系统盘：DiskType:"CLOUD_SSD",IsBoot:"True"；RSSD数据盘：DiskType:"CLOUD_RSSD",IsBoot:"False"；RSSD系统盘：DiskType:"CLOUD_RSSD",IsBoot:"True"；高效数据盘：DiskType:"CLOUD_EFFICIENCY",IsBoot:"False"；高效系统盘：DiskType:"CLOUD_EFFICIENCY",IsBoot:"True"。请求中的ProtocolVersion字段为0或没有该字段时，云硬盘类型参照如下:普通数据盘：DataDisk；普通系统盘：SystemDisk；SSD数据盘：SSDDataDisk；SSD系统盘：SSDSystemDisk；RSSD数据盘：RSSDDataDisk；RSSD系统盘：RSSDSystemDisk；高效数据盘：EfficiencyDataDisk；高效系统盘：EfficiencySystemDisk。:
         * false
         */
        @SerializedName("DiskType")
        private String diskType;

        /** 是否支持克隆，1支持 ，0不支持: false */
        @SerializedName("CloneEnable")
        private Integer cloneEnable;

        /** 是否支持快照，1支持 ，0不支持: false */
        @SerializedName("SnapEnable")
        private Integer snapEnable;

        /** 是否支持开启方舟，1支持 ，0不支持: false */
        @SerializedName("ArkSwitchEnable")
        private Integer arkSwitchEnable;

        /** 是否是加密盘，是:"Yes", 否:"No": false */
        @SerializedName("UKmsMode")
        private String uKmsMode;

        /** 该盘的cmk id: false */
        @SerializedName("CmkId")
        private String cmkId;

        /** 该盘的密文密钥: false */
        @SerializedName("DataKey")
        private String dataKey;

        /** 该盘cmk的状态, Enabled(正常)，Disabled(失效)，Deleted(删除)，NoCmkId(非加密盘): false */
        @SerializedName("CmkIdStatus")
        private String cmkIdStatus;

        /** cmk id 别名: false */
        @SerializedName("CmkIdAlias")
        private String cmkIdAlias;

        /** 是否是系统盘，是："True", 否："False": false */
        @SerializedName("IsBoot")
        private String isBoot;

        /** 该盘的备份方式。快照服务："SnapshotService"；数据方舟："UDataArk"；无备份方式："": false */
        @SerializedName("BackupMode")
        private String backupMode;

        /** RDMA集群id，仅RSSD返回该值；其他类型云盘返回""。当云盘的此值与快杰云主机的RdmaClusterId相同时，RSSD可以挂载到这台云主机。: false */
        @SerializedName("RdmaClusterId")
        private String rdmaClusterId;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getUDiskId() {
            return uDiskId;
        }

        public void setUDiskId(String uDiskId) {
            this.uDiskId = uDiskId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
        }

        public String getUHostId() {
            return uHostId;
        }

        public void setUHostId(String uHostId) {
            this.uHostId = uHostId;
        }

        public String getUHostName() {
            return uHostName;
        }

        public void setUHostName(String uHostName) {
            this.uHostName = uHostName;
        }

        public String getUHostIP() {
            return uHostIP;
        }

        public void setUHostIP(String uHostIP) {
            this.uHostIP = uHostIP;
        }

        public String getHostId() {
            return hostId;
        }

        public void setHostId(String hostId) {
            this.hostId = hostId;
        }

        public String getHostName() {
            return hostName;
        }

        public void setHostName(String hostName) {
            this.hostName = hostName;
        }

        public String getHostIP() {
            return hostIP;
        }

        public void setHostIP(String hostIP) {
            this.hostIP = hostIP;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getIsExpire() {
            return isExpire;
        }

        public void setIsExpire(String isExpire) {
            this.isExpire = isExpire;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getUDataArkMode() {
            return uDataArkMode;
        }

        public void setUDataArkMode(String uDataArkMode) {
            this.uDataArkMode = uDataArkMode;
        }

        public Integer getSnapshotCount() {
            return snapshotCount;
        }

        public void setSnapshotCount(Integer snapshotCount) {
            this.snapshotCount = snapshotCount;
        }

        public Integer getSnapshotLimit() {
            return snapshotLimit;
        }

        public void setSnapshotLimit(Integer snapshotLimit) {
            this.snapshotLimit = snapshotLimit;
        }

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }

        public Integer getCloneEnable() {
            return cloneEnable;
        }

        public void setCloneEnable(Integer cloneEnable) {
            this.cloneEnable = cloneEnable;
        }

        public Integer getSnapEnable() {
            return snapEnable;
        }

        public void setSnapEnable(Integer snapEnable) {
            this.snapEnable = snapEnable;
        }

        public Integer getArkSwitchEnable() {
            return arkSwitchEnable;
        }

        public void setArkSwitchEnable(Integer arkSwitchEnable) {
            this.arkSwitchEnable = arkSwitchEnable;
        }

        public String getUKmsMode() {
            return uKmsMode;
        }

        public void setUKmsMode(String uKmsMode) {
            this.uKmsMode = uKmsMode;
        }

        public String getCmkId() {
            return cmkId;
        }

        public void setCmkId(String cmkId) {
            this.cmkId = cmkId;
        }

        public String getDataKey() {
            return dataKey;
        }

        public void setDataKey(String dataKey) {
            this.dataKey = dataKey;
        }

        public String getCmkIdStatus() {
            return cmkIdStatus;
        }

        public void setCmkIdStatus(String cmkIdStatus) {
            this.cmkIdStatus = cmkIdStatus;
        }

        public String getCmkIdAlias() {
            return cmkIdAlias;
        }

        public void setCmkIdAlias(String cmkIdAlias) {
            this.cmkIdAlias = cmkIdAlias;
        }

        public String getIsBoot() {
            return isBoot;
        }

        public void setIsBoot(String isBoot) {
            this.isBoot = isBoot;
        }

        public String getBackupMode() {
            return backupMode;
        }

        public void setBackupMode(String backupMode) {
            this.backupMode = backupMode;
        }

        public String getRdmaClusterId() {
            return rdmaClusterId;
        }

        public void setRdmaClusterId(String rdmaClusterId) {
            this.rdmaClusterId = rdmaClusterId;
        }
    }
}
