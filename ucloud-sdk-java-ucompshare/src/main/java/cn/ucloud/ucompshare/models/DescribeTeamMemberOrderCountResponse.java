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

public class DescribeTeamMemberOrderCountResponse extends Response {

    /** 订单数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 订单总金额 */
    @SerializedName("Amount")
    private String amount;

    /** 真实金额 */
    @SerializedName("AmountReal")
    private String amountReal;

    /** 赠送金额 */
    @SerializedName("AmountFree")
    private String amountFree;

    /** 代金券 */
    @SerializedName("AmountCoupon")
    private String amountCoupon;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
}
