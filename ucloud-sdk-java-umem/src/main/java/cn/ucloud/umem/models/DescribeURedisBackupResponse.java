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

public class DescribeURedisBackupResponse extends Response {

    /** 用户名下总的备份个数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 备份列表 参见 URedisBackupSet */
    @SerializedName("DataSet")
    private List<URedisBackupSet> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<URedisBackupSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<URedisBackupSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class URedisBackupSet extends Response {

        /** 可用区，参见[可用区列表](../summary/regionlist.html) */
        @SerializedName("Zone")
        private String zone;

        /** 备份ID */
        @SerializedName("BackupId")
        private String backupId;

        /** 对应的实例ID */
        @SerializedName("GroupId")
        private String groupId;

        /** 组名称 */
        @SerializedName("GroupName")
        private String groupName;

        /** 备份的名称 */
        @SerializedName("BackupName")
        private String backupName;

        /** 备份时间 (UNIX时间戳) */
        @SerializedName("BackupTime")
        private Integer backupTime;

        /** 备份文件大小, 以字节为单位 */
        @SerializedName("BackupSize")
        private Integer backupSize;

        /** 备份类型: Manual 手动 Auto 自动 */
        @SerializedName("BackupType")
        private String backupType;

        /** 备份的状态: Backuping 备份中 Success 备份成功 Error 备份失败 Expired 备份过期 */
        @SerializedName("State")
        private String state;

        /** 跨地域备份源地域 */
        @SerializedName("SrcRegionName")
        private String srcRegionName;

        /** 跨地域备份目标地域 */
        @SerializedName("DstRegionName")
        private String dstRegionName;

        /** 源实例容量大小 */
        @SerializedName("MemorySize")
        private Integer memorySize;

        /** 源实例Redis版本 */
        @SerializedName("RedisVersion")
        private String redisVersion;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getBackupId() {
            return backupId;
        }

        public void setBackupId(String backupId) {
            this.backupId = backupId;
        }

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
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

        public String getBackupType() {
            return backupType;
        }

        public void setBackupType(String backupType) {
            this.backupType = backupType;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getSrcRegionName() {
            return srcRegionName;
        }

        public void setSrcRegionName(String srcRegionName) {
            this.srcRegionName = srcRegionName;
        }

        public String getDstRegionName() {
            return dstRegionName;
        }

        public void setDstRegionName(String dstRegionName) {
            this.dstRegionName = dstRegionName;
        }

        public Integer getMemorySize() {
            return memorySize;
        }

        public void setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
        }

        public String getRedisVersion() {
            return redisVersion;
        }

        public void setRedisVersion(String redisVersion) {
            this.redisVersion = redisVersion;
        }
    }
}
