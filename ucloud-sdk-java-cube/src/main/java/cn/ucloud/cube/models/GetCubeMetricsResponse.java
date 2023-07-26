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
package cn.ucloud.cube.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetCubeMetricsResponse extends Response {

    /** 指标数据 */
    @SerializedName("DataSets")
    private List<MetricDataSet> dataSets;

    public List<MetricDataSet> getDataSets() {
        return dataSets;
    }

    public void setDataSets(List<MetricDataSet> dataSets) {
        this.dataSets = dataSets;
    }

    public static class MetricDataSet extends Response {

        /** */
        @SerializedName("MetricName")
        private String metricName;

        /** */
        @SerializedName("Values")
        private List<ValueSet> values;

        public String getMetricName() {
            return metricName;
        }

        public void setMetricName(String metricName) {
            this.metricName = metricName;
        }

        public List<ValueSet> getValues() {
            return values;
        }

        public void setValues(List<ValueSet> values) {
            this.values = values;
        }
    }

    public static class ValueSet extends Response {

        /** */
        @SerializedName("Value")
        private Double value;

        /** */
        @SerializedName("Timestamp")
        private Integer timestamp;

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }

        public Integer getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
        }
    }
}
