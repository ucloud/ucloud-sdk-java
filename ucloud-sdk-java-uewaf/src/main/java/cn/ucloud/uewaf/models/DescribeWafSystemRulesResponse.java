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

public class DescribeWafSystemRulesResponse extends Response {

    /** 规则内容列表，参考SystemRuleInfo */
    @SerializedName("Rules")
    private List<SystemRuleInfo> rules;

    public List<SystemRuleInfo> getRules() {
        return rules;
    }

    public void setRules(List<SystemRuleInfo> rules) {
        this.rules = rules;
    }

    public static class SystemRuleInfo extends Response {

        /** 规则起始编号 */
        @SerializedName("SysRuleset")
        private Integer sysRuleset;

        /** 动作 */
        @SerializedName("Action")
        private String action;

        /** 风险等级 */
        @SerializedName("RiskRank")
        private String riskRank;

        /** 规则集类型 */
        @SerializedName("RulesetType")
        private String rulesetType;

        /** 优先级 */
        @SerializedName("Priority")
        private Integer priority;

        /** 攻击类型 */
        @SerializedName("AttackType")
        private String attackType;

        /** 规则描述 */
        @SerializedName("Description")
        private String description;

        public Integer getSysRuleset() {
            return sysRuleset;
        }

        public void setSysRuleset(Integer sysRuleset) {
            this.sysRuleset = sysRuleset;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getRiskRank() {
            return riskRank;
        }

        public void setRiskRank(String riskRank) {
            this.riskRank = riskRank;
        }

        public String getRulesetType() {
            return rulesetType;
        }

        public void setRulesetType(String rulesetType) {
            this.rulesetType = rulesetType;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public String getAttackType() {
            return attackType;
        }

        public void setAttackType(String attackType) {
            this.attackType = attackType;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
