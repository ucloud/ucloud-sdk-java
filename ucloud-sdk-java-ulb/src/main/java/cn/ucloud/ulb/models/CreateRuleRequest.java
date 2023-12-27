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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreateRuleRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 负载均衡实例的ID */
    @NotEmpty
    @UCloudParam("LoadBalancerId")
    private String loadBalancerId;

    /** 监听器的ID */
    @NotEmpty
    @UCloudParam("ListenerId")
    private String listenerId;

    /** */
    @UCloudParam("RuleConditions")
    private List<RuleConditions> ruleConditions;

    /** */
    @UCloudParam("RuleActions")
    private List<RuleActions> ruleActions;

    /** 当转发的服务节点为空时，规则是否忽略。默认值true */
    @UCloudParam("Pass")
    private Boolean pass;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public List<RuleConditions> getRuleConditions() {
        return ruleConditions;
    }

    public void setRuleConditions(List<RuleConditions> ruleConditions) {
        this.ruleConditions = ruleConditions;
    }

    public List<RuleActions> getRuleActions() {
        return ruleActions;
    }

    public void setRuleActions(List<RuleActions> ruleActions) {
        this.ruleActions = ruleActions;
    }

    public Boolean getPass() {
        return pass;
    }

    public void setPass(Boolean pass) {
        this.pass = pass;
    }

    public static class RuleActions extends Request {

        /** 动作类型。限定枚举值："Forward"；RuleActions暂支持长度为1 */
        @NotEmpty
        @UCloudParam("Type")
        private String type;

        /** */
        @UCloudParam("ForwardConfig")
        private RuleActionsForwardConfig forwardConfig;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public RuleActionsForwardConfig getForwardConfig() {
            return forwardConfig;
        }

        public void setForwardConfig(RuleActionsForwardConfig forwardConfig) {
            this.forwardConfig = forwardConfig;
        }
    }

    public static class RuleActionsForwardConfig extends Request {

        /** */
        @UCloudParam("Targets")
        private List<RuleActionsForwardConfigTargets> targets;

        public List<RuleActionsForwardConfigTargets> getTargets() {
            return targets;
        }

        public void setTargets(List<RuleActionsForwardConfigTargets> targets) {
            this.targets = targets;
        }
    }

    public static class RuleActionsForwardConfigTargets extends Request {

        /** 转发的后端服务节点的标识ID。限定在监听器的服务节点池里；数组长度可以是0；转发服务节点配置的数组长度不为0时，Id必填 */
        @UCloudParam("Id")
        private String id;

        /** 转发的后端服务节点的权重。仅监听器负载均衡算法是加权轮询是有效 */
        @UCloudParam("Weight")
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

    public static class RuleConditions extends Request {

        /** 匹配条件类型。限定枚举值："Host"/"Path" */
        @NotEmpty
        @UCloudParam("Type")
        private String type;

        /** */
        @UCloudParam("HostConfig")
        private RuleConditionsHostConfig hostConfig;

        /** */
        @UCloudParam("PathConfig")
        private RuleConditionsPathConfig pathConfig;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public RuleConditionsHostConfig getHostConfig() {
            return hostConfig;
        }

        public void setHostConfig(RuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
        }

        public RuleConditionsPathConfig getPathConfig() {
            return pathConfig;
        }

        public void setPathConfig(RuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
        }
    }

    public static class RuleConditionsHostConfig extends Request {

        /** 匹配方式。限定枚举值："Regular"/"Wildcard"，默认值："Regular" */
        @UCloudParam("MatchMode")
        private String matchMode;

        /** 取值。暂时只支持数组长度为1；取值需符合相关匹配方式的条件；域名匹配时必填 */
        @UCloudParam("Values")
        private List<String> values;

        public String getMatchMode() {
            return matchMode;
        }

        public void setMatchMode(String matchMode) {
            this.matchMode = matchMode;
        }

        public List<String> getValues() {
            return values;
        }

        public void setValues(List<String> values) {
            this.values = values;
        }
    }

    public static class RuleConditionsPathConfig extends Request {

        /** 取值。暂时只支持数组长度为1；取值需符合相关条件；路径匹配时必填 */
        @UCloudParam("Values")
        private List<String> values;

        public List<String> getValues() {
            return values;
        }

        public void setValues(List<String> values) {
            this.values = values;
        }
    }
}
