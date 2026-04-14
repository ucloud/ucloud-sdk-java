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
package cn.ucloud.ucompshare.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class DownloadTeamOrderResponse extends Response {

    /** 订单号 */
    @SerializedName("OrderNo")
    private String orderNo;

    /** 创建时间 */
    @SerializedName("CreateTime")
    private Integer createTime;

    /** 开始时间 */
    @SerializedName("StartTime")
    private Integer startTime;

    /** 结束时间 */
    @SerializedName("EndTime")
    private Integer endTime;

    /** 订单类型 */
    @SerializedName("OrderType")
    private String orderType;

    /** 资源ID */
    @SerializedName("ResourceId")
    private String resourceId;

    /** 产品类型 */
    @SerializedName("ResourceType")
    private String resourceType;

    /** 计费方式 */
    @SerializedName("ChargeType")
    private String chargeType;

    /** 总金额 */
    @SerializedName("Amount")
    private String amount;

    /** 现金 */
    @SerializedName("AmountReal")
    private String amountReal;

    /** 赠金 */
    @SerializedName("AmountFree")
    private String amountFree;

    /** 代金券 */
    @SerializedName("AmountCoupon")
    private String amountCoupon;

    /** 成员ID */
    @SerializedName("VirtualCompanyId")
    private Integer virtualCompanyId;

    /** 成员备注 */
    @SerializedName("RemarkName")
    private String remarkName;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmountReal() {
        return amountReal;
    }

    public void setAmountReal(String amountReal) {
        this.amountReal = amountReal;
    }

    public String getAmountFree() {
        return amountFree;
    }

    public void setAmountFree(String amountFree) {
        this.amountFree = amountFree;
    }

    public String getAmountCoupon() {
        return amountCoupon;
    }

    public void setAmountCoupon(String amountCoupon) {
        this.amountCoupon = amountCoupon;
    }

    public Integer getVirtualCompanyId() {
        return virtualCompanyId;
    }

    public void setVirtualCompanyId(Integer virtualCompanyId) {
        this.virtualCompanyId = virtualCompanyId;
    }

    public String getRemarkName() {
        return remarkName;
    }

    public void setRemarkName(String remarkName) {
        this.remarkName = remarkName;
    }
}
