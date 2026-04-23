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
package cn.ucloud.ues.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ResizeUESInstanceRequest extends Request {

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

    /** 实例ID */
    @NotEmpty
    @UCloudParam("InstanceId")
    private String instanceId;

    /** 节点类型（compute、master、coordinating、kibana、dashboard） */
    @NotEmpty
    @UCloudParam("NodeRole")
    private String nodeRole;

    /** 改配节点类型，NodeDiskSize为0，基于NodeRole 进行改配 */
    @UCloudParam("NodeConf")
    private String nodeConf;

    /** 改配节点磁盘大小，NodeConf 为空字符串，基于NodeRole 进行改配 */
    @UCloudParam("NodeDiskSize")
    private Integer nodeDiskSize;

    /** 进行改配操作是否强制检查集群健康状态，默认为false */
    @UCloudParam("ForceResizing")
    private Boolean forceResizing;

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

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    public String getNodeConf() {
        return nodeConf;
    }

    public void setNodeConf(String nodeConf) {
        this.nodeConf = nodeConf;
    }

    public Integer getNodeDiskSize() {
        return nodeDiskSize;
    }

    public void setNodeDiskSize(Integer nodeDiskSize) {
        this.nodeDiskSize = nodeDiskSize;
    }

    public Boolean getForceResizing() {
        return forceResizing;
    }

    public void setForceResizing(Boolean forceResizing) {
        this.forceResizing = forceResizing;
    }
}
