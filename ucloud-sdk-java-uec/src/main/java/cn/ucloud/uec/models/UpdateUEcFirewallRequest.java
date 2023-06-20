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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class UpdateUEcFirewallRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 防火墙Id */
    @NotEmpty
    @UCloudParam("FirewallId")
    private String firewallId;

    /** */
    @UCloudParam("Rule")
    private List<Rule> rule;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getFirewallId() {
        return firewallId;
    }

    public void setFirewallId(String firewallId) {
        this.firewallId = firewallId;
    }

    public List<Rule> getRule() {
        return rule;
    }

    public void setRule(List<Rule> rule) {
        this.rule = rule;
    }

    public static class Rule extends Request {

        /** 协议，可选值：TCP，UDP，ICMP */
        @NotEmpty
        @UCloudParam("ProtocolType")
        private String protocolType;

        /** 端口，范围用"-"符号分隔，如：1-65535 */
        @NotEmpty
        @UCloudParam("Port")
        private String port;

        /** 源ip */
        @NotEmpty
        @UCloudParam("SrcIp")
        private String srcIp;

        /** ACCEPT（接受）和DROP（拒绝） */
        @NotEmpty
        @UCloudParam("Action")
        private String action;

        /** 优先级：HIGH（高），MEDIUM（中），LOW（低） */
        @NotEmpty
        @UCloudParam("Priority")
        private String priority;

        /** 备注 */
        @NotEmpty
        @UCloudParam("Remark")
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
