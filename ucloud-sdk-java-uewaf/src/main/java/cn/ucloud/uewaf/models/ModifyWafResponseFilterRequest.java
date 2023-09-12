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

public class ModifyWafResponseFilterRequest extends Request {

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 要修改的规则ID */
    @NotEmpty
    @UCloudParam("ID")
    private Integer id;

    /** 要操作的域名 */
    @NotEmpty
    @UCloudParam("FullDomain")
    private String fullDomain;

    /** 规则名称 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 过滤类型；可选项：Status（状态码），Sensitive（敏感内容），Customize（自定义字符串） */
    @NotEmpty
    @UCloudParam("Type")
    private String type;

    /** 丢弃响应或伪装内容；可选项：DROP（丢弃响应），DISGUISE（伪装内容） */
    @NotEmpty
    @UCloudParam("RuleAction")
    private String ruleAction;

    /** 过滤内容。当过滤类型为Sensitive时为可选项，可选值：Identity（身份证号），TelNum（手机号），Email（邮件），BankNum（银行卡号） */
    @UCloudParam("Content")
    private String content;

    /** 伪装响应内容 */
    @UCloudParam("DisguiseFile")
    private String disguiseFile;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public String getFullDomain() {
        return fullDomain;
    }

    public void setFullDomain(String fullDomain) {
        this.fullDomain = fullDomain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRuleAction() {
        return ruleAction;
    }

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDisguiseFile() {
        return disguiseFile;
    }

    public void setDisguiseFile(String disguiseFile) {
        this.disguiseFile = disguiseFile;
    }
}
