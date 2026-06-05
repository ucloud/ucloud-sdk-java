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

public class DescribeHostMachineTypeFamiliesResponse extends Response {

    /** 机型配置列表 */
    @SerializedName("MachineTypes")
    private List<MachineTypes> machineTypes;

    public List<MachineTypes> getMachineTypes() {
        return machineTypes;
    }

    public void setMachineTypes(List<MachineTypes> machineTypes) {
        this.machineTypes = machineTypes;
    }

    public static class Collection extends Response {

        /** CPU规格 */
        @SerializedName("Cpu")
        private Integer cpu;

        /** 内存规格 */
        @SerializedName("Memory")
        private List<Integer> memory;

        /** CPU和内存规格只能在列出来的CPU平台支持 */
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

    public static class CpuPlatformStatus extends Response {

        /** CPU平台 */
        @SerializedName("Name")
        private String name;

        /** 运营Commpont Code */
        @SerializedName("OperationStatus")
        private String operationStatus;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOperationStatus() {
            return operationStatus;
        }

        public void setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
        }
    }

    public static class CpuPlatformWithModels extends Response {

        /** CPU平台 */
        @SerializedName("Name")
        private String name;

        /** CPU Model列表 */
        @SerializedName("CpuModels")
        private List<String> cpuModels;

        /** CPU频率 */
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

    public static class DiskFeature extends Response {

        /** 特性名称 */
        @SerializedName("Name")
        private String name;

        /** 特性详情 */
        @SerializedName("Modes")
        private List<NameOperationStatus> modes;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<NameOperationStatus> getModes() {
            return modes;
        }

        public void setModes(List<NameOperationStatus> modes) {
            this.modes = modes;
        }
    }

    public static class FamiliesBootDiskInfo extends Response {

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
        private List<DiskFeature> features;

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

        public List<DiskFeature> getFeatures() {
            return features;
        }

        public void setFeatures(List<DiskFeature> features) {
            this.features = features;
        }
    }

    public static class FamiliesDataDiskInfo extends Response {

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
        private List<DiskFeature> features;

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

        public List<DiskFeature> getFeatures() {
            return features;
        }

        public void setFeatures(List<DiskFeature> features) {
            this.features = features;
        }
    }

    public static class FamiliesDisks extends Response {

        /** 磁盘介质类别信息，磁盘主要分类如下：云盘|cloudDisk、普通本地盘|normalLocalDisk和SSD本地盘|ssdLocalDisk。 */
        @SerializedName("Name")
        private String name;

        /** 系统盘信息 */
        @SerializedName("BootDisk")
        private List<FamiliesBootDiskInfo> bootDisk;

        /** 数据盘信息 */
        @SerializedName("DataDisk")
        private List<FamiliesDataDiskInfo> dataDisk;

        /** 权限位 */
        @SerializedName("OperationStatus")
        private String operationStatus;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<FamiliesBootDiskInfo> getBootDisk() {
            return bootDisk;
        }

        public void setBootDisk(List<FamiliesBootDiskInfo> bootDisk) {
            this.bootDisk = bootDisk;
        }

        public List<FamiliesDataDiskInfo> getDataDisk() {
            return dataDisk;
        }

        public void setDataDisk(List<FamiliesDataDiskInfo> dataDisk) {
            this.dataDisk = dataDisk;
        }

        public String getOperationStatus() {
            return operationStatus;
        }

        public void setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
        }
    }

    public static class FamiliesGpuType extends Response {

        /** 机型名称 */
        @SerializedName("Name")
        private String name;

        /** 显存信息 */
        @SerializedName("GraphicsMemory")
        private GraphicsMemory graphicsMemory;

        /** 性能信息 */
        @SerializedName("Performance")
        private Performance performance;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public GraphicsMemory getGraphicsMemory() {
            return graphicsMemory;
        }

        public void setGraphicsMemory(GraphicsMemory graphicsMemory) {
            this.graphicsMemory = graphicsMemory;
        }

        public Performance getPerformance() {
            return performance;
        }

        public void setPerformance(Performance performance) {
            this.performance = performance;
        }
    }

    public static class FeatureModes extends Response {

        /** 模式|特性名称 */
        @SerializedName("Name")
        private String name;

        /** 为镜像上支持这个特性的标签。例如DescribeImage返回的字段Features包含HotPlug，说明该镜像支持热升级。 */
        @SerializedName("RelatedToImageFeature")
        private List<String> relatedToImageFeature;

        /** 这个特性必须是列出来的CPU平台及以上的CPU才支持 */
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

    public static class Features extends Response {

        /** 可支持的特性名称。目前支持的特性网络增强|NetCapability、热升级|Hotplug */
        @SerializedName("Name")
        private String name;

        /** 可以提供的模式类别 */
        @SerializedName("Modes")
        private List<FeatureModes> modes;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<FeatureModes> getModes() {
            return modes;
        }

        public void setModes(List<FeatureModes> modes) {
            this.modes = modes;
        }
    }

    public static class Frequency extends Response {

        /** 值 */
        @SerializedName("Value")
        private Double value;

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }
    }

    public static class GraphicsMemory extends Response {

        /** 值，单位是GB */
        @SerializedName("Value")
        private Integer value;

        /** 交互展示参数，可忽略 */
        @SerializedName("Rate")
        private Integer rate;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Integer getRate() {
            return rate;
        }

        public void setRate(Integer rate) {
            this.rate = rate;
        }
    }

    public static class MachineSizes extends Response {

