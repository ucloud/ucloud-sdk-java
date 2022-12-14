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

package cn.ucloud.ucdn.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class GetUcdnDomainLogV2Response extends Response {

    
        
    /**
     * 
     */
    @SerializedName("DomainLogSet")
    private List<DomanLogList> domainLogSet;
        
    
    public List<DomanLogList> getDomainLogSet() {
        return domainLogSet;
    }

    public void setDomainLogSet(List<DomanLogList> domainLogSet) {
        this.domainLogSet = domainLogSet;
    }
    
        public static class DomanLogList extends Response {
            
        
    /**
     * 域名
     */
    @SerializedName("Domain")
    private String domain;
        
    
        
    /**
     * 日志信息列表
     */
    @SerializedName("LogList")
    private List<LogInfo> logList;
        
    
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    public List<LogInfo> getLogList() {
        return logList;
    }

    public void setLogList(List<LogInfo> logList) {
        this.logList = logList;
    }
    
        }
        public static class LogInfo extends Response {
            
        
    /**
     * Unix时间戳
     */
    @SerializedName("LogTime")
    private Integer logTime;
        
    
        
    /**
     * 日志url地址，多个URL用分号隔开
     */
    @SerializedName("LogUrl")
    private String logUrl;
        
    
    public Integer getLogTime() {
        return logTime;
    }

    public void setLogTime(Integer logTime) {
        this.logTime = logTime;
    }
    
    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }
    
        }
}









