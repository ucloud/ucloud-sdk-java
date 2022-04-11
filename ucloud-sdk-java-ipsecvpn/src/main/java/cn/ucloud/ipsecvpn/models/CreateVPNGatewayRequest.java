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

public class CreateVPNGatewayRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 新建VPN网关名称 */
    @NotEmpty
    @UCloudParam("VPNGatewayName")
    private String vpnGatewayName;

    /** 新建VPN网关所属VPC的资源ID */
    @NotEmpty
    @UCloudParam("VPCId")
    private String vpcId;

    /** 购买的VPN网关规格，枚举值为: Standard, 标准型; Enhanced, 增强型 */
    @NotEmpty
    @UCloudParam("Grade")
    private String grade;

    /** 备注，默认为空 */
    @UCloudParam("Remark")
    private String remark;

    /** 业务组名称，默认为 "Default" */
    @UCloudParam("Tag")
    private String tag;

    /** 购买时长, 默认: 1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 付费方式, 枚举值为: Year, 按年付费; Month, 按月付费；Dynamic, 按需付费(需开启权限)；Trial, 试用(需开启权限)；默认为按月付费 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 业务组ID */
    @UCloudParam("BusinessId")
    private String businessId;

    /** 若要绑定EIP，在此填上EIP的资源ID */
    @UCloudParam("EIPId")
    private String eipId;

    /** 代金券ID, 默认不使用 */
    @UCloudParam("CouponId")
    private String couponId;

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

    public String getVPNGatewayName() {
        return vpnGatewayName;
    }

    public void setVPNGatewayName(String vpnGatewayName) {
        this.vpnGatewayName = vpnGatewayName;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getEIPId() {
        return eipId;
    }

    public void setEIPId(String eipId) {
        this.eipId = eipId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
