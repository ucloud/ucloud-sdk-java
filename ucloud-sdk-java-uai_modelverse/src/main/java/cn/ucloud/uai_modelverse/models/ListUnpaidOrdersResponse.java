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

public class ListUnpaidOrdersResponse extends Response {

    /** 欠费订单明细列表 */
    @SerializedName("Orders")
    private List<UnpaidOrderItem> orders;

    public List<UnpaidOrderItem> getOrders() {
        return orders;
    }

    public void setOrders(List<UnpaidOrderItem> orders) {
        this.orders = orders;
    }

    public static class UnpaidOrderItem extends Response {

        /** 地域代码 */
        @SerializedName("Region")
        private String region;

        /** 订单号 */
        @SerializedName("OrderNo")
        private String orderNo;

        /** 来源订单号 */
        @SerializedName("SourceOrderNo")
        private String sourceOrderNo;

        /** 公司id */
        @SerializedName("CompanyID")
        private Integer companyID;

        /** 组织ID */
        @SerializedName("OrganizationID")
        private Integer organizationID;

        /** 组织名称 */
        @SerializedName("OrganizationName")
        private String organizationName;

        /** 用户邮箱 */
        @SerializedName("UserEmail")
        private String userEmail;

        /** 计费类型 */
        @SerializedName("ChargeType")
        private Integer chargeType;

        /** 计价方式显示名 */
        @SerializedName("ChargeTypeDisplay")
        private String chargeTypeDisplay;

        /** 渠道 */
        @SerializedName("Channel")
        private Integer channel;

        /** 币种（如：CNY、USD） */
        @SerializedName("Currency")
        private String currency;

        /** 币种显示名 */
        @SerializedName("CurrencyDisplay")
        private String currencyDisplay;

        /** 模型key */
        @SerializedName("ResourceID")
        private String resourceID;

        /** 资源类型 */
        @SerializedName("ResourceType")
        private Integer resourceType;

        /** 资源类型显示名 */
        @SerializedName("ResourceTypeDisplay")
        private String resourceTypeDisplay;

        /** 模型ID */
        @SerializedName("ModelID")
        private String modelID;

        /** 模型名称 */
        @SerializedName("ModelName")
        private String modelName;

        /** 订单类型 */
        @SerializedName("OrderType")
        private Integer orderType;

        /** 订单类型显示名 */
        @SerializedName("OrderTypeDisplay")
        private String orderTypeDisplay;

        /** 计费单元（SKU）名称 */
        @SerializedName("PricingSKU")
        private String pricingSKU;

        /** 用量 */
        @SerializedName("Quantity")
        private Integer quantity;

        /** 用量显示（含单位） */
        @SerializedName("QuantityDisplay")
        private String quantityDisplay;

        /** 计费单位（计量单元） */
        @SerializedName("PricingUnit")
        private Integer pricingUnit;

        /** 计费单位显示名（如：千Token、张、秒） */
        @SerializedName("PricingUnitDisplay")
        private String pricingUnitDisplay;

        /** 列表价（原单价） */
        @SerializedName("ListPrice")
        private String listPrice;

        /** 折后价（折后单价） */
        @SerializedName("DiscountPrice")
        private String discountPrice;

        /** 订单总额 */
        @SerializedName("OrderTotalPrice")
        private String orderTotalPrice;

        /** 原价 */
        @SerializedName("OriginalPrice")
        private String originalPrice;

        /** 订单状态 */
        @SerializedName("Status")
        private Integer status;

        /** 订单状态显示名 */
        @SerializedName("StatusDisplay")
        private String statusDisplay;

        /** 创建订单时间（Unix 时间戳，秒级） */
        @SerializedName("CreateTime")
        private String createTime;

        /** 开始计费时间（Unix 时间戳，秒级） */
        @SerializedName("StartTime")
        private Integer startTime;

        /** 结束计费时间（Unix 时间戳，秒级） */
        @SerializedName("EndTime")
        private Integer endTime;

        /** 订单支付时间（Unix 时间戳，秒级） */
        @SerializedName("PaidTime")
        private Integer paidTime;

