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
package cn.ucloud.uhost.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUHostAvailableDiskTypesResponse extends Response {

    /** 可挂载的磁盘信息列表 */
    @SerializedName("DiskTypeSet")
    private List<AvailableDiskTypes> diskTypeSet;

    public List<AvailableDiskTypes> getDiskTypeSet() {
        return diskTypeSet;
    }

    public void setDiskTypeSet(List<AvailableDiskTypes> diskTypeSet) {
        this.diskTypeSet = diskTypeSet;
    }

    public static class AvailableDiskTypes extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 实例Id */
        @SerializedName("UHostId")
        private String uHostId;

        /** 可用磁盘信息 */
        @SerializedName("AvailableDisks")
        private List<Disks> availableDisks;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getUHostId() {
            return uHostId;
        }

        public void setUHostId(String uHostId) {
            this.uHostId = uHostId;
        }

        public List<Disks> getAvailableDisks() {
            return availableDisks;
        }

        public void setAvailableDisks(List<Disks> availableDisks) {
            this.availableDisks = availableDisks;
        }
    }

    public static class BootDiskInfo extends Response {

        /**
         * 系统盘类别，包含普通云盘|CLOUD_NORMAL、SSD云盘|CLOUD_SSD和RSSD云盘|CLOUD_RSSD。普通本地盘只包含普通本地盘|LOCAL_NORMAL一种。SSD本地盘只包含SSD本地盘|LOCAL_SSD一种。
         */
        @SerializedName("Name")
        private String name;

        /** 系统盘是否允许扩容，如果是本地盘，则不允许扩容，InstantResize为false。 */
        @SerializedName("InstantResize")
        private Boolean instantResize;

        /** MaximalSize为磁盘最大值 */
        @SerializedName("MaximalSize")
        private Integer maximalSize;

        /** 磁盘可支持的服务 */
        @SerializedName("Features")
        private List<String> features;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getInstantResize() {
            return instantResize;
        }

        public void setInstantResize(Boolean instantResize) {
            this.instantResize = instantResize;
        }

        public Integer getMaximalSize() {
            return maximalSize;
        }

        public void setMaximalSize(Integer maximalSize) {
            this.maximalSize = maximalSize;
        }

        public List<String> getFeatures() {
            return features;
        }

        public void setFeatures(List<String> features) {
            this.features = features;
        }
    }

    public static class DataDiskInfo extends Response {

        /** 磁盘最小值，如果没有该字段，最小值取基础镜像Size值即可（linux为20G，windows为40G）。 */
        @SerializedName("MinimalSize")
        private Integer minimalSize;

        /**
         * 数据盘类别，包含普通云盘|CLOUD_NORMAL、SSD云盘|CLOUD_SSD和RSSD云盘|CLOUD_RSSD。普通本地盘只包含普通本地盘|LOCAL_NORMAL一种。SSD本地盘只包含SSD本地盘|LOCAL_SSD一种。
         */
        @SerializedName("Name")
        private String name;

        /** MaximalSize为磁盘最大值 */
        @SerializedName("MaximalSize")
        private Integer maximalSize;

        /** 数据盘可支持的服务 */
        @SerializedName("Features")
        private List<String> features;

        /** 支持的快照备份策略 */
        @SerializedName("BackupMode")
        private List<String> backupMode;

        public Integer getMinimalSize() {
            return minimalSize;
        }

        public void setMinimalSize(Integer minimalSize) {
            this.minimalSize = minimalSize;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getMaximalSize() {
            return maximalSize;
        }

        public void setMaximalSize(Integer maximalSize) {
            this.maximalSize = maximalSize;
        }

        public List<String> getFeatures() {
            return features;
        }

        public void setFeatures(List<String> features) {
            this.features = features;
        }

        public List<String> getBackupMode() {
            return backupMode;
        }

        public void setBackupMode(List<String> backupMode) {
            this.backupMode = backupMode;
        }
    }

    public static class Disks extends Response {

        /** 磁盘介质类别信息，磁盘主要分类如下：云盘|cloudDisk、普通本地盘|normalLocalDisk和SSD本地盘|ssdLocalDisk。 */
        @SerializedName("Name")
        private String name;

        /** 系统盘信息 */
        @SerializedName("BootDisk")
        private List<BootDiskInfo> bootDisk;

        /** 数据盘信息 */
        @SerializedName("DataDisk")
        private List<DataDiskInfo> dataDisk;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<BootDiskInfo> getBootDisk() {
            return bootDisk;
        }

        public void setBootDisk(List<BootDiskInfo> bootDisk) {
            this.bootDisk = bootDisk;
        }

        public List<DataDiskInfo> getDataDisk() {
            return dataDisk;
        }

        public void setDataDisk(List<DataDiskInfo> dataDisk) {
            this.dataDisk = dataDisk;
        }
    }
}
