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
package cn.ucloud.upgsql.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetUPgSQLInstanceResponse extends Response {

    /** */
    @SerializedName("DataSet")
    private UDBInstance dataSet;

    public UDBInstance getDataSet() {
        return dataSet;
    }

    public void setDataSet(UDBInstance dataSet) {
        this.dataSet = dataSet;
    }

    public static class UDBInstance extends Response {

        /** DB实例所在可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 跨可用区高可用备库所在可用区 */
        @SerializedName("BackupZone")
        private String backupZone;

        /** DB实例id */
        @SerializedName("InstanceID")
        private String instanceID;

        /** 实例名称 */
        @SerializedName("Name")
        private String name;

        /** DB 版本 */
        @SerializedName("DBVersion")
        private String dbVersion;

        /** DB实例使用的配置参数组id */
        @SerializedName("ParamGroupID")
        private Integer paramGroupID;

        /** 管理员帐户名，默认root */
        @SerializedName("AdminUser")
        private String adminUser;

        /** DBip */
        @SerializedName("IP")
        private String ip;

        /** DB port */
        @SerializedName("Port")
        private Integer port;

        /** VPC的ID */
        @SerializedName("VPCID")
        private String vpcid;

        /** 子网ID */
        @SerializedName("SubnetID")
        private String subnetID;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 备份文件保留的数量，默认7次 */
        @SerializedName("BackupCount")
        private Integer backupCount;

        /** 备份开始时间，单位小时计，默认3点 */
        @SerializedName("BackupBeginTime")
        private Integer backupBeginTime;

        /** 备份的时间段，范围[0,23] */
        @SerializedName("BackupTimeRange")
        private Integer backupTimeRange;

        /**
         * 用于设置备份策略的备份日期标记位。共7位,每一位为一周中一天的备份情况 0表示关闭当天备份,1表示打开当天备份。最右边的一位 为星期天的备份开关，其余从右到左依次为星期一到星期
         * 六的备份配置开关，每周必须至少设置两天备份。 例如：1100000 表示打开星期六和星期五的自动备份功能
         */
        @SerializedName("BackupDate")
        private String backupDate;

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

        /** 内存限制(MB)，默认根据配置机型 */
        @SerializedName("MemoryLimit")
        private Integer memoryLimit;

        /** 磁盘空间(GB), 默认根据配置机型 */
        @SerializedName("DiskSpace")
        private Integer diskSpace;

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

        /** Normal/HA,普通/高可用 */
        @SerializedName("InstanceMode")
        private String instanceMode;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getBackupZone() {
            return backupZone;
        }

        public void setBackupZone(String backupZone) {
            this.backupZone = backupZone;
        }

        public String getInstanceID() {
            return instanceID;
        }

        public void setInstanceID(String instanceID) {
            this.instanceID = instanceID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDBVersion() {
            return dbVersion;
        }

        public void setDBVersion(String dbVersion) {
            this.dbVersion = dbVersion;
        }

        public Integer getParamGroupID() {
            return paramGroupID;
        }

        public void setParamGroupID(Integer paramGroupID) {
            this.paramGroupID = paramGroupID;
        }

        public String getAdminUser() {
            return adminUser;
        }

        public void setAdminUser(String adminUser) {
            this.adminUser = adminUser;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getVPCID() {
            return vpcid;
        }

        public void setVPCID(String vpcid) {
            this.vpcid = vpcid;
        }

        public String getSubnetID() {
            return subnetID;
        }

        public void setSubnetID(String subnetID) {
            this.subnetID = subnetID;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
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

        public Integer getBackupTimeRange() {
            return backupTimeRange;
        }

        public void setBackupTimeRange(Integer backupTimeRange) {
            this.backupTimeRange = backupTimeRange;
        }

        public String getBackupDate() {
            return backupDate;
        }

        public void setBackupDate(String backupDate) {
            this.backupDate = backupDate;
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

        public String getInstanceMode() {
            return instanceMode;
        }

        public void setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
        }
    }
}
