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
package cn.ucloud.uk8s.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUK8SAvailableInstanceTypesResponse extends Response {

    /** 当前区域是否可售 */
    @SerializedName("Status")
    private String status;

    /** UK8S 支持的可用机型列表 */
    @SerializedName("AvailableInstanceTypes")
    private List<UK8SAvailableInstanceType> availableInstanceTypes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<UK8SAvailableInstanceType> getAvailableInstanceTypes() {
        return availableInstanceTypes;
    }

    public void setAvailableInstanceTypes(List<UK8SAvailableInstanceType> availableInstanceTypes) {
        this.availableInstanceTypes = availableInstanceTypes;
    }

    public static class InstanceTypeBootDisk extends Response {

        /** 系统盘类型名称 */
        @SerializedName("Name")
        private String name;

        /** 是否支持即时扩容 */
        @SerializedName("InstantResize")
        private Boolean instantResize;

        /** 最大磁盘容量 */
        @SerializedName("MaximalSize")
        private Integer maximalSize;

        /** 磁盘特性列表 */
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

    public static class InstanceTypeCpuPlatform extends Response {

        /** CPU 平台名称 */
        @SerializedName("Name")
        private String name;

        /** CPU 型号列表 */
        @SerializedName("CpuModels")
        private List<String> cpuModels;

        /** CPU 频率 */
        @SerializedName("CpuFrequency")
        private String cpuFrequency;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getCpuModels() {
            return cpuModels;
        }

        public void setCpuModels(List<String> cpuModels) {
            this.cpuModels = cpuModels;
        }

        public String getCpuFrequency() {
            return cpuFrequency;
        }

        public void setCpuFrequency(String cpuFrequency) {
            this.cpuFrequency = cpuFrequency;
        }
    }

    public static class InstanceTypeDataDisk extends Response {

        /** 数据盘类型名称 */
        @SerializedName("Name")
        private String name;

        /** 最小磁盘容量 */
        @SerializedName("MinimalSize")
        private Integer minimalSize;

        /** 最大磁盘容量 */
        @SerializedName("MaximalSize")
        private Integer maximalSize;

        /** 磁盘特性列表 */
        @SerializedName("Features")
        private List<String> features;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getMinimalSize() {
            return minimalSize;
        }

        public void setMinimalSize(Integer minimalSize) {
            this.minimalSize = minimalSize;
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

    public static class InstanceTypeDisk extends Response {

        /** 磁盘配置名称 */
        @SerializedName("Name")
        private String name;

        /** 支持的系统盘配置 */
        @SerializedName("BootDisk")
        private List<InstanceTypeBootDisk> bootDisk;

        /** 支持的数据盘配置 */
        @SerializedName("DataDisk")
        private List<InstanceTypeDataDisk> dataDisk;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<InstanceTypeBootDisk> getBootDisk() {
            return bootDisk;
        }

        public void setBootDisk(List<InstanceTypeBootDisk> bootDisk) {
            this.bootDisk = bootDisk;
        }

        public List<InstanceTypeDataDisk> getDataDisk() {
            return dataDisk;
        }

        public void setDataDisk(List<InstanceTypeDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
        }
    }

    public static class InstanceTypeFeature extends Response {

        /** 特性名称 */
        @SerializedName("Name")
        private String name;

        /** 特性模式列表 */
        @SerializedName("Modes")
        private List<InstanceTypeFeatureMode> modes;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<InstanceTypeFeatureMode> getModes() {
            return modes;
        }

        public void setModes(List<InstanceTypeFeatureMode> modes) {
            this.modes = modes;
        }
    }

    public static class InstanceTypeFeatureMode extends Response {

        /** 模式名称 */
        @SerializedName("Name")
        private String name;

        /** 关联的镜像特性 */
        @SerializedName("RelatedToImageFeature")
        private List<String> relatedToImageFeature;

        /** 最低 CPU 平台列表 */
        @SerializedName("MinimalCpuPlatform")
        private List<String> minimalCpuPlatform;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getRelatedToImageFeature() {
            return relatedToImageFeature;
        }

        public void setRelatedToImageFeature(List<String> relatedToImageFeature) {
            this.relatedToImageFeature = relatedToImageFeature;
        }

        public List<String> getMinimalCpuPlatform() {
            return minimalCpuPlatform;
        }

        public void setMinimalCpuPlatform(List<String> minimalCpuPlatform) {
            this.minimalCpuPlatform = minimalCpuPlatform;
        }
    }

    public static class InstanceTypeMachineSize extends Response {

        /** GPU 数量 */
        @SerializedName("Gpu")
        private Integer gpu;

        /** CPU 与内存规格组合 */
        @SerializedName("Collection")
        private List<InstanceTypeMachineSizeCollection> collection;

        public Integer getGpu() {
            return gpu;
        }

        public void setGpu(Integer gpu) {
            this.gpu = gpu;
        }

        public List<InstanceTypeMachineSizeCollection> getCollection() {
            return collection;
        }

        public void setCollection(List<InstanceTypeMachineSizeCollection> collection) {
            this.collection = collection;
        }
    }

    public static class InstanceTypeMachineSizeCollection extends Response {

        /** CPU 核数 */
        @SerializedName("Cpu")
        private Integer cpu;

        /** 可用内存容量列表 */
        @SerializedName("Memory")
        private List<Integer> memory;

        /** 最低 CPU 平台列表 */
        @SerializedName("MinimalCpuPlatform")
        private List<String> minimalCpuPlatform;

        public Integer getCpu() {
            return cpu;
        }

        public void setCpu(Integer cpu) {
            this.cpu = cpu;
        }

        public List<Integer> getMemory() {
            return memory;
        }

        public void setMemory(List<Integer> memory) {
            this.memory = memory;
        }

        public List<String> getMinimalCpuPlatform() {
            return minimalCpuPlatform;
        }

        public void setMinimalCpuPlatform(List<String> minimalCpuPlatform) {
            this.minimalCpuPlatform = minimalCpuPlatform;
        }
    }

    public static class InstanceTypeUHostFamily extends Response {

        /** 规格族名称 */
        @SerializedName("Name")
        private String name;

        /** CPU 频率 */
        @SerializedName("CpuFrequency")
        private String cpuFrequency;

        /** 支持的 CPU 平台 */
        @SerializedName("CpuPlatforms")
        private List<InstanceTypeCpuPlatform> cpuPlatforms;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCpuFrequency() {
            return cpuFrequency;
        }

        public void setCpuFrequency(String cpuFrequency) {
            this.cpuFrequency = cpuFrequency;
        }

        public List<InstanceTypeCpuPlatform> getCpuPlatforms() {
            return cpuPlatforms;
        }

        public void setCpuPlatforms(List<InstanceTypeCpuPlatform> cpuPlatforms) {
            this.cpuPlatforms = cpuPlatforms;
        }
    }

    public static class InstanceTypeValueRate extends Response {

        /** 数值 */
        @SerializedName("Value")
        private Double value;

        /** 评分 */
        @SerializedName("Rate")
        private Integer rate;

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }

        public Integer getRate() {
            return rate;
        }

        public void setRate(Integer rate) {
            this.rate = rate;
        }
    }

    public static class UK8SAvailableInstanceType extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 机型名称 */
        @SerializedName("Name")
        private String name;

        /** 机型状态 */
        @SerializedName("Status")
        private String status;

        /** 机型描述 */
        @SerializedName("Description")
        private String description;

        /** 主机系列列表 */
        @SerializedName("UHostFamilies")
        private List<InstanceTypeUHostFamily> uHostFamilies;

        /** 支持的磁盘配置 */
        @SerializedName("Disks")
        private List<InstanceTypeDisk> disks;

        /** 支持的机型规格 */
        @SerializedName("MachineSizes")
        private List<InstanceTypeMachineSize> machineSizes;

        /** 机型特性列表 */
        @SerializedName("Features")
        private List<InstanceTypeFeature> features;

        /** 机型类别 */
        @SerializedName("MachineClass")
        private String machineClass;

        /** 实例类型 */
        @SerializedName("InstanceType")
        private String instanceType;

        /** 父机型类型 */
        @SerializedName("ParentType")
        private String parentType;

        /** 显存信息 */
        @SerializedName("GraphicsMemory")
        private InstanceTypeValueRate graphicsMemory;

        /** 性能信息 */
        @SerializedName("Performance")
        private InstanceTypeValueRate performance;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public List<InstanceTypeUHostFamily> getUHostFamilies() {
            return uHostFamilies;
        }

        public void setUHostFamilies(List<InstanceTypeUHostFamily> uHostFamilies) {
            this.uHostFamilies = uHostFamilies;
        }

        public List<InstanceTypeDisk> getDisks() {
            return disks;
        }

        public void setDisks(List<InstanceTypeDisk> disks) {
            this.disks = disks;
        }

        public List<InstanceTypeMachineSize> getMachineSizes() {
            return machineSizes;
        }

        public void setMachineSizes(List<InstanceTypeMachineSize> machineSizes) {
            this.machineSizes = machineSizes;
        }

        public List<InstanceTypeFeature> getFeatures() {
            return features;
        }

        public void setFeatures(List<InstanceTypeFeature> features) {
            this.features = features;
        }

        public String getMachineClass() {
            return machineClass;
        }

        public void setMachineClass(String machineClass) {
            this.machineClass = machineClass;
        }

        public String getInstanceType() {
            return instanceType;
        }

        public void setInstanceType(String instanceType) {
            this.instanceType = instanceType;
        }

        public String getParentType() {
            return parentType;
        }

        public void setParentType(String parentType) {
            this.parentType = parentType;
        }

        public InstanceTypeValueRate getGraphicsMemory() {
            return graphicsMemory;
        }

        public void setGraphicsMemory(InstanceTypeValueRate graphicsMemory) {
            this.graphicsMemory = graphicsMemory;
        }

        public InstanceTypeValueRate getPerformance() {
            return performance;
        }

        public void setPerformance(InstanceTypeValueRate performance) {
            this.performance = performance;
        }
    }
}
