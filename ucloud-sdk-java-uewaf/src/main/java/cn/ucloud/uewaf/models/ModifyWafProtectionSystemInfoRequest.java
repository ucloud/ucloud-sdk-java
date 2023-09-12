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
package cn.ucloud.uewaf.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class ModifyWafProtectionSystemInfoRequest extends Request {

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 要操作的域名 */
    @NotEmpty
    @UCloudParam("FullDomain")
    private String fullDomain;

    /** 设置为拦截的系统默认规则 */
    @UCloudParam("Deny")
    private List<Integer> deny;

    /** 设置为放行的系统默认规则 */
    @UCloudParam("Accept")
    private List<Integer> accept;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getFullDomain() {
        return fullDomain;
    }

    public void setFullDomain(String fullDomain) {
        this.fullDomain = fullDomain;
    }

    public List<Integer> getDeny() {
        return deny;
    }

    public void setDeny(List<Integer> deny) {
        this.deny = deny;
    }

    public List<Integer> getAccept() {
        return accept;
    }

    public void setAccept(List<Integer> accept) {
        this.accept = accept;
    }
}
