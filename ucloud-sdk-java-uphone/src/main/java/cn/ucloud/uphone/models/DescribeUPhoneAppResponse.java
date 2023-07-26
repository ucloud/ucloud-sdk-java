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

public class DescribeUPhoneAppResponse extends Response {

    
        
    /**
     * AppInstance总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
        
    /**
     * 云手机应用实例列表，每项参数可见数据模型 [AppInstance](#appInstance)
     */
    @SerializedName("Apps")
    private List<AppInstance> apps;
        
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
    public List<AppInstance> getApps() {
        return apps;
    }

    public void setApps(List<AppInstance> apps) {
        this.apps = apps;
    }
    
        public static class AppInstance extends Response {
            
        
    /**
     * 应用的唯一标识ID
     */
    @SerializedName("AppId")
    private String appId;
        
    
        
    /**
     * 应用名称。
     */
    @SerializedName("AppName")
    private String appName;
        
    
        
    /**
     * 创建时间，格式为Unix时间戳。
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 修改时间，格式为Unix时间戳。
     */
    @SerializedName("ModifyTime")
    private Integer modifyTime;
        
    
        
    /**
     * 应用描述。
     */
    @SerializedName("Description")
    private String description;
        
    
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
    
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public Integer getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Integer modifyTime) {
        this.modifyTime = modifyTime;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
        }
}









