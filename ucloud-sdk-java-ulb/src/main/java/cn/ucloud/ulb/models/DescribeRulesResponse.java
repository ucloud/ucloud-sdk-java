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
package cn.ucloud.ulb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeRulesResponse extends Response {

    /** 转发规则信息 */
    @SerializedName("Rules")
    private List<Rule> rules;

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public static class ForwardConfigSet extends Response {

        /** 转发的后端服务节点。限定在监听器的服务节点池里；数组长度可以为0。具体结构详见 ForwardTargetSet */
        @SerializedName("Targets")
        private List<ForwardTargetSet> targets;

        public List<ForwardTargetSet> getTargets() {
            return targets;
        }

        public void setTargets(List<ForwardTargetSet> targets) {
            this.targets = targets;
        }
    }

    public static class ForwardTargetSet extends Response {

        /** 服务节点的标识ID */
        @SerializedName("Id")
        private String id;

        /** 权重。仅监听器负载均衡算法是加权轮询是有效；取值范围[1-100]，默认值为1 */
        @SerializedName("Weight")
        private Integer weight;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }
    }

    public static class HostConfigSet extends Response {

        /** 取值。暂时只支持数组长度为1； 取值需符合相关匹配方式的条件 */
        @SerializedName("Values")
        private List<String> values;

        /** 匹配方式。限定枚举值：Regular-正则，Wildcard-泛域名； 默认值：Regular */
        @SerializedName("MatchMode")
        private String matchMode;

        public List<String> getValues() {
            return values;
        }

        public void setValues(List<String> values) {
            this.values = values;
        }

        public String getMatchMode() {
            return matchMode;
        }

        public void setMatchMode(String matchMode) {
            this.matchMode = matchMode;
        }
    }

    public static class PathConfigSet extends Response {

        /** 取值。暂时只支持数组长度为1； 取值需符合相关匹配方式的条件 */
        @SerializedName("Values")
        private List<String> values;

        public List<String> getValues() {
            return values;
        }

        public void setValues(List<String> values) {
            this.values = values;
        }
    }

    public static class Rule extends Response {

        /** 转发规则的ID */
        @SerializedName("RuleId")
        private String ruleId;

        /** 转发规则匹配条件。具体结构详见 RuleCondition */
        @SerializedName("RuleConditions")
        private List<RuleCondition> ruleConditions;

        /** 转发动作。具体规则详见RuleAction */
        @SerializedName("RuleActions")
        private List<RuleAction> ruleActions;

        /** 是否为默认转发规则 */
        @SerializedName("IsDefault")
        private Boolean isDefault;

        /** 当转发的服务节点为空时，规则是否忽略 */
        @SerializedName("Pass")
        private Boolean pass;

        public String getRuleId() {
            return ruleId;
        }

        public void setRuleId(String ruleId) {
            this.ruleId = ruleId;
        }

        public List<RuleCondition> getRuleConditions() {
            return ruleConditions;
        }

        public void setRuleConditions(List<RuleCondition> ruleConditions) {
            this.ruleConditions = ruleConditions;
        }

        public List<RuleAction> getRuleActions() {
            return ruleActions;
        }

        public void setRuleActions(List<RuleAction> ruleActions) {
            this.ruleActions = ruleActions;
        }

        public Boolean getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
        }

        public Boolean getPass() {
            return pass;
        }

        public void setPass(Boolean pass) {
            this.pass = pass;
        }
    }

    public static class RuleAction extends Response {

        /** 动作类型。限定枚举值：Forward */
        @SerializedName("Type")
        private String type;

        /** 转发服务节点相关配置。 具体结构详见 ForwardConfigSet */
        @SerializedName("ForwardConfig")
        private ForwardConfigSet forwardConfig;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public ForwardConfigSet getForwardConfig() {
            return forwardConfig;
        }

        public void setForwardConfig(ForwardConfigSet forwardConfig) {
            this.forwardConfig = forwardConfig;
        }
    }

    public static class RuleCondition extends Response {

        /** 匹配条件类型。限定枚举值：Host，Path */
        @SerializedName("Type")
        private String type;

        /** 域名相关配置。Type为Host时必填。具体结构详见 HostConfigSet */
        @SerializedName("HostConfig")
        private HostConfigSet hostConfig;

        /** 路径相关配置。Type为Path时必填。具体结构详见 PathConfigSet */
        @SerializedName("PathConfig")
        private PathConfigSet pathConfig;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public HostConfigSet getHostConfig() {
            return hostConfig;
        }

        public void setHostConfig(HostConfigSet hostConfig) {
            this.hostConfig = hostConfig;
        }

        public PathConfigSet getPathConfig() {
            return pathConfig;
        }

        public void setPathConfig(PathConfigSet pathConfig) {
            this.pathConfig = pathConfig;
        }
    }
}
