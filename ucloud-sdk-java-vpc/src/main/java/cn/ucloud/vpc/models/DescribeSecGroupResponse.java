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
package cn.ucloud.vpc.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeSecGroupResponse extends Response {

    /** 详见SecGroupInfo */
    @SerializedName("DataSet")
    private List<SecGroupInfo> dataSet;

    public List<SecGroupInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<SecGroupInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public static class SecGroupInfo extends Response {

        /** 安全组资源ID */
        @SerializedName("SecGroupId")
        private String secGroupId;

        /** 安全组名称 */
        @SerializedName("Name")
        private String name;

        /** VPC资源ID */
        @SerializedName("VPCId")
        private String vpcId;

        /** 用户 ID */
        @SerializedName("Account")
        private Integer account;

        /** 业务组 */
        @SerializedName("Tag")
        private String tag;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /**
         * 安全组类型，枚举值为： "user defined", 自定义创建安全组； "recommend web", 使用Web模板创建的安全组； "recommend non
         * web", 使用非Web模板创建的安全组
         */
        @SerializedName("Type")
        private String type;

        /** 创建的时间，格式为Unix Timestamp，如 1747030299 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 安全组组中的规则列表，参见 SecGroupRuleInfo */
        @SerializedName("Rule")
        private List<SecGroupRuleInfo> rule;

        public String getSecGroupId() {
            return secGroupId;
        }

        public void setSecGroupId(String secGroupId) {
            this.secGroupId = secGroupId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public Integer getAccount() {
            return account;
        }

        public void setAccount(Integer account) {
            this.account = account;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public List<SecGroupRuleInfo> getRule() {
            return rule;
        }

        public void setRule(List<SecGroupRuleInfo> rule) {
            this.rule = rule;
        }
    }

    public static class SecGroupRuleInfo extends Response {

        /** 规则ID */
        @SerializedName("RuleId")
        private String ruleId;

        /** "Ingress/Egress"，入站规则/出站规则 */
        @SerializedName("Direction")
        private String direction;

        /** 地址 */
        @SerializedName("IPRange")
        private String ipRange;

        /** 优先级 */
        @SerializedName("Priority")
        private Integer priority;

        /** 协议类型 */
        @SerializedName("ProtocolType")
        private String protocolType;

        /** 目标端口 */
        @SerializedName("DstPort")
        private String dstPort;

        /** 匹配策略 */
        @SerializedName("RuleAction")
        private String ruleAction;

        /** 安全组规则备注 */
        @SerializedName("Remark")
        private String remark;

        /** IP 版本，如 "IPv4"。支持 IPv6 后废弃 */
        @SerializedName("IPVersion")
        private String ipVersion;

        public String getRuleId() {
            return ruleId;
        }

        public void setRuleId(String ruleId) {
            this.ruleId = ruleId;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getIPRange() {
            return ipRange;
        }

        public void setIPRange(String ipRange) {
            this.ipRange = ipRange;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public String getProtocolType() {
            return protocolType;
        }

        public void setProtocolType(String protocolType) {
            this.protocolType = protocolType;
        }

        public String getDstPort() {
            return dstPort;
        }

        public void setDstPort(String dstPort) {
            this.dstPort = dstPort;
        }

        public String getRuleAction() {
            return ruleAction;
        }

        public void setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getIPVersion() {
            return ipVersion;
        }

        public void setIPVersion(String ipVersion) {
            this.ipVersion = ipVersion;
        }
    }
}
