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
package cn.ucloud.udb.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class UploadUDBParamGroupRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @UCloudParam("ProjectId")
    private String projectId;

    /**
     * DB类型id，DB类型id，mysql/mongodb/postgesql按版本细分
     * 1：mysql-5.1，2：mysql-5.5，3：percona-5.5，4：mysql-5.6，5：percona-5.6，6：mysql-5.7，7：percona-5.7，8：mariadb-10.0，9：mongodb-2.4，10：mongodb-2.6，11：mongodb-3.0，12：mongodb-3.2,13：postgresql-9.4，14：postgresql-9.6
     */
    @NotEmpty
    @UCloudParam("DBTypeId")
    private String dbTypeId;

    /** 配置参数组名称 */
    @NotEmpty
    @UCloudParam("GroupName")
    private String groupName;

    /** 参数组描述 */
    @NotEmpty
    @UCloudParam("Description")
    private String description;

    /** 配置内容，导入的配置内容采用base64编码 */
    @NotEmpty
    @UCloudParam("Content")
    private String content;

    /** 该配置文件是否是地域级别配置文件， 默认是false */
    @UCloudParam("RegionFlag")
    private Boolean regionFlag;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getDBTypeId() {
        return dbTypeId;
    }

    public void setDBTypeId(String dbTypeId) {
        this.dbTypeId = dbTypeId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getRegionFlag() {
        return regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }
}
