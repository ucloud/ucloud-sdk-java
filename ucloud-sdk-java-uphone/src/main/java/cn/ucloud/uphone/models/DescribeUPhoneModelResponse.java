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

package cn.ucloud.uphone.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeUPhoneModelResponse extends Response {

    
        
    /**
     * UPhoneModelInstance总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
        
    /**
     * UPhoneModel实例列表，具体参数可见 UPhoneModelInstance
     */
    @SerializedName("UPhoneModels")
    private List<UPhoneModelInstance> uPhoneModels;
        
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
    public List<UPhoneModelInstance> getUPhoneModels() {
        return uPhoneModels;
    }

    public void setUPhoneModels(List<UPhoneModelInstance> uPhoneModels) {
        this.uPhoneModels = uPhoneModels;
    }
    
        public static class UPhoneModelInstance extends Response {
            
        
    /**
     * UPhoneModel名称
     */
    @SerializedName("UPhoneModelName")
    private String uPhoneModelName;
        
    
        
    /**
     * 虚拟CPU核数。
     */
    @SerializedName("CPU")
    private Integer cpu;
        
    
        
    /**
     * 内存大小。单位MB
     */
    @SerializedName("Memory")
    private Integer memory;
        
    
        
    /**
     * 磁盘大小，单位: GB
     */
    @SerializedName("DiskSize")
    private Integer diskSize;
        
    
        
    /**
     * 分辨率
     */
    @SerializedName("Resolution")
    private String resolution;
        
    
        
    /**
     * 刷新率
     */
    @SerializedName("Refresh")
    private Integer refresh;
        
    
        
    /**
     * DPI
     */
    @SerializedName("Dpi")
    private Integer dpi;
        
    
        
    /**
     * 型号描述信息
     */
    @SerializedName("Description")
    private String description;
        
    
    public String getUPhoneModelName() {
        return uPhoneModelName;
    }

    public void setUPhoneModelName(String uPhoneModelName) {
        this.uPhoneModelName = uPhoneModelName;
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
    
    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }
    
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    
    public Integer getRefresh() {
        return refresh;
    }

    public void setRefresh(Integer refresh) {
        this.refresh = refresh;
    }
    
    public Integer getDpi() {
        return dpi;
    }

    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
        }
}