        /** 撤销时间（Unix 时间戳，秒级） */
        @SerializedName("RevocationTime")
        private String revocationTime;

        /** 地域显示名 */
        @SerializedName("RegionDisplay")
        private String regionDisplay;

        /** 产品类型 */
        @SerializedName("ProductCode")
        private String productCode;

        /** 产品类型显示名 */
        @SerializedName("ProductCodeDisplay")
        private String productCodeDisplay;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getSourceOrderNo() {
            return sourceOrderNo;
        }

        public void setSourceOrderNo(String sourceOrderNo) {
            this.sourceOrderNo = sourceOrderNo;
        }

        public Integer getCompanyID() {
            return companyID;
        }

        public void setCompanyID(Integer companyID) {
            this.companyID = companyID;
        }

        public Integer getOrganizationID() {
            return organizationID;
        }

        public void setOrganizationID(Integer organizationID) {
            this.organizationID = organizationID;
        }

        public String getOrganizationName() {
            return organizationName;
        }

        public void setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public Integer getChargeType() {
            return chargeType;
        }

        public void setChargeType(Integer chargeType) {
            this.chargeType = chargeType;
        }

        public String getChargeTypeDisplay() {
            return chargeTypeDisplay;
        }

        public void setChargeTypeDisplay(String chargeTypeDisplay) {
            this.chargeTypeDisplay = chargeTypeDisplay;
        }

        public Integer getChannel() {
            return channel;
        }

        public void setChannel(Integer channel) {
            this.channel = channel;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getCurrencyDisplay() {
            return currencyDisplay;
        }

        public void setCurrencyDisplay(String currencyDisplay) {
            this.currencyDisplay = currencyDisplay;
        }

        public String getResourceID() {
            return resourceID;
        }

        public void setResourceID(String resourceID) {
            this.resourceID = resourceID;
        }

        public Integer getResourceType() {
            return resourceType;
        }

        public void setResourceType(Integer resourceType) {
            this.resourceType = resourceType;
        }

        public String getResourceTypeDisplay() {
            return resourceTypeDisplay;
        }

        public void setResourceTypeDisplay(String resourceTypeDisplay) {
            this.resourceTypeDisplay = resourceTypeDisplay;
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

        public String getPricingSKU() {
            return pricingSKU;
        }

        public void setPricingSKU(String pricingSKU) {
            this.pricingSKU = pricingSKU;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public String getQuantityDisplay() {
            return quantityDisplay;
        }

        public void setQuantityDisplay(String quantityDisplay) {
            this.quantityDisplay = quantityDisplay;
        }

        public Integer getPricingUnit() {
            return pricingUnit;
        }

        public void setPricingUnit(Integer pricingUnit) {
            this.pricingUnit = pricingUnit;
        }

        public String getPricingUnitDisplay() {
            return pricingUnitDisplay;
        }

        public void setPricingUnitDisplay(String pricingUnitDisplay) {
            this.pricingUnitDisplay = pricingUnitDisplay;
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

        public String getOrderTotalPrice() {
            return orderTotalPrice;
        }

        public void setOrderTotalPrice(String orderTotalPrice) {
            this.orderTotalPrice = orderTotalPrice;
        }

        public String getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
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

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
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

        public Integer getPaidTime() {
            return paidTime;
        }

        public void setPaidTime(Integer paidTime) {
            this.paidTime = paidTime;
        }

        public String getRevocationTime() {
            return revocationTime;
        }

        public void setRevocationTime(String revocationTime) {
            this.revocationTime = revocationTime;
        }

        public String getRegionDisplay() {
            return regionDisplay;
        }

        public void setRegionDisplay(String regionDisplay) {
            this.regionDisplay = regionDisplay;
        }

        public String getProductCode() {
            return productCode;
        }

        public void setProductCode(String productCode) {
            this.productCode = productCode;
        }

        public String getProductCodeDisplay() {
            return productCodeDisplay;
        }

        public void setProductCodeDisplay(String productCodeDisplay) {
            this.productCodeDisplay = productCodeDisplay;
        }
    }
}
