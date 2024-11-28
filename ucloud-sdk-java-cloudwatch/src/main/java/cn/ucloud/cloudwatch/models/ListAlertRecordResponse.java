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

public class ListAlertRecordResponse extends Response {

    /** 告警记录集合 */
    @SerializedName("Data")
    private List<AlertRecord> data;

    /** 告警记录总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<AlertRecord> getData() {
        return data;
    }

    public void setData(List<AlertRecord> data) {
        this.data = data;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class AlertRecord extends Response {

        /** 告警记录RecordID */
        @SerializedName("RecordID")
        private Integer recordID;

        /** 项目ProjectID */
        @SerializedName("ProjectID")
        private Integer projectID;

        /** 告警记录触发告警策略名称 */
        @SerializedName("StrategyName")
        private String strategyName;

        /** 产品类型 */
        @SerializedName("ProductType")
        private Integer productType;

        /** 产品类型名称 */
        @SerializedName("ProductName")
        private String productName;

        /** 资源id */
        @SerializedName("ResourceID")
        private String resourceID;

        /** 指标id */
        @SerializedName("MetricID")
        private Integer metricID;

        /** 指标名称 */
        @SerializedName("MetricName")
        private String metricName;

        /** 告警记录触发告警策略Id */
        @SerializedName("StrategyID")
        private Integer strategyID;

        /** 告警记录触发告警规则Id */
        @SerializedName("RuleID")
        private Integer ruleID;

        /** 告警屏蔽规则id(如果配置了屏蔽规则，并且满足条件) */
        @SerializedName("ShieldRuleID")
        private Integer shieldRuleID;

        /** 告警内容 */
        @SerializedName("Content")
        private String content;

        /** 告警等级 */
        @SerializedName("Level")
        private String level;

        /** 告警状态 */
        @SerializedName("Status")
        private String status;

        /** 告警触发时间 */
        @SerializedName("StartAt")
        private Integer startAt;

        /** 告警恢复时间 */
        @SerializedName("EndAt")
        private Integer endAt;

        public Integer getRecordID() {
            return recordID;
        }

        public void setRecordID(Integer recordID) {
            this.recordID = recordID;
        }

        public Integer getProjectID() {
            return projectID;
        }

        public void setProjectID(Integer projectID) {
            this.projectID = projectID;
        }

        public String getStrategyName() {
            return strategyName;
        }

        public void setStrategyName(String strategyName) {
            this.strategyName = strategyName;
        }

        public Integer getProductType() {
            return productType;
        }

        public void setProductType(Integer productType) {
            this.productType = productType;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getResourceID() {
            return resourceID;
        }

        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        public Integer getMetricID() {
            return metricID;
        }

        public void setMetricID(Integer metricID) {
            this.metricID = metricID;
        }

        public String getMetricName() {
            return metricName;
        }

        public void setMetricName(String metricName) {
            this.metricName = metricName;
        }

        public Integer getStrategyID() {
            return strategyID;
        }

        public void setStrategyID(Integer strategyID) {
            this.strategyID = strategyID;
        }

        public Integer getRuleID() {
            return ruleID;
        }

        public void setRuleID(Integer ruleID) {
            this.ruleID = ruleID;
        }

        public Integer getShieldRuleID() {
            return shieldRuleID;
        }

        public void setShieldRuleID(Integer shieldRuleID) {
            this.shieldRuleID = shieldRuleID;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getStartAt() {
            return startAt;
        }

        public void setStartAt(Integer startAt) {
            this.startAt = startAt;
        }

        public Integer getEndAt() {
            return endAt;
        }

        public void setEndAt(Integer endAt) {
            this.endAt = endAt;
        }
    }
}
