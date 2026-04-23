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
package cn.ucloud.uclickhouse.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUClickhouseClusterCreateOptionResponse extends Response {

    /** 数据 */
    @SerializedName("Data")
    private GetCreateUClickhouseClusterOptionResponseData data;

    public GetCreateUClickhouseClusterOptionResponseData getData() {
        return data;
    }

    public void setData(GetCreateUClickhouseClusterOptionResponseData data) {
        this.data = data;
    }

    public static class ClickhouseDataDisk extends Response {

        /** 磁盘类型 */
        @SerializedName("DiskType")
        private String diskType;

        /** 最小值，GB */
        @SerializedName("MinDiskSize")
        private Integer minDiskSize;

        /** 最大值，GB */
        @SerializedName("MaxDiskSize")
        private Integer maxDiskSize;

        /** 默认大小，GB */
        @SerializedName("DefaultDataDiskSize")
        private Integer defaultDataDiskSize;

        /** 步长，GB */
        @SerializedName("Step")
        private Integer step;

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }

        public Integer getMinDiskSize() {
            return minDiskSize;
        }

        public void setMinDiskSize(Integer minDiskSize) {
            this.minDiskSize = minDiskSize;
        }

        public Integer getMaxDiskSize() {
            return maxDiskSize;
        }

        public void setMaxDiskSize(Integer maxDiskSize) {
            this.maxDiskSize = maxDiskSize;
        }

        public Integer getDefaultDataDiskSize() {
            return defaultDataDiskSize;
        }

        public void setDefaultDataDiskSize(Integer defaultDataDiskSize) {
            this.defaultDataDiskSize = defaultDataDiskSize;
        }

        public Integer getStep() {
            return step;
        }

        public void setStep(Integer step) {
            this.step = step;
        }
    }

    public static class ClickhouseMachineType extends Response {

        /** CK机型名称 */
        @SerializedName("ClickhouseMachineTypeName")
        private String clickhouseMachineTypeName;

        /** CK机型可选项 */
        @SerializedName("ClickhouseMachineTypeOptions")
        private List<ClickhouseMachineTypeOption> clickhouseMachineTypeOptions;

        /** 机型是否支持安全组 */
        @SerializedName("IsSecgroupMachineType")
        private String isSecgroupMachineType;

        public String getClickhouseMachineTypeName() {
            return clickhouseMachineTypeName;
        }

        public void setClickhouseMachineTypeName(String clickhouseMachineTypeName) {
            this.clickhouseMachineTypeName = clickhouseMachineTypeName;
        }

        public List<ClickhouseMachineTypeOption> getClickhouseMachineTypeOptions() {
            return clickhouseMachineTypeOptions;
        }

        public void setClickhouseMachineTypeOptions(
                List<ClickhouseMachineTypeOption> clickhouseMachineTypeOptions) {
            this.clickhouseMachineTypeOptions = clickhouseMachineTypeOptions;
        }

        public String getIsSecgroupMachineType() {
            return isSecgroupMachineType;
        }

        public void setIsSecgroupMachineType(String isSecgroupMachineType) {
            this.isSecgroupMachineType = isSecgroupMachineType;
        }
    }

    public static class ClickhouseMachineTypeOption extends Response {

        /** Clickhouse机型ID */
        @SerializedName("ClickhouseMachineTypeId")
        private String clickhouseMachineTypeId;

        /** 机型 */
        @SerializedName("MachineType")
        private String machineType;

        /** CPU大小 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 内存大小，GB */
        @SerializedName("Memory")
        private Integer memory;

        /** 数据盘列表 */
        @SerializedName("DataDisks")
        private List<ClickhouseDataDisk> dataDisks;

        /** 允许创建的节点个数 */
        @SerializedName("NodeCounts")
        private List<Integer> nodeCounts;

        public String getClickhouseMachineTypeId() {
            return clickhouseMachineTypeId;
        }

        public void setClickhouseMachineTypeId(String clickhouseMachineTypeId) {
            this.clickhouseMachineTypeId = clickhouseMachineTypeId;
        }

        public String getMachineType() {
            return machineType;
        }

        public void setMachineType(String machineType) {
            this.machineType = machineType;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public List<ClickhouseDataDisk> getDataDisks() {
            return dataDisks;
        }

        public void setDataDisks(List<ClickhouseDataDisk> dataDisks) {
            this.dataDisks = dataDisks;
        }

        public List<Integer> getNodeCounts() {
            return nodeCounts;
        }

        public void setNodeCounts(List<Integer> nodeCounts) {
            this.nodeCounts = nodeCounts;
        }
    }

    public static class ClickhouseVersion extends Response {

        /** 版本号 */
        @SerializedName("Version")
        private String version;

        /** 版本名称 */
        @SerializedName("VersionName")
        private String versionName;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getVersionName() {
            return versionName;
        }

        public void setVersionName(String versionName) {
            this.versionName = versionName;
        }
    }

    public static class GetCreateUClickhouseClusterOptionResponseData extends Response {

        /** 支持的CK版本 */
        @SerializedName("ClickhouseVersions")
        private List<ClickhouseVersion> clickhouseVersions;

        /** 支持的CK机型 */
        @SerializedName("ClickhouseMachineTypes")
        private List<ClickhouseMachineType> clickhouseMachineTypes;

        /** 实例可创建的最大节点数量 */
        @SerializedName("MaxNodeCount")
        private Integer maxNodeCount;

        /** 支持的Zookeeper机型 */
        @SerializedName("ZookeeperMachineTypes")
        private List<ClickhouseMachineType> zookeeperMachineTypes;

        public List<ClickhouseVersion> getClickhouseVersions() {
            return clickhouseVersions;
        }

        public void setClickhouseVersions(List<ClickhouseVersion> clickhouseVersions) {
            this.clickhouseVersions = clickhouseVersions;
        }

        public List<ClickhouseMachineType> getClickhouseMachineTypes() {
            return clickhouseMachineTypes;
        }

        public void setClickhouseMachineTypes(List<ClickhouseMachineType> clickhouseMachineTypes) {
            this.clickhouseMachineTypes = clickhouseMachineTypes;
        }

        public Integer getMaxNodeCount() {
            return maxNodeCount;
        }

        public void setMaxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = maxNodeCount;
        }

        public List<ClickhouseMachineType> getZookeeperMachineTypes() {
            return zookeeperMachineTypes;
        }

        public void setZookeeperMachineTypes(List<ClickhouseMachineType> zookeeperMachineTypes) {
            this.zookeeperMachineTypes = zookeeperMachineTypes;
        }
    }
}
