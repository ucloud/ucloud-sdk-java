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

package cn.ucloud.pathx.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class DescribePathXSSLRequest extends Request {

    
        
    /**
     * 项目ID。请参考[GetProjectList接口](../summary/get_project_list.html)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * SSL证书的Id，不传分页获取证书列表
     */
    @UCloudParam("SSLId")
    private String sslId;
        
    
        
    /**
     * 不为空则按证书名称、证书域名模糊搜索 分页返回结果
     */
    @UCloudParam("SearchValue")
    private String searchValue;
        
    
        
    /**
     * 最大返回条数，默认100，最大400
     */
    @UCloudParam("Limit")
    private Integer limit;
        
    
        
    /**
     * 偏移值 默认为0
     */
    @UCloudParam("Offset")
    private Integer offset;
        
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getSSLId() {
        return sslId;
    }

    public void setSSLId(String sslId) {
        this.sslId = sslId;
    }
    
    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }
    
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    
}









