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

public class GetUGA3MetricRequest extends Request {

    /** 项目ID。请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 资源ID */
    @NotEmpty
    @UCloudParam("InstanceId")
    private String instanceId;

    /** 查询起始时间，10位长度时间戳 */
    @NotEmpty
    @UCloudParam("BeginTime")
    private Integer beginTime;

    /** 查询结束时间，10位长度时间戳 */
    @NotEmpty
    @UCloudParam("EndTime")
    private Integer endTime;

    /**
     * 查询监控的指标项。可不传 NetworkOut:出口总带宽 NetworkIn：入口总带宽 NetworkOutUsage：出口带宽使用率 NetworkInUsage：入口总带宽使用率
     * NetworkOutSubline ：子线路出口带宽 NetworkInSubline：子线路入口带宽 Delay：线路平均延迟 DelaySubline：子线路延迟
     * ConnectCount：当前连接数 ConnectCountSubline：子线路当前连接数 DelayPromote：延迟提升 DelayPromoteSubline：子线路延迟提升
     */
    @UCloudParam("MetricName")
    private List<String> metricName;

    /** 是否为子线路。为了简化查询,true 会返回所有子线路监控项可以，false:返回所有汇总的监控数据 */
    @UCloudParam("IsSubline")
    private Boolean isSubline;

    /** 子线路AreaCode ,子线路的时候传，不是子线路可以不传 */
    @UCloudParam("AreaCode")
    private String areaCode;

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

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public List<String> getMetricName() {
        return metricName;
    }

    public void setMetricName(List<String> metricName) {
        this.metricName = metricName;
    }

    public Boolean getIsSubline() {
        return isSubline;
    }

    public void setIsSubline(Boolean isSubline) {
        this.isSubline = isSubline;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
