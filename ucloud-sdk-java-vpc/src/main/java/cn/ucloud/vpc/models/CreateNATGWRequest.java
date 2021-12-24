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

public class CreateNATGWRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目Id。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** NAT网关名称 */
    @NotEmpty
    @UCloudParam("NATGWName")
    private String natgwName;

    /** NAT网关绑定的EIPId */
    @NotEmpty
    @UCloudParam("EIPIds")
    private List<String> eipIds;

    /** NAT网关绑定的防火墙Id */
    @NotEmpty
    @UCloudParam("FirewallId")
    private String firewallId;

    /** NAT网关绑定的子网Id，默认为空。 */
    @UCloudParam("SubnetworkIds")
    private List<String> subnetworkIds;

    /** NAT网关所属的VPC Id。默认为Default VPC Id */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 白名单开关标记。0表示关闭，1表示开启。默认为0 */
    @UCloudParam("IfOpen")
    private Integer ifOpen;

    /** 业务组。默认为空 */
    @UCloudParam("Tag")
    private String tag;

    /** 备注。默认为空 */
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

    public String getNATGWName() {
        return natgwName;
    }

    public void setNATGWName(String natgwName) {
        this.natgwName = natgwName;
    }

    public List<String> getEIPIds() {
        return eipIds;
    }

    public void setEIPIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

    public String getFirewallId() {
        return firewallId;
    }

    public void setFirewallId(String firewallId) {
        this.firewallId = firewallId;
    }

    public List<String> getSubnetworkIds() {
        return subnetworkIds;
    }

    public void setSubnetworkIds(List<String> subnetworkIds) {
        this.subnetworkIds = subnetworkIds;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Integer getIfOpen() {
        return ifOpen;
    }

    public void setIfOpen(Integer ifOpen) {
        this.ifOpen = ifOpen;
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
