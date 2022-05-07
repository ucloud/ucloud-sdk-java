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

import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class DescribeUGA3AreaRequest extends Request {

    /** 项目ID,如org-xxxx。请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list) */
    @UCloudParam("ProjectId")
    private String projectId;

    /** IP集合，非必填。如果填IP或者域名，会推荐一个地域在返回列表的第一个，源站IP集合，以逗号分隔[127.0.0.1,127.0.0.2] */
    @UCloudParam("IPList")
    private String ipList;

    /** 域名，非必填。如果填IP或者域名，会推荐一个地域在返回列表的第一个 */
    @UCloudParam("Domain")
    private String domain;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getIPList() {
        return ipList;
    }

    public void setIPList(String ipList) {
        this.ipList = ipList;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
