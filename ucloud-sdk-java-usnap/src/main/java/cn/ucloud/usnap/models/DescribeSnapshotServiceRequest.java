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
package cn.ucloud.usnap.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class DescribeSnapshotServiceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 数据偏移量, 默认为0 */
    @UCloudParam("Offset")
    private Integer offset;

    /** 返回数据长度, 默认为20 */
    @UCloudParam("Limit")
    private Integer limit;

    /** 快照服务ID(传入则获取当前快照服务ID, 不传则获取当前可用区快照服务列表) */
    @UCloudParam("SnapshotServiceId")
    private String snapshotServiceId;

    /** 磁盘ID (传入则获取当前盘快照服务, 不传则获取当前可用区快照服务列表) */
    @UCloudParam("VDiskId")
    private String vDiskId;

    /** 快照ID (传入则获取当前快照对应盘的快照服务, 不传则获取当前可用区快照服务列表，磁盘ID和快照ID同时传入以磁盘ID为准) */
    @UCloudParam("SnapshotId")
    private String snapshotId;

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

    public String getSnapshotServiceId() {
        return snapshotServiceId;
    }

    public void setSnapshotServiceId(String snapshotServiceId) {
        this.snapshotServiceId = snapshotServiceId;
    }

    public String getVDiskId() {
        return vDiskId;
    }

    public void setVDiskId(String vDiskId) {
        this.vDiskId = vDiskId;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
}
