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

package cn.ucloud.udisk.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeRecycleUDiskResponse extends Response {

    
        
    /**
     * 磁盘数量
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
        
    /**
     * 回收站磁盘列表
     */
    @SerializedName("DataSet")
    private List<RecycleUDiskSet> dataSet;
        
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
    public List<RecycleUDiskSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<RecycleUDiskSet> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class RecycleUDiskSet extends Response {
            
        
    /**
     * 磁盘id
     */
    @SerializedName("UDiskId")
    private String uDiskId;
        
    
        
    /**
     * 创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 过期时间
     */
    @SerializedName("ExpiredTime")
    private Integer expiredTime;
        
    
        
    /**
     * 销毁倒计时
     */
    @SerializedName("CountdownTime")
    private Integer countdownTime;
        
    
        
    /**
     * 磁盘名称
     */
    @SerializedName("Name")
    private String name;
        
    
        
    /**
     * 磁盘容量
     */
    @SerializedName("Size")
    private Integer size;
        
    
        
    /**
     * 业务组
     */
    @SerializedName("Tag")
    private String tag;
        
    
        
    /**
     * 可用区
     */
    @SerializedName("Zone")
    private String zone;
        
    
    public String getUDiskId() {
        return uDiskId;
    }

    public void setUDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public Integer getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
    }
    
    public Integer getCountdownTime() {
        return countdownTime;
    }

    public void setCountdownTime(Integer countdownTime) {
        this.countdownTime = countdownTime;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    
        }
}









