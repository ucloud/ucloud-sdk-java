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

public class UpdateRuleAttributeRequest extends Request {

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

    /** 转发规则的ID */
    @NotEmpty
    @UCloudParam("RuleId")
    private String ruleId;

    /** */
    @UCloudParam("RuleConditions")
    private List<RuleConditions> ruleConditions;

    /** */
    @UCloudParam("RuleActions")
    private List<RuleActions> ruleActions;

    /** 当转发的服务节点为空时，规则是否忽略。默认转发规则不可更改 */
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

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
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

        /** 动作类型。限定枚举值："Forward"；RuleActions数组长度不为0时必填 */
        @UCloudParam("Type")
        private String type;

        /** */
        @UCloudParam("ForwardConfig")
        private RuleActionsForwardConfig forwardConfig;

        /**
         * 转发规则动作执行的顺序，取值为1~1000，按值从小到大执行动作。值不能为空，不能重复。
         *
         * <p>Forward、FixedResponse 类型的动作不判断 Order，最后一个执行
         */
        @UCloudParam("Order")
        private Integer order;

        /** */
        @UCloudParam("InsertHeaderConfig")
        private RuleActionsInsertHeaderConfig insertHeaderConfig;

        /** */
        @UCloudParam("RemoveHeaderConfig")
        private RuleActionsRemoveHeaderConfig removeHeaderConfig;

        /** */
        @UCloudParam("CorsConfig")
        private RuleActionsCorsConfig corsConfig;

        /** */
        @UCloudParam("FixedResponseConfig")
        private RuleActionsFixedResponseConfig fixedResponseConfig;

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

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        public RuleActionsInsertHeaderConfig getInsertHeaderConfig() {
            return insertHeaderConfig;
        }

        public void setInsertHeaderConfig(RuleActionsInsertHeaderConfig insertHeaderConfig) {
            this.insertHeaderConfig = insertHeaderConfig;
        }

        public RuleActionsRemoveHeaderConfig getRemoveHeaderConfig() {
            return removeHeaderConfig;
        }

        public void setRemoveHeaderConfig(RuleActionsRemoveHeaderConfig removeHeaderConfig) {
            this.removeHeaderConfig = removeHeaderConfig;
        }

        public RuleActionsCorsConfig getCorsConfig() {
            return corsConfig;
        }

        public void setCorsConfig(RuleActionsCorsConfig corsConfig) {
            this.corsConfig = corsConfig;
        }

        public RuleActionsFixedResponseConfig getFixedResponseConfig() {
            return fixedResponseConfig;
        }

