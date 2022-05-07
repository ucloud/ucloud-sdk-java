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
package cn.ucloud.uphost.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeBaremetalMachineTypeResponse extends Response {

    /** 机型列表，模型：PHostCloudMachineTypeSet */
    @SerializedName("MachineTypes")
    private List<PHostCloudMachineTypeSet> machineTypes;

    public List<PHostCloudMachineTypeSet> getMachineTypes() {
        return machineTypes;
    }

    public void setMachineTypes(List<PHostCloudMachineTypeSet> machineTypes) {
        this.machineTypes = machineTypes;
    }

    public static class PHostClusterSet extends Response {

        /** 集群名。枚举值：千兆网络集群：1G；万兆网络集群：10G；智能网卡网络：25G； */
        @SerializedName("Name")
        private String name;

        /** 库存状态。枚举值：有库存：Available；无库存：SoldOut */
        @SerializedName("StockStatus")
        private String stockStatus;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStockStatus() {
            return stockStatus;
        }

        public void setStockStatus(String stockStatus) {
            this.stockStatus = stockStatus;
        }
    }

    public static class PHostComponentSet extends Response {

        /** 组件名称 */
        @SerializedName("Name")
        private String name;

        /** 组件数量 */
        @SerializedName("Count")
        private Integer count;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }

    public static class PHostCPUSet extends Response {

        /** CPU型号 */
        @SerializedName("Model")
        private String model;

        /** CPU主频 */
        @SerializedName("Frequence")
        private Double frequence;

        /** CPU个数 */
        @SerializedName("Count")
        private Integer count;

        /** CPU核数 */
        @SerializedName("CoreCount")
        private Integer coreCount;

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public Double getFrequence() {
            return frequence;
        }

        public void setFrequence(Double frequence) {
            this.frequence = frequence;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getCoreCount() {
            return coreCount;
        }

        public void setCoreCount(Integer coreCount) {
            this.coreCount = coreCount;
        }
    }

    public static class PHostCloudMachineTypeSet extends Response {

        /** 物理云主机机型别名，全网唯一。 */
        @SerializedName("Type")
        private String type;

        /** CPU信息 */
        @SerializedName("CPU")
        private PHostCPUSet cpu;

        /** 内存大小，单位MB */
        @SerializedName("Memory")
        private Integer memory;

        /** 其他组件信息 */
        @SerializedName("Components")
        private PHostComponentSet components;

        /** 集群库存信息 */
        @SerializedName("Clusters")
        private List<PHostClusterSet> clusters;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public PHostCPUSet getCPU() {
            return cpu;
        }

        public void setCPU(PHostCPUSet cpu) {
            this.cpu = cpu;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public PHostComponentSet getComponents() {
            return components;
        }

        public void setComponents(PHostComponentSet components) {
            this.components = components;
        }

        public List<PHostClusterSet> getClusters() {
            return clusters;
        }

        public void setClusters(List<PHostClusterSet> clusters) {
            this.clusters = clusters;
        }
    }
}
