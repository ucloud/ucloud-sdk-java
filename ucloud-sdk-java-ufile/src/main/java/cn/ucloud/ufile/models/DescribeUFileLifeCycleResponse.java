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

package cn.ucloud.ufile.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeUFileLifeCycleResponse extends Response {

    
        
    /**
     * 生命周期信息
     */
    @SerializedName("DateSet")
    private List<LifeCycleItem> dateSet;
        
    
    public List<LifeCycleItem> getDateSet() {
        return dateSet;
    }

    public void setDateSet(List<LifeCycleItem> dateSet) {
        this.dateSet = dateSet;
    }
    
        public static class LifeCycleItem extends Response {
            
        
    /**
     * 生命周期Id
     */
    @SerializedName("LifeCycleId")
    private String lifeCycleId;
        
    
        
    /**
     * 生命周期名称
     */
    @SerializedName("LifeCycleName")
    private String lifeCycleName;
        
    
        
    /**
     * 生命周期所适用的前缀；*为整个存储空间文件；
     */
    @SerializedName("Prefix")
    private String prefix;
        
    
        
    /**
     * 指定一个过期天数N，文件会在其最近更新时间点的N天后过期，自动删除，0代表不启用；
     */
    @SerializedName("Days")
    private Integer days;
        
    
        
    /**
     * Enabled -- 启用，Disabled -- 不启用
     */
    @SerializedName("Status")
    private String status;
        
    
        
    /**
     * 存储空间名称
     */
    @SerializedName("BucketName")
    private String bucketName;
        
    
        
    /**
     * 指定一个过期天数N，文件会在其最近更新时间点的N天后过期，自动转换为归档存储类型，0代表不启用；
     */
    @SerializedName("ArchivalDays")
    private Integer archivalDays;
        
    
        
    /**
     * 指定一个过期天数N，文件会在其最近更新时间点的N天后过期，自动转换为低频存储类型，0代表不启用；
     */
    @SerializedName("IADays")
    private Integer iaDays;
        
    
    public String getLifeCycleId() {
        return lifeCycleId;
    }

    public void setLifeCycleId(String lifeCycleId) {
        this.lifeCycleId = lifeCycleId;
    }
    
    public String getLifeCycleName() {
        return lifeCycleName;
    }

    public void setLifeCycleName(String lifeCycleName) {
        this.lifeCycleName = lifeCycleName;
    }
    
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    
    public Integer getArchivalDays() {
        return archivalDays;
    }

    public void setArchivalDays(Integer archivalDays) {
        this.archivalDays = archivalDays;
    }
    
    public Integer getIADays() {
        return iaDays;
    }

    public void setIADays(Integer iaDays) {
        this.iaDays = iaDays;
    }
    
        }
}









