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

public class AddUHostSecWebRiskWhiteRuleRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /**
     * webrisk白名单规则信息（值为以下字段的json转base64后字符串，json格式：{"Data":[{"IP":{"Type":"subnet","IPs":["192.168.1.0/24","172.36.1.0-172.36.255.255"]},"Type":"不安全的配置","RuleId":"30001","RiskDesc":"未删除的.git目录","Detail":"未删除的.git目录，黑客可以直接下载git相关文件","FileName":"/var/www/html/DiscuzX/install/index.php"},{"IP":{"Type":"all","IPs":[]},"Type":"不安全的配置","RuleId":"30001","RiskDesc":"未删除的.git目录","Detail":"未删除的.git目录，黑客可以直接下载git相关文件","FileName":"/var/www/html/DiscuzX/install/index.php"}]}）
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
