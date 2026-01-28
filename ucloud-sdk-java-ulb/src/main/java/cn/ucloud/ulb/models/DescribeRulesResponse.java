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

    public static class CorsConfigSet extends Response {

        /**
         * 允许的访问来源列表。支持只配置一个元素*，或配置一个或多个值。
         *
         * <p>单个值必须以http://或者https://开头，后边加一个正确的域名或一级泛域名。（例：http://*.test.abc.example.com）
         * 单个值可以不加端口，也可以指定端口，端口范围：1~65535。 最多支持5个值
         */
        @SerializedName("AllowOrigin")
        private List<String> allowOrigin;

        /**
         * 允许跨域的 Header 列表。支持配置为*或配置一个或多个 value 值。 单个 value
         * 值只允许包含大小写字母、数字，不能以下划线（_）和短划线（-）开头或结尾，最大长度限制为 32 个字符。 最多支持20个值
         */
        @SerializedName("AllowHeaders")
        private List<String> allowHeaders;

        /**
         * 允许暴露的 Header 列表。支持配置为*或配置一个或多个 value 值。 单个 value
         * 值只允许包含大小写字母、数字，不能以下划线（_）和短划线（-）开头或结尾，最大长度限制为 32 个字符。 最多支持20个值
         */
        @SerializedName("ExposeHeaders")
        private List<String> exposeHeaders;

        /**
         * 选择跨域访问时允许的 HTTP 方法。取值：
         *
         * <p>GET POST PUT DELETE HEAD OPTIONS PATCH
         */
        @SerializedName("AllowMethods")
        private List<String> allowMethods;

        /**
         * 是否允许携带凭证信息。取值：
         *
         * <p>on：是。 off：否。
         */
        @SerializedName("AllowCredentials")
        private String allowCredentials;

        /**
         * 预检请求在浏览器的最大缓存时间，单位：秒。
         *
         * <p>取值范围：-1~172800。
         */
        @SerializedName("MaxAge")
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

    public static class FixedResponseConfigSet extends Response {

        /** 返回的 HTTP 响应码，仅支持 2xx、4xx、5xx 数字，x 为任意数字。 */
        @SerializedName("HttpCode")
        private Integer httpCode;

        /** 返回的固定内容。最大支持存储 1 KB，只支持 ASCII 码值ch >= 32 && ch < 127范围内、不包括 $ 的可打印字符。 */
        @SerializedName("Content")
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

    public static class InsertHeaderConfigSet extends Response {

        /**
         * 插入的 header 字段名称，长度为 1~40 个字符，支持大小写字母 a~z、数字、下划线（_）和短划线（-）。头字段名称不能重复用于InsertHeader中。
         *
         * <p>header 字段不能使用以下(此处判断大小写不敏感)
         *
         * <p>x-real-ip、x-forwarded-for、x-forwarded-proto、x-forwarded-srcport、ucloud-alb-trace、connection、upgrade、content-length、transfer-encoding、keep-alive、te、host、cookie、remoteip、authority
         */
        @SerializedName("Key")
        private String key;

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
        @SerializedName("Value")
        private String value;

        /**
         * 头字段内容类型。取值：
         *
         * <p>UserDefined：用户指定。
         *
         * <p>ReferenceHeader：引用用户请求头中的某一个字段。
         *
         * <p>SystemDefined：系统定义。
         */
        @SerializedName("ValueType")
        private String valueType;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getValueType() {
            return valueType;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
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

    public static class RemoveHeaderConfigSet extends Response {

        /**
         * 删除的 header 字段名称，目前只能删除以下几个默认配置的字段:
         * X-Real-IP、X-Forwarded-For、X-Forwarded-Proto、X-Forwarded-SrcPort
         */
        @SerializedName("Key")
        private String key;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
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

        /** 动作类型。限定枚举值：Forward、"InsertHeader"、"Cors"、"FixedResponse"、"RemoveHeader" */
        @SerializedName("Type")
        private String type;

        /** 转发服务节点相关配置，对应 type 值: "Forward"。具体结构详见 ForwardConfigSet */
        @SerializedName("ForwardConfig")
        private ForwardConfigSet forwardConfig;

        /** 静态返回相关配置，对应 type 值: "FixedResponse"。具体结构详见 FixedResponseConfigSet */
        @SerializedName("FixedResponseConfig")
        private FixedResponseConfigSet fixedResponseConfig;

        /** 插入 header 相关配置，对应 type 值: "InsertHeader"。具体结构详见 InsertHeaderConfigSet */
        @SerializedName("InsertHeaderConfig")
        private InsertHeaderConfigSet insertHeaderConfig;

        /** 跨域相关配置，对应 type 值: "Cors"。具体结构详见 CorsConfigSet */
        @SerializedName("CorsConfig")
        private CorsConfigSet corsConfig;

        /** 删除 header 相关配置，对应 type 值: "RemoveHeader"。具体结构详见 RemoveHeaderConfigSet */
        @SerializedName("RemoveHeaderConfig")
        private RemoveHeaderConfigSet removeHeaderConfig;

        /**
         * 转发规则动作执行的顺序，取值为1~1000，按值从小到大执行动作。值不能为空，不能重复。
         *
         * <p>Forward、FixedResponse 类型的动作不判断 Order，最后一个执行
         */
        @SerializedName("Order")
        private Integer order;

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

        public FixedResponseConfigSet getFixedResponseConfig() {
            return fixedResponseConfig;
        }

        public void setFixedResponseConfig(FixedResponseConfigSet fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
        }

        public InsertHeaderConfigSet getInsertHeaderConfig() {
            return insertHeaderConfig;
        }

        public void setInsertHeaderConfig(InsertHeaderConfigSet insertHeaderConfig) {
            this.insertHeaderConfig = insertHeaderConfig;
        }

        public CorsConfigSet getCorsConfig() {
            return corsConfig;
        }

        public void setCorsConfig(CorsConfigSet corsConfig) {
            this.corsConfig = corsConfig;
        }

        public RemoveHeaderConfigSet getRemoveHeaderConfig() {
            return removeHeaderConfig;
        }

        public void setRemoveHeaderConfig(RemoveHeaderConfigSet removeHeaderConfig) {
            this.removeHeaderConfig = removeHeaderConfig;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
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
