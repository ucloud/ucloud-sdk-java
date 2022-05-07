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

public class DescribeUDBParamGroupRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 分页显示的起始偏移，列表操作则指定 */
    @UCloudParam("Offset")
    private Integer offset;

    /** 分页显示的条目数，列表操作则指定 */
    @UCloudParam("Limit")
    private Integer limit;

    /** 参数组id，如果指定则获取描述，否则是列表操作，需要 指定Offset/Limit */
    @UCloudParam("GroupId")
    private Integer groupId;

    /** 是否选取专区中配置 */
    @UCloudParam("IsInUDBC")
    private Boolean isInUDBC;

    /** 当请求没有填写Zone时，如果指定为true，表示只拉取跨可用区的相关配置文件，否则，拉取所有机房的配置文件（包括每个单可用区和跨可用区） */
    @UCloudParam("RegionFlag")
    private Boolean regionFlag;

    /** 如果未指定GroupId，则可选是否选取特定DB类型的配置(sql, nosql, postgresql, sqlserver) */
    @UCloudParam("ClassType")
    private String classType;

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

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Boolean getIsInUDBC() {
        return isInUDBC;
    }

    public void setIsInUDBC(Boolean isInUDBC) {
        this.isInUDBC = isInUDBC;
    }

    public Boolean getRegionFlag() {
        return regionFlag;
    }

    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }
}
