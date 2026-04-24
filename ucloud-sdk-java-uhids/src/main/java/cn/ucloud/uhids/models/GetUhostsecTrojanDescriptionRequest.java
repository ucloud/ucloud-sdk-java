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

public class GetUhostsecTrojanDescriptionRequest extends Request {

    /** 项目ID */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /**
     * 获取指定当前木马对应的告警表名，指定当前木马对应的告警表名，利用告警表名来获取当前的描述信息,可以通过获取ListUHostsecTrojanWarnsResponse的返回信息提供TableName值内容，值：WebShellAlarm、checkCockhorse
     */
    @NotEmpty
    @UCloudParam("TableName")
    private String tableName;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
