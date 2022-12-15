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

package cn.ucloud.unet.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class DescribeEIPRequest extends Request {

    
        
    /**
     * 地域
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 弹性IP的资源ID如果为空, 则返回当前 Region中符合条件的的所有EIP
     */
    @UCloudParam("EIPIds")
    private List<String> eipIds;
        
    
        
    /**
     * 数据偏移量, 默认为0
     */
    @UCloudParam("Offset")
    private Integer offset;
        
    
        
    /**
     * 数据分页值, 默认为20
     */
    @UCloudParam("Limit")
    private Integer limit;
        
    
        
    /**
     * IP地址，支持通过ip查询，如果ip与EIP都传，会取并集查询
     */
    @UCloudParam("IPs")
    private List<String> iPs;
        
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public List<String> getEIPIds() {
        return eipIds;
    }

    public void setEIPIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }
    
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    public List<String> getIPs() {
        return iPs;
    }

    public void setIPs(List<String> iPs) {
        this.iPs = iPs;
    }
    
}









