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
package cn.ucloud.uai_modelverse.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetOrderAmountResponse extends Response {

    /** 订单总额（所有订单的总金额） */
    @SerializedName("TotalOrderAmount")
    private String totalOrderAmount;

    /** 已支付金额 */
    @SerializedName("PaidAmount")
    private String paidAmount;

    /** 待支付金额 */
    @SerializedName("UnpaidAmount")
    private String unpaidAmount;

    /** 现金账户总金额 */
    @SerializedName("CashAmount")
    private String cashAmount;

    /** 赠金账户总金额 */
    @SerializedName("BonusAmount")
    private String bonusAmount;

    /** 代金券抵扣总额 */
    @SerializedName("CouponAmount")
    private String couponAmount;

    /** 星力卡抵扣总金额 */
    @SerializedName("StarCardAmount")
    private String starCardAmount;

    /** 订单总数 */
    @SerializedName("OrderCount")
    private Integer orderCount;

    /** 已支付订单数 */
    @SerializedName("PaidCount")
    private Integer paidCount;

    /** 待支付订单数量 */
    @SerializedName("UnpaidCount")
    private Integer unpaidCount;

    public String getTotalOrderAmount() {
        return totalOrderAmount;
    }

    public void setTotalOrderAmount(String totalOrderAmount) {
        this.totalOrderAmount = totalOrderAmount;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getUnpaidAmount() {
        return unpaidAmount;
    }

    public void setUnpaidAmount(String unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
    }

    public String getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(String cashAmount) {
        this.cashAmount = cashAmount;
    }

    public String getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(String bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public String getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getStarCardAmount() {
        return starCardAmount;
    }

    public void setStarCardAmount(String starCardAmount) {
        this.starCardAmount = starCardAmount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getPaidCount() {
        return paidCount;
    }

    public void setPaidCount(Integer paidCount) {
        this.paidCount = paidCount;
    }

    public Integer getUnpaidCount() {
        return unpaidCount;
    }

    public void setUnpaidCount(Integer unpaidCount) {
        this.unpaidCount = unpaidCount;
    }
}
