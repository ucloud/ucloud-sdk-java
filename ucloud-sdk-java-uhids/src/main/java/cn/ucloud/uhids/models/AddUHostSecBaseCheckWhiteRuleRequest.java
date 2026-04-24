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
package cn.ucloud.uhids.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class AddUHostSecBaseCheckWhiteRuleRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /**
     * 基线白名单规则信息（值为以下字段的json转base64后字符串，json格式：{"Data":[{"IP":{"Type":"ip","IPs":["192.168.3.4","192.168.3.4"]},"RuleID":"B0101001V01","AppName":"Linux","Description":"存在弱口令用户[testUser]","RiskType":"配置缺陷","RiskLevel":"高危","User":"testUser"},{"IP":{"Type":"all","IPs":[]},"RuleID":"B0101001V01","AppName":"Linux","Description":"存在弱口令用户[testUser]","RiskType":"配置缺陷","RiskLevel":"高危","User":"testUser"}]}）
     */
    @NotEmpty
    @UCloudParam("Data")
    private String data;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
