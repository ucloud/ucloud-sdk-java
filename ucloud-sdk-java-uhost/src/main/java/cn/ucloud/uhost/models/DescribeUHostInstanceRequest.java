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
package cn.ucloud.uhost.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;
import java.util.List;

public class DescribeUHostInstanceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist): false */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist): false */
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list): false
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /**
     * 【数组】UHost主机的资源ID，例如UHostIds.0代表希望获取信息 的主机1，UHostIds.1代表主机2。 如果不传入，则返回当前Region
     * 所有符合条件的UHost实例。: false
     */
    @UCloudParam("UHostIds")
    private List<String> uHostIds;

    /** 要查询的业务组名称: false */
    @UCloudParam("Tag")
    private String tag;

    /** 列表起始位置偏移量，默认为0: false */
    @UCloudParam("Offset")
    private Integer offset;

    /** 返回数据长度，默认为20，最大100: false */
    @UCloudParam("Limit")
    private Integer limit;

    /** 硬件隔离组id。通过硬件隔离组筛选主机。: false */
    @UCloudParam("IsolationGroup")
    private String isolationGroup;

    /** vpc id。通过VPC筛选主机。北京一地域无效。: false */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 子网id。通过子网筛选主机。北京一地域无效。: false */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 要挂载的云盘id，过滤返回能被UDiskId挂载的云主机。目前主要针对rssd云盘使用: false */
    @UCloudParam("UDiskIdForAttachment")
    private String uDiskIdForAttachment;

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

    public List<String> getUHostIds() {
        return uHostIds;
    }

    public void setUHostIds(List<String> uHostIds) {
        this.uHostIds = uHostIds;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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

    public String getIsolationGroup() {
        return isolationGroup;
    }

    public void setIsolationGroup(String isolationGroup) {
        this.isolationGroup = isolationGroup;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getUDiskIdForAttachment() {
        return uDiskIdForAttachment;
    }

    public void setUDiskIdForAttachment(String uDiskIdForAttachment) {
        this.uDiskIdForAttachment = uDiskIdForAttachment;
    }
}
