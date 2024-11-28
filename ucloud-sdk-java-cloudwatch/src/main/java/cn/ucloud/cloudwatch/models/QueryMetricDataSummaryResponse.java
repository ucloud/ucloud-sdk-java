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

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QueryMetricDataSummaryResponse extends Response {

    /** 链路id */
    @SerializedName("TraceId")
    private String traceId;

    /** 总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 数据 */
    @SerializedName("Data")
    private QueryMetricDataSummaryRespData data;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public QueryMetricDataSummaryRespData getData() {
        return data;
    }

    public void setData(QueryMetricDataSummaryRespData data) {
        this.data = data;
    }

    public static class MetricSample extends Response {

        /** 时间戳 */
        @SerializedName("Timestamp")
        private Double timestamp;

        /** 样本值 */
        @SerializedName("Value")
        private Double value;

        public Double getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Double timestamp) {
            this.timestamp = timestamp;
        }

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }
    }

    public static class MetricSingleSample extends Response {

        /** 指标名 */
        @SerializedName("Metric")
        private String metric;

        /** 指标的tag的k-v对象 */
        @SerializedName("Tags")
        private Object tags;

        /** 指标单个样本点对象 */
        @SerializedName("Value")
        private MetricSample value;

        public String getMetric() {
            return metric;
        }

        public void setMetric(String metric) {
            this.metric = metric;
        }

        public Object getTags() {
            return tags;
        }

        public void setTags(Object tags) {
            this.tags = tags;
        }

        public MetricSample getValue() {
            return value;
        }

        public void setValue(MetricSample value) {
            this.value = value;
        }
    }

    public static class QueryMetricDataSummaryRespData extends Response {

        /** 总数 */
        @SerializedName("Total")
        private Integer total;

        /** 结果集 */
        @SerializedName("List")
        private List<ResourceSummary> list;

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public List<ResourceSummary> getList() {
            return list;
        }

        public void setList(List<ResourceSummary> list) {
            this.list = list;
        }
    }

    public static class ResourceMonitorItem extends Response {

        /** 指标名 */
        @SerializedName("Metric")
        private String metric;

        /** 指标数据数组 */
        @SerializedName("MetricValues")
        private List<MetricSingleSample> metricValues;

        public String getMetric() {
            return metric;
        }

        public void setMetric(String metric) {
            this.metric = metric;
        }

        public List<MetricSingleSample> getMetricValues() {
            return metricValues;
        }

        public void setMetricValues(List<MetricSingleSample> metricValues) {
            this.metricValues = metricValues;
        }
    }

    public static class ResourceSummary extends Response {

        /** 地域 */
        @SerializedName("Region")
        private String region;

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 项目id */
        @SerializedName("ProjectId")
        private Integer projectId;

        /** 公司id */
        @SerializedName("CompanyId")
        private Integer companyId;

        /** 资源id */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源名称 */
        @SerializedName("Name")
        private String name;

        /** 地域中文名 */
        @SerializedName("RegionCN")
        private String regionCN;

        /** 可用区中文 */
        @SerializedName("ZoneCN")
        private String zoneCN;

        /** 产品类型 */
        @SerializedName("ProductKey")
        private String productKey;

        /** 项目id */
        @SerializedName("OrganizationId")
        private Integer organizationId;

        /** 资源状态 */
        @SerializedName("Status")
        private Integer status;

        /** 资源的各项指标当前值，类型为： map[string][]MetricSingleSample map的key为指标名，value为样本点数组。 */
        @SerializedName("MonitorAttr")
        private List<ResourceMonitorItem> monitorAttr;

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

        public Integer getProjectId() {
            return projectId;
        }

        public void setProjectId(Integer projectId) {
            this.projectId = projectId;
        }

        public Integer getCompanyId() {
            return companyId;
        }

        public void setCompanyId(Integer companyId) {
            this.companyId = companyId;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRegionCN() {
            return regionCN;
        }

        public void setRegionCN(String regionCN) {
            this.regionCN = regionCN;
        }

        public String getZoneCN() {
            return zoneCN;
        }

        public void setZoneCN(String zoneCN) {
            this.zoneCN = zoneCN;
        }

        public String getProductKey() {
            return productKey;
        }

        public void setProductKey(String productKey) {
            this.productKey = productKey;
        }

        public Integer getOrganizationId() {
            return organizationId;
        }

        public void setOrganizationId(Integer organizationId) {
            this.organizationId = organizationId;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public List<ResourceMonitorItem> getMonitorAttr() {
            return monitorAttr;
        }

        public void setMonitorAttr(List<ResourceMonitorItem> monitorAttr) {
            this.monitorAttr = monitorAttr;
        }
    }
}
