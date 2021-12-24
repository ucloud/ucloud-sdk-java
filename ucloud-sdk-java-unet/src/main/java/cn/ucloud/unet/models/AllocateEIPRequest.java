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
package cn.ucloud.unet.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class AllocateEIPRequest extends Request {

    /** 地域。 */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 */
    @UCloudParam("ProjectId")
    private String projectId;

    /**
     * 弹性IP线路，枚举值：国际线路， International；BGP线路：Bgp。
     *
     * <p>使用BGP线路的地域：北京二、上海金融云、上海二、广州等，其他地域均使用国际线路。
     */
    @NotEmpty
    @UCloudParam("OperatorName")
    private String operatorName;

    /**
     * 弹性IP的外网带宽, 单位为Mbps. 共享带宽模式必须指定0M带宽, 非共享带宽模式必须指定非0Mbps带宽. 各地域非共享带宽的带宽范围如下：
     * 流量计费[1-300]，带宽计费[1-10000]
     */
    @NotEmpty
    @UCloudParam("Bandwidth")
    private Integer bandwidth;

    /** 业务组名称, 默认为 "Default" */
    @UCloudParam("Tag")
    private String tag;

    /** 付费方式, 枚举值为: Year, 按年付费; Month, 按月付费; Dynamic, 按时付费，默认为按月付费。 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买的时长, 默认: 1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /**
     * 弹性IP的计费模式. 枚举值: "Traffic", 流量计费; "Bandwidth", 带宽计费; "ShareBandwidth",共享带宽模式. 默认为
     * "Bandwidth".“PostAccurateBandwidth”：带宽后付费模式
     */
    @UCloudParam("PayMode")
    private String payMode;

    /** 绑定的共享带宽Id,仅当PayMode为ShareBandwidth时有效 */
    @UCloudParam("ShareBandwidthId")
    private String shareBandwidthId;

    /** 弹性IP的名称, 默认为 "EIP" */
    @UCloudParam("Name")
    private String name;

    /** 弹性IP的备注, 默认为空 */
    @UCloudParam("Remark")
    private String remark;

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

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
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

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getShareBandwidthId() {
        return shareBandwidthId;
    }

    public void setShareBandwidthId(String shareBandwidthId) {
        this.shareBandwidthId = shareBandwidthId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
