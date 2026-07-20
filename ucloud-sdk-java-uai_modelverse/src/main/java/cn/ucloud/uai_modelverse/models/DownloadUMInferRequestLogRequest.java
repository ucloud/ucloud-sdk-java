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
package cn.ucloud.uai_modelverse.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class DownloadUMInferRequestLogRequest extends Request {

    /** 业务地域，如 cn-wlcb。可先调用 ListUMInferRegions 获取可选地域 */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。请参考
     * [GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 导出开始时间，Unix 毫秒时间戳 */
    @NotEmpty
    @UCloudParam("StartTime")
    private Integer startTime;

    /** 导出结束时间，Unix 毫秒时间戳，最长支持 30 天范围 */
    @NotEmpty
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 接收导出结果的邮箱地址 */
    @NotEmpty
    @UCloudParam("Email")
    private String email;

    /** 模型名称列表，用于过滤 */
    @UCloudParam("ModelNames")
    private List<String> modelNames;

    /** API Key ID 列表，用于过滤 */
    @UCloudParam("ApiKeyIds")
    private List<String> apiKeyIds;

    /** 请求 ID，用于精确过滤 */
    @UCloudParam("RequestId")
    private String requestId;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getModelNames() {
        return modelNames;
    }

    public void setModelNames(List<String> modelNames) {
        this.modelNames = modelNames;
    }

    public List<String> getApiKeyIds() {
        return apiKeyIds;
    }

    public void setApiKeyIds(List<String> apiKeyIds) {
        this.apiKeyIds = apiKeyIds;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
