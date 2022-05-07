/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.pathx.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class GetUGA3UpdatePriceRequest extends Request {

    /** 项目ID。请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 资源ID */
    @NotEmpty
    @UCloudParam("InstanceId")
    private String instanceId;

    /** 只有升级带宽的时候有价格变化 */
    @UCloudParam("Bandwidth")
    private Integer bandwidth;

    /** 暂未支持，加速大区，在更换加速大区的时候使用 */
    @UCloudParam("AccelerationArea")
    private String accelerationArea;

    /** 暂未支持，源站区域 */
    @UCloudParam("AreaCode")
    private String areaCode;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getAccelerationArea() {
        return accelerationArea;
    }

    public void setAccelerationArea(String accelerationArea) {
        this.accelerationArea = accelerationArea;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
