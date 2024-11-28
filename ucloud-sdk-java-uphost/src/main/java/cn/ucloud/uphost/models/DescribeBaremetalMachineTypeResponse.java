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

    /** 机型列表，模型：PHostCloudMachineTypeSetV2,仅在入参Version=v2时返回 */
    @SerializedName("MachineTypes")
    private List<PHostCloudMachineTypeSetV2> machineTypes;

    public List<PHostCloudMachineTypeSetV2> getMachineTypes() {
        return machineTypes;
    }

    public void setMachineTypes(List<PHostCloudMachineTypeSetV2> machineTypes) {
        this.machineTypes = machineTypes;
    }

    public static class PHostCPUSetV2 extends Response {

        /** CPU核数 */
        @SerializedName("CoreCount")
        private Integer coreCount;

        /** CPU个数 */
        @SerializedName("Count")
        private Integer count;

        /** CPU型号 */
        @SerializedName("Model")
        private String model;

        /** CPU主频 */
        @SerializedName("Frequency")
        private String frequency;

        public Integer getCoreCount() {
            return coreCount;
        }

        public void setCoreCount(Integer coreCount) {
            this.coreCount = coreCount;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getFrequency() {
            return frequency;
        }

        public void setFrequency(String frequency) {
            this.frequency = frequency;
        }
    }

    public static class PHostCloudMachineTypeSetV2 extends Response {

        /** 机型所在可用区 */
        @SerializedName("Zone")
        private String zone;

        /** CPU信息 */
        @SerializedName("CPU")
        private PHostCPUSetV2 cpu;

        /** 磁盘信息 */
        @SerializedName("Disks")
        private List<PHostDiskSetV2> disks;

        /** 组件信息 */
        @SerializedName("Components")
        private List<PHostComponentSet> components;

        /** 物理云主机机型别名 */
        @SerializedName("Type")
        private String type;

        /** 是否支持做Raid。枚举值：可以：Yes；不可以：No */
        @SerializedName("RaidSupported")
        private String raidSupported;

        /** 内存大小，单位MB */
        @SerializedName("Memory")
        private Integer memory;

        /** 是否是裸金属机型 */
        @SerializedName("IsBaremetal")
        private Boolean isBaremetal;

        /** 是否需要加新机型标记 */
        @SerializedName("IsNew")
        private Boolean isNew;

        /** GPU信息 */
        @SerializedName("GpuInfo")
        private PHostGpuInfoV2 gpuInfo;

        /** 通常获取到的都是可售卖的 */
        @SerializedName("OnSale")
        private Boolean onSale;

        /** 库存数量 */
        @SerializedName("Stock")
        private Integer stock;

        /** 库存状态。枚举值：有库存：Available；无库存：SoldOut */
        @SerializedName("StockStatus")
        private String stockStatus;

        /** 参考价格。字典类型，default:为默认价格；cn-wlcb-01:乌兰察布A可用区价格 */
        @SerializedName("Price")
        private Object price;

        /** 集群名。枚举值：千兆网络集群：1G；万兆网络集群：10G；智能网卡网络：25G； */
        @SerializedName("Cluster")
        private String cluster;

        /** 适用场景。例如：ai表示AI学习场景； */
        @SerializedName("Scene")
        private List<String> scene;

        /** 是否是GPU机型 */
        @SerializedName("IsGpu")
        private Boolean isGpu;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public PHostCPUSetV2 getCPU() {
            return cpu;
        }

        public void setCPU(PHostCPUSetV2 cpu) {
            this.cpu = cpu;
        }

        public List<PHostDiskSetV2> getDisks() {
            return disks;
        }

        public void setDisks(List<PHostDiskSetV2> disks) {
            this.disks = disks;
        }

        public List<PHostComponentSet> getComponents() {
            return components;
        }

        public void setComponents(List<PHostComponentSet> components) {
            this.components = components;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getRaidSupported() {
            return raidSupported;
        }

        public void setRaidSupported(String raidSupported) {
            this.raidSupported = raidSupported;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public Boolean getIsBaremetal() {
            return isBaremetal;
        }

        public void setIsBaremetal(Boolean isBaremetal) {
            this.isBaremetal = isBaremetal;
        }

        public Boolean getIsNew() {
            return isNew;
        }

        public void setIsNew(Boolean isNew) {
            this.isNew = isNew;
        }

        public PHostGpuInfoV2 getGpuInfo() {
            return gpuInfo;
        }

        public void setGpuInfo(PHostGpuInfoV2 gpuInfo) {
            this.gpuInfo = gpuInfo;
        }

        public Boolean getOnSale() {
            return onSale;
        }

        public void setOnSale(Boolean onSale) {
            this.onSale = onSale;
        }

        public Integer getStock() {
            return stock;
        }

        public void setStock(Integer stock) {
            this.stock = stock;
        }

        public String getStockStatus() {
            return stockStatus;
        }

        public void setStockStatus(String stockStatus) {
            this.stockStatus = stockStatus;
        }

        public Object getPrice() {
            return price;
        }

        public void setPrice(Object price) {
            this.price = price;
        }

        public String getCluster() {
            return cluster;
        }

        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        public List<String> getScene() {
            return scene;
        }

        public void setScene(List<String> scene) {
            this.scene = scene;
        }

        public Boolean getIsGpu() {
            return isGpu;
        }

        public void setIsGpu(Boolean isGpu) {
            this.isGpu = isGpu;
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

    public static class PHostDiskSetV2 extends Response {

        /** 空间大小 */
        @SerializedName("Space")
        private Integer space;

        /** 磁盘名 */
        @SerializedName("Name")
        private String name;

        /** IO性能 */
        @SerializedName("IoCap")
        private Integer ioCap;

        /** 数量 */
        @SerializedName("Number")
        private Integer number;

        /** 转换单位 */
        @SerializedName("UnitSize")
        private Integer unitSize;

        /** Raid级别 */
        @SerializedName("RaidLevel")
        private Integer raidLevel;

        /** 磁盘类型 */
        @SerializedName("DiskType")
        private Integer diskType;

        public Integer getSpace() {
            return space;
        }

        public void setSpace(Integer space) {
            this.space = space;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getIoCap() {
            return ioCap;
        }

        public void setIoCap(Integer ioCap) {
            this.ioCap = ioCap;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public Integer getUnitSize() {
            return unitSize;
        }

        public void setUnitSize(Integer unitSize) {
            this.unitSize = unitSize;
        }

        public Integer getRaidLevel() {
            return raidLevel;
        }

        public void setRaidLevel(Integer raidLevel) {
            this.raidLevel = raidLevel;
        }

        public Integer getDiskType() {
            return diskType;
        }

        public void setDiskType(Integer diskType) {
            this.diskType = diskType;
        }
    }

    public static class PHostGpuInfoV2 extends Response {

        /** GPU名称，例如：NVIDIA_V100S */
        @SerializedName("Name")
        private String name;

        /** GPU数量 */
        @SerializedName("Count")
        private Integer count;

        /** GPU显存大小 */
        @SerializedName("Memory")
        private String memory;

        /** GPU性能指标 */
        @SerializedName("Performance")
        private String performance;

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

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }

        public String getPerformance() {
            return performance;
        }

        public void setPerformance(String performance) {
            this.performance = performance;
        }
    }
}
