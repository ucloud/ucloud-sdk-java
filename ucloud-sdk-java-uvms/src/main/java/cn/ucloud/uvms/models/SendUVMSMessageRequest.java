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
package cn.ucloud.uvms.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class SendUVMSMessageRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 被叫号码，采用 E.164 标准，格式为+[国家代码][用户号码]。 例如：+8613512345678， 其中前面有一个+号 ，86为国家码，13512345678为手机号 */
    @NotEmpty
    @UCloudParam("CalledNumber")
    private String calledNumber;

    /** 模板 ID，在控制台审核通过的模板 ID。 */
    @NotEmpty
    @UCloudParam("TemplateId")
    private String templateId;

    /**
     * 模板可变参数，以数组的方式填写，举例，TemplateParams.0，TemplateParams.1，...
     * 若模板中无可变参数，则该项可不填写；若模板中有可变参数，则该项为必填项，参数个数需与变量个数保持一致，否则无法发送；
     */
    @UCloudParam("TemplateParams")
    private List<String> templateParams;

    /** 主叫号码，号码随机时不填。专属号码时传入已购买的号码，仅支持一个号码，在控制台查看已购买的号码。 */
    @UCloudParam("FromNumber")
    private String fromNumber;

    /** 自定义的业务标识ID，字符串（ 长度不能超过32 位），不支持 单引号、表情包符号等特殊字符 */
    @UCloudParam("UserId")
    private String userId;

    /** 号码组类型，1-随机组，2-专属组。如不填写则根据主叫号码判断，若主叫号码为空，则为随机组，若不为空，则为专属组。 */
    @UCloudParam("GroupType")
    private Integer groupType;

    /** 调度规则，0-默认（归属地优先），1-随机。当不指定外显号码（主叫号码为空）时生效。如不填写，默认为归属地优先。 */
    @UCloudParam("DispatchRule")
    private Integer dispatchRule;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getCalledNumber() {
        return calledNumber;
    }

    public void setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public List<String> getTemplateParams() {
        return templateParams;
    }

    public void setTemplateParams(List<String> templateParams) {
        this.templateParams = templateParams;
    }

    public String getFromNumber() {
        return fromNumber;
    }

    public void setFromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public Integer getDispatchRule() {
        return dispatchRule;
    }

    public void setDispatchRule(Integer dispatchRule) {
        this.dispatchRule = dispatchRule;
    }
}
