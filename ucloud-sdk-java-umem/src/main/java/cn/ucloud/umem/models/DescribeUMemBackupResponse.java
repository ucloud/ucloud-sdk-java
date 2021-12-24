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
package cn.ucloud.umem.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeUMemBackupResponse extends Response {

    /** 分布式redis 备份，数组的每个元素为每个分片的备份 */
    @SerializedName("DataSet")
    private List<UMemBackupSet> dataSet;

    public List<UMemBackupSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UMemBackupSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UMemBackupSet extends Response {

        /** 备份名称 */
        @SerializedName("BackupName")
        private String backupName;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** Starting:备份中 Done:完成 */
        @SerializedName("State")
        private String state;

        /** 空间的备份ID */
        @SerializedName("BackupId")
        private String backupId;

        /** 备份类型: auto(自动) ,manual(手动) */
        @SerializedName("BackupType")
        private String backupType;

        /** 本次备份，分片的数量 */
        @SerializedName("BlockCount")
        private Integer blockCount;

        public String getBackupName() {
            return backupName;
        }

        public void setBackupName(String backupName) {
            this.backupName = backupName;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getBackupId() {
            return backupId;
        }

        public void setBackupId(String backupId) {
            this.backupId = backupId;
        }

        public String getBackupType() {
            return backupType;
        }

        public void setBackupType(String backupType) {
            this.backupType = backupType;
        }

        public Integer getBlockCount() {
            return blockCount;
        }

        public void setBlockCount(Integer blockCount) {
            this.blockCount = blockCount;
        }
    }
}
