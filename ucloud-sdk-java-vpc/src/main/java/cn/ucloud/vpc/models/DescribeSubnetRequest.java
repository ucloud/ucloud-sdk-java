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
package cn.ucloud.vpc.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;
import java.util.List;

public class DescribeSubnetRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html): false */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html): false */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 子网id数组，适用于一次查询多个子网信息: false */
    @UCloudParam("SubnetIds")
    private List<String> subnetIds;

    /** 子网id，适用于一次查询一个子网信息: false */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 路由表Id: false */
    @UCloudParam("RouteTableId")
    private String routeTableId;

    /** VPC资源id: false */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 业务组名称，默认为Default: false */
    @UCloudParam("Tag")
    private String tag;

    /** 偏移量，默认为0: false */
    @UCloudParam("Offset")
    private Integer offset;

    /** 列表长度，默认为20: false */
    @UCloudParam("Limit")
    private Integer limit;

    /** 是否返回子网的可用IP数，true为是，false为否，默认不返回: false */
    @UCloudParam("ShowAvailableIPs")
    private Boolean showAvailableIPs;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
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

    public Boolean getShowAvailableIPs() {
        return showAvailableIPs;
    }

    public void setShowAvailableIPs(Boolean showAvailableIPs) {
        this.showAvailableIPs = showAvailableIPs;
    }
}
