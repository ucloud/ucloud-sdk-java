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
package cn.ucloud.ipsecvpn.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class DescribeVPNGatewayRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /**
     * VPN网关的资源ID，例如VPNGatewayIds.0代表希望获取VPN网关1的信息，VPNGatewayIds.1代表VPN网关2，如果为空，则返回当前Region中所有VPN网关的信息
     */
    @UCloudParam("VPNGatewayIds")
    private List<String> vpnGatewayIds;

    /** VPC的资源ID，返回指定的VPC下的所有VPN网关的信息。默认返回当前Region中所有VPN网关实例的信息 */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 数据偏移量。默认为0 */
    @UCloudParam("Offset")
    private Integer offset;

    /** 业务组名称，若指定则返回指定的业务组下的所有VPN网关的信息。 */
    @UCloudParam("Tag")
    private String tag;

    /** 数据分页值。默认为20 */
    @UCloudParam("Limit")
    private Integer limit;

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

    public List<String> getVPNGatewayIds() {
        return vpnGatewayIds;
    }

    public void setVPNGatewayIds(List<String> vpnGatewayIds) {
        this.vpnGatewayIds = vpnGatewayIds;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
