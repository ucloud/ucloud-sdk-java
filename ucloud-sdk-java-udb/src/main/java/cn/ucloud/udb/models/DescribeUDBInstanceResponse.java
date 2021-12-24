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
package cn.ucloud.udb.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeUDBInstanceResponse extends Response {

    /** DB实例信息列表 UDBInstanceSet */
    @SerializedName("DataSet")
    private List<UDBInstanceSet> dataSet;

    /** 用户db组的数量，对于 mysql: 主从结对数量，没有slave，则只有master mongodb: 副本集数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<UDBInstanceSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDBInstanceSet> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class UFileDataSet extends Response {

        /** Ufile的令牌tokenid */
        @SerializedName("TokenID")
        private String tokenID;

        /** bucket名称 */
        @SerializedName("Bucket")
        private String bucket;

        public String getTokenID() {
            return tokenID;
        }

        public void setTokenID(String tokenID) {
            this.tokenID = tokenID;
        }

        public String getBucket() {
            return bucket;
        }

        public void setBucket(String bucket) {
            this.bucket = bucket;
        }
    }

    public static class UDBInstanceSet extends Response {

        /** DB实例所在可用区 */
        @SerializedName("Zone")
        private String zone;

        /**
         * 当DB类型为mongodb时，返回该实例所在集群中的角色，包括：mongos、configsrv_sccc、configsrv_csrs、shardsrv_datanode、shardsrv_arbiter，其中congfigsrv分为sccc和csrs两种模式，shardsrv分为datanode和arbiter两种模式
         */
        @SerializedName("ClusterRole")
        private String clusterRole;

        /** DB实例id */
        @SerializedName("DBId")
        private String dbId;

        /** 实例名称，至少6位 */
        @SerializedName("Name")
        private String name;

        /**
         * DB类型id，mysql/mongodb按版本细分各有一个id 目前id的取值范围为[1,7],数值对应的版本如下：
         * 1：mysql-5.5，2：mysql-5.1，3：percona-5.5 4：mongodb-2.4，5：mongodb-2.6，6：mysql-5.6，
         * 7：percona-5.6
         */
        @SerializedName("DBTypeId")
        private String dbTypeId;

        /** DB实例使用的配置参数组id */
        @SerializedName("ParamGroupId")
        private Integer paramGroupId;

        /** 管理员帐户名，默认root */
        @SerializedName("AdminUser")
        private String adminUser;

        /** DB实例虚ip */
        @SerializedName("VirtualIP")
        private String virtualIP;

        /** DB实例虚ip的mac地址 */
        @SerializedName("VirtualIPMac")
        private String virtualIPMac;

        /** VPC的ID */
        @SerializedName("VPCId")
        private String vpcId;

        /** 子网ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /** UDB数据库机型 */
        @SerializedName("InstanceType")
        private String instanceType;

        /** UDB数据库机型ID */
        @SerializedName("InstanceTypeId")
        private Integer instanceTypeId;

        /** 获取资源其他信息 */
        @SerializedName("Tag")
        private String tag;

        /** 端口号，mysql默认3306，mongodb默认27017 */
        @SerializedName("Port")
        private Integer port;

        /** 对mysql的slave而言是master的DBId，对master则为空， 对mongodb则是副本集id */
        @SerializedName("SrcDBId")
        private String srcDBId;

        /** 备份策略，不可修改，备份文件保留的数量，默认7次 */
        @SerializedName("BackupCount")
        private Integer backupCount;

        /** 备份策略，不可修改，开始时间，单位小时计，默认3点 */
        @SerializedName("BackupBeginTime")
        private Integer backupBeginTime;

        /** 备份策略，一天内备份时间间隔，单位小时，默认24小时 */
        @SerializedName("BackupDuration")
        private Integer backupDuration;

        /** 备份策略，备份黑名单，mongodb则不适用 */
        @SerializedName("BackupBlacklist")
        private String backupBlacklist;

        /**
         * DB状态标记
         * Init：初始化中，Fail：安装失败，Starting：启动中，Running：运行，Shutdown：关闭中，Shutoff：已关闭，Delete：已删除，Upgrading：升级中，Promoting：提升为独库进行中，Recovering：恢复中，Recover
         * fail：恢复失败
         */
        @SerializedName("State")
        private String state;

        /** DB实例创建时间，采用UTC计时时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** DB实例修改时间，采用UTC计时时间戳 */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** DB实例过期时间，采用UTC计时时间戳 */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /** Year， Month， Dynamic，Trial，默认: Dynamic */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 内存限制(MB)，默认根据配置机型 */
        @SerializedName("MemoryLimit")
        private Integer memoryLimit;

        /** 磁盘空间(GB), 默认根据配置机型 */
        @SerializedName("DiskSpace")
        private Integer diskSpace;

        /** 是否使用SSD */
        @SerializedName("UseSSD")
        private Boolean useSSD;

        /** SSD类型，SATA/PCI-E/NVMe */
        @SerializedName("SSDType")
        private String ssdType;

        /** DB实例角色，mysql区分master/slave，mongodb多种角色 */
        @SerializedName("Role")
        private String role;

        /** DB实例磁盘已使用空间，单位GB */
        @SerializedName("DiskUsedSize")
        private Double diskUsedSize;

        /** DB实例数据文件大小，单位GB */
        @SerializedName("DataFileSize")
        private Double dataFileSize;

        /** DB实例系统文件大小，单位GB */
        @SerializedName("SystemFileSize")
        private Double systemFileSize;

        /** DB实例日志文件大小，单位GB */
        @SerializedName("LogFileSize")
        private Double logFileSize;

        /**
         * 备份日期标记位。共7位,每一位为一周中一天的备份情况 0表示关闭当天备份,1表示打开当天备份。最右边的一位 为星期天的备份开关，其余从右到左依次为星期一到星期
         * 六的备份配置开关，每周必须至少设置两天备份。 例如：1100000 表示打开星期六和星期五的自动备份功能
         */
        @SerializedName("BackupDate")
        private String backupDate;

        /** UDB实例模式类型, 可选值如下: “Normal”： 普通版UDB实例 “HA”: 高可用版UDB实例 */
        @SerializedName("InstanceMode")
        private String instanceMode;

        /**
         * 如果在需要返回从库的场景下，返回该DB实例的所有从库DB实例信息列表。列表中每一个元素的内容同UDBSlaveInstanceSet
         * 。如果这个DB实例没有从库的情况下，此时返回一个空的列表
         */
        @SerializedName("DataSet")
        private List<UDBSlaveInstanceSet> dataSet;

        /** 跨可用区高可用备库所在可用区 */
        @SerializedName("BackupZone")
        private String backupZone;

        /** 该实例的ipv6地址 */
        @SerializedName("IPv6Address")
        private String iPv6Address;

        /** 用户转存备份到自己的UFILE配置, 结构参考UFileDataSet */
        @SerializedName("UserUFileData")
        private UFileDataSet userUFileData;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getClusterRole() {
            return clusterRole;
        }

        public void setClusterRole(String clusterRole) {
            this.clusterRole = clusterRole;
        }

        public String getDBId() {
            return dbId;
        }

        public void setDBId(String dbId) {
            this.dbId = dbId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDBTypeId() {
            return dbTypeId;
        }

        public void setDBTypeId(String dbTypeId) {
            this.dbTypeId = dbTypeId;
        }

        public Integer getParamGroupId() {
            return paramGroupId;
        }

        public void setParamGroupId(Integer paramGroupId) {
            this.paramGroupId = paramGroupId;
        }

        public String getAdminUser() {
            return adminUser;
        }

        public void setAdminUser(String adminUser) {
            this.adminUser = adminUser;
        }

        public String getVirtualIP() {
            return virtualIP;
        }

        public void setVirtualIP(String virtualIP) {
            this.virtualIP = virtualIP;
        }

        public String getVirtualIPMac() {
            return virtualIPMac;
        }

        public void setVirtualIPMac(String virtualIPMac) {
            this.virtualIPMac = virtualIPMac;
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

        public String getInstanceType() {
            return instanceType;
        }

        public void setInstanceType(String instanceType) {
            this.instanceType = instanceType;
        }

        public Integer getInstanceTypeId() {
            return instanceTypeId;
        }

        public void setInstanceTypeId(Integer instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getSrcDBId() {
            return srcDBId;
        }

        public void setSrcDBId(String srcDBId) {
            this.srcDBId = srcDBId;
        }

        public Integer getBackupCount() {
            return backupCount;
        }

        public void setBackupCount(Integer backupCount) {
            this.backupCount = backupCount;
        }

        public Integer getBackupBeginTime() {
            return backupBeginTime;
        }

        public void setBackupBeginTime(Integer backupBeginTime) {
            this.backupBeginTime = backupBeginTime;
        }

        public Integer getBackupDuration() {
            return backupDuration;
        }

        public void setBackupDuration(Integer backupDuration) {
            this.backupDuration = backupDuration;
        }

        public String getBackupBlacklist() {
            return backupBlacklist;
        }

        public void setBackupBlacklist(String backupBlacklist) {
            this.backupBlacklist = backupBlacklist;
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

        public Integer getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
        }

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getMemoryLimit() {
            return memoryLimit;
        }

        public void setMemoryLimit(Integer memoryLimit) {
            this.memoryLimit = memoryLimit;
        }

        public Integer getDiskSpace() {
            return diskSpace;
        }

        public void setDiskSpace(Integer diskSpace) {
            this.diskSpace = diskSpace;
        }

        public Boolean getUseSSD() {
            return useSSD;
        }

        public void setUseSSD(Boolean useSSD) {
            this.useSSD = useSSD;
        }

        public String getSSDType() {
            return ssdType;
        }

        public void setSSDType(String ssdType) {
            this.ssdType = ssdType;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public Double getDiskUsedSize() {
            return diskUsedSize;
        }

        public void setDiskUsedSize(Double diskUsedSize) {
            this.diskUsedSize = diskUsedSize;
        }

        public Double getDataFileSize() {
            return dataFileSize;
        }

        public void setDataFileSize(Double dataFileSize) {
            this.dataFileSize = dataFileSize;
        }

        public Double getSystemFileSize() {
            return systemFileSize;
        }

        public void setSystemFileSize(Double systemFileSize) {
            this.systemFileSize = systemFileSize;
        }

        public Double getLogFileSize() {
            return logFileSize;
        }

        public void setLogFileSize(Double logFileSize) {
            this.logFileSize = logFileSize;
        }

        public String getBackupDate() {
            return backupDate;
        }

        public void setBackupDate(String backupDate) {
            this.backupDate = backupDate;
        }

        public String getInstanceMode() {
            return instanceMode;
        }

        public void setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
        }

        public List<UDBSlaveInstanceSet> getDataSet() {
            return dataSet;
        }

        public void setDataSet(List<UDBSlaveInstanceSet> dataSet) {
            this.dataSet = dataSet;
        }

        public String getBackupZone() {
            return backupZone;
        }

        public void setBackupZone(String backupZone) {
            this.backupZone = backupZone;
        }

        public String getIPv6Address() {
            return iPv6Address;
        }

        public void setIPv6Address(String iPv6Address) {
            this.iPv6Address = iPv6Address;
        }

        public UFileDataSet getUserUFileData() {
            return userUFileData;
        }

        public void setUserUFileData(UFileDataSet userUFileData) {
            this.userUFileData = userUFileData;
        }
    }

    public static class UDBSlaveInstanceSet extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** DB实例id */
        @SerializedName("DBId")
        private String dbId;

        /** 实例名称，至少6位 */
        @SerializedName("Name")
        private String name;

        /**
         * DB类型id，mysql/mongodb按版本细分各有一个id 目前id的取值范围为[1,7],数值对应的版本如下：
         * 1：mysql-5.5，2：mysql-5.1，3：percona-5.5 4：mongodb-2.4，5：mongodb-2.6，6：mysql-5.6，
         * 7：percona-5.6
         */
        @SerializedName("DBTypeId")
        private String dbTypeId;

        /** DB实例使用的配置参数组id */
        @SerializedName("ParamGroupId")
        private Integer paramGroupId;

        /** 管理员帐户名，默认root */
        @SerializedName("AdminUser")
        private String adminUser;

        /** DB实例虚ip */
        @SerializedName("VirtualIP")
        private String virtualIP;

        /** DB实例虚ip的mac地址 */
        @SerializedName("VirtualIPMac")
        private String virtualIPMac;

        /** 端口号，mysql默认3306，mongodb默认27017 */
        @SerializedName("Port")
        private Integer port;

        /** 对mysql的slave而言是master的DBId，对master则为空， 对mongodb则是副本集id */
        @SerializedName("SrcDBId")
        private String srcDBId;

        /** 备份策略，不可修改，备份文件保留的数量，默认7次 */
        @SerializedName("BackupCount")
        private Integer backupCount;

        /** 备份策略，不可修改，开始时间，单位小时计，默认3点 */
        @SerializedName("BackupBeginTime")
        private Integer backupBeginTime;

        /** 备份策略，一天内备份时间间隔，单位小时，默认24小时 */
        @SerializedName("BackupDuration")
        private Integer backupDuration;

        /** 备份策略，备份黑名单，mongodb则不适用 */
        @SerializedName("BackupBlacklist")
        private String backupBlacklist;

        /**
         * DB状态标记
         * Init：初始化中，Fail：安装失败，Starting：启动中，Running：运行，Shutdown：关闭中，Shutoff：已关闭，Delete：已删除，Upgrading：升级中，Promoting：提升为独库进行中，Recovering：恢复中，Recover
         * fail：恢复失败
         */
        @SerializedName("State")
        private String state;

        /** DB实例创建时间，采用UTC计时时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** DB实例修改时间，采用UTC计时时间戳 */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** DB实例过期时间，采用UTC计时时间戳 */
        @SerializedName("ExpiredTime")
        private Integer expiredTime;

        /** Year， Month， Dynamic，Trial，默认: Dynamic */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 内存限制(MB)，默认根据配置机型 */
        @SerializedName("MemoryLimit")
        private Integer memoryLimit;

        /** 磁盘空间(GB), 默认根据配置机型 */
        @SerializedName("DiskSpace")
        private Integer diskSpace;

        /** 是否使用SSD */
        @SerializedName("UseSSD")
        private Boolean useSSD;

        /** SSD类型，SATA/PCI-E */
        @SerializedName("SSDType")
        private String ssdType;

        /** DB实例角色，mysql区分master/slave，mongodb多种角色 */
        @SerializedName("Role")
        private String role;

        /** DB实例磁盘已使用空间，单位GB */
        @SerializedName("DiskUsedSize")
        private Double diskUsedSize;

        /** DB实例数据文件大小，单位GB */
        @SerializedName("DataFileSize")
        private Double dataFileSize;

        /** DB实例系统文件大小，单位GB */
        @SerializedName("SystemFileSize")
        private Double systemFileSize;

        /** DB实例日志文件大小，单位GB */
        @SerializedName("LogFileSize")
        private Double logFileSize;

        /**
         * 备份日期标记位。共7位,每一位为一周中一天的备份情况 0表示关闭当天备份,1表示打开当天备份。最右边的一位 为星期天的备份开关，其余从右到左依次为星期一到星期
         * 六的备份配置开关，每周必须至少设置两天备份。 例如：1100000 表示打开星期六和星期五的自动备份功能
         */
        @SerializedName("BackupDate")
        private String backupDate;

        /** UDB实例模式类型, 可选值如下: "Normal": 普通版UDB实例;"HA": 高可用版UDB实例 */
        @SerializedName("InstanceMode")
        private String instanceMode;

        /**
         * 当DB类型为mongodb时，返回该实例所在集群中的角色，包括：mongos、configsrv_sccc、configsrv_csrs、shardsrv_datanode、shardsrv_arbiter，其中congfigsrv分为sccc和csrs两种模式，shardsrv分为datanode和arbiter两种模式
         */
        @SerializedName("ClusterRole")
        private String clusterRole;

        /** 子网ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /** VPC的ID */
        @SerializedName("VPCId")
        private String vpcId;

        /** UDB数据库机型 */
        @SerializedName("InstanceType")
        private String instanceType;

        /** UDB数据库机型ID */
        @SerializedName("InstanceTypeId")
        private Integer instanceTypeId;

        /** 获取资源其他信息 */
        @SerializedName("Tag")
        private String tag;

        /** 获取该实例的IPv6地址 */
        @SerializedName("IPv6Address")
        private String iPv6Address;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getDBId() {
            return dbId;
        }

        public void setDBId(String dbId) {
            this.dbId = dbId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDBTypeId() {
            return dbTypeId;
        }

        public void setDBTypeId(String dbTypeId) {
            this.dbTypeId = dbTypeId;
        }

        public Integer getParamGroupId() {
            return paramGroupId;
        }

        public void setParamGroupId(Integer paramGroupId) {
            this.paramGroupId = paramGroupId;
        }

        public String getAdminUser() {
            return adminUser;
        }

        public void setAdminUser(String adminUser) {
            this.adminUser = adminUser;
        }

        public String getVirtualIP() {
            return virtualIP;
        }

        public void setVirtualIP(String virtualIP) {
            this.virtualIP = virtualIP;
        }

        public String getVirtualIPMac() {
            return virtualIPMac;
        }

        public void setVirtualIPMac(String virtualIPMac) {
            this.virtualIPMac = virtualIPMac;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getSrcDBId() {
            return srcDBId;
        }

        public void setSrcDBId(String srcDBId) {
            this.srcDBId = srcDBId;
        }

        public Integer getBackupCount() {
            return backupCount;
        }

        public void setBackupCount(Integer backupCount) {
            this.backupCount = backupCount;
        }

        public Integer getBackupBeginTime() {
            return backupBeginTime;
        }

        public void setBackupBeginTime(Integer backupBeginTime) {
            this.backupBeginTime = backupBeginTime;
        }

        public Integer getBackupDuration() {
            return backupDuration;
        }

        public void setBackupDuration(Integer backupDuration) {
            this.backupDuration = backupDuration;
        }

        public String getBackupBlacklist() {
            return backupBlacklist;
        }

        public void setBackupBlacklist(String backupBlacklist) {
            this.backupBlacklist = backupBlacklist;
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

        public Integer getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
        }

        public Integer getExpiredTime() {
            return expiredTime;
        }

        public void setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getMemoryLimit() {
            return memoryLimit;
        }

        public void setMemoryLimit(Integer memoryLimit) {
            this.memoryLimit = memoryLimit;
        }

        public Integer getDiskSpace() {
            return diskSpace;
        }

        public void setDiskSpace(Integer diskSpace) {
            this.diskSpace = diskSpace;
        }

        public Boolean getUseSSD() {
            return useSSD;
        }

        public void setUseSSD(Boolean useSSD) {
            this.useSSD = useSSD;
        }

        public String getSSDType() {
            return ssdType;
        }

        public void setSSDType(String ssdType) {
            this.ssdType = ssdType;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public Double getDiskUsedSize() {
            return diskUsedSize;
        }

        public void setDiskUsedSize(Double diskUsedSize) {
            this.diskUsedSize = diskUsedSize;
        }

        public Double getDataFileSize() {
            return dataFileSize;
        }

        public void setDataFileSize(Double dataFileSize) {
            this.dataFileSize = dataFileSize;
        }

        public Double getSystemFileSize() {
            return systemFileSize;
        }

        public void setSystemFileSize(Double systemFileSize) {
            this.systemFileSize = systemFileSize;
        }

        public Double getLogFileSize() {
            return logFileSize;
        }

        public void setLogFileSize(Double logFileSize) {
            this.logFileSize = logFileSize;
        }

        public String getBackupDate() {
            return backupDate;
        }

        public void setBackupDate(String backupDate) {
            this.backupDate = backupDate;
        }

        public String getInstanceMode() {
            return instanceMode;
        }

        public void setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
        }

        public String getClusterRole() {
            return clusterRole;
        }

        public void setClusterRole(String clusterRole) {
            this.clusterRole = clusterRole;
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

        public String getInstanceType() {
            return instanceType;
        }

        public void setInstanceType(String instanceType) {
            this.instanceType = instanceType;
        }

        public Integer getInstanceTypeId() {
            return instanceTypeId;
        }

        public void setInstanceTypeId(Integer instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getIPv6Address() {
            return iPv6Address;
        }

        public void setIPv6Address(String iPv6Address) {
            this.iPv6Address = iPv6Address;
        }
    }
}
