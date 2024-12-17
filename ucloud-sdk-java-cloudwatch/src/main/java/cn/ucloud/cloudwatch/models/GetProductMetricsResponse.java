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

public class GetProductMetricsResponse extends Response {

    /** 返回数据 */
    @SerializedName("Data")
    private GetProductMetricsRespData data;

    public GetProductMetricsRespData getData() {
        return data;
    }

    public void setData(GetProductMetricsRespData data) {
        this.data = data;
    }

    public static class ConversionRule extends Response {

        /** 来源 */
        @SerializedName("From")
        private String from;

        /** 目标 */
        @SerializedName("To")
        private String to;

        /** 转换因子 */
        @SerializedName("ConversionFactor")
        private Integer conversionFactor;

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public Integer getConversionFactor() {
            return conversionFactor;
        }

        public void setConversionFactor(Integer conversionFactor) {
            this.conversionFactor = conversionFactor;
        }
    }

    public static class GetProductMetricsRespData extends Response {

        /** 查询结果总数 */
        @SerializedName("Total")
        private Integer total;

        /** 指标列表 */
        @SerializedName("List")
        private List<Metirc> list;

        /** 单位转换信息 */
        @SerializedName("UnitConfigs")
        private List<MetricUnitConfig> unitConfigs;

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public List<Metirc> getList() {
            return list;
        }

        public void setList(List<Metirc> list) {
            this.list = list;
        }

        public List<MetricUnitConfig> getUnitConfigs() {
            return unitConfigs;
        }

        public void setUnitConfigs(List<MetricUnitConfig> unitConfigs) {
            this.unitConfigs = unitConfigs;
        }
    }

    public static class Metirc extends Response {

        /** 云产品ID */
        @SerializedName("ProductType")
        private Integer productType;

        /** 单位ID */
        @SerializedName("UnitID")
        private Integer unitID;

        /** 指标ID */
        @SerializedName("MetricID")
        private Integer metricID;

        /** 指标唯一标识 (uhost_cpu_usage) */
        @SerializedName("Metric")
        private String metric;

        /** 指标英文名称 */
        @SerializedName("MetricEnName")
        private String metricEnName;

        /** 指标中文名称 */
        @SerializedName("MetricChName")
        private String metricChName;

        /** 指标英文描述 */
        @SerializedName("MetricEnDesc")
        private String metricEnDesc;

        /** 指标中文描述 */
        @SerializedName("MetricChDesc")
        private String metricChDesc;

        /** 指标分类/指标组 */
        @SerializedName("MetricGroup")
        private String metricGroup;

        /** 上报频率毫秒 */
        @SerializedName("FrequencyMs")
        private Integer frequencyMs;

        /** 单位 */
        @SerializedName("Unit")
        private MetricUnit unit;

        /** 创建者 */
        @SerializedName("CreatedBy")
        private String createdBy;

        /** 创建时间 */
        @SerializedName("CreatedAt")
        private String createdAt;

        /** 修改者 */
        @SerializedName("UpdatedBy")
        private String updatedBy;

        /** 修改时间 */
        @SerializedName("UpdatedAt")
        private String updatedAt;

        public Integer getProductType() {
            return productType;
        }

        public void setProductType(Integer productType) {
            this.productType = productType;
        }

        public Integer getUnitID() {
            return unitID;
        }

        public void setUnitID(Integer unitID) {
            this.unitID = unitID;
        }

        public Integer getMetricID() {
            return metricID;
        }

        public void setMetricID(Integer metricID) {
            this.metricID = metricID;
        }

        public String getMetric() {
            return metric;
        }

        public void setMetric(String metric) {
            this.metric = metric;
        }

        public String getMetricEnName() {
            return metricEnName;
        }

        public void setMetricEnName(String metricEnName) {
            this.metricEnName = metricEnName;
        }

        public String getMetricChName() {
            return metricChName;
        }

        public void setMetricChName(String metricChName) {
            this.metricChName = metricChName;
        }

        public String getMetricEnDesc() {
            return metricEnDesc;
        }

        public void setMetricEnDesc(String metricEnDesc) {
            this.metricEnDesc = metricEnDesc;
        }

