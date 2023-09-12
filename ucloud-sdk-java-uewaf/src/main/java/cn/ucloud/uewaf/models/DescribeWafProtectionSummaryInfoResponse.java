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
package cn.ucloud.uewaf.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeWafProtectionSummaryInfoResponse extends Response {

    /** 规则数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 工作模式 */
    @SerializedName("WorkMode")
    private String workMode;

    /** 规则集列表，参考ProtectionSummaryRuleSetEntry */
    @SerializedName("RuleSetList")
    private List<ProtectionSummaryRuleSetEntry> ruleSetList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getWorkMode() {
        return workMode;
    }

    public void setWorkMode(String workMode) {
        this.workMode = workMode;
    }

    public List<ProtectionSummaryRuleSetEntry> getRuleSetList() {
        return ruleSetList;
    }

    public void setRuleSetList(List<ProtectionSummaryRuleSetEntry> ruleSetList) {
        this.ruleSetList = ruleSetList;
    }

    public static class ProtectionSummaryRuleInfo extends Response {

        /** 匹配字段 */
        @SerializedName("Field")
        private String field;

        /** 行为动作 */
        @SerializedName("Operator")
        private String operator;

        /** 匹配内容 */
        @SerializedName("Content")
        private String content;

        /** 规则ID */
        @SerializedName("RuleId")
        private Integer ruleId;

        /** 规则描述 */
        @SerializedName("Description")
        private String description;

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getOperator() {
            return operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Integer getRuleId() {
            return ruleId;
        }

        public void setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class ProtectionSummaryRuleSetEntry extends Response {

        /** 规则名称 */
        @SerializedName("RuleName")
        private String ruleName;

        /** 规则动作 */
        @SerializedName("RuleAction")
        private String ruleAction;

        /** 优先级 */
        @SerializedName("Priority")
        private Integer priority;

        /** 风险等级 */
        @SerializedName("RiskRank")
        private String riskRank;

        /** 风险类型 */
        @SerializedName("RiskType")
        private String riskType;

        /** 规则集ID */
        @SerializedName("RuleSetID")
        private Integer ruleSetID;

        /** 规则集类型 */
        @SerializedName("RuleSetType")
        private String ruleSetType;

        /** 规则集起始ID */
        @SerializedName("SysRuleset")
        private Integer sysRuleset;

        /** 规则描述 */
        @SerializedName("RuleDescription")
        private String ruleDescription;

        /** 规则详情，参考ProtectionSummaryRuleInfo */
        @SerializedName("RuleList")
        private List<ProtectionSummaryRuleInfo> ruleList;

        public String getRuleName() {
            return ruleName;
        }

        public void setRuleName(String ruleName) {
            this.ruleName = ruleName;
        }

        public String getRuleAction() {
            return ruleAction;
        }

        public void setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public String getRiskRank() {
            return riskRank;
        }

        public void setRiskRank(String riskRank) {
            this.riskRank = riskRank;
        }

        public String getRiskType() {
            return riskType;
        }

        public void setRiskType(String riskType) {
            this.riskType = riskType;
        }

        public Integer getRuleSetID() {
            return ruleSetID;
        }

        public void setRuleSetID(Integer ruleSetID) {
            this.ruleSetID = ruleSetID;
        }

        public String getRuleSetType() {
            return ruleSetType;
        }

        public void setRuleSetType(String ruleSetType) {
            this.ruleSetType = ruleSetType;
        }

        public Integer getSysRuleset() {
            return sysRuleset;
        }

        public void setSysRuleset(Integer sysRuleset) {
            this.sysRuleset = sysRuleset;
        }

        public String getRuleDescription() {
            return ruleDescription;
        }

        public void setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
        }

        public List<ProtectionSummaryRuleInfo> getRuleList() {
            return ruleList;
        }

        public void setRuleList(List<ProtectionSummaryRuleInfo> ruleList) {
            this.ruleList = ruleList;
        }
    }
}
