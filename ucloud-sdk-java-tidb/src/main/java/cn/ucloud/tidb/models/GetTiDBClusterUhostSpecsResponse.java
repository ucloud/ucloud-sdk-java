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

import java.util.List;

public class GetTiDBClusterUhostSpecsResponse extends Response {

    /** 详情 */
    @SerializedName("Data")
    private List<UhostSpecs> data;

    public List<UhostSpecs> getData() {
        return data;
    }

    public void setData(List<UhostSpecs> data) {
        this.data = data;
    }

    public static class UhostSpecs extends Response {

        /** 节点规格ID */
        @SerializedName("ConfigId")
        private String configId;

        /** 节点规格名称 */
        @SerializedName("ConfigName")
        private String configName;

        /** 节点类型 */
        @SerializedName("NodeType")
        private String nodeType;

        /** CPU核数 */
        @SerializedName("CoreNum")
        private Integer coreNum;

        /** 内存 */
        @SerializedName("Memory")
        private Integer memory;

        /** 最小磁盘容量 */
        @SerializedName("MinDiskCapacity")
        private Integer minDiskCapacity;

        /** 最大磁盘容量 */
        @SerializedName("MaxDiskCapacity")
        private Integer maxDiskCapacity;

        /** 磁盘容量变更步长 */
        @SerializedName("DiskStep")
        private Integer diskStep;

        public String getConfigId() {
            return configId;
        }

        public void setConfigId(String configId) {
            this.configId = configId;
        }

        public String getConfigName() {
            return configName;
        }

        public void setConfigName(String configName) {
            this.configName = configName;
        }

        public String getNodeType() {
            return nodeType;
        }

        public void setNodeType(String nodeType) {
            this.nodeType = nodeType;
        }

        public Integer getCoreNum() {
            return coreNum;
        }

        public void setCoreNum(Integer coreNum) {
            this.coreNum = coreNum;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public Integer getMinDiskCapacity() {
            return minDiskCapacity;
        }

        public void setMinDiskCapacity(Integer minDiskCapacity) {
            this.minDiskCapacity = minDiskCapacity;
        }

        public Integer getMaxDiskCapacity() {
            return maxDiskCapacity;
        }

        public void setMaxDiskCapacity(Integer maxDiskCapacity) {
            this.maxDiskCapacity = maxDiskCapacity;
        }

        public Integer getDiskStep() {
            return diskStep;
        }

        public void setDiskStep(Integer diskStep) {
            this.diskStep = diskStep;
        }
    }
}
