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

public class ModifyAntiCCRuleRequest extends Request {

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 要修改的规则ID */
    @NotEmpty
    @UCloudParam("ID")
    private Integer id;

    /** 统计时长内请求次数 */
    @NotEmpty
    @UCloudParam("Reqs")
    private Integer reqs;

    /** 请求的uri */
    @NotEmpty
    @UCloudParam("URL")
    private String url;

    /** URI匹配模式，equal:完全匹配;,contains:包含; */
    @NotEmpty
    @UCloudParam("Mode")
    private String mode;

    /** 统计时长,单位：秒 */
    @NotEmpty
    @UCloudParam("Duration")
    private Integer duration;

    /** 触发条件后执行的动作，forbidden:拦截请求； captcha:验证码；iptables：IP封堵 */
    @NotEmpty
    @UCloudParam("ActionType")
    private String actionType;

    /** 动作有效期，单位：分钟 */
    @NotEmpty
    @UCloudParam("Validity")
    private Integer validity;

    /** 添加CC防护规则的域名 */
    @NotEmpty
    @UCloudParam("Domain")
    private String domain;

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

    public Integer getReqs() {
        return reqs;
    }

    public void setReqs(Integer reqs) {
        this.reqs = reqs;
    }

    public String getURL() {
        return url;
    }

    public void setURL(String url) {
        this.url = url;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
