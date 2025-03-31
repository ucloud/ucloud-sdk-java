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

public class DescribeUDBBinlogBackupResponse extends Response {

    /** Binlog备份信息 参见BinlogBackupSet */
    @SerializedName("DataSet")
    private List<BinlogBackupSet> dataSet;

    /** 备份总数，如果指定dbid，则是该db备份总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<BinlogBackupSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<BinlogBackupSet> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class BinlogBackupSet extends Response {

        /** 备份id */
        @SerializedName("BackupId")
        private Integer backupId;

        /** 备份名称 */
        @SerializedName("BackupName")
        private String backupName;

        /** 备份时间 */
        @SerializedName("BackupTime")
        private Integer backupTime;

        /** 备份文件大小 */
        @SerializedName("BackupSize")
        private Integer backupSize;

        /** 备份状态 Backuping // 备份中 Success // 备份成功 Failed // 备份失败 Expired // 备份过期 */
        @SerializedName("State")
        private String state;

        /** binlog备份类型 Manual:手动备份 ,Auto:自动备份 */
        @SerializedName("BinlogType")
        private String binlogType;

        /** dbid */
        @SerializedName("DBId")
        private String dbId;

        /** 节点标识ID */
        @SerializedName("ServerId")
        private String serverId;

        /** 日志开始时间 */
        @SerializedName("LogStartTime")
        private Integer logStartTime;

        /** 日志结束时间 */
        @SerializedName("LogEndTime")
        private Integer logEndTime;

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

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getBinlogType() {
            return binlogType;
        }

        public void setBinlogType(String binlogType) {
            this.binlogType = binlogType;
        }

        public String getDBId() {
            return dbId;
        }

        public void setDBId(String dbId) {
            this.dbId = dbId;
        }

        public String getServerId() {
            return serverId;
        }

        public void setServerId(String serverId) {
            this.serverId = serverId;
        }

        public Integer getLogStartTime() {
            return logStartTime;
        }

        public void setLogStartTime(Integer logStartTime) {
            this.logStartTime = logStartTime;
        }

        public Integer getLogEndTime() {
            return logEndTime;
        }

        public void setLogEndTime(Integer logEndTime) {
            this.logEndTime = logEndTime;
        }
    }
}