        public String getMetricChDesc() {
            return metricChDesc;
        }

        public void setMetricChDesc(String metricChDesc) {
            this.metricChDesc = metricChDesc;
        }

        public String getMetricGroup() {
            return metricGroup;
        }

        public void setMetricGroup(String metricGroup) {
            this.metricGroup = metricGroup;
        }

        public Integer getFrequencyMs() {
            return frequencyMs;
        }

        public void setFrequencyMs(Integer frequencyMs) {
            this.frequencyMs = frequencyMs;
        }

        public MetricUnit getUnit() {
            return unit;
        }

        public void setUnit(MetricUnit unit) {
            this.unit = unit;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedBy() {
            return updatedBy;
        }

        public void setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }
    }

    public static class MetricUnit extends Response {

        /** 单位id */
        @SerializedName("UnitID")
        private Integer unitID;

        /** GroupId */
        @SerializedName("GroupId")
        private Integer groupId;

        /** 单位英文名称 */
        @SerializedName("UnitEnName")
        private String unitEnName;

        /** 单位中文名称 */
        @SerializedName("UnitChName")
        private String unitChName;

        /** 单位描述 */
        @SerializedName("UnitDesc")
        private String unitDesc;

        /** 转换因子 */
        @SerializedName("ConversionFactor")
        private Integer conversionFactor;

        /** 创建人 */
        @SerializedName("CreatedBy")
        private String createdBy;

        /** 修改人 */
        @SerializedName("UpdatedBy")
        private String updatedBy;

        /** 创建时间 */
        @SerializedName("CreatedAt")
        private String createdAt;

        /** 修改时间 */
        @SerializedName("UpdatedAt")
        private String updatedAt;

        /** 删除时间 */
        @SerializedName("DeletedAt")
        private Integer deletedAt;

        public Integer getUnitID() {
            return unitID;
        }

        public void setUnitID(Integer unitID) {
            this.unitID = unitID;
        }

        public Integer getGroupId() {
            return groupId;
        }

        public void setGroupId(Integer groupId) {
            this.groupId = groupId;
        }

        public String getUnitEnName() {
            return unitEnName;
        }

        public void setUnitEnName(String unitEnName) {
            this.unitEnName = unitEnName;
        }

        public String getUnitChName() {
            return unitChName;
        }

        public void setUnitChName(String unitChName) {
            this.unitChName = unitChName;
        }

        public String getUnitDesc() {
            return unitDesc;
        }

        public void setUnitDesc(String unitDesc) {
            this.unitDesc = unitDesc;
        }

        public Integer getConversionFactor() {
            return conversionFactor;
        }

        public void setConversionFactor(Integer conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public String getUpdatedBy() {
            return updatedBy;
        }

        public void setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Integer getDeletedAt() {
            return deletedAt;
        }

        public void setDeletedAt(Integer deletedAt) {
            this.deletedAt = deletedAt;
        }
    }

    public static class MetricUnitConfig extends Response {

        /** 指标中文名列表 */
        @SerializedName("UnitCnNames")
        private List<String> unitCnNames;

        /** 指标英文名列表 */
        @SerializedName("UnitEnNames")
        private List<String> unitEnNames;

        /** 转换因子 */
        @SerializedName("ConversionFactor")
        private Integer conversionFactor;

        /** 转换规则 */
        @SerializedName("ConversionRules")
        private List<ConversionRule> conversionRules;

        public List<String> getUnitCnNames() {
            return unitCnNames;
        }

        public void setUnitCnNames(List<String> unitCnNames) {
            this.unitCnNames = unitCnNames;
        }

        public List<String> getUnitEnNames() {
            return unitEnNames;
        }

        public void setUnitEnNames(List<String> unitEnNames) {
            this.unitEnNames = unitEnNames;
        }

        public Integer getConversionFactor() {
            return conversionFactor;
        }

        public void setConversionFactor(Integer conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public List<ConversionRule> getConversionRules() {
            return conversionRules;
        }

        public void setConversionRules(List<ConversionRule> conversionRules) {
            this.conversionRules = conversionRules;
        }
    }
}
