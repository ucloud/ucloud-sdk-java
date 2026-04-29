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

public class ListTiDBClusterRestoreResponse extends Response {

    /** 恢复信息 */
    @SerializedName("RestoreData")
    private RestoreData restoreData;

    public RestoreData getRestoreData() {
        return restoreData;
    }

    public void setRestoreData(RestoreData restoreData) {
        this.restoreData = restoreData;
    }

    public static class RestoreData extends Response {

        /** 恢复的Id */
        @SerializedName("RestoreId")
        private String restoreId;

        /** 源实例Id */
        @SerializedName("SourceServiceId")
        private String sourceServiceId;

        /** 目标实例Id */
        @SerializedName("TargetServiceId")
        private String targetServiceId;

        /** 备份Id */
        @SerializedName("BackupId")
        private String backupId;

        /** 恢复的起始时间 */
        @SerializedName("RestoreStartTime")
        private Integer restoreStartTime;

        /** 恢复的结束时间 */
        @SerializedName("RestoreEndTime")
        private Integer restoreEndTime;

        /** 恢复的状态 */
        @SerializedName("State")
        private String state;

        public String getRestoreId() {
            return restoreId;
        }

        public void setRestoreId(String restoreId) {
            this.restoreId = restoreId;
        }

        public String getSourceServiceId() {
            return sourceServiceId;
        }

        public void setSourceServiceId(String sourceServiceId) {
            this.sourceServiceId = sourceServiceId;
        }

        public String getTargetServiceId() {
            return targetServiceId;
        }

        public void setTargetServiceId(String targetServiceId) {
            this.targetServiceId = targetServiceId;
        }

        public String getBackupId() {
            return backupId;
        }

        public void setBackupId(String backupId) {
            this.backupId = backupId;
        }

        public Integer getRestoreStartTime() {
            return restoreStartTime;
        }

        public void setRestoreStartTime(Integer restoreStartTime) {
            this.restoreStartTime = restoreStartTime;
        }

        public Integer getRestoreEndTime() {
            return restoreEndTime;
        }

        public void setRestoreEndTime(Integer restoreEndTime) {
            this.restoreEndTime = restoreEndTime;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
