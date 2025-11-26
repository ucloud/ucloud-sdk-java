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

public class SwitchToFirewallRequest extends Request {

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

    /** 防火墙 ID */
    @UCloudParam("Firewall")
    private String firewall;

    /**
     * map[string]string，string 到 防火墙 ID
     * 的映射。ResourceId是uhost则Node是uni；ResourceId是uhadoop则Node是hadoophost
     */
    @UCloudParam("NodeToFirewall")
    private String nodeToFirewall;

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

    public String getFirewall() {
        return firewall;
    }

    public void setFirewall(String firewall) {
        this.firewall = firewall;
    }

    public String getNodeToFirewall() {
        return nodeToFirewall;
    }

    public void setNodeToFirewall(String nodeToFirewall) {
        this.nodeToFirewall = nodeToFirewall;
    }
}
