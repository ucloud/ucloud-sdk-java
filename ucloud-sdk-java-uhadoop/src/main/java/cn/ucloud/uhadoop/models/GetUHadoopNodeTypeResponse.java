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
package cn.ucloud.uhadoop.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUHadoopNodeTypeResponse extends Response {

    /** 类型信息 */
    @SerializedName("InstanceTypeSet")
    private List<InstanceType> instanceTypeSet;

    /** 当前可用区是否支持元数据库使用UDB */
    @SerializedName("MetaDataUDBUsable")
    private Boolean metaDataUDBUsable;

    /** 机型可支持的节点类型 */
    @SerializedName("HostTypeSupportNodeType")
    private String hostTypeSupportNodeType;

    public List<InstanceType> getInstanceTypeSet() {
        return instanceTypeSet;
    }

    public void setInstanceTypeSet(List<InstanceType> instanceTypeSet) {
        this.instanceTypeSet = instanceTypeSet;
    }

    public Boolean getMetaDataUDBUsable() {
        return metaDataUDBUsable;
    }

    public void setMetaDataUDBUsable(Boolean metaDataUDBUsable) {
        this.metaDataUDBUsable = metaDataUDBUsable;
    }

    public String getHostTypeSupportNodeType() {
        return hostTypeSupportNodeType;
    }

    public void setHostTypeSupportNodeType(String hostTypeSupportNodeType) {
        this.hostTypeSupportNodeType = hostTypeSupportNodeType;
    }

    public static class DiskSet extends Response {

        /** 总磁盘大小 */
        @SerializedName("Size")
        private Integer size;

        /** 磁盘角色，分Data数据盘和Boot系统盘 */
        @SerializedName("Type")
        private String type;

        /** 可支持的磁盘类型 */
        @SerializedName("DiskType")
        private List<String> diskType;

        /** 单块盘大小 */
        @SerializedName("SingleDiskSize")
        private Integer singleDiskSize;

        /** 磁盘数量 */
        @SerializedName("DiskNum")
        private Integer diskNum;

        /** 最大磁盘数量 */
        @SerializedName("DiskMaxNum")
        private String diskMaxNum;

        /** 最大单块盘容量，单位GB */
        @SerializedName("DiskMaxSize")
        private String diskMaxSize;

        /** 最小磁盘数量 */
        @SerializedName("DiskMinNum")
        private String diskMinNum;

        /** 最小单块盘容量，单位GB */
        @SerializedName("DiskMinSize")
        private String diskMinSize;

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<String> getDiskType() {
            return diskType;
        }

        public void setDiskType(List<String> diskType) {
            this.diskType = diskType;
        }

        public Integer getSingleDiskSize() {
            return singleDiskSize;
        }

        public void setSingleDiskSize(Integer singleDiskSize) {
            this.singleDiskSize = singleDiskSize;
        }

        public Integer getDiskNum() {
            return diskNum;
        }

        public void setDiskNum(Integer diskNum) {
            this.diskNum = diskNum;
        }

        public String getDiskMaxNum() {
            return diskMaxNum;
        }

        public void setDiskMaxNum(String diskMaxNum) {
            this.diskMaxNum = diskMaxNum;
        }

        public String getDiskMaxSize() {
            return diskMaxSize;
        }

        public void setDiskMaxSize(String diskMaxSize) {
            this.diskMaxSize = diskMaxSize;
        }

        public String getDiskMinNum() {
            return diskMinNum;
        }

        public void setDiskMinNum(String diskMinNum) {
            this.diskMinNum = diskMinNum;
        }

        public String getDiskMinSize() {
            return diskMinSize;
        }

        public void setDiskMinSize(String diskMinSize) {
            this.diskMinSize = diskMinSize;
        }
    }

    public static class InstanceType extends Response {

        /** 机型名称 */
        @SerializedName("NodeType")
        private String nodeType;

        /** 机型种类，可选Outstanding(快杰机型)|General(普通机型)|BareMetal(裸金属机型)|GPU(GPU机型)四种类型 */
        @SerializedName("HostType")
        private String hostType;

        /** 可用的节点类型，值为core|task|master之一 */
        @SerializedName("SuitableRole")
        private List<String> suitableRole;

        /** cpu大小 */
        @SerializedName("CPU")
        private String cpu;

        /** cpu内存比 */
        @SerializedName("CPUToMemoryRatio")
        private String cpuToMemoryRatio;

        /** 内存大小 */
        @SerializedName("Memory")
        private String memory;

        /** 磁盘信息 */
        @SerializedName("DiskSet")
        private List<DiskSet> diskSet;

        /** 是否可用,该机型是否支持创建 */
        @SerializedName("IsUsable")
        private String isUsable;

        /** 是否支持开启安全组 */
        @SerializedName("IsOpenSecgroup")
        private String isOpenSecgroup;

        /** GPU型号 */
        @SerializedName("GpuType")
        private String gpuType;

        /** GPU数量 */
        @SerializedName("GpuCount")
        private Integer gpuCount;

        public String getNodeType() {
            return nodeType;
        }

        public void setNodeType(String nodeType) {
            this.nodeType = nodeType;
        }

        public String getHostType() {
            return hostType;
        }

        public void setHostType(String hostType) {
            this.hostType = hostType;
        }

        public List<String> getSuitableRole() {
            return suitableRole;
        }

        public void setSuitableRole(List<String> suitableRole) {
            this.suitableRole = suitableRole;
        }

        public String getCPU() {
            return cpu;
        }

        public void setCPU(String cpu) {
            this.cpu = cpu;
        }

        public String getCPUToMemoryRatio() {
            return cpuToMemoryRatio;
        }

        public void setCPUToMemoryRatio(String cpuToMemoryRatio) {
            this.cpuToMemoryRatio = cpuToMemoryRatio;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }

        public List<DiskSet> getDiskSet() {
            return diskSet;
        }

        public void setDiskSet(List<DiskSet> diskSet) {
            this.diskSet = diskSet;
        }

        public String getIsUsable() {
            return isUsable;
        }

        public void setIsUsable(String isUsable) {
            this.isUsable = isUsable;
        }

        public String getIsOpenSecgroup() {
            return isOpenSecgroup;
        }

        public void setIsOpenSecgroup(String isOpenSecgroup) {
            this.isOpenSecgroup = isOpenSecgroup;
        }

        public String getGpuType() {
            return gpuType;
        }

        public void setGpuType(String gpuType) {
            this.gpuType = gpuType;
        }

        public Integer getGpuCount() {
            return gpuCount;
        }

        public void setGpuCount(Integer gpuCount) {
            this.gpuCount = gpuCount;
        }
    }
}
