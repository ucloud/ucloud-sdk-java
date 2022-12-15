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


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class GetNewUcdnLogRefererStatisticsRequest extends Request {

    
        
    /**
     * 域名id，创建域名时生成的id
     */
    @UCloudParam("DomainId")
    private String domainId;
        
    
        
    /**
     * 查询带宽区域 cn代表国内 abroad代表海外 ；目前只支持国内
     */
    @UCloudParam("Areacode")
    private String areacode;
        
    
        
    /**
     * 查询带宽的起始时间，格式：时间戳
     */
    @UCloudParam("BeginTime")
    private Integer beginTime;
        
    
        
    /**
     * 查询统计日志的结束时间，格式：时间戳。最大时间间隔30天
     */
    @UCloudParam("EndTime")
    private Integer endTime;
        
    
        
    /**
     * 0表示按流量降序排列，1表示按照下载次数降序排列，默认为0
     */
    @UCloudParam("OrderBy")
    private Integer orderBy;
        
    
        
    /**
     * 返回的结果数量限制，默认1000
     */
    @UCloudParam("Limit")
    private Integer limit;
        
    
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }
    
    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }
    
    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }
    
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
    
    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }
    
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
}









