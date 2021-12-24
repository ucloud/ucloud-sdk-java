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
package cn.ucloud.uec.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeUEcFirewallResponse extends Response {

    /** 防火墙组详细信息，参见 FirewallInfo: false */
    @SerializedName("FirewallSet")
    private List<FirewallInfo> firewallSet;

    /** 满足条件的节点总数: false */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<FirewallInfo> getFirewallSet() {
        return firewallSet;
    }

    public void setFirewallSet(List<FirewallInfo> firewallSet) {
        this.firewallSet = firewallSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class FirewallInfo extends Response {

        /** 防火墙Id: false */
        @SerializedName("FirewallId")
        private String firewallId;

        /** 防火墙名称: false */
        @SerializedName("Name")
        private String name;

        /** 创建时间: false */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 防火墙规则组，详情参见RuleInfo: false */
        @SerializedName("Rule")
        private List<RuleInfo> rule;

        /** 防火墙绑定资源数量: false */
        @SerializedName("ResourceCount")
        private Integer resourceCount;

        /**
         * 防火墙组类型，枚举值为： "user defined", 用户自定义防火墙； "recommend web", 默认Web防火墙； "recommend non web",
         * 默认非Web防火墙: false
         */
        @SerializedName("Type")
        private String type;

        /** 描述: false */
        @SerializedName("Remark")
        private String remark;

        public String getFirewallId() {
            return firewallId;
        }

        public void setFirewallId(String firewallId) {
            this.firewallId = firewallId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public List<RuleInfo> getRule() {
            return rule;
        }

        public void setRule(List<RuleInfo> rule) {
            this.rule = rule;
        }

        public Integer getResourceCount() {
            return resourceCount;
        }

        public void setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }

    public static class RuleInfo extends Response {

        /** 协议，可选值：TCP，UDP，ICMP: false */
        @SerializedName("ProtocolType")
        private String protocolType;

        /** 端口，范围用"-"符号分隔，如：1-65535: false */
        @SerializedName("Port")
        private String port;

        /** 源ip: false */
        @SerializedName("SrcIp")
        private String srcIp;

        /** ACCEPT（接受）和DROP（拒绝）: false */
        @SerializedName("Action")
        private String action;

        /** 优先级：HIGH（高），MEDIUM（中），LOW（低）: false */
        @SerializedName("Priority")
        private String priority;

        /** 备注: false */
        @SerializedName("Remark")
        private String remark;

        public String getProtocolType() {
            return protocolType;
        }

        public void setProtocolType(String protocolType) {
            this.protocolType = protocolType;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getSrcIp() {
            return srcIp;
        }

        public void setSrcIp(String srcIp) {
            this.srcIp = srcIp;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
