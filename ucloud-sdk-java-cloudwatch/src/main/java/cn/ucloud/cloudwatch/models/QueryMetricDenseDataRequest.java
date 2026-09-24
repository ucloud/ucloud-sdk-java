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
package cn.ucloud.cloudwatch.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class QueryMetricDenseDataRequest extends Request {

    /** 地域。 全局产品可不传，其他类型必传。 */
    @UCloudParam("Region")
    private String region;

    /** 项目ID */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 资源类型 */
    @NotEmpty
    @UCloudParam("ProductKey")
    private String productKey;

    /** 开始时间戳 */
    @NotEmpty
    @UCloudParam("StartTime")
    private Integer startTime;

    /** 截止时间戳 */
    @NotEmpty
    @UCloudParam("EndTime")
    private Integer endTime;

    /** */
    @UCloudParam("MetricInfos")
    private List<MetricInfos> metricInfos;

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

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public List<MetricInfos> getMetricInfos() {
        return metricInfos;
    }

    public void setMetricInfos(List<MetricInfos> metricInfos) {
        this.metricInfos = metricInfos;
    }

    public static class MetricInfos extends Request {

        /** 指标名 */
        @UCloudParam("Metric")
        private String metric;

        /** 资源id */
        @UCloudParam("ResourceId")
        private String resourceId;

        /** */
        @UCloudParam("Tags")
        private MetricInfosTags tags;

        public String getMetric() {
            return metric;
        }

        public void setMetric(String metric) {
            this.metric = metric;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public MetricInfosTags getTags() {
            return tags;
        }

        public void setTags(MetricInfosTags tags) {
            this.tags = tags;
        }
    }

    public static class MetricInfosTags extends Request {

        /**
         * AnyKey：代表任意一个用户自定义的key。 Tags是一个用户自定义对象map，是要查询指标的tag的key和value。
         * 用户自定义的Tags对象里的key和value，它们分别是要查询的tag的key和value。如： "Tags":{ "tag1":"value1",
         * "tag2":"value2", "tag3":"value3" }
         */
        @UCloudParam("AnyKey")
        private String anyKey;

        public String getAnyKey() {
            return anyKey;
        }

        public void setAnyKey(String anyKey) {
            this.anyKey = anyKey;
        }
    }
}
