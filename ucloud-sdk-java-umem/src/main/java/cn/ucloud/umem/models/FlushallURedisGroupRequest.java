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
package cn.ucloud.umem.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class FlushallURedisGroupRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html): false */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](../summary/regionlist.html): false */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html): false */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 组的ID: false */
    @NotEmpty
    @UCloudParam("GroupId")
    private String groupId;

    /** FlushDb或FlushAll: false */
    @NotEmpty
    @UCloudParam("FlushType")
    private String flushType;

    /** 清空的db，FlushType为FlushDb，此项为必传项: false */
    @UCloudParam("DbNum")
    private Integer dbNum;

    /** company_id: false */
    @UCloudParam("TopOrganizationId")
    private Integer topOrganizationId;

    /** OrganizationId: false */
    @UCloudParam("OrganizationId")
    private Integer organizationId;

    /** 跨机房URedis，slave所在可用区（必须和Zone在同一Region，且不可相同）: false */
    @UCloudParam("SlaveZone")
    private String slaveZone;

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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getFlushType() {
        return flushType;
    }

    public void setFlushType(String flushType) {
        this.flushType = flushType;
    }

    public Integer getDbNum() {
        return dbNum;
    }

    public void setDbNum(Integer dbNum) {
        this.dbNum = dbNum;
    }

    public Integer getTopOrganizationId() {
        return topOrganizationId;
    }

    public void setTopOrganizationId(Integer topOrganizationId) {
        this.topOrganizationId = topOrganizationId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getSlaveZone() {
        return slaveZone;
    }

    public void setSlaveZone(String slaveZone) {
        this.slaveZone = slaveZone;
    }
}
