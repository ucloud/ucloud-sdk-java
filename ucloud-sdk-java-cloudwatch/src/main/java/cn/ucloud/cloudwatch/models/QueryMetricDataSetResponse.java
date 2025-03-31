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

public class QueryMetricDataSetResponse extends Response {

    /** 日志链路id */
    @SerializedName("TraceId")
    private String traceId;

    /** QueryMetricDataResp */
    @SerializedName("Data")
    private QueryMetricDataResp data;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public QueryMetricDataResp getData() {
        return data;
    }

    public void setData(QueryMetricDataResp data) {
        this.data = data;
    }

    public static class MetricResult extends Response {

        /** 资源的短id */
        @SerializedName("ResourceId")
        private String resourceId;

        /** TagMap是一个对象，key和value均为字符串。 TagMap返回当前series的所有的tag的key和value。 */
        @SerializedName("TagMap")
        private Object tagMap;

        /** */
        @SerializedName("Values")
        private List<MetricSample> values;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public Object getTagMap() {
            return tagMap;
        }

        public void setTagMap(Object tagMap) {
            this.tagMap = tagMap;
        }

        public List<MetricSample> getValues() {
            return values;
        }

        public void setValues(List<MetricSample> values) {
            this.values = values;
        }
    }

    public static class MetricSample extends Response {

        /** 时间戳 */
        @SerializedName("Timestamp")
        private Integer timestamp;

        /** 样本值 */
        @SerializedName("Value")
        private Double value;

        public Integer getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
        }

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }
    }

    public static class QueryMetricDataResp extends Response {

        /** 查询的结果集 */
        @SerializedName("List")
        private List<QueryMetricDataRespItem> list;

        public List<QueryMetricDataRespItem> getList() {
            return list;
        }

        public void setList(List<QueryMetricDataRespItem> list) {
            this.list = list;
        }
    }

    public static class QueryMetricDataRespItem extends Response {

        /** 指标名 */
        @SerializedName("Metric")
        private String metric;

        /**
         * 指标查询结果的所有tag的key和对应的所有value数组。
         *
         * <p>Tags格式为，key为tagkey字符串，value为tagValue的字符串数组。
         */
        @SerializedName("Tags")
        private Object tags;

        /** */
        @SerializedName("Results")
        private List<MetricResult> results;

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

        public List<MetricResult> getResults() {
            return results;
        }

        public void setResults(List<MetricResult> results) {
            this.results = results;
        }
    }
}