        /** Gpu为GPU可支持的规格即GPU颗数，非GPU机型，Gpu为0 */
        @SerializedName("Gpu")
        private Integer gpu;

        /** CPU和内存可支持的规格 */
        @SerializedName("Collection")
        private List<Collection> collection;

        public Integer getGpu() {
            return gpu;
        }

        public void setGpu(Integer gpu) {
            this.gpu = gpu;
        }

        public List<Collection> getCollection() {
            return collection;
        }

        public void setCollection(List<Collection> collection) {
            this.collection = collection;
        }
    }

    public static class MachineTypes extends Response {

        /** 机型名称 */
        @SerializedName("Name")
        private String name;

        /** 机型中文名称 */
        @SerializedName("Description")
        private String description;

        /** 机型ComponentCode */
        @SerializedName("OperationStatus")
        private String operationStatus;

        /** CPU平台列表 */
        @SerializedName("CpuPlatforms")
        private List<CpuPlatformStatus> cpuPlatforms;

        /** 磁盘信息 */
        @SerializedName("Disks")
        private List<FamiliesDisks> disks;

        /** 规格信息 */
        @SerializedName("MachineSizes")
        private List<MachineSizes> machineSizes;

        /** 特性信息 */
        @SerializedName("Features")
        private List<Features> features;

        /** 父类型。如GPU机型的父类型为"G" */
        @SerializedName("ParentType")
        private String parentType;

        /** GPU信息 */
        @SerializedName("GpuType")
        private FamiliesGpuType gpuType;

        /** 场景分类 */
        @SerializedName("SceneCategories")
        private List<String> sceneCategories;

        /** GPU系列 */
        @SerializedName("GpuSeries")
        private String gpuSeries;

        /** 规格族信息 */
        @SerializedName("UHostFamilies")
        private List<UHostFamily> uHostFamilies;

        /** 是否为非真实机型 */
        @SerializedName("Virtual")
        private Boolean virtual;

        /** 仅OPROG\OPRO机型返回 */
        @SerializedName("ProType")
        private NameFrequency proType;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getOperationStatus() {
            return operationStatus;
        }

        public void setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
        }

        public List<CpuPlatformStatus> getCpuPlatforms() {
            return cpuPlatforms;
        }

        public void setCpuPlatforms(List<CpuPlatformStatus> cpuPlatforms) {
            this.cpuPlatforms = cpuPlatforms;
        }

        public List<FamiliesDisks> getDisks() {
            return disks;
        }

        public void setDisks(List<FamiliesDisks> disks) {
            this.disks = disks;
        }

        public List<MachineSizes> getMachineSizes() {
            return machineSizes;
        }

        public void setMachineSizes(List<MachineSizes> machineSizes) {
            this.machineSizes = machineSizes;
        }

        public List<Features> getFeatures() {
            return features;
        }

        public void setFeatures(List<Features> features) {
            this.features = features;
        }

        public String getParentType() {
            return parentType;
        }

        public void setParentType(String parentType) {
            this.parentType = parentType;
        }

        public FamiliesGpuType getGpuType() {
            return gpuType;
        }

        public void setGpuType(FamiliesGpuType gpuType) {
            this.gpuType = gpuType;
        }

        public List<String> getSceneCategories() {
            return sceneCategories;
        }

        public void setSceneCategories(List<String> sceneCategories) {
            this.sceneCategories = sceneCategories;
        }

        public String getGpuSeries() {
            return gpuSeries;
        }

        public void setGpuSeries(String gpuSeries) {
            this.gpuSeries = gpuSeries;
        }

        public List<UHostFamily> getUHostFamilies() {
            return uHostFamilies;
        }

        public void setUHostFamilies(List<UHostFamily> uHostFamilies) {
            this.uHostFamilies = uHostFamilies;
        }

        public Boolean getVirtual() {
            return virtual;
        }

        public void setVirtual(Boolean virtual) {
            this.virtual = virtual;
        }

        public NameFrequency getProType() {
            return proType;
        }

        public void setProType(NameFrequency proType) {
            this.proType = proType;
        }
    }

    public static class NameFrequency extends Response {

        /** 机型名称 */
        @SerializedName("Name")
        private String name;

        /** 频率 */
        @SerializedName("Frequency")
        private Frequency frequency;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Frequency getFrequency() {
            return frequency;
        }

        public void setFrequency(Frequency frequency) {
            this.frequency = frequency;
        }
    }

    public static class NameOperationStatus extends Response {

        /** 名称 */
        @SerializedName("Name")
        private String name;

        /** 标记 */
        @SerializedName("OperationStatus")
        private String operationStatus;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOperationStatus() {
            return operationStatus;
        }

        public void setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
        }
    }

    public static class Performance extends Response {

        /** 值，单位是TFlops */
        @SerializedName("Value")
        private Double value;

        /** 交互展示参数，可忽略 */
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

    public static class UHostFamily extends Response {

        /** 规格族 */
        @SerializedName("Name")
        private String name;

        /** CPU频率信息 */
        @SerializedName("CpuFrequency")
        private String cpuFrequency;

        /** CPU平台信息 */
        @SerializedName("CpuPlatforms")
        private List<CpuPlatformWithModels> cpuPlatforms;

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

        public List<CpuPlatformWithModels> getCpuPlatforms() {
            return cpuPlatforms;
        }

        public void setCpuPlatforms(List<CpuPlatformWithModels> cpuPlatforms) {
            this.cpuPlatforms = cpuPlatforms;
        }
    }
}
