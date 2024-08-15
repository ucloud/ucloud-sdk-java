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

import java.util.List;

public class ListUMongoDBBackupResponse extends Response {

    /** 备份列表 */
    @SerializedName("DataSet")
    private List<BackupInfo> dataSet;

    public List<BackupInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<BackupInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public static class BackupInfo extends Response {

        /** 备份ID */
        @SerializedName("BackupId")
        private String backupId;

        /** 备份名称 */
        @SerializedName("BackupName")
        private String backupName;

        /** 实例ID */
        @SerializedName("ClusterId")
        private String clusterId;

        /** 备份状态 */
        @SerializedName("State")
        private String state;

        /** 备份数据大小 */
        @SerializedName("BackupSize")
        private Integer backupSize;

        /** 备份类型 */
        @SerializedName("BackupType")
        private String backupType;

        /** 备份开始时间 */
        @SerializedName("StartTime")
        private Integer startTime;

        /** 备份结束时间 */
        @SerializedName("EndTime")
        private Integer endTime;

        /** 虚拟节点id */
        @SerializedName("VirtualClusterId")
        private String virtualClusterId;

        /** 副本类型,ConfigRepl或者DataRepl */
        @SerializedName("ReplicaType")
        private String replicaType;

        /** 批次id */
        @SerializedName("BatchId")
        private String batchId;

        /** 磁盘大小 */
        @SerializedName("DiskSize")
        private Integer diskSize;

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

        public String getClusterId() {
            return clusterId;
        }

        public void setClusterId(String clusterId) {
            this.clusterId = clusterId;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Integer getBackupSize() {
            return backupSize;
        }

        public void setBackupSize(Integer backupSize) {
            this.backupSize = backupSize;
        }

        public String getBackupType() {
            return backupType;
        }

        public void setBackupType(String backupType) {
            this.backupType = backupType;
        }

        public Integer getStartTime() {
            return startTime;
        }

        public void setStartTime(Integer startTime) {
            this.startTime = startTime;
        }

        public Integer getEndTime() {
            return endTime;
        }

        public void setEndTime(Integer endTime) {
            this.endTime = endTime;
        }

        public String getVirtualClusterId() {
            return virtualClusterId;
        }

        public void setVirtualClusterId(String virtualClusterId) {
            this.virtualClusterId = virtualClusterId;
        }

        public String getReplicaType() {
            return replicaType;
        }

        public void setReplicaType(String replicaType) {
            this.replicaType = replicaType;
        }

        public String getBatchId() {
            return batchId;
        }

        public void setBatchId(String batchId) {
            this.batchId = batchId;
        }

        public Integer getDiskSize() {
            return diskSize;
        }

        public void setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
        }
    }
}
