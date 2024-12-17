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

public class ListAlertStrategyResponse extends Response {

    /** 告警策略集合 */
    @SerializedName("Data")
    private List<AlertStrategy> data;

    /** 告警策略总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 链路ID */
    @SerializedName("TraceId")
    private String traceId;

    public List<AlertStrategy> getData() {
        return data;
    }

    public void setData(List<AlertStrategy> data) {
        this.data = data;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public static class AlertRule extends Response {

        /** 规则ID */
        @SerializedName("RuleID")
        private Integer ruleID;

        /** 指标ID */
        @SerializedName("MetricID")
        private Integer metricID;

        /** 指标名称 */
        @SerializedName("MetricName")
        private String metricName;

        /** 阈值比较方式 */
        @SerializedName("ThresholdCompare")
        private Integer thresholdCompare;

        /** 阈值 */
        @SerializedName("ThresholdValue")
        private Double thresholdValue;

        /** 触发次数 */
        @SerializedName("TriggerCount")
        private Integer triggerCount;

        /** 触发周期 */
        @SerializedName("SendPeriodType")
        private String sendPeriodType;

        /** 发送间隔 */
        @SerializedName("SendInterval")
        private Integer sendInterval;

        /** 告警等级 */
        @SerializedName("Level")
        private String level;

        /** 告警状态 */
        @SerializedName("Status")
        private Integer status;

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
    }

    public static class AlertStrategy extends Response {

        /** 告警规则集合 */
        @SerializedName("RuleSet")
        private List<AlertRule> ruleSet;

        /** 告警策略Id */
        @SerializedName("AlertStrategyID")
        private Integer alertStrategyID;

        /** 告警策略名称 */
        @SerializedName("Name")
        private String name;

        /** 资源类型 */
        @SerializedName("ProductType")
        private Integer productType;

        /** 资源类型名称 */
        @SerializedName("ProductKey")
        private String productKey;

        /** 告警规则配置类型(基于模板配置、基于手工配置) */
        @SerializedName("ConfigMode")
        private Integer configMode;

        /** 模板Id */
        @SerializedName("TemplateId")
        private Integer templateId;

        /** 通知方式(通知组：group，通知人：user) */
        @SerializedName("NotifyType")
        private String notifyType;

        /** 通知人用户id集合 */
        @SerializedName("NotifyUserIDs")
        private List<Integer> notifyUserIDs;

        /** 通知组id集合 */
        @SerializedName("NotifyGroupIDs")
        private List<Integer> notifyGroupIDs;

        /** 通知渠道('email', 'sms', 'webhook') */
        @SerializedName("NotifyChannelDs")
        private List<String> notifyChannelDs;

        /** 回调语言(cn,en) */
        @SerializedName("CallbackLanguage")
        private String callbackLanguage;

        /** 回调地址 */
        @SerializedName("CallbackUrls")
        private List<String> callbackUrls;

        /** 告警策略状态 */
        @SerializedName("Status")
        private Integer status;

        /** 告警策略备注 */
        @SerializedName("Remark")
        private String remark;

        /** 创建人 */
        @SerializedName("CreatedBy")
        private String createdBy;

        /** 更新人 */
        @SerializedName("UpdatedBy")
        private String updatedBy;

        /** 创建时间 */
        @SerializedName("CreatedAt")
        private Integer createdAt;

        /** 更新时间 */
        @SerializedName("UpdatedAt")
        private Integer updatedAt;

        public List<AlertRule> getRuleSet() {
            return ruleSet;
        }

        public void setRuleSet(List<AlertRule> ruleSet) {
            this.ruleSet = ruleSet;
        }

        public Integer getAlertStrategyID() {
            return alertStrategyID;
        }

        public void setAlertStrategyID(Integer alertStrategyID) {
            this.alertStrategyID = alertStrategyID;
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

        public Integer getConfigMode() {
            return configMode;
        }

        public void setConfigMode(Integer configMode) {
            this.configMode = configMode;
        }

        public Integer getTemplateId() {
            return templateId;
        }

        public void setTemplateId(Integer templateId) {
            this.templateId = templateId;
        }

        public String getNotifyType() {
            return notifyType;
        }

        public void setNotifyType(String notifyType) {
            this.notifyType = notifyType;
        }

        public List<Integer> getNotifyUserIDs() {
            return notifyUserIDs;
        }

        public void setNotifyUserIDs(List<Integer> notifyUserIDs) {
            this.notifyUserIDs = notifyUserIDs;
        }

        public List<Integer> getNotifyGroupIDs() {
            return notifyGroupIDs;
        }

        public void setNotifyGroupIDs(List<Integer> notifyGroupIDs) {
            this.notifyGroupIDs = notifyGroupIDs;
        }

        public List<String> getNotifyChannelDs() {
            return notifyChannelDs;
        }

        public void setNotifyChannelDs(List<String> notifyChannelDs) {
            this.notifyChannelDs = notifyChannelDs;
        }

        public String getCallbackLanguage() {
            return callbackLanguage;
        }

        public void setCallbackLanguage(String callbackLanguage) {
            this.callbackLanguage = callbackLanguage;
        }

        public List<String> getCallbackUrls() {
            return callbackUrls;
        }

        public void setCallbackUrls(List<String> callbackUrls) {
            this.callbackUrls = callbackUrls;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
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

        public Integer getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Integer createdAt) {
            this.createdAt = createdAt;
        }

        public Integer getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(Integer updatedAt) {
            this.updatedAt = updatedAt;
        }
    }
}
