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

package cn.ucloud.uhost.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class CopyCustomImageRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @UCloudParam("Zone")
    private String zone;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 源镜像Id, 参见 DescribeImage
     */
    @NotEmpty
    @UCloudParam("SourceImageId")
    private String sourceImageId;
        
    
        
    /**
     * 目标项目Id, 参见 GetProjectList
     */
    @NotEmpty
    @UCloudParam("TargetProjectId")
    private String targetProjectId;
        
    
        
    /**
     * 目标地域，不跨地域不用填
     */
    @UCloudParam("TargetRegion")
    private String targetRegion;
        
    
        
    /**
     * 目标镜像名称
     */
    @UCloudParam("TargetImageName")
    private String targetImageName;
        
    
        
    /**
     * 目标镜像描述
     */
    @UCloudParam("TargetImageDescription")
    private String targetImageDescription;
        
    
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
    
    public String getSourceImageId() {
        return sourceImageId;
    }

    public void setSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
    }
    
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }
    
    public String getTargetRegion() {
        return targetRegion;
    }

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }
    
    public String getTargetImageName() {
        return targetImageName;
    }

    public void setTargetImageName(String targetImageName) {
        this.targetImageName = targetImageName;
    }
    
    public String getTargetImageDescription() {
        return targetImageDescription;
    }

    public void setTargetImageDescription(String targetImageDescription) {
        this.targetImageDescription = targetImageDescription;
    }
    
}









