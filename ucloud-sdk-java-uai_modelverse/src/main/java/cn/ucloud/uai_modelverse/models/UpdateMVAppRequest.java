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


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class UpdateMVAppRequest extends Request {

    
        
    /**
     * 应用ID
     */
    @NotEmpty
    @UCloudParam("AppID")
    private String appID;
        
    
        
    /**
     * 应用名称
     */
    @UCloudParam("AppName")
    private String appName;
        
    
        
    /**
     * 应用类型
     */
    @UCloudParam("AppType")
    private Integer appType;
        
    
        
    /**
     * 应用状态
     */
    @UCloudParam("AppState")
    private Integer appState;
        
    
        
    /**
     * 语言模型ID
     */
    @UCloudParam("LLMID")
    private String llmid;
        
    
        
    /**
     * 模型采样温度，(0,100)开区间，默认值95
     */
    @UCloudParam("LLMTemperature")
    private Integer llmTemperature;
        
    
        
    /**
     * 模型采样温度（核取样），(0,100)开区间，默认值70
     */
    @UCloudParam("LLMTopP")
    private Integer llmTopP;
        
    
        
    /**
     * 应用描述
     */
    @UCloudParam("AppDes")
    private String appDes;
        
    
    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }
    
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
    
    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
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
    
    public String getAppDes() {
        return appDes;
    }

    public void setAppDes(String appDes) {
        this.appDes = appDes;
    }
    
}









