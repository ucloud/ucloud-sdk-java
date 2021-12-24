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

public class DescribeUDBBackupResponse extends Response {

    /** 备份信息 参照UDBBackupSet */
    @SerializedName("DataSet")
    private List<UDBBackupSet> dataSet;

    /** 满足条件备份总数，如果指定dbid，则是该db备份总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<UDBBackupSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDBBackupSet> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class UDBBackupSet extends Response {

        /** 备份id */
        @SerializedName("BackupId")
        private Integer backupId;

        /** 备份名称 */
        @SerializedName("BackupName")
        private String backupName;

        /** 备份时间(Unix时间戳) */
        @SerializedName("BackupTime")
        private Integer backupTime;

        /** 备份文件大小(字节) */
        @SerializedName("BackupSize")
        private Integer backupSize;

        /** 备份类型,取值为0或1,0表示自动，1表示手动 */
        @SerializedName("BackupType")
        private Integer backupType;

        /** 备份状态 Backuping // 备份中 Success // 备份成功 Failed // 备份失败 Expired // 备份过期 */
        @SerializedName("State")
        private String state;

        /** dbid */
        @SerializedName("DBId")
        private String dbId;

        /** 对应的db名称 */
        @SerializedName("DBName")
        private String dbName;

        /** 备份所在可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 跨机房高可用备库所在可用区 */
        @SerializedName("BackupZone")
        private String backupZone;

        /** 备份完成时间(Unix时间戳) */
        @SerializedName("BackupEndTime")
        private Integer backupEndTime;

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

        public String getDBId() {
            return dbId;
        }

        public void setDBId(String dbId) {
            this.dbId = dbId;
        }

        public String getDBName() {
            return dbName;
        }

        public void setDBName(String dbName) {
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
    }
}
