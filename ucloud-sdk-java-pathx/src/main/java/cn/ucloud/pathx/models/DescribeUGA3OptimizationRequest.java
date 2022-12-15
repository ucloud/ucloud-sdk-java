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

public class DescribeUGA3OptimizationRequest extends Request {

    
        
    /**
     * 项目ID,如org-xxxx。请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 源站AreaCode
     */
    @NotEmpty
    @UCloudParam("AreaCode")
    private String areaCode;
        
    
        
    /**
     * 默认一天 ，枚举类型["Hour","Day","Week"]
     */
    @UCloudParam("TimeRange")
    private String timeRange;
        
    
        
    /**
     * 加速大区,默认Global,[
    "Global":"全球",
    "AP":"亚太",
    "EU":"欧洲",
    "ME":"中东",
    "OA":"大洋洲",
    "AF":"非洲",
    "NA":"北美洲",
    "SA":"南美洲"
]
     */
    @UCloudParam("AccelerationArea")
    private String accelerationArea;
        
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    
    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }
    
    public String getAccelerationArea() {
        return accelerationArea;
    }

    public void setAccelerationArea(String accelerationArea) {
        this.accelerationArea = accelerationArea;
    }
    
}









