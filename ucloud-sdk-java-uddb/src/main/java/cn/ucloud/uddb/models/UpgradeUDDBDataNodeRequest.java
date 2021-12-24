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
package cn.ucloud.uddb.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class UpgradeUDDBDataNodeRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html): false */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](../summary/regionlist.html): false */
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html): false */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** UDDB实例ID: false */
    @NotEmpty
    @UCloudParam("UDDBId")
    private String uddbId;

    /** 新的数据节点的内存配置, 单位：MB 具体数值参考UDB的内存取值: false */
    @NotEmpty
    @UCloudParam("DataNodeMemory")
    private Integer dataNodeMemory;

    /** 新的数据节点的磁盘大小配置. 单位: GB 具体数值参考UDB的磁盘大小取值.: false */
    @NotEmpty
    @UCloudParam("DataNodeDiskSpace")
    private Integer dataNodeDiskSpace;

    /** 使用的代金券id: false */
    @UCloudParam("CouponId")
    private String couponId;

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

    public String getUDDBId() {
        return uddbId;
    }

    public void setUDDBId(String uddbId) {
        this.uddbId = uddbId;
    }

    public Integer getDataNodeMemory() {
        return dataNodeMemory;
    }

    public void setDataNodeMemory(Integer dataNodeMemory) {
        this.dataNodeMemory = dataNodeMemory;
    }

    public Integer getDataNodeDiskSpace() {
        return dataNodeDiskSpace;
    }

    public void setDataNodeDiskSpace(Integer dataNodeDiskSpace) {
        this.dataNodeDiskSpace = dataNodeDiskSpace;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
