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

        /** 资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 资源标签列表。每项为 TagListItem：Tag（标签名）和 TagValue（标签值）。 */
        @SerializedName("TagList")
        private List<TagListItem> tagList;

        /** 指标数据点列表，元素为 MetricPoint */
        @SerializedName("Values")
        private List<MetricSample> values;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public List<TagListItem> getTagList() {
            return tagList;
        }

        public void setTagList(List<TagListItem> tagList) {
            this.tagList = tagList;
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

        /** 无效或无权限资源的 ID 列表 */
        @SerializedName("InvalidResourceIds")
        private List<String> invalidResourceIds;

        /** 查询的结果集 */
        @SerializedName("List")
        private List<QueryMetricDataRespItem> list;

        public List<String> getInvalidResourceIds() {
            return invalidResourceIds;
        }

        public void setInvalidResourceIds(List<String> invalidResourceIds) {
            this.invalidResourceIds = invalidResourceIds;
        }

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

        /** 该指标查询的处理状态码 */
        @SerializedName("ErrCode")
        private Integer errCode;

        /** 该指标查询的状态说明 */
        @SerializedName("ErrMsg")
        private String errMsg;

        /** 标签列表。每项为 TagEntry：TagName（标签名）和 KeyList（该标签的全部候选值）。 */
        @SerializedName("TagEntries")
        private List<TagEntry> tagEntries;

        /** 查询到的时间序列列表 */
        @SerializedName("Results")
        private List<MetricResult> results;

        public String getMetric() {
            return metric;
        }

        public void setMetric(String metric) {
            this.metric = metric;
        }

        public Integer getErrCode() {
            return errCode;
        }

        public void setErrCode(Integer errCode) {
            this.errCode = errCode;
        }

        public String getErrMsg() {
            return errMsg;
        }

        public void setErrMsg(String errMsg) {
            this.errMsg = errMsg;
        }

        public List<TagEntry> getTagEntries() {
            return tagEntries;
        }

        public void setTagEntries(List<TagEntry> tagEntries) {
            this.tagEntries = tagEntries;
        }

        public List<MetricResult> getResults() {
            return results;
        }

        public void setResults(List<MetricResult> results) {
            this.results = results;
        }
    }

    public static class TagEntry extends Response {

        /** 标签名称 */
        @SerializedName("TagName")
        private String tagName;

        /** 标签候选值列表 */
        @SerializedName("KeyList")
        private List<String> keyList;

        public String getTagName() {
            return tagName;
        }

        public void setTagName(String tagName) {
            this.tagName = tagName;
        }

        public List<String> getKeyList() {
            return keyList;
        }

        public void setKeyList(List<String> keyList) {
            this.keyList = keyList;
        }
    }

    public static class TagListItem extends Response {

        /** 标签名 */
        @SerializedName("Tag")
        private String tag;

        /** 标签值 */
        @SerializedName("TagValue")
        private String tagValue;

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getTagValue() {
            return tagValue;
        }

        public void setTagValue(String tagValue) {
            this.tagValue = tagValue;
        }
    }
}
