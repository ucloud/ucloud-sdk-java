/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.uk8s.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class ListUK8SNodeGroupResponse extends Response {

    
        
    /**
     * 节点池列表
     */
    @SerializedName("NodeGroupList")
    private List<NodeGroupSet> nodeGroupList;
        
    
    public List<NodeGroupSet> getNodeGroupList() {
        return nodeGroupList;
    }

    public void setNodeGroupList(List<NodeGroupSet> nodeGroupList) {
        this.nodeGroupList = nodeGroupList;
    }
    
        public static class NodeGroupSet extends Response {
            
        
    /**
     * 节点池ID
     */
    @SerializedName("NodeGroupId")
    private String nodeGroupId;
        
    
        
    /**
     * 节点池名字
     */
    @SerializedName("NodeGroupName")
    private String nodeGroupName;
        
    
        
    /**
     * 镜像ID
     */
    @SerializedName("ImageId")
    private String imageId;
        
    
        
    /**
     * 机型
     */
    @SerializedName("MachineType")
    private String machineType;
        
    
        
    /**
     * cpu平台
     */
    @SerializedName("MinimalCpuPlatform")
    private String minimalCpuPlatform;
        
    
        
    /**
     * 虚拟CPU核数
     */
    @SerializedName("CPU")
    private Integer cpu;
        
    
        
    /**
     * 内存大小
     */
    @SerializedName("Mem")
    private Integer mem;
        
    
        
    /**
     * GPU类型
     */
    @SerializedName("GpuType")
    private String gpuType;
        
    
        
    /**
     * GPU卡核心数
     */
    @SerializedName("GPU")
    private Integer gpu;
        
    
        
    /**
     * 系统盘类型
     */
    @SerializedName("BootDiskType")
    private String bootDiskType;
        
    
        
    /**
     * 数据盘大小
     */
    @SerializedName("DataDiskSize")
    private Integer dataDiskSize;
        
    
        
    /**
     * 数据盘类型
     */
    @SerializedName("DataDiskType")
    private String dataDiskType;
        
    
        
    /**
     * 业务组
     */
    @SerializedName("Tag")
    private String tag;
        
    
        
    /**
     * 付费方式
     */
    @SerializedName("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 节点id列表
     */
    @SerializedName("NodeList")
    private List<String> nodeList;
        
    
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }
    
    public String getNodeGroupName() {
        return nodeGroupName;
    }

    public void setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
    }
    
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }
    
    public String getMinimalCpuPlatform() {
        return minimalCpuPlatform;
    }

    public void setMinimalCpuPlatform(String minimalCpuPlatform) {
        this.minimalCpuPlatform = minimalCpuPlatform;
    }
    
    public Integer getCPU() {
        return cpu;
    }

    public void setCPU(Integer cpu) {
        this.cpu = cpu;
    }
    
    public Integer getMem() {
        return mem;
    }

    public void setMem(Integer mem) {
        this.mem = mem;
    }
    
    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }
    
    public Integer getGPU() {
        return gpu;
    }

    public void setGPU(Integer gpu) {
        this.gpu = gpu;
    }
    
    public String getBootDiskType() {
        return bootDiskType;
    }

    public void setBootDiskType(String bootDiskType) {
        this.bootDiskType = bootDiskType;
    }
    
    public Integer getDataDiskSize() {
        return dataDiskSize;
    }

    public void setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
    }
    
    public String getDataDiskType() {
        return dataDiskType;
    }

    public void setDataDiskType(String dataDiskType) {
        this.dataDiskType = dataDiskType;
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
    
    public List<String> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<String> nodeList) {
        this.nodeList = nodeList;
    }
    
        }
}









