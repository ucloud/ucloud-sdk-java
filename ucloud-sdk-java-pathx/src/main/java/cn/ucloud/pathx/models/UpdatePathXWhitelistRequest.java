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
import java.util.List;

public class UpdatePathXWhitelistRequest extends Request {

    /** 项目ID,如org-xxxx。请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** GlobalSSH实例ID，资源唯一标识 */
    @NotEmpty
    @UCloudParam("InstanceId")
    private String instanceId;

    /**
     * 白名单规则,例如 "Whitelist.0": "192.168.1.1/24|tcp|22"，"Whitelist.1":
     * "192.168.1.2|tcp|8080:8090"，第一个参数为ip或ip段，第二个参数代表协议（tcp/udp），第三个参数代表端口号或端口范围（使用 ':'
     * 隔开）；可以添加多条规则（递增Whitelist.n字段内的n值）；此接口需要列出全部规则，例如不填则为清空白名单规则，如若需要增量添加，使用InsertPathXWhitelist接口,globalssh
     * 没有端口范围：端口设置成加速端口，协议设置成tcp:ip|tcp|加速端口
     */
    @UCloudParam("Whitelist")
    private List<String> whitelist;

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

    public List<String> getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(List<String> whitelist) {
        this.whitelist = whitelist;
    }
}
