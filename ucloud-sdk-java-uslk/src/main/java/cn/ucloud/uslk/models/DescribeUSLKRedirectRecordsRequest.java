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

public class DescribeUSLKRedirectRecordsRequest extends Request {

    
        
    /**
     * 查询周期开始时间戳(ms级别)
     */
    @NotEmpty
    @UCloudParam("StartTime")
    private Integer startTime;
        
    
        
    /**
     * 查询周期结束时间戳(ms级别)
     */
    @NotEmpty
    @UCloudParam("EndTime")
    private Integer endTime;
        
    
        
    /**
     * 短链接
     */
    @NotEmpty
    @UCloudParam("ShortLink")
    private String shortLink;
        
    
        
    /**
     * 页码，从0开始，用于分页查找
     */
    @UCloudParam("Page")
    private Integer page;
        
    
        
    /**
     * 每页个数，用于分页查找，默认20
     */
    @UCloudParam("NumPerPage")
    private Integer numPerPage;
        
    
        
    /**
     * 根据指定字段排序：默认按短链接访问时间：CreateTime 排序
     */
    @UCloudParam("OrderBy")
    private String orderBy;
        
    
        
    /**
     * 排序方式。asc-正序 desc-倒序

     */
    @UCloudParam("OrderType")
    private String orderType;
        
    
        
    /**
     * 模糊查询字段值，支持根据生成短链接进行模糊查询。支持字段(ShortLink，场景名称)

     */
    @UCloudParam("FuzzySearch")
    private String fuzzySearch;
        
    
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
    
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
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
    
}









