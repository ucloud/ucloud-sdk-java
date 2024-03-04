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
package cn.ucloud.umongodb.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetUMongoDBBackupParamResponse extends Response {

    /** 备份策略信息 */
    @SerializedName("DataSet")
    private BackupParam dataSet;

    public BackupParam getDataSet() {
        return dataSet;
    }

    public void setDataSet(BackupParam dataSet) {
        this.dataSet = dataSet;
    }

    public static class BackupParam extends Response {

        /** 实例ID */
        @SerializedName("ClusterId")
        private String clusterId;

        /** 自动备份预期周几 (1-7 表示 周一到周末，多个数据用','分割，eg: 3,7) */
        @SerializedName("AutoBackupToggleWeek")
        private String autoBackupToggleWeek;

        /** 自动备份预期时间范围 (24小时制，精确到分钟，00:00~23:59) */
        @SerializedName("AutoBackupToggleTime")
        private String autoBackupToggleTime;

        /** 自动备份保存份数 */
        @SerializedName("AutoBackupCopies")
        private Integer autoBackupCopies;

        /** 手动备份保存份数 */
        @SerializedName("ManualBackupCopies")
        private Integer manualBackupCopies;

        /** 是否禁用(false:未禁用;true:禁用) */
        @SerializedName("Disabled")
        private Boolean disabled;

        public String getClusterId() {
            return clusterId;
        }

        public void setClusterId(String clusterId) {
            this.clusterId = clusterId;
        }

        public String getAutoBackupToggleWeek() {
            return autoBackupToggleWeek;
        }

        public void setAutoBackupToggleWeek(String autoBackupToggleWeek) {
            this.autoBackupToggleWeek = autoBackupToggleWeek;
        }

        public String getAutoBackupToggleTime() {
            return autoBackupToggleTime;
        }

        public void setAutoBackupToggleTime(String autoBackupToggleTime) {
            this.autoBackupToggleTime = autoBackupToggleTime;
        }

        public Integer getAutoBackupCopies() {
            return autoBackupCopies;
        }

        public void setAutoBackupCopies(Integer autoBackupCopies) {
            this.autoBackupCopies = autoBackupCopies;
        }

        public Integer getManualBackupCopies() {
            return manualBackupCopies;
        }

        public void setManualBackupCopies(Integer manualBackupCopies) {
            this.manualBackupCopies = manualBackupCopies;
        }

        public Boolean getDisabled() {
            return disabled;
        }

        public void setDisabled(Boolean disabled) {
            this.disabled = disabled;
        }
    }
}
