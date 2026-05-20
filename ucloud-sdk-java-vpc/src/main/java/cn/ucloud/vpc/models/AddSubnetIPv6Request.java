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

public class AddSubnetIPv6Request extends Request {

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

    /** 子网ID */
    @NotEmpty
    @UCloudParam("SubnetworkId")
    private String subnetworkId;

    /** 所属VPC的IPv6网段，可选，不填默认选择一个VPC IPv6网段进行分配 */
    @UCloudParam("VPCIPv6Network")
    private String vpciPv6Network;

    /** 指定IPv6网段 */
    @UCloudParam("IPv6Network")
    private String iPv6Network;

    /** 指定IPv6网段掩码 */
    @UCloudParam("IPv6PrefixLength")
    private Integer iPv6PrefixLength;

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

    public String getSubnetworkId() {
        return subnetworkId;
    }

    public void setSubnetworkId(String subnetworkId) {
        this.subnetworkId = subnetworkId;
    }

    public String getVPCIPv6Network() {
        return vpciPv6Network;
    }

    public void setVPCIPv6Network(String vpciPv6Network) {
        this.vpciPv6Network = vpciPv6Network;
    }

    public String getIPv6Network() {
        return iPv6Network;
    }

    public void setIPv6Network(String iPv6Network) {
        this.iPv6Network = iPv6Network;
    }

    public Integer getIPv6PrefixLength() {
        return iPv6PrefixLength;
    }

    public void setIPv6PrefixLength(Integer iPv6PrefixLength) {
        this.iPv6PrefixLength = iPv6PrefixLength;
    }
}
