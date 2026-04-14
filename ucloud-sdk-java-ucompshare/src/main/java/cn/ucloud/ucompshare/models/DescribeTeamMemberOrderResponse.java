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

import java.util.List;

public class DescribeTeamMemberOrderResponse extends Response {

    /** 订单详细信息 */
    @SerializedName("OrderInfos")
    private List<OrderInfo> orderInfos;

    /** 总条数 */
    @SerializedName("Total")
    private Integer total;

    /** 分页大小 */
    @SerializedName("Limit")
    private Integer limit;

    /** 分页偏移 */
    @SerializedName("Offset")
    private Integer offset;

    public List<OrderInfo> getOrderInfos() {
        return orderInfos;
    }

    public void setOrderInfos(List<OrderInfo> orderInfos) {
        this.orderInfos = orderInfos;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public static class OrderDetailItem extends Response {

        /** 产品名 */
        @SerializedName("ProductName")
        private String productName;

        /** 配置 */
        @SerializedName("Value")
        private String value;

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class OrderInfo extends Response {

        /** 订单号 */
        @SerializedName("OrderNo")
        private String orderNo;

        /** 订单类型 */
        @SerializedName("OrderType")
        private String orderType;

        /** 订单状态 */
        @SerializedName("OrderState")
        private String orderState;

        /** 可用区 */
        @SerializedName("RegionId")
        private String regionId;

        /** 产品类型 */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 付费方式 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 订单金额 */
        @SerializedName("Amount")
        private String amount;

        /** 真实金额 */
        @SerializedName("AmountReal")
        private String amountReal;

        /** 赠金 */
        @SerializedName("AmountFree")
        private String amountFree;

        /** 优惠券金额 */
        @SerializedName("AmountCoupon")
        private String amountCoupon;

        /** 购买量 */
        @SerializedName("Quantity")
        private String quantity;

        /** 购买数量 */
        @SerializedName("Count")
        private Integer count;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 更新时间 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** 订单起始时间 */
        @SerializedName("StartTime")
        private Integer startTime;

        /** 订单结束时间 */
        @SerializedName("EndTime")
        private Integer endTime;

        /** 交易号 */
        @SerializedName("TradeNo")
        private String tradeNo;

        /** 资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 抢占式折扣，仅抢占式才展示 */
        @SerializedName("SpotDiscount")
        private String spotDiscount;

        /** 折扣率 */
        @SerializedName("OriginalPrice")
        private String originalPrice;

        /** 项目名称 */
        @SerializedName("ProjectName")
        private String projectName;

        /** 配置详情 */
        @SerializedName("OrderDetail")
        private List<OrderDetailItem> orderDetail;

        /** 原配置详情 */
        @SerializedName("OrderDetailOld")
        private List<OrderDetailItem> orderDetailOld;

        /** 资源标识 */
        @SerializedName("ResourceTag")
        private List<ResourceTagItem> resourceTag;

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderType() {
            return orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getOrderState() {
            return orderState;
        }

        public void setOrderState(String orderState) {
            this.orderState = orderState;
        }

        public String getRegionId() {
            return regionId;
        }

        public void setRegionId(String regionId) {
            this.regionId = regionId;
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

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
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

        public String getTradeNo() {
            return tradeNo;
        }

        public void setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getSpotDiscount() {
            return spotDiscount;
        }

        public void setSpotDiscount(String spotDiscount) {
            this.spotDiscount = spotDiscount;
        }

        public String getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
        }

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }

        public List<OrderDetailItem> getOrderDetail() {
            return orderDetail;
        }

        public void setOrderDetail(List<OrderDetailItem> orderDetail) {
            this.orderDetail = orderDetail;
        }

        public List<OrderDetailItem> getOrderDetailOld() {
            return orderDetailOld;
        }

        public void setOrderDetailOld(List<OrderDetailItem> orderDetailOld) {
            this.orderDetailOld = orderDetailOld;
        }

        public List<ResourceTagItem> getResourceTag() {
            return resourceTag;
        }

        public void setResourceTag(List<ResourceTagItem> resourceTag) {
            this.resourceTag = resourceTag;
        }
    }

    public static class ResourceTagItem extends Response {

        /** 标识名称 */
        @SerializedName("KeyId")
        private String keyId;

        /** 标识信息 */
        @SerializedName("Value")
        private String value;

        public String getKeyId() {
            return keyId;
        }

        public void setKeyId(String keyId) {
            this.keyId = keyId;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
