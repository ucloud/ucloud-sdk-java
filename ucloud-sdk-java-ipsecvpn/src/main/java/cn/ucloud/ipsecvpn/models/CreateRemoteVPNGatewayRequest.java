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

public class CreateRemoteVPNGatewayRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 客户VPN网关名称 */
    @NotEmpty
    @UCloudParam("RemoteVPNGatewayName")
    private String remoteVPNGatewayName;

    /** 客户VPN网关地址 */
    @NotEmpty
    @UCloudParam("RemoteVPNGatewayAddr")
    private String remoteVPNGatewayAddr;

    /** 业务组名称，默认为 "Default" */
    @UCloudParam("Tag")
    private String tag;

    /** 备注，默认为空 */
    @UCloudParam("Remark")
    private String remark;

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

    public String getRemoteVPNGatewayName() {
        return remoteVPNGatewayName;
    }

    public void setRemoteVPNGatewayName(String remoteVPNGatewayName) {
        this.remoteVPNGatewayName = remoteVPNGatewayName;
    }

    public String getRemoteVPNGatewayAddr() {
        return remoteVPNGatewayAddr;
    }

    public void setRemoteVPNGatewayAddr(String remoteVPNGatewayAddr) {
        this.remoteVPNGatewayAddr = remoteVPNGatewayAddr;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
