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

import java.util.List;

public class CopyWafDomainRulesRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 源域名 */
    @NotEmpty
    @UCloudParam("FullDomain")
    private String fullDomain;

    /** 目的域名 */
    @NotEmpty
    @UCloudParam("DestDomain")
    private List<String> destDomain;

    /**
     * 规则类型,CCRule:CC规则； ProtectionRule：防护规则； AutoBlacklistRule：自动拦截规则； HTTPDisguiseRule：信息防护规则；
     * RegionBlockRule：区域封堵规则；WhiteList：白名单规则；BlackList：黑名单规则
     */
    @NotEmpty
    @UCloudParam("RuleType")
    private String ruleType;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getFullDomain() {
        return fullDomain;
    }

    public void setFullDomain(String fullDomain) {
        this.fullDomain = fullDomain;
    }

    public List<String> getDestDomain() {
        return destDomain;
    }

    public void setDestDomain(List<String> destDomain) {
        this.destDomain = destDomain;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }
}
