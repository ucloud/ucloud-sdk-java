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

public class UpdateUK8SAutoscalerRequest extends Request {

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

    /** 集群ID */
    @NotEmpty
    @UCloudParam("ClusterId")
    private String clusterId;

    /** 节点持续不需要后触发缩容的等待时间，单位分钟，范围 1–1440。 */
    @NotEmpty
    @UCloudParam("ScaleDownUnneededTime")
    private Integer scaleDownUnneededTime;

    /** 节点缩容利用率阈值，单位百分比，范围 0–100。例如 50 表示 50%。 */
    @NotEmpty
    @UCloudParam("ScaleDownUtilizationThreshold")
    private Integer scaleDownUtilizationThreshold;

    /** 添加节点后等待缩容的时间，单位分钟，范围 1–1440。 */
    @NotEmpty
    @UCloudParam("ScaleDownDelayAfterAdd")
    private Integer scaleDownDelayAfterAdd;

    /** GPU 缩容利用率阈值，单位百分比，范围 0–100。省略时使用 ScaleDownUtilizationThreshold。 */
    @UCloudParam("ScaleDownGPUUtilizationThreshold")
    private Integer scaleDownGPUUtilizationThreshold;

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

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public Integer getScaleDownUnneededTime() {
        return scaleDownUnneededTime;
    }

    public void setScaleDownUnneededTime(Integer scaleDownUnneededTime) {
        this.scaleDownUnneededTime = scaleDownUnneededTime;
    }

    public Integer getScaleDownUtilizationThreshold() {
        return scaleDownUtilizationThreshold;
    }

    public void setScaleDownUtilizationThreshold(Integer scaleDownUtilizationThreshold) {
        this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
    }

    public Integer getScaleDownDelayAfterAdd() {
        return scaleDownDelayAfterAdd;
    }

    public void setScaleDownDelayAfterAdd(Integer scaleDownDelayAfterAdd) {
        this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
    }

    public Integer getScaleDownGPUUtilizationThreshold() {
        return scaleDownGPUUtilizationThreshold;
    }

    public void setScaleDownGPUUtilizationThreshold(Integer scaleDownGPUUtilizationThreshold) {
        this.scaleDownGPUUtilizationThreshold = scaleDownGPUUtilizationThreshold;
    }
}
