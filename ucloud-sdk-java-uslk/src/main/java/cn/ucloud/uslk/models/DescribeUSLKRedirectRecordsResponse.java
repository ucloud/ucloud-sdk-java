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

package cn.ucloud.uslk.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeUSLKRedirectRecordsResponse extends Response {

    
        
    /**
     * 长链接列表
     */
    @SerializedName("Data")
    private List<RedirectRecords> data;
        
    
        
    /**
     * 数据总量
     */
    @SerializedName("Total")
    private Integer total;
        
    
    public List<RedirectRecords> getData() {
        return data;
    }

    public void setData(List<RedirectRecords> data) {
        this.data = data;
    }
    
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    
        public static class RedirectRecords extends Response {
            
        
    /**
     * 报备场景
     */
    @SerializedName("Scenario")
    private String scenario;
        
    
        
    /**
     * 短链接
     */
    @SerializedName("ShortLink")
    private String shortLink;
        
    
        
    /**
     * 短链接域名
     */
    @SerializedName("ShortLinkDomain")
    private String shortLinkDomain;
        
    
        
    /**
     * 访问时间戳（ms）
     */
    @SerializedName("RequestTime")
    private Integer requestTime;
        
    
        
    /**
     * 重定向时间戳 (ms)
     */
    @SerializedName("RedirectTime")
    private Integer redirectTime;
        
    
        
    /**
     * 账户ID
     */
    @SerializedName("AccountID")
    private Integer accountID;
        
    
        
    /**
     * 场景ID
     */
    @SerializedName("ScenarioID")
    private Integer scenarioID;
        
    
        
    /**
     * 访问IP
     */
    @SerializedName("ClientIP")
    private String clientIP;
        
    
        
    /**
     * 访问设备
     */
    @SerializedName("Browser")
    private String browser;
        
    
        
    /**
     * 访问操作系统
     */
    @SerializedName("Os")
    private String os;
        
    
        
    /**
     * 访问省份信息
     */
    @SerializedName("ProvinceCode")
    private String provinceCode;
        
    
    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }
    
    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }
    
    public String getShortLinkDomain() {
        return shortLinkDomain;
    }

    public void setShortLinkDomain(String shortLinkDomain) {
        this.shortLinkDomain = shortLinkDomain;
    }
    
    public Integer getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Integer requestTime) {
        this.requestTime = requestTime;
    }
    
    public Integer getRedirectTime() {
        return redirectTime;
    }

    public void setRedirectTime(Integer redirectTime) {
        this.redirectTime = redirectTime;
    }
    
    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }
    
    public Integer getScenarioID() {
        return scenarioID;
    }

    public void setScenarioID(Integer scenarioID) {
        this.scenarioID = scenarioID;
    }
    
    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }
    
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
    
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    
    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
    
        }
}









