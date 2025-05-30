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

public class CreateAlertStrategyTemplateRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 告警模板名称。最大长度64个字符 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 产品类型。参考ListMonitorProduct获取监控对象类型列表 */
    @NotEmpty
    @UCloudParam("ProductKey")
    private String productKey;

    /** */
    @UCloudParam("RuleSet")
    private List<RuleSet> ruleSet;

    /** 备注 */
    @UCloudParam("Remark")
    private String remark;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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

    public List<RuleSet> getRuleSet() {
        return ruleSet;
    }

    public void setRuleSet(List<RuleSet> ruleSet) {
        this.ruleSet = ruleSet;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static class RuleSet extends Request {

        /** 规则指标ID。参考该类型产品下返回的指标列表GetProductMetrics */
        @NotEmpty
        @UCloudParam("MetricID")
        private Integer metricID;

        /** 阈值比较方式。 枚举值比较方式: 1->= 2-<= 3-> 4-< 5-== 6-!= */
        @NotEmpty
        @UCloudParam("ThresholdCompare")
        private Integer thresholdCompare;

        /** 触发阈值 */
        @NotEmpty
        @UCloudParam("ThresholdValue")
        private Integer thresholdValue;

        /** 触发次数 */
        @NotEmpty
        @UCloudParam("TriggerCount")
        private Integer triggerCount;

        /** 触发周期。枚举值：continuous连续 exponent 指数 single 不重复 */
        @NotEmpty
        @UCloudParam("SendPeriodType")
        private String sendPeriodType;

        /** 告警等级。枚举值：P0,P1,P2,P3 */
        @NotEmpty
        @UCloudParam("Level")
        private String level;

        /** 告警状态。枚举值：0-关闭 1-开启 */
        @NotEmpty
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
}
