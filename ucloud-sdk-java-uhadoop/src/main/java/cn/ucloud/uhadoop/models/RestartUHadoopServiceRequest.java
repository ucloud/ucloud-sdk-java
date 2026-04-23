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
package cn.ucloud.uhadoop.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class RestartUHadoopServiceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 要操作的服务名。可通过ListUHadoopFrameworkApp接口获取 */
    @NotEmpty
    @UCloudParam("ServiceName")
    private String serviceName;

    /** 实例ID */
    @NotEmpty
    @UCloudParam("InstanceId")
    private String instanceId;

    /** 应用版本，ApplicationVersion传参时，表示这次操作是整个应用所有服务。 */
    @UCloudParam("ApplicationVersion")
    private String applicationVersion;

    /** 只启动。值为false|true之一，默认false，当OnlyStart和OnlyStop同时置为true，则重启。 */
    @UCloudParam("OnlyStart")
    private Boolean onlyStart;

    /** 只停止。值为false|true之一，默认false。当OnlyStart和OnlyStop同时置为true，则重启。 */
    @UCloudParam("OnlyStop")
    private Boolean onlyStop;

    /** 要操作的NodeId数组。如果传入，则用于过滤操作哪些Node。 */
    @UCloudParam("NodeId")
    private List<String> nodeId;

    /** 要操作的NodeRole数组。如果传入，则用于过滤操作哪些Node。值为以下之一 master|core|task */
    @UCloudParam("NodeRole")
    private List<String> nodeRole;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getApplicationVersion() {
        return applicationVersion;
    }

    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    public Boolean getOnlyStart() {
        return onlyStart;
    }

    public void setOnlyStart(Boolean onlyStart) {
        this.onlyStart = onlyStart;
    }

    public Boolean getOnlyStop() {
        return onlyStop;
    }

    public void setOnlyStop(Boolean onlyStop) {
        this.onlyStop = onlyStop;
    }

    public List<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(List<String> nodeId) {
        this.nodeId = nodeId;
    }

    public List<String> getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(List<String> nodeRole) {
        this.nodeRole = nodeRole;
    }
}
