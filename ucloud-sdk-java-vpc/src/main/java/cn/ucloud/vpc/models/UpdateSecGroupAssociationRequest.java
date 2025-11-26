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

public class UpdateSecGroupAssociationRequest extends Request {

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

    /** 资源ID */
    @NotEmpty
    @UCloudParam("ResourceId")
    private String resourceId;

    /** 被替换的安全组ID。支持数组格式，即为 string 数组。 */
    @NotEmpty
    @UCloudParam("OldSecGroupId")
    private List<String> oldSecGroupId;

    /** */
    @UCloudParam("NewPrioritySecGroup")
    private List<NewPrioritySecGroup> newPrioritySecGroup;

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

    public List<String> getOldSecGroupId() {
        return oldSecGroupId;
    }

    public void setOldSecGroupId(List<String> oldSecGroupId) {
        this.oldSecGroupId = oldSecGroupId;
    }

    public List<NewPrioritySecGroup> getNewPrioritySecGroup() {
        return newPrioritySecGroup;
    }

    public void setNewPrioritySecGroup(List<NewPrioritySecGroup> newPrioritySecGroup) {
        this.newPrioritySecGroup = newPrioritySecGroup;
    }

    public static class NewPrioritySecGroup extends Request {

        /** 新绑定安全组的绑定优先级。支持 NewPrioritySecGroup 为数组格式，即传对应数据的 JSON 格式数组。 */
        @NotEmpty
        @UCloudParam("Priority")
        private Integer priority;

        /** 需新绑定的安全组ID */
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
