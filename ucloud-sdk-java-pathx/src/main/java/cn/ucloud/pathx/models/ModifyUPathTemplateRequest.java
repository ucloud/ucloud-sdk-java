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

public class ModifyUPathTemplateRequest extends Request {

    /** 项目ID。请参考[GetProjectList接口](../summary/get_project_list.html) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 加速线路实例ID */
    @NotEmpty
    @UCloudParam("UPathId")
    private String uPathId;

    /**
     * 告警指标名称,
     * 所有n的个数必须一致。目前仅允许以下四项：UpathNetworkOut:出向带宽，UpathNetworkIn:入向带宽，UpathNetworkOutUsage:出向带宽使用率，UpathNetworkInUsage:入向带宽使用率
     */
    @UCloudParam("MetricName")
    private List<String> metricName;

    /** 告警阈值，带宽使用率的阈值范围是[50,100]的正整数，带宽告警阈值为1000000的倍数, 如大于2Mbps则告警 阈值应该传 2000000 */
    @UCloudParam("Threshold")
    private List<Integer> threshold;

    /** 告警探测周期，单位：秒 */
    @UCloudParam("AlarmFrequency")
    private List<Integer> alarmFrequency;

    /** 告警组id */
    @UCloudParam("ContactGroupId")
    private List<Integer> contactGroupId;

    /** 比较策略，可选 ['GE','LE'] 分别代表不小于和不大于 */
    @UCloudParam("Compare")
    private List<String> compare;

    /** 收敛策略，可选范围 ['Exponential','Continuous','Once']，分别对应指数递增、连续告警、单次告警 */
    @UCloudParam("AlarmStrategy")
    private List<String> alarmStrategy;

    /** 告警触发周期（次数） */
    @UCloudParam("TriggerCount")
    private List<Integer> triggerCount;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUPathId() {
        return uPathId;
    }

    public void setUPathId(String uPathId) {
        this.uPathId = uPathId;
    }

    public List<String> getMetricName() {
        return metricName;
    }

    public void setMetricName(List<String> metricName) {
        this.metricName = metricName;
    }

    public List<Integer> getThreshold() {
        return threshold;
    }

    public void setThreshold(List<Integer> threshold) {
        this.threshold = threshold;
    }

    public List<Integer> getAlarmFrequency() {
        return alarmFrequency;
    }

    public void setAlarmFrequency(List<Integer> alarmFrequency) {
        this.alarmFrequency = alarmFrequency;
    }

    public List<Integer> getContactGroupId() {
        return contactGroupId;
    }

    public void setContactGroupId(List<Integer> contactGroupId) {
        this.contactGroupId = contactGroupId;
    }

    public List<String> getCompare() {
        return compare;
    }

    public void setCompare(List<String> compare) {
        this.compare = compare;
    }

    public List<String> getAlarmStrategy() {
        return alarmStrategy;
    }

    public void setAlarmStrategy(List<String> alarmStrategy) {
        this.alarmStrategy = alarmStrategy;
    }

    public List<Integer> getTriggerCount() {
        return triggerCount;
    }

    public void setTriggerCount(List<Integer> triggerCount) {
        this.triggerCount = triggerCount;
    }
}
