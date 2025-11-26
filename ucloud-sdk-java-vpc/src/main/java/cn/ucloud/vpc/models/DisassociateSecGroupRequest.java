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

public class DisassociateSecGroupRequest extends Request {

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

    /** 安全组ID，不传表示解绑安全组绑定的所以资源，安全组ID和资源ID至少传一个,且只能有一个批量。支持 string 数组格式。 */
    @UCloudParam("SecGroupId")
    private List<String> secGroupId;

    /** 资源ID，不传表示解绑资源上所有安全组，安全组ID和资源ID至少传一个，且只能有一个批量。支持 string 数组格式。 */
    @UCloudParam("ResourceId")
    private List<String> resourceId;

    /** 是否强制解绑。默认为 false。为 true 表示强制解绑，用于删除资源前的解绑，因为开启安全组特性的资源至少绑定一个安全组，正常情况下是不允许解绑所有安全组。 */
    @UCloudParam("Force")
    private Boolean force;

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

    public List<String> getSecGroupId() {
        return secGroupId;
    }

    public void setSecGroupId(List<String> secGroupId) {
        this.secGroupId = secGroupId;
    }

    public List<String> getResourceId() {
        return resourceId;
    }

    public void setResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
    }

    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }
}
