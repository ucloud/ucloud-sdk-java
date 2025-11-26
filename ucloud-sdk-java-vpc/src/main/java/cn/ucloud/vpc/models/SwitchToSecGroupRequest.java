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
package cn.ucloud.vpc.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class SwitchToSecGroupRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 资源ID。资源类型为 UHost、UNI、PAAS 资源 */
    @NotEmpty
    @UCloudParam("ResourceId")
    private String resourceId;

    /** 是否移除当前的防火墙（且绑定默认全通的防火墙） */
    @NotEmpty
    @UCloudParam("IsRemoveFirewall")
    private Boolean isRemoveFirewall;

    /** PrioritySecGroup类型的数组 */
    @UCloudParam("PrioritySecGroup")
    private List<String> prioritySecGroup;

    /** map[string][]PrioritySecGroup， string 到 PrioritySecGroup 数组的映射 */
    @UCloudParam("UniToPrioritySecGroup")
    private String uniToPrioritySecGroup;

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

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Boolean getIsRemoveFirewall() {
        return isRemoveFirewall;
    }

    public void setIsRemoveFirewall(Boolean isRemoveFirewall) {
        this.isRemoveFirewall = isRemoveFirewall;
    }

    public List<String> getPrioritySecGroup() {
        return prioritySecGroup;
    }

    public void setPrioritySecGroup(List<String> prioritySecGroup) {
        this.prioritySecGroup = prioritySecGroup;
    }

    public String getUniToPrioritySecGroup() {
        return uniToPrioritySecGroup;
    }

    public void setUniToPrioritySecGroup(String uniToPrioritySecGroup) {
        this.uniToPrioritySecGroup = uniToPrioritySecGroup;
    }
}
