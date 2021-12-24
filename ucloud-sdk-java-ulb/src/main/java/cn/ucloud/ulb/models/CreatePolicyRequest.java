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
package cn.ucloud.ulb.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;
import java.util.List;

public class CreatePolicyRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 需要添加内容转发策略的负载均衡实例ID */
    @NotEmpty
    @UCloudParam("ULBId")
    private String ulbId;

    /** 需要添加内容转发策略的VServer实例ID */
    @NotEmpty
    @UCloudParam("VServerId")
    private String vServerId;

    /** 内容转发策略应用的后端资源实例的ID，来源于 AllocateBackend 返回的 BackendId */
    @NotEmpty
    @UCloudParam("BackendId")
    private List<String> backendId;

    /** 内容转发匹配字段 */
    @NotEmpty
    @UCloudParam("Match")
    private String match;

    /** 内容转发匹配字段的类型 */
    @UCloudParam("Type")
    private String type;

    /** 策略优先级，1-9999 */
    @UCloudParam("PolicyPriority")
    private Integer policyPriority;

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

    public String getULBId() {
        return ulbId;
    }

    public void setULBId(String ulbId) {
        this.ulbId = ulbId;
    }

    public String getVServerId() {
        return vServerId;
    }

    public void setVServerId(String vServerId) {
        this.vServerId = vServerId;
    }

    public List<String> getBackendId() {
        return backendId;
    }

    public void setBackendId(List<String> backendId) {
        this.backendId = backendId;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPolicyPriority() {
        return policyPriority;
    }

    public void setPolicyPriority(Integer policyPriority) {
        this.policyPriority = policyPriority;
    }
}
