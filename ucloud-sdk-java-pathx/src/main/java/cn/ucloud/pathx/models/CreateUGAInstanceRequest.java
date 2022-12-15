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

public class CreateUGAInstanceRequest extends Request {

    /** 项目ID,如org-xxxx。请参考[GetProjectList接口](../summary/get_project_list.html) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 加速配置实例名称 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 加速源IP，多个IP用英文半角逗号(,)隔开；IPList和Domain二选一必填 */
    @UCloudParam("IPList")
    private String ipList;

    /** 加速源域名，IPList和Domain二选一必填 */
    @UCloudParam("Domain")
    private String domain;

    /** TCP端口号，已废弃。请使用 CreateUGAForwarder API 创建端口 */
    @UCloudParam("TCP")
    private List<String> tcp;

    /** UDP端口号，已废弃。请使用 CreateUGAForwarder API 创建端口 */
    @UCloudParam("UDP")
    private List<String> udp;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<String> getTCP() {
        return tcp;
    }

    public void setTCP(List<String> tcp) {
        this.tcp = tcp;
    }

    public List<String> getUDP() {
        return udp;
    }

    public void setUDP(List<String> udp) {
        this.udp = udp;
    }
}
