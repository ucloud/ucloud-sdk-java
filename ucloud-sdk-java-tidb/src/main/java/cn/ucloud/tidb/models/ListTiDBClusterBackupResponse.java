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
package cn.ucloud.tidb.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class ListTiDBClusterBackupResponse extends Response {

    /** 备份信息 */
    @SerializedName("Data")
    private BackupData data;

    /** 备份总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public BackupData getData() {
        return data;
    }

    public void setData(BackupData data) {
        this.data = data;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class BackupData extends Response {

        /** 备份 ID */
        @SerializedName("BackupId")
        private String backupId;

        /** 备份起始时间 */
        @SerializedName("BackupStartTime")
        private Integer backupStartTime;

        /** 备份结束时间 */
        @SerializedName("BackupEndTime")
        private Integer backupEndTime;

        /** 备份文件大小，单位：MB */
        @SerializedName("BackupSize")
        private Integer backupSize;

        /** 备份状态 */
        @SerializedName("State")
        private String state;

        /** 备份方式 */
        @SerializedName("BackupType")
        private String backupType;

        public String getBackupId() {
            return backupId;
        }

        public void setBackupId(String backupId) {
            this.backupId = backupId;
        }

        public Integer getBackupStartTime() {
            return backupStartTime;
        }

        public void setBackupStartTime(Integer backupStartTime) {
            this.backupStartTime = backupStartTime;
        }

        public Integer getBackupEndTime() {
            return backupEndTime;
        }

        public void setBackupEndTime(Integer backupEndTime) {
            this.backupEndTime = backupEndTime;
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

        public String getBackupType() {
            return backupType;
        }

        public void setBackupType(String backupType) {
            this.backupType = backupType;
        }
    }
}
