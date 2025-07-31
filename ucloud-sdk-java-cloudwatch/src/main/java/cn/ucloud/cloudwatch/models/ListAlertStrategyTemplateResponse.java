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

public class ListAlertStrategyTemplateResponse extends Response {

    /** 条件模板列表 */
    @SerializedName("Data")
    private List<ListAlertTemplate> data;

    /** 条件模板总条数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<ListAlertTemplate> getData() {
        return data;
    }

    public void setData(List<ListAlertTemplate> data) {
        this.data = data;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class AlertRule extends Response {

        /** 规则ID */
        @SerializedName("RuleID")
        private Integer ruleID;

        /** 规则指标ID。参考该类型产品下返回的指标列表GetProductMetrics */
        @SerializedName("MetricID")
        private Integer metricID;

        /** 指标名称 */
        @SerializedName("MetricName")
        private String metricName;

        /** 阈值比较方式 枚举值比较方式: 1->= 2-<= 3-> 4-< 5-== 6-!= */
        @SerializedName("ThresholdCompare")
        private Integer thresholdCompare;

        /** 触发阈值 */
        @SerializedName("ThresholdValue")
        private Double thresholdValue;

        /** 触发次数 */
        @SerializedName("TriggerCount")
        private Integer triggerCount;

        /** 触发周期。枚举值：continuous连续 exponent 指数 single 不重复 */
        @SerializedName("SendPeriodType")
        private String sendPeriodType;

        /** 发送间隔 */
        @SerializedName("SendInterval")
        private Integer sendInterval;

        /** 告警等级。枚举值：P0,P1,P2,P3 */
        @SerializedName("Level")
        private String level;

        /** 告警状态。枚举值：0-关闭 1-开启 */
        @SerializedName("Status")
        private Integer status;

        /** 单位id */
        @SerializedName("UnitID")
        private Integer unitID;

        /** 单位名称 */
        @SerializedName("UnitName")
        private String unitName;

        public Integer getRuleID() {
            return ruleID;
        }

        public void setRuleID(Integer ruleID) {
            this.ruleID = ruleID;
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

        public Integer getThresholdCompare() {
            return thresholdCompare;
        }

        public void setThresholdCompare(Integer thresholdCompare) {
            this.thresholdCompare = thresholdCompare;
        }

        public Double getThresholdValue() {
            return thresholdValue;
        }

        public void setThresholdValue(Double thresholdValue) {
            this.thresholdValue = thresholdValue;
        }

        public Integer getTriggerCount() {
            return triggerCount;
        }

        public void setTriggerCount(Integer triggerCount) {
            this.triggerCount = triggerCount;
        }

        public String getSendPeriodType() {
            return sendPeriodType;
        }

        public void setSendPeriodType(String sendPeriodType) {
            this.sendPeriodType = sendPeriodType;
        }

        public Integer getSendInterval() {
            return sendInterval;
        }

        public void setSendInterval(Integer sendInterval) {
            this.sendInterval = sendInterval;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getUnitID() {
            return unitID;
        }

        public void setUnitID(Integer unitID) {
            this.unitID = unitID;
        }

        public String getUnitName() {
            return unitName;
        }

        public void setUnitName(String unitName) {
            this.unitName = unitName;
        }
    }

    public static class ListAlertTemplate extends Response {

        /** 公司id */
        @SerializedName("CompanyID")
        private Integer companyID;

        /** 模板Id */
        @SerializedName("TemplateID")
        private Integer templateID;

        /** 告警模板名称 */
        @SerializedName("Name")
        private String name;

        /** 产品类型(数值型)。参考ListMonitorProduct获取监控对象类型列表 */
        @SerializedName("ProductType")
        private Integer productType;

        /** 产品类型(字符型)。参考ListMonitorProduct获取监控对象类型列表 */
        @SerializedName("ProductKey")
        private String productKey;

        /** 告警条件规则 */
        @SerializedName("RuleSet")
        private List<AlertRule> ruleSet;

        /** 条件模板备注 */
        @SerializedName("Remark")
        private String remark;

        public Integer getCompanyID() {
            return companyID;
        }

        public void setCompanyID(Integer companyID) {
            this.companyID = companyID;
        }

        public Integer getTemplateID() {
            return templateID;
        }

        public void setTemplateID(Integer templateID) {
            this.templateID = templateID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getProductType() {
            return productType;
        }

        public void setProductType(Integer productType) {
            this.productType = productType;
        }

        public String getProductKey() {
            return productKey;
        }

        public void setProductKey(String productKey) {
            this.productKey = productKey;
        }

        public List<AlertRule> getRuleSet() {
            return ruleSet;
        }

        public void setRuleSet(List<AlertRule> ruleSet) {
            this.ruleSet = ruleSet;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
