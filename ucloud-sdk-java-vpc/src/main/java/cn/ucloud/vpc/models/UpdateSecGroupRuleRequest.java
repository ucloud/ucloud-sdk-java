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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class UpdateSecGroupRuleRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 规则所属得安全组 ID。 */
    @NotEmpty
    @UCloudParam("SecGroupId")
    private String secGroupId;

    /** */
    @UCloudParam("Rule")
    private List<Rule> rule;

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

    public String getSecGroupId() {
        return secGroupId;
    }

    public void setSecGroupId(String secGroupId) {
        this.secGroupId = secGroupId;
    }

    public List<Rule> getRule() {
        return rule;
    }

    public void setRule(List<Rule> rule) {
        this.rule = rule;
    }

    public static class Rule extends Request {

        /** 规则 ID */
        @NotEmpty
        @UCloudParam("RuleId")
        private String ruleId;

        /** "Ingress/Egress"，入站规则/出站规则 */
        @NotEmpty
        @UCloudParam("Direction")
        private String direction;

        /** IP 地址信息，逗号分隔。 */
        @NotEmpty
        @UCloudParam("IPRange")
        private String ipRange;

        /** 规则优先级。范围为 1~200 */
        @NotEmpty
        @UCloudParam("Priority")
        private Integer priority;

        /** 协议类型。"TCP","UDP","ICMP","ICMPv6","ALL" */
        @NotEmpty
        @UCloudParam("ProtocolType")
        private String protocolType;

        /** 目的端口。逗号分隔，如 "80,443"、"443,2000-10000" */
        @NotEmpty
        @UCloudParam("DstPort")
        private String dstPort;

        /** 规则行为。"Accept" 或 "Drop" */
        @NotEmpty
        @UCloudParam("RuleAction")
        private String ruleAction;

        /** 规则备注 */
        @NotEmpty
        @UCloudParam("Remark")
        private String remark;

        /** IP 版本，如 “IPv4”。支持 IPv6 后废弃 */
        @UCloudParam("IPVersion")
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
