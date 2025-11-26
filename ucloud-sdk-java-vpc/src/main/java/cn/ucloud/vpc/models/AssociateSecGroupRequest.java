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

public class AssociateSecGroupRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 资源短 ID，安全组参数和该字段只支持一个批量。支持 string 数组。 */
    @NotEmpty
    @UCloudParam("ResourceId")
    private List<String> resourceId;

    /** */
    @UCloudParam("PrioritySecGroup")
    private List<PrioritySecGroup> prioritySecGroup;

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

    public List<String> getResourceId() {
        return resourceId;
    }

    public void setResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
    }

    public List<PrioritySecGroup> getPrioritySecGroup() {
        return prioritySecGroup;
    }

    public void setPrioritySecGroup(List<PrioritySecGroup> prioritySecGroup) {
        this.prioritySecGroup = prioritySecGroup;
    }

    public static class PrioritySecGroup extends Request {

        /** 绑定优先级。该字段和资源 ID 只支持一个批量。支持 PrioritySecGroup 的 JSON 格式数组。 */
        @NotEmpty
        @UCloudParam("Priority")
        private Integer priority;

        /** 安全组 ID。该字段和资源 ID 只支持一个批量。支持 PrioritySecGroup 的 JSON 格式数组。 */
        @NotEmpty
        @UCloudParam("SecGroupId")
        private String secGroupId;

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public String getSecGroupId() {
            return secGroupId;
        }

        public void setSecGroupId(String secGroupId) {
            this.secGroupId = secGroupId;
        }
    }
}
