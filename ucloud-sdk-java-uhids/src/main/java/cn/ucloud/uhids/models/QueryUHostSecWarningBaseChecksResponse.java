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
package cn.ucloud.uhids.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QueryUHostSecWarningBaseChecksResponse extends Response {

    /** 正在告警基线类型 */
    @SerializedName("Result")
    private List<BaseCheckWarning> result;

    public List<BaseCheckWarning> getResult() {
        return result;
    }

    public void setResult(List<BaseCheckWarning> result) {
        this.result = result;
    }

    public static class BaseCheckWarning extends Response {

        /** 基线规则ID */
        @SerializedName("RuleID")
        private String ruleID;

        /** 应用类 */
        @SerializedName("AppName")
        private String appName;

        /** 风险描述 */
        @SerializedName("Description")
        private String description;

        /** 风险英文描述 */
        @SerializedName("DescriptionEn")
        private String descriptionEn;

        /** 风险类型 */
        @SerializedName("RiskType")
        private String riskType;

        /** 风险等级 */
        @SerializedName("RiskLevel")
        private String riskLevel;

        /** 影响主机数 */
        @SerializedName("AgentCount")
        private Integer agentCount;

        public String getRuleID() {
            return ruleID;
        }

        public void setRuleID(String ruleID) {
            this.ruleID = ruleID;
        }

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDescriptionEn() {
            return descriptionEn;
        }

        public void setDescriptionEn(String descriptionEn) {
            this.descriptionEn = descriptionEn;
        }

        public String getRiskType() {
            return riskType;
        }

        public void setRiskType(String riskType) {
            this.riskType = riskType;
        }

        public String getRiskLevel() {
            return riskLevel;
        }

        public void setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
        }

        public Integer getAgentCount() {
            return agentCount;
        }

        public void setAgentCount(Integer agentCount) {
            this.agentCount = agentCount;
        }
    }
}
