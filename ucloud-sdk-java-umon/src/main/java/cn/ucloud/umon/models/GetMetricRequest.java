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
package cn.ucloud.umon.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class GetMetricRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID，不填为默认项目。子账户必须填写项目ID */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 资源类型 */
    @NotEmpty
    @UCloudParam("ResourceType")
    private String resourceType;

    /** 指标名称（不同ResourceType对应不同的MetricName） */
    @NotEmpty
    @UCloudParam("MetricName")
    private List<String> metricName;

    /** 资源Id（目前除sharebandwidth可以不传入ResourceId外，其他资源必须传入，sharebandwidth不传入会默认使用获取到的第一个资源Id） */
    @UCloudParam("ResourceId")
    private String resourceId;

    /** 拉取最近多少秒的监控数据，默认1小时，即3600；最大1个月 */
    @UCloudParam("TimeRange")
    private Integer timeRange;

    /** 起始时间unixtimestamp，若传入TimeRange，此项忽略 */
    @UCloudParam("BeginTime")
    private Integer beginTime;

    /** 结束时间unixtimestamp，若传入TimeRange，此项忽略；若只传入BeginTime，此项默认为当前时间 */
    @UCloudParam("EndTime")
    private Integer endTime;

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

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public List<String> getMetricName() {
        return metricName;
    }

    public void setMetricName(List<String> metricName) {
        this.metricName = metricName;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
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
}
