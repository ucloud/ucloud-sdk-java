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

public class DescribeUDBInstanceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区，不填时默认全部可用区。参见 [可用区列表](../summary/regionlist.html) */
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @UCloudParam("ProjectId")
    private String projectId;

    /** DB种类，如果是列表操作，则需要指定,不区分大小写，其取值如下：mysql: SQL；mongo: NOSQL；postgresql: postgresql */
    @UCloudParam("ClassType")
    private String classType;

    /** 分页显示起始偏移位置，列表操作时必填 */
    @UCloudParam("Offset")
    private Integer offset;

    /** 分页显示数量，列表操作时必填 */
    @UCloudParam("Limit")
    private Integer limit;

    /** DB实例id，如果指定则获取单个db实例的描述，否则为列表操作。 指定DBId时无需填写ClassType、Offset、Limit */
    @UCloudParam("DBId")
    private String dbId;

    /** 是否查看专区里面DB */
    @UCloudParam("IsInUDBC")
    private Boolean isInUDBC;

    /** IsInUDBC为True,UDBCId为空，说明查看整个可用区的专区的db，如果UDBId不为空则只查看此专区下面的db */
    @UCloudParam("UDBCId")
    private String udbcId;

    /** 当只获取这个特定DBId的信息时，如果有该选项，那么把这个DBId实例的所有从库信息一起拉取并返回 */
    @UCloudParam("IncludeSlaves")
    private Boolean includeSlaves;

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

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getDBId() {
        return dbId;
    }

    public void setDBId(String dbId) {
        this.dbId = dbId;
    }

    public Boolean getIsInUDBC() {
        return isInUDBC;
    }

    public void setIsInUDBC(Boolean isInUDBC) {
        this.isInUDBC = isInUDBC;
    }

    public String getUDBCId() {
        return udbcId;
    }

    public void setUDBCId(String udbcId) {
        this.udbcId = udbcId;
    }

    public Boolean getIncludeSlaves() {
        return includeSlaves;
    }

    public void setIncludeSlaves(Boolean includeSlaves) {
        this.includeSlaves = includeSlaves;
    }
}
