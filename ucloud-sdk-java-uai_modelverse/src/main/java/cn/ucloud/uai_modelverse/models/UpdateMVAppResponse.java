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

package cn.ucloud.uai_modelverse.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class UpdateMVAppResponse extends Response {

    
        
    /**
     * Code非0时，描述错误信息
     */
    @SerializedName("Msg")
    private String msg;
        
    
        
    /**
     * 
     */
    @SerializedName("AppInfo")
    private AppInfo appInfo;
        
    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public AppInfo getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(AppInfo appInfo) {
        this.appInfo = appInfo;
    }
    
        public static class AppInfo extends Response {
            
        
    /**
     * 应用名称
     */
    @SerializedName("AppName")
    private String appName;
        
    
        
    /**
     * 应用ID
     */
    @SerializedName("AppID")
    private String appID;
        
    
        
    /**
     * 应用类型
     */
    @SerializedName("AppType")
    private Integer appType;
        
    
        
    /**
     * 应用描述
     */
    @SerializedName("AppDes")
    private String appDes;
        
    
        
    /**
     * 应用状态
     */
    @SerializedName("AppState")
    private Integer appState;
        
    
        
    /**
     * 语言模型ID
     */
    @SerializedName("LLMID")
    private String llmid;
        
    
        
    /**
     * 模型采样温度
     */
    @SerializedName("LLMTemperature")
    private Integer llmTemperature;
        
    
        
    /**
     * 模型采样温度的另一种方法（核取样）
     */
    @SerializedName("LLMTopP")
    private Integer llmTopP;
        
    
        
    /**
     * 应用创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 应用更新时间
     */
    @SerializedName("UpdateTime")
    private Integer updateTime;
        
    
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
    
    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }
    
    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }
    
    public String getAppDes() {
        return appDes;
    }

    public void setAppDes(String appDes) {
        this.appDes = appDes;
    }
    
    public Integer getAppState() {
        return appState;
    }

    public void setAppState(Integer appState) {
        this.appState = appState;
    }
    
    public String getLLMID() {
        return llmid;
    }

    public void setLLMID(String llmid) {
        this.llmid = llmid;
    }
    
    public Integer getLLMTemperature() {
        return llmTemperature;
    }

    public void setLLMTemperature(Integer llmTemperature) {
        this.llmTemperature = llmTemperature;
    }
    
    public Integer getLLMTopP() {
        return llmTopP;
    }

    public void setLLMTopP(Integer llmTopP) {
        this.llmTopP = llmTopP;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
    
        }
}









