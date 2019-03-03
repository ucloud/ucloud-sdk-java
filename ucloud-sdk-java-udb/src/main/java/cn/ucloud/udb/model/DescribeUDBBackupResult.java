package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取备份列表 结果类
 * @Author : codezhang
 * @Date : 2019-03-03 19:22
 **/
public class DescribeUDBBackupResult extends BaseResponseResult {

    public static class UDBBackup {

        /**
         * 备份id
         */
        @SerializedName("BackupId")
        private String backupId;


        /**
         * 备份名称
         */
        @SerializedName("BackupName")
        private String backupName;


        /**
         * 备份时间(Unix时间戳)
         */
        @SerializedName("BackupTime")
        private Integer backupTime;

        /**
         * 备份文件大小(字节)
         */
        @SerializedName("BackupSize")
        private Integer backupSize;

        /**
         * 备份类型,取值为0或1,0表示自动，1表示手动
         */
        @SerializedName("BackupType")
        private Integer backupType;

        /**
         * 备份状态
         * Backuping // 备份中
         * Success // 备份成功
         * Failed // 备份失败
         * Expired // 备份过期
         */
        @SerializedName("State")
        private String state;

        /**
         * 数据库实例ID
         */
        @SerializedName("DBId")
        private String dbId;

        /**
         * 对应的db名称
         */
        @SerializedName("DBName")
        private String dbName;

        /**
         * 对应的db名称
         */
        @SerializedName("Zone")
        private String zone;

        /**
         * 跨机房高可用备库所在可用区
         */
        @SerializedName("BackupZone")
        private String backupZone;

        /**
         * 备份完成时间(Unix时间戳)
         */
        @SerializedName("BackupEndTime")
        private Integer backupEndTime;

        public String getBackupId() {
            return backupId;
        }

        public void setBackupId(String backupId) {
            this.backupId = backupId;
        }

        public String getBackupName() {
            return backupName;
        }

        public void setBackupName(String backupName) {
            this.backupName = backupName;
        }

        public Integer getBackupTime() {
            return backupTime;
        }

        public void setBackupTime(Integer backupTime) {
            this.backupTime = backupTime;
        }

        public Integer getBackupSize() {
            return backupSize;
        }

        public void setBackupSize(Integer backupSize) {
            this.backupSize = backupSize;
        }

        public Integer getBackupType() {
            return backupType;
        }

        public void setBackupType(Integer backupType) {
            this.backupType = backupType;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getDbId() {
            return dbId;
        }

        public void setDbId(String dbId) {
            this.dbId = dbId;
        }

        public String getDbName() {
            return dbName;
        }

        public void setDbName(String dbName) {
            this.dbName = dbName;
        }

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

        public Integer getBackupEndTime() {
            return backupEndTime;
        }

        public void setBackupEndTime(Integer backupEndTime) {
            this.backupEndTime = backupEndTime;
        }

        @Override
        public String toString() {
            return "UDBBackup{" +
                    "backupId='" + backupId + '\'' +
                    ", backupName='" + backupName + '\'' +
                    ", backupTime=" + backupTime +
                    ", backupSize=" + backupSize +
                    ", backupType=" + backupType +
                    ", state='" + state + '\'' +
                    ", dbId='" + dbId + '\'' +
                    ", dbName='" + dbName + '\'' +
                    ", zone='" + zone + '\'' +
                    ", backupZone='" + backupZone + '\'' +
                    ", backupEndTime=" + backupEndTime +
                    '}';
        }
    }


    /**
     * 满足条件备份总数，如果指定dbid，则是该db备份总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 备份信息 参照UDBBackup
     */
    @SerializedName("DataSet")
    private List<UDBBackup> backups;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UDBBackup> getBackups() {
        return backups;
    }

    public void setBackups(List<UDBBackup> backups) {
        this.backups = backups;
    }

    @Override
    public String toString() {
        return "DescribeUDBBackupResult{" +
                "totalCount=" + totalCount +
                ", backups=" + backups +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
