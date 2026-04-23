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
package cn.ucloud.udns.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateUDNSZoneRequest extends Request {

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

    /** 域名字符串 */
    @NotEmpty
    @UCloudParam("DNSZoneName")
    private String dnsZoneName;

    /** 域名类型。枚举值，“private”，内网DNS；“public”，公网DNS，暂只支持private。 */
    @NotEmpty
    @UCloudParam("Type")
    private String type;

    /** 所属业务组名称 */
    @UCloudParam("Tag")
    private String tag;

    /** 备注 */
    @UCloudParam("Remark")
    private String remark;

    /** 是否支持迭代。枚举值,"enable",支持迭代; "disable",不支持迭代 */
    @UCloudParam("IsRecursionEnabled")
    private String isRecursionEnabled;

    /** 购买时长，默认为1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 付费方式, 枚举值为: Year, 按年付费; Month, 按月付费; Dynamic, 按需付费，默认为按月付费 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 代金券ID，默认不使用 */
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

    public String getDNSZoneName() {
        return dnsZoneName;
    }

    public void setDNSZoneName(String dnsZoneName) {
        this.dnsZoneName = dnsZoneName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getIsRecursionEnabled() {
        return isRecursionEnabled;
    }

    public void setIsRecursionEnabled(String isRecursionEnabled) {
        this.isRecursionEnabled = isRecursionEnabled;
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

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
