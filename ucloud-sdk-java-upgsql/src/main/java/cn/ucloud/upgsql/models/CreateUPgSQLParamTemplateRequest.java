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

package cn.ucloud.upgsql.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class CreateUPgSQLParamTemplateRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 模板名称
     */
    @NotEmpty
    @UCloudParam("GroupName")
    private String groupName;
        
    
        
    /**
     * 基准模板
     */
    @NotEmpty
    @UCloudParam("SrcGroupID")
    private Integer srcGroupID;
        
    
        
    /**
     * 什么版本,以及类型的DB
     */
    @NotEmpty
    @UCloudParam("DBVersion")
    private String dbVersion;
        
    
        
    /**
     * 描述信息
     */
    @UCloudParam("Description")
    private String description;
        
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    public Integer getSrcGroupID() {
        return srcGroupID;
    }

    public void setSrcGroupID(Integer srcGroupID) {
        this.srcGroupID = srcGroupID;
    }
    
    public String getDBVersion() {
        return dbVersion;
    }

    public void setDBVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}









