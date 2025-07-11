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

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetAlarmRecordListResponse extends Response {

    /** 告警记录列表 */
    @SerializedName("DataSet")
    private List<AlarmRecord> dataSet;

    public List<AlarmRecord> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<AlarmRecord> dataSet) {
        this.dataSet = dataSet;
    }

    public static class AlarmRecord extends Response {

        /** 地域编号 */
        @SerializedName("Region")
        private String region;

        /** 可用区编号 */
        @SerializedName("Zone")
        private String zone;

        /** 资源id */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源类型 */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 资源名称 */
        @SerializedName("Name")
        private String name;

        /** 指标名称 */
        @SerializedName("MetricName")
        private String metricName;

        /** 告警发生时间 */
        @SerializedName("OccurrenceTime")
        private Integer occurrenceTime;

        /** 是否恢复 */
        @SerializedName("Recovered")
        private String recovered;

        /** 阈值 */
        @SerializedName("Threshold")
        private Double threshold;

        /** 告警值 */
        @SerializedName("Value")
        private Double value;

        /** 告警恢复时间 */
        @SerializedName("RecoveryTime")
        private Integer recoveryTime;

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

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMetricName() {
            return metricName;
        }

        public void setMetricName(String metricName) {
            this.metricName = metricName;
        }

        public Integer getOccurrenceTime() {
            return occurrenceTime;
        }

        public void setOccurrenceTime(Integer occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
        }

        public String getRecovered() {
            return recovered;
        }

        public void setRecovered(String recovered) {
            this.recovered = recovered;
        }

        public Double getThreshold() {
            return threshold;
        }

        public void setThreshold(Double threshold) {
            this.threshold = threshold;
        }

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }

        public Integer getRecoveryTime() {
            return recoveryTime;
        }

        public void setRecoveryTime(Integer recoveryTime) {
            this.recoveryTime = recoveryTime;
        }
    }
}
