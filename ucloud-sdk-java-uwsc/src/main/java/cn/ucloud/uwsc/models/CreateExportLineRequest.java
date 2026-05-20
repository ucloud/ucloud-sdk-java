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
package cn.ucloud.uwsc.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateExportLineRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 本端地域 */
    @NotEmpty
    @UCloudParam("FromRegion")
    private String fromRegion;

    /** 目标地域 */
    @NotEmpty
    @UCloudParam("ToRegion")
    private String toRegion;

    /** IP类型：International、BGP、Native、Resident */
    @NotEmpty
    @UCloudParam("IpType")
    private String ipType;

    /** CPE Id */
    @NotEmpty
    @UCloudParam("CPEId")
    private String cpeId;

    /** 套餐类型：2M-Entry、5M-Basic、10M-Enterprise */
    @UCloudParam("PkgType")
    private String pkgType;

    /** 带宽大小 */
    @UCloudParam("Bandwidth")
    private Integer bandwidth;

    /** 资源名称 */
    @UCloudParam("Name")
    private String name;

    /** 业务组名称, 默认为 "Default" */
    @UCloudParam("Tag")
    private String tag;

    /** 计费模式。枚举值为： Year，按年付费； Month，按月付费； Dynamic，按小时付费（需开启权限）。默认为月付 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长。默认: 1。按小时购买(Dynamic)时无需此参数。 月付时，此参数传0，代表了购买至月末。 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 备注 */
    @UCloudParam("Remark")
    private String remark;

    /** 计费类型：fixed-bw，固定带宽；traffic，流量计费 */
    @UCloudParam("PayMode")
    private String payMode;

    /** 代金券ID。请登录用户中心查看 */
    @UCloudParam("CouponId")
    private Integer couponId;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getFromRegion() {
        return fromRegion;
    }

    public void setFromRegion(String fromRegion) {
        this.fromRegion = fromRegion;
    }

    public String getToRegion() {
        return toRegion;
    }

    public void setToRegion(String toRegion) {
        this.toRegion = toRegion;
    }

    public String getIpType() {
        return ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public String getCPEId() {
        return cpeId;
    }

    public void setCPEId(String cpeId) {
        this.cpeId = cpeId;
    }

    public String getPkgType() {
        return pkgType;
    }

    public void setPkgType(String pkgType) {
        this.pkgType = pkgType;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }
}
