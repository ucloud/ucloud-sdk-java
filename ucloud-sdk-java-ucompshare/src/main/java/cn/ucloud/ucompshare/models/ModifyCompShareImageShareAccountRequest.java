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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class ModifyCompShareImageShareAccountRequest extends Request {

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

    /** 镜像Id */
    @NotEmpty
    @UCloudParam("CompShareImageId")
    private String compShareImageId;

    /** 添加被共享的账号Id，每次最多10个。与RemoveAccounts.N不能同时为空 */
    @UCloudParam("AddAccounts")
    private List<Integer> addAccounts;

    /** 移除被共享的账号Id，每次最多10个。与AddAccounts.N不能同时为空 */
    @UCloudParam("RemoveAccounts")
    private List<Integer> removeAccounts;

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

    public String getCompShareImageId() {
        return compShareImageId;
    }

    public void setCompShareImageId(String compShareImageId) {
        this.compShareImageId = compShareImageId;
    }

    public List<Integer> getAddAccounts() {
        return addAccounts;
    }

    public void setAddAccounts(List<Integer> addAccounts) {
        this.addAccounts = addAccounts;
    }

    public List<Integer> getRemoveAccounts() {
        return removeAccounts;
    }

    public void setRemoveAccounts(List<Integer> removeAccounts) {
        this.removeAccounts = removeAccounts;
    }
}
