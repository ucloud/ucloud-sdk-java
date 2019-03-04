package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : UDB实例日志备份信息列表
 * @Author : codezhang
 * @Date : 2019-03-04 15:29
 **/
public class DescribeUDBLogPackageResult extends BaseResponseResult {

    public static class UDBLogPackage {

        /**
         * 备份id
         */
        @SerializedName("BackupId")
        private Integer backupId;

        /**
         * 备份名称
         */
        @SerializedName("BackupName")
        private String backupName;

        /**
         * 备份时间
         */
        @SerializedName("BackupTime")
        private Integer backupTime;

        /**
         * 备份文件大小
         */
        @SerializedName("BackupSize")
        private Integer backupSize;

        /**
         * 备份类型，包括2-binlog备份，3-slowlog备份
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
         * 所在可用区
         */
        @SerializedName("Zone")
        private String zone;

        /**
         * 跨可用区高可用备库所在可用区
         */
        @SerializedName("BackupZone")
        private String backupZone;

        public Integer getBackupId() {
            return backupId;
        }

        public void setBackupId(Integer backupId) {
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

        @Override
        public String toString() {
            return "UDBLogPackage{" +
                    "backupId=" + backupId +
                    ", backupName='" + backupName + '\'' +
                    ", backupTime=" + backupTime +
                    ", backupSize=" + backupSize +
                    ", backupType=" + backupType +
                    ", state='" + state + '\'' +
                    ", dbId='" + dbId + '\'' +
                    ", dbName='" + dbName + '\'' +
                    ", zone='" + zone + '\'' +
                    ", backupZone='" + backupZone + '\'' +
                    '}';
        }
    }

    /**
     * 备份总数，如果指定dbid，则是该db备份总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /**
     * 备份信息 参见UDBLogPackage
     */
    @SerializedName("DataSet")
    private List<UDBLogPackage> udbLogPackages;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UDBLogPackage> getUdbLogPackages() {
        return udbLogPackages;
    }

    public void setUdbLogPackages(List<UDBLogPackage> udbLogPackages) {
        this.udbLogPackages = udbLogPackages;
    }

    @Override
    public String toString() {
        return "DescribeUDBLogPackageResult{" +
                "totalCount=" + totalCount +
                ", udbLogPackages=" + udbLogPackages +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
