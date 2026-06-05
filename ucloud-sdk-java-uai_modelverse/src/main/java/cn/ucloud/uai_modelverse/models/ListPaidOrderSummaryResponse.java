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

import java.util.List;

public class ListPaidOrderSummaryResponse extends Response {

    /** 已完成订单汇总列表 */
    @SerializedName("Summaries")
    private List<OrderSummaryItem> summaries;

    public List<OrderSummaryItem> getSummaries() {
        return summaries;
    }

    public void setSummaries(List<OrderSummaryItem> summaries) {
        this.summaries = summaries;
    }

    public static class OrderSummaryItem extends Response {

        /** 资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 计费单元（SKU）名称 */
        @SerializedName("PricingSKU")
        private String pricingSKU;

        /** 模型ID */
        @SerializedName("ModelID")
        private String modelID;

        /** 模型名称 */
        @SerializedName("ModelName")
        private String modelName;

        /** 计费单位（计量单元） */
        @SerializedName("PricingUnit")
        private Integer pricingUnit;

        /** 计费单位名称 */
        @SerializedName("PricingUnitName")
        private String pricingUnitName;

        /** 订单类型 */
        @SerializedName("OrderType")
        private Integer orderType;

        /** 订单类型显示名 */
        @SerializedName("OrderTypeDisplay")
        private String orderTypeDisplay;

        /** 计费类型 */
        @SerializedName("ChargeType")
        private Integer chargeType;

        /** 订单状态（2=已支付; 3=已撤销） */
        @SerializedName("Status")
        private Integer status;

        /** 订单状态显示名 */
        @SerializedName("StatusDisplay")
        private String statusDisplay;

        /** 列表价（原单价） */
        @SerializedName("ListPrice")
        private String listPrice;

        /** 折后单价 */
        @SerializedName("DiscountPrice")
        private String discountPrice;

        /** 总用量（原始值） */
        @SerializedName("SumQuantity")
        private Integer sumQuantity;

        /** 总用量显示（格式化后的字符串，千token和百万token会进行转换） */
        @SerializedName("SumQuantityDisplay")
        private String sumQuantityDisplay;

        /** 总订单金额（格式化后的字符串） */
        @SerializedName("SumOrderPrice")
        private String sumOrderPrice;

        /** 总原价（格式化后的字符串） */
        @SerializedName("SumOriginalPrice")
        private String sumOriginalPrice;

        /** 总现金账户扣款（仅已完成订单返回） */
        @SerializedName("SumCashAccount")
        private String sumCashAccount;

        /** 总星力卡抵扣金额（仅已完成订单返回） */
        @SerializedName("SumStarCardAccount")
        private String sumStarCardAccount;

        /** 总赠金账户扣款（仅已完成订单返回） */
        @SerializedName("SumBonusAccount")
        private String sumBonusAccount;

        /** 总代金券抵扣（仅已完成订单返回） */
        @SerializedName("SumCoupon")
        private String sumCoupon;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getPricingSKU() {
            return pricingSKU;
        }

        public void setPricingSKU(String pricingSKU) {
            this.pricingSKU = pricingSKU;
        }

        public String getModelID() {
            return modelID;
        }

        public void setModelID(String modelID) {
            this.modelID = modelID;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public Integer getPricingUnit() {
            return pricingUnit;
        }

        public void setPricingUnit(Integer pricingUnit) {
            this.pricingUnit = pricingUnit;
        }

        public String getPricingUnitName() {
            return pricingUnitName;
        }

        public void setPricingUnitName(String pricingUnitName) {
            this.pricingUnitName = pricingUnitName;
        }

        public Integer getOrderType() {
            return orderType;
        }

        public void setOrderType(Integer orderType) {
            this.orderType = orderType;
        }

        public String getOrderTypeDisplay() {
            return orderTypeDisplay;
        }

        public void setOrderTypeDisplay(String orderTypeDisplay) {
            this.orderTypeDisplay = orderTypeDisplay;
        }

        public Integer getChargeType() {
            return chargeType;
        }

        public void setChargeType(Integer chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getStatusDisplay() {
            return statusDisplay;
        }

        public void setStatusDisplay(String statusDisplay) {
            this.statusDisplay = statusDisplay;
        }

        public String getListPrice() {
            return listPrice;
        }

        public void setListPrice(String listPrice) {
            this.listPrice = listPrice;
        }

        public String getDiscountPrice() {
            return discountPrice;
        }

        public void setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
        }

        public Integer getSumQuantity() {
            return sumQuantity;
        }

        public void setSumQuantity(Integer sumQuantity) {
            this.sumQuantity = sumQuantity;
        }

        public String getSumQuantityDisplay() {
            return sumQuantityDisplay;
        }

        public void setSumQuantityDisplay(String sumQuantityDisplay) {
            this.sumQuantityDisplay = sumQuantityDisplay;
        }

        public String getSumOrderPrice() {
            return sumOrderPrice;
        }

        public void setSumOrderPrice(String sumOrderPrice) {
            this.sumOrderPrice = sumOrderPrice;
        }

        public String getSumOriginalPrice() {
            return sumOriginalPrice;
        }

        public void setSumOriginalPrice(String sumOriginalPrice) {
            this.sumOriginalPrice = sumOriginalPrice;
        }

        public String getSumCashAccount() {
            return sumCashAccount;
        }

        public void setSumCashAccount(String sumCashAccount) {
            this.sumCashAccount = sumCashAccount;
        }

        public String getSumStarCardAccount() {
            return sumStarCardAccount;
        }

        public void setSumStarCardAccount(String sumStarCardAccount) {
            this.sumStarCardAccount = sumStarCardAccount;
        }

        public String getSumBonusAccount() {
            return sumBonusAccount;
        }

        public void setSumBonusAccount(String sumBonusAccount) {
            this.sumBonusAccount = sumBonusAccount;
        }

        public String getSumCoupon() {
            return sumCoupon;
        }

        public void setSumCoupon(String sumCoupon) {
            this.sumCoupon = sumCoupon;
        }
    }
}
