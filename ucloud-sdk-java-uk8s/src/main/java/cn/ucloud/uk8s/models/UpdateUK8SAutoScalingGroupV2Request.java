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
package cn.ucloud.uk8s.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class UpdateUK8SAutoScalingGroupV2Request extends Request {

    /** 可用区，可选。此接口按集群和伸缩组 ID 更新配置。 */
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 地域 */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 集群ID */
    @NotEmpty
    @UCloudParam("ClusterId")
    private String clusterId;

    /** 伸缩组ID */
    @NotEmpty
    @UCloudParam("Id")
    private String id;

    /** 伸缩组名称 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 最小节点数，范围 0–100。 */
    @NotEmpty
    @UCloudParam("Min")
    private Integer min;

    /** 最大节点数，范围 1–100。 */
    @NotEmpty
    @UCloudParam("Max")
    private Integer max;

    /** 伸缩组优先级，范围 1–100，值越大越优先。省略或传 0 时保持原优先级。 */
    @UCloudParam("Priority")
    private Integer priority;

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