        public void setFixedResponseConfig(RuleActionsFixedResponseConfig fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
        }
    }

    public static class RuleActionsCorsConfig extends Request {

        /**
         * 允许的访问来源列表。支持只配置一个元素*，或配置一个或多个值。
         *
         * <p>单个值必须以http://或者https://开头，后边加一个正确的域名或一级泛域名。（例：http://*.test.abc.example.com）
         * 单个值可以不加端口，也可以指定端口，端口范围：1~65535。 最多支持5个值
         */
        @UCloudParam("AllowOrigin")
        private List<String> allowOrigin;

        /**
         * 允许跨域的 Header 列表。支持配置为*或配置一个或多个 value 值。 单个 value
         * 值只允许包含大小写字母、数字，不能以下划线（_）和短划线（-）开头或结尾，最大长度限制为 32 个字符。 最多支持20个值
         */
        @UCloudParam("AllowHeaders")
        private List<String> allowHeaders;

        /**
         * 允许暴露的 Header 列表。支持配置为*或配置一个或多个 value 值。 单个 value
         * 值只允许包含大小写字母、数字，不能以下划线（_）和短划线（-）开头或结尾，最大长度限制为 32 个字符。 最多支持20个值
         */
        @UCloudParam("ExposeHeaders")
        private List<String> exposeHeaders;

        /**
         * 选择跨域访问时允许的 HTTP 方法。取值：
         *
         * <p>GET。 POST。 PUT。 DELETE。 HEAD。 OPTIONS。 PATCH。
         */
        @UCloudParam("AllowMethods")
        private List<String> allowMethods;

        /**
         * 是否允许携带凭证信息。取值：
         *
         * <p>on：是。 off：否。
         */
        @UCloudParam("AllowCredentials")
        private String allowCredentials;

        /**
         * 预检请求在浏览器的最大缓存时间，单位：秒。
         *
         * <p>取值范围：-1~172800。
         */
        @UCloudParam("MaxAge")
        private Integer maxAge;

        public List<String> getAllowOrigin() {
            return allowOrigin;
        }

        public void setAllowOrigin(List<String> allowOrigin) {
            this.allowOrigin = allowOrigin;
        }

        public List<String> getAllowHeaders() {
            return allowHeaders;
        }

        public void setAllowHeaders(List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
        }

        public List<String> getExposeHeaders() {
            return exposeHeaders;
        }

        public void setExposeHeaders(List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
        }

        public List<String> getAllowMethods() {
            return allowMethods;
        }

        public void setAllowMethods(List<String> allowMethods) {
            this.allowMethods = allowMethods;
        }

        public String getAllowCredentials() {
            return allowCredentials;
        }

        public void setAllowCredentials(String allowCredentials) {
            this.allowCredentials = allowCredentials;
        }

        public Integer getMaxAge() {
            return maxAge;
        }

        public void setMaxAge(Integer maxAge) {
            this.maxAge = maxAge;
        }
    }

    public static class RuleActionsFixedResponseConfig extends Request {

        /** 返回的 HTTP 响应码，仅支持 2xx、4xx、5xx 数字，x 为任意数字。 */
        @UCloudParam("HttpCode")
        private Integer httpCode;

        /** 返回的固定内容。最大支持存储 1 KB，只支持 ASCII 码值ch >= 32 && ch < 127范围内、不包括 $ 的可打印字符。 */
        @UCloudParam("Content")
        private String content;

        public Integer getHttpCode() {
            return httpCode;
        }

        public void setHttpCode(Integer httpCode) {
            this.httpCode = httpCode;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
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

    public static class RuleActionsInsertHeaderConfig extends Request {

        /**
         * 插入的 header 字段名称，长度为 1~40 个字符，支持大小写字母 a~z、数字、下划线（_）和短划线（-）。头字段名称不能重复用于InsertHeader中。
         *
         * <p>header 字段不能使用以下(此处判断大小写不敏感)
         *
         * <p>x-real-ip、x-forwarded-for、x-forwarded-proto、x-forwarded-srcport、ucloud-alb-trace、connection、upgrade、content-length、transfer-encoding、keep-alive、te、host、cookie、remoteip、authority
         */
        @UCloudParam("Key")
        private String key;

        /**
         * 头字段内容类型。取值： UserDefined：用户指定。
         *
         * <p>ReferenceHeader：引用用户请求头中的某一个字段。
         *
         * <p>SystemDefined：系统定义。
         */
        @UCloudParam("ValueType")
        private String valueType;

        /**
         * 插入的 header 字段内容。
         *
         * <p>ValueType 取值为 SystemDefined 时取值如下： ClientSrcPort：客户端端口。 ClientSrcIp：客户端 IP 地址。
         * Protocol：客户端请求的协议（HTTP 或 HTTPS)。 RuleID：客户端请求命中的转发规则ID。 ALBID：ALB ID。 ALBPort：ALB 端口。
         *
         * <p>ValueType 取值为 UserDefined 时：
         *
         * <p>可以自定义头字段内容，限制长度为 1~128 个字符，只支持 ASCII 码值ch >= 32 && ch < 127范围内、不包括 $ 的可打印字符。
         *
         * <p>ValueType 取值为 ReferenceHeader 时：
         *
         * <p>可以引用请求头字段中的某一个字段，限制长度限制为 1~128 个字符，支持小写字母 a~z、数字、短划线（-）和下划线（_）。
         */
        @UCloudParam("Value")
        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValueType() {
            return valueType;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class RuleActionsRemoveHeaderConfig extends Request {

        /**
         * 删除的 header 字段名称，目前只能删除以下几个默认配置的字段
         *
         * <p>X-Real-IP、X-Forwarded-For、X-Forwarded-Proto、X-Forwarded-SrcPort
         */
        @UCloudParam("Key")
        private String key;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }

    public static class RuleConditions extends Request {

        /** 匹配条件类型。限定枚举值："Host"/"Path"；RuleConditions数组长度不为0时必填 */
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

        /** 取值。暂时只支持数组长度为1；取值需符合相关匹配方式的条件；修改域名匹配时必填 */
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

        /** 取值。暂时只支持数组长度为1；取值需符合相关条件；修改路径匹配时必填 */
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
