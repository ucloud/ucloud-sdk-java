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
package cn.ucloud.ulb.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateULBRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 负载均衡的名字，默认值为“ULB” */
    @UCloudParam("ULBName")
    private String ulbName;

    /** 业务组 */
    @UCloudParam("Tag")
    private String tag;

    /** 备注 */
    @UCloudParam("Remark")
    private String remark;

    /** 创建的CLB是否为外网模式，默认即为外网模式 */
    @UCloudParam("OuterMode")
    private String outerMode;

    /** 创建的CLB是否为内网模式 */
    @UCloudParam("InnerMode")
    private String innerMode;

    /** 付费方式, 枚举值为: Year, 按年付费; Month, 按月付费; Dynamic, 按时付费 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** CLB所在的VPC的ID。 如果不传则使用默认的VPC，若不传且无默认VPC则接口报错 */
    @UCloudParam("VPCId")
    private String vpcId;

    /** CLB 所属的子网ID，如果不传则随机选择一个。 */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** CLB 所属的业务组ID，如果不传则使用默认的业务组 */
    @UCloudParam("BusinessId")
    private String businessId;

    /** 防火墙ID，如果不传，则默认不绑定防火墙 */
    @UCloudParam("FirewallId")
    private String firewallId;

    /**
     * CLB 监听器类型，外网CLB默认RequestProxy，内网ULB默认PacketsTransmit。枚举值：RequestProxy，请求代理； PacketsTransmit
     * ，报文转发。
     */
    @UCloudParam("ListenType")
    private String listenType;

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

    public String getULBName() {
        return ulbName;
    }

    public void setULBName(String ulbName) {
        this.ulbName = ulbName;
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

    public String getOuterMode() {
        return outerMode;
    }

    public void setOuterMode(String outerMode) {
        this.outerMode = outerMode;
    }

    public String getInnerMode() {
        return innerMode;
    }

    public void setInnerMode(String innerMode) {
        this.innerMode = innerMode;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
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

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getFirewallId() {
        return firewallId;
    }

    public void setFirewallId(String firewallId) {
        this.firewallId = firewallId;
    }

    public String getListenType() {
        return listenType;
    }

    public void setListenType(String listenType) {
        this.listenType = listenType;
    }
}
