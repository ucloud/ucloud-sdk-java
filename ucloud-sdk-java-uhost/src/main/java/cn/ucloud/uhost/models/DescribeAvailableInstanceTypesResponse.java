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

public class DescribeAvailableInstanceTypesResponse extends Response {

    /** AvailableInstanceTypes */
    @SerializedName("AvailableInstanceTypes")
    private List<AvailableInstanceTypes> availableInstanceTypes;

    public List<AvailableInstanceTypes> getAvailableInstanceTypes() {
        return availableInstanceTypes;
    }

    public void setAvailableInstanceTypes(List<AvailableInstanceTypes> availableInstanceTypes) {
        this.availableInstanceTypes = availableInstanceTypes;
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

    public static class AvailableInstanceTypes extends Response {

        /** 机型名称：快杰O型|O 、快杰共享型|OM 、快杰内存型|OMEM 、 快杰PRO型|OPRO、通用N型|N、高主频C型|C和GPU G型|G等 */
        @SerializedName("Name")
        private String name;

        /** 机型状态：可售|Normal 、 公测|Beta、售罄|Soldout、隐藏|Hidden */
        @SerializedName("Status")
        private String status;

        /** 支持的CPU平台，并且按照Intel、AMD和Ampere分类返回 */
        @SerializedName("CpuPlatforms")
        private List<CpuPlatforms> cpuPlatforms;

        /**
         * 磁盘信息。磁盘主要分类如下：云盘|cloudDisk、普通本地盘|normalLocalDisk和SSD本地盘|ssdLocalDisk。
         *
         * <p>其中云盘主要包含普通云盘|CLOUD_NORMAL、SSD云盘|CLOUD_SSD和RSSD云盘|CLOUD_RSSD。普通本地盘只包含普通本地盘|LOCAL_NORMAL一种。SSD本地盘只包含SSD本地盘|LOCAL_SSD一种。
         *
         * <p>MinimalSize为磁盘最小值，如果没有该字段，最小值取基础镜像Size值即可（linux为20G，windows为40G）。MaximalSize为磁盘最大值。
         *
         * <p>InstantResize表示系统盘是否允许扩容，如果是本地盘，则不允许扩容，InstantResize为false。
         *
         * <p>Features为磁盘可支持的服务：数据方舟|DATAARK，快照服务|SNAPSHOT，加密盘|Encrypted。
         */
        @SerializedName("Disks")
        private List<Disks> disks;

        /**
         * GPU、CPU和内存信息。Gpu为GPU可支持的规格，Cpu和Memory分别为CPU和内存可支持的规格。如果非GPU机型，GPU为0。
         *
         * <p>MinimalCpuPlatform代表含义这个CPU和内存规格只能在列出来的CPU平台支持。
         */
        @SerializedName("MachineSizes")
        private List<MachineSizes> machineSizes;

        /**
         * 虚机可支持的特性。目前支持的特性网络增强|NetCapability、热升级|Hotplug。
         *
         * <p>网络增强分为关闭|Normal、网络增强1.0|Super和网络增强2.0|Ultra。
         *
         * <p>Name为可支持的特性名称，Modes为可以提供的模式类别等，RelatedToImageFeature为镜像上支持这个特性的标签。例如DescribeImage返回的字段Features包含HotPlug，说明该镜像支持热升级。
         *
         * <p>MinimalCpuPlatform表示这个特性必须是列出来的CPU平台及以上的CPU才支持。
         */
        @SerializedName("Features")
        private List<Features> features;

        /** 区分是否是GPU机型：GPU机型|GPU，非GPU机型|Normal。 */
        @SerializedName("MachineClass")
        private String machineClass;

        /** GPU的显存指标，value为值，单位是GB。 */
        @SerializedName("GraphicsMemory")
        private GraphicsMemory graphicsMemory;

        /** GPU的性能指标，value为值，单位是TFlops。 */
        @SerializedName("Performance")
        private Performance performance;

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

        public List<CpuPlatforms> getCpuPlatforms() {
            return cpuPlatforms;
        }

        public void setCpuPlatforms(List<CpuPlatforms> cpuPlatforms) {
            this.cpuPlatforms = cpuPlatforms;
        }

        public List<Disks> getDisks() {
            return disks;
        }

        public void setDisks(List<Disks> disks) {
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

        public String getMachineClass() {
            return machineClass;
        }

        public void setMachineClass(String machineClass) {
            this.machineClass = machineClass;
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

    public static class Performance extends Response {

        /** 值，单位是TFlops */
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

    public static class CpuPlatforms extends Response {

        /** 返回Intel的CPU平台信息，例如：Intel: ['Intel/CascadeLake','Intel/CascadelakeR','Intel/IceLake'] */
        @SerializedName("Intel")
        private List<String> intel;

        /** 返回AMD的CPU平台信息，例如：AMD: ['Amd/Epyc2'] */
        @SerializedName("Amd")
        private List<String> amd;

        /** 返回Arm的CPU平台信息，例如：Ampere: ['Ampere/Altra'] */
        @SerializedName("Ampere")
        private List<String> ampere;

        public List<String> getIntel() {
            return intel;
        }

        public void setIntel(List<String> intel) {
            this.intel = intel;
        }

        public List<String> getAmd() {
            return amd;
        }

        public void setAmd(List<String> amd) {
            this.amd = amd;
        }

        public List<String> getAmpere() {
            return ampere;
        }

        public void setAmpere(List<String> ampere) {
            this.ampere = ampere;
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
}
