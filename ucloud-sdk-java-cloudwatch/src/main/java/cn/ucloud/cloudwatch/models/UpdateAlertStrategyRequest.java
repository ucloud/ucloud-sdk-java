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

public class UpdateAlertStrategyRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 告警策略id */
    @NotEmpty
    @UCloudParam("AlertStrategyID")
    private String alertStrategyID;

    /** 告警策略名称。最大长度255个字符 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 产品类型。参考ListMonitorProduct获取监控对象类型列表 */
    @NotEmpty
    @UCloudParam("ProductKey")
    private String productKey;

    /** 绑定资源类型 1 资源组 2 资源 */
    @NotEmpty
    @UCloudParam("ObjectType")
    private Integer objectType;

    /** 条件设置方式 1. 手动配置 2.选择模版 */
    @NotEmpty
    @UCloudParam("ConfigMode")
    private Integer configMode;

    /** 绑定资源，对应绑定资源类型ObjectType=2 */
    @UCloudParam("Resources")
    private List<String> resources;

    /** 绑定资源组，对应绑定资源类型ObjectType=1 */
    @UCloudParam("ResourceGroupIDs")
    private List<Integer> resourceGroupIDs;

    /** */
    @UCloudParam("Tags")
    private List<Tags> tags;

    /** 模板id.对应ConfigMode=2 */
    @UCloudParam("TemplateId")
    private Integer templateId;

    /** */
    @UCloudParam("RuleSet")
    private List<RuleSet> ruleSet;

    /** 通知类型 通知组 group 通知人 user */
    @UCloudParam("NotifyType")
    private String notifyType;

    /** 通知人id */
    @UCloudParam("NotifyUserIDs")
    private List<Integer> notifyUserIDs;

    /** 通知人组id */
    @UCloudParam("NotifyGroupIDs")
    private List<Integer> notifyGroupIDs;

    /** 通知渠道 短信sms 邮件email 回调webhook */
    @UCloudParam("NotifyChannelDs")
    private List<String> notifyChannelDs;

    /** 通知渠道回调webhook 回调语言 中文cn 英文en */
    @UCloudParam("CallbackLanguage")
    private String callbackLanguage;

    /** 回调url */
    @UCloudParam("CallbackUrls")
    private List<String> callbackUrls;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getAlertStrategyID() {
        return alertStrategyID;
    }

    public void setAlertStrategyID(String alertStrategyID) {
        this.alertStrategyID = alertStrategyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public Integer getConfigMode() {
        return configMode;
    }

    public void setConfigMode(Integer configMode) {
        this.configMode = configMode;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public List<Integer> getResourceGroupIDs() {
        return resourceGroupIDs;
    }

    public void setResourceGroupIDs(List<Integer> resourceGroupIDs) {
        this.resourceGroupIDs = resourceGroupIDs;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public List<RuleSet> getRuleSet() {
        return ruleSet;
    }

    public void setRuleSet(List<RuleSet> ruleSet) {
        this.ruleSet = ruleSet;
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

    public static class RuleSet extends Request {

        /** 规则指标ID。参考该类型产品下返回的指标列表GetProductMetrics */
        @UCloudParam("MetricID")
        private Integer metricID;

        /** 阈值比较方式。 枚举值比较方式: 1->= 2-<= 3-> 4-< 5-== 6-!= */
        @UCloudParam("ThresholdCompare")
        private Integer thresholdCompare;

        /** 触发阈值 */
        @UCloudParam("ThresholdValue")
        private Integer thresholdValue;

        /** 触发次数 */
        @UCloudParam("TriggerCount")
        private Integer triggerCount;

        /** 触发周期。枚举值：continuous连续 exponent 指数 single 不重复 */
        @UCloudParam("SendPeriodType")
        private String sendPeriodType;

        /** 告警等级。枚举值：P0,P1,P2,P3 */
        @UCloudParam("Level")
        private String level;

        /** 告警状态。枚举值：0-关闭 1-开启 */
        @UCloudParam("Status")
        private Integer status;

        /** 沉默周期(告警周期选择为连续时必填) */
        @UCloudParam("SendInterval")
        private Integer sendInterval;

        public Integer getMetricID() {
            return metricID;
        }

        public void setMetricID(Integer metricID) {
            this.metricID = metricID;
        }

        public Integer getThresholdCompare() {
            return thresholdCompare;
        }

        public void setThresholdCompare(Integer thresholdCompare) {
            this.thresholdCompare = thresholdCompare;
        }

        public Integer getThresholdValue() {
            return thresholdValue;
        }

        public void setThresholdValue(Integer thresholdValue) {
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

        public Integer getSendInterval() {
            return sendInterval;
        }

        public void setSendInterval(Integer sendInterval) {
            this.sendInterval = sendInterval;
        }
    }

    public static class Tags extends Request {

        /** 数据点tag key */
        @UCloudParam("Key")
        private String key;

        /** 数据点tag operator 包含= 不包含!= */
        @UCloudParam("Operator")
        private String operator;

        /** 数据点tag value */
        @UCloudParam("Values")
        private List<String> values;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getOperator() {
            return operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public List<String> getValues() {
            return values;
        }

        public void setValues(List<String> values) {
            this.values = values;
        }
    }
}
