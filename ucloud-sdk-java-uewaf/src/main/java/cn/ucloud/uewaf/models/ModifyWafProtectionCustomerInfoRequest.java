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


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class ModifyWafProtectionCustomerInfoRequest extends Request {

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 规则ID */
    @NotEmpty
    @UCloudParam("RuleSetID")
    private Integer ruleSetID;

    /** 规则名称 */
    @NotEmpty
    @UCloudParam("RuleName")
    private String ruleName;

    /** 规则风险等级 */
    @NotEmpty
    @UCloudParam("RiskRank")
    private String riskRank;

    /** 规则匹配后的动作 */
    @NotEmpty
    @UCloudParam("RuleAction")
    private String ruleAction;

    /** 规则匹配条件个数 */
    @NotEmpty
    @UCloudParam("RuleNum")
    private Integer ruleNum;

    /** 风险种类，scan,loopholes,xss,cc,sql,exec,webshell,infoleak,eaa,protocol,other */
    @NotEmpty
    @UCloudParam("RiskType")
    private String riskType;

    /** 域名， 域名与域名ID 必须选填一项 */
    @NotEmpty
    @UCloudParam("FullDomain")
    private String fullDomain;

    /** 规则匹配条件 */
    @UCloudParam("Rule")
    private String rule;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getRuleSetID() {
        return ruleSetID;
    }

    public void setRuleSetID(Integer ruleSetID) {
        this.ruleSetID = ruleSetID;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRiskRank() {
        return riskRank;
    }

    public void setRiskRank(String riskRank) {
        this.riskRank = riskRank;
    }

    public String getRuleAction() {
        return ruleAction;
    }

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    public Integer getRuleNum() {
        return ruleNum;
    }

    public void setRuleNum(Integer ruleNum) {
        this.ruleNum = ruleNum;
    }

    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    public String getFullDomain() {
        return fullDomain;
    }

    public void setFullDomain(String fullDomain) {
        this.fullDomain = fullDomain;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }
}
