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


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class DescribeUSLKShortLinkListRequest extends Request {

    
        
    /**
     * 页码，从0开始，用于分页查找
     */
    @UCloudParam("Page")
    private Integer page;
        
    
        
    /**
     * 1: 待生效；2：已生效；3：已失效；4：已删除（预留）；5：已封禁
     */
    @UCloudParam("Status")
    private Integer status;
        
    
        
    /**
     * 每页个数，用于分页查找，默认20
     */
    @UCloudParam("NumPerPage")
    private Integer numPerPage;
        
    
        
    /**
     * 根据指定字段排序：默认按创建时间：CreateTime 排序，支持值：CreateTime,StartTime,EndTime
     */
    @UCloudParam("OrderBy")
    private String orderBy;
        
    
        
    /**
     * 排序方式。asc-正序 desc-倒序

     */
    @UCloudParam("OrderType")
    private String orderType;
        
    
        
    /**
     * 模糊查询字段值，支持根据生成短链接进行模糊查询。支持字段(LonkLink,场景名称)

     */
    @UCloudParam("FuzzySearch")
    private String fuzzySearch;
        
    
        
    /**
     * 查询周期开始时间戳
     */
    @UCloudParam("StartTime")
    private Integer startTime;
        
    
        
    /**
     * 查询周期结束时间戳
     */
    @UCloudParam("EndTime")
    private Integer endTime;
        
    
        
    /**
     * 短链
     */
    @UCloudParam("ShortLink")
    private String shortLink;
        
    
        
    /**
     * 场景ID
     */
    @UCloudParam("ScenarioID")
    private Integer scenarioID;
        
    
        
    /**
     * 长链接ID
     */
    @UCloudParam("LongLinkID")
    private Integer longLinkID;
        
    
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public Integer getNumPerPage() {
        return numPerPage;
    }

    public void setNumPerPage(Integer numPerPage) {
        this.numPerPage = numPerPage;
    }
    
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
    
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    
    public String getFuzzySearch() {
        return fuzzySearch;
    }

    public void setFuzzySearch(String fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
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
    
    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }
    
    public Integer getScenarioID() {
        return scenarioID;
    }

    public void setScenarioID(Integer scenarioID) {
        this.scenarioID = scenarioID;
    }
    
    public Integer getLongLinkID() {
        return longLinkID;
    }

    public void setLongLinkID(Integer longLinkID) {
        this.longLinkID = longLinkID;
    }
    
}









