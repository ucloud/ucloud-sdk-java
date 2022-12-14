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

public class DescribeUSLKShortLinkListResponse extends Response {

    
        
    /**
     * 短链接列表
     */
    @SerializedName("Data")
    private List<ShortLink> data;
        
    
    public List<ShortLink> getData() {
        return data;
    }

    public void setData(List<ShortLink> data) {
        this.data = data;
    }
    
        public static class SecondaryLinkForQuery extends Response {
            
        
    /**
     * 长链接ID
     */
    @SerializedName("LongLinkID")
    private Integer longLinkID;
        
    
        
    /**
     * 长短链接映射ID
     */
    @SerializedName("ShortLongMapID")
    private Integer shortLongMapID;
        
    
        
    /**
     * 长链接
     */
    @SerializedName("LongLink")
    private String longLink;
        
    
        
    /**
     * 场景ID
     */
    @SerializedName("ScenarioID")
    private Integer scenarioID;
        
    
        
    /**
     * 场景名称
     */
    @SerializedName("Scenario")
    private String scenario;
        
    
        
    /**
     * 是否是次链接
     */
    @SerializedName("IsSecondary")
    private Boolean isSecondary;
        
    
        
    /**
     * 省份codes，例如: Hebei,Shandong,多个以逗号分隔
     */
    @SerializedName("ProvinceCodes")
    private String provinceCodes;
        
    
        
    /**
     * 操作系统,例如: Windows,Android,多个以逗号分隔
     */
    @SerializedName("Oses")
    private String oses;
        
    
    public Integer getLongLinkID() {
        return longLinkID;
    }

    public void setLongLinkID(Integer longLinkID) {
        this.longLinkID = longLinkID;
    }
    
    public Integer getShortLongMapID() {
        return shortLongMapID;
    }

    public void setShortLongMapID(Integer shortLongMapID) {
        this.shortLongMapID = shortLongMapID;
    }
    
    public String getLongLink() {
        return longLink;
    }

    public void setLongLink(String longLink) {
        this.longLink = longLink;
    }
    
    public Integer getScenarioID() {
        return scenarioID;
    }

    public void setScenarioID(Integer scenarioID) {
        this.scenarioID = scenarioID;
    }
    
    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }
    
    public Boolean getIsSecondary() {
        return isSecondary;
    }

    public void setIsSecondary(Boolean isSecondary) {
        this.isSecondary = isSecondary;
    }
    
    public String getProvinceCodes() {
        return provinceCodes;
    }

    public void setProvinceCodes(String provinceCodes) {
        this.provinceCodes = provinceCodes;
    }
    
    public String getOses() {
        return oses;
    }

    public void setOses(String oses) {
        this.oses = oses;
    }
    
        }
        public static class ShortLink extends Response {
            
        
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
     * 短链接开始生效时间戳
     */
    @SerializedName("StartTime")
    private Integer startTime;
        
    
        
    /**
     * 短链接过期时间戳
     */
    @SerializedName("EndTime")
    private Integer endTime;
        
    
        
    /**
     * 关联长链接列表
     */
    @SerializedName("LongLinks")
    private List<String> longLinks;
        
    
        
    /**
     * 短链接创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 短链接ID
     */
    @SerializedName("ID")
    private Integer id;
        
    
        
    /**
     * 场景ID
     */
    @SerializedName("ScenarioID")
    private Integer scenarioID;
        
    
        
    /**
     * 场景描述
     */
    @SerializedName("ScenarioDesc")
    private String scenarioDesc;
        
    
        
    /**
     * 更新时间戳
     */
    @SerializedName("UpdateTime")
    private Integer updateTime;
        
    
        
    /**
     * 删除时间戳
     */
    @SerializedName("DeleteTime")
    private Integer deleteTime;
        
    
        
    /**
     * 链接类型-预留：1:普通跳转 3:智能跳转等
     */
    @SerializedName("Type")
    private Integer type;
        
    
        
    /**
     * 短链接状态：1: 待生效；2：已生效；3：已失效；4：已删除（预留）；5：已封禁
     */
    @SerializedName("Status")
    private Integer status;
        
    
        
    /**
     * 操作人
     */
    @SerializedName("Operator")
    private String operator;
        
    
        
    /**
     * 操作说明(封禁原因)
     */
    @SerializedName("Remark")
    private String remark;
        
    
        
    /**
     * 累计访问量
     */
    @SerializedName("ClickCount")
    private Integer clickCount;
        
    
        
    /**
     * 当日访问量
     */
    @SerializedName("ClickCountToday")
    private Integer clickCountToday;
        
    
        
    /**
     * 累计独立访问量
     */
    @SerializedName("UniqueClickCount")
    private Integer uniqueClickCount;
        
    
        
    /**
     * 今日独立访问量
     */
    @SerializedName("UniqueClickCountToday")
    private Integer uniqueClickCountToday;
        
    
        
    /**
     * 次链接，智能跳转类型才有
     */
    @SerializedName("SecondaryLinks")
    private List<SecondaryLinkForQuery> secondaryLinks;
        
    
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
    
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }
    
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
    
    public List<String> getLongLinks() {
        return longLinks;
    }

    public void setLongLinks(List<String> longLinks) {
        this.longLinks = longLinks;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }
    
    public Integer getScenarioID() {
        return scenarioID;
    }

    public void setScenarioID(Integer scenarioID) {
        this.scenarioID = scenarioID;
    }
    
    public String getScenarioDesc() {
        return scenarioDesc;
    }

    public void setScenarioDesc(String scenarioDesc) {
        this.scenarioDesc = scenarioDesc;
    }
    
    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
    
    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }
    
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }
    
    public Integer getClickCountToday() {
        return clickCountToday;
    }

    public void setClickCountToday(Integer clickCountToday) {
        this.clickCountToday = clickCountToday;
    }
    
    public Integer getUniqueClickCount() {
        return uniqueClickCount;
    }

    public void setUniqueClickCount(Integer uniqueClickCount) {
        this.uniqueClickCount = uniqueClickCount;
    }
    
    public Integer getUniqueClickCountToday() {
        return uniqueClickCountToday;
    }

    public void setUniqueClickCountToday(Integer uniqueClickCountToday) {
        this.uniqueClickCountToday = uniqueClickCountToday;
    }
    
    public List<SecondaryLinkForQuery> getSecondaryLinks() {
        return secondaryLinks;
    }

    public void setSecondaryLinks(List<SecondaryLinkForQuery> secondaryLinks) {
        this.secondaryLinks = secondaryLinks;
    }
    
        }
}









