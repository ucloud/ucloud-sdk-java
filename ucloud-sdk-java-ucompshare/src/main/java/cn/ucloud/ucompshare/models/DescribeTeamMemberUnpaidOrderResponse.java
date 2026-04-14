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

public class DescribeTeamMemberUnpaidOrderResponse extends Response {

    /** 订单详细信息 */
    @SerializedName("OrderInfos")
    private List<UnpaidOrderInfo> orderInfos;

    /** 总条数 */
    @SerializedName("Total")
    private Integer total;

    /** 分页大小 */
    @SerializedName("Limit")
    private Integer limit;

    /** 分页偏移 */
    @SerializedName("Offset")
    private Integer offset;

    public List<UnpaidOrderInfo> getOrderInfos() {
        return orderInfos;
    }

    public void setOrderInfos(List<UnpaidOrderInfo> orderInfos) {
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

    public static class UnpaidOrderDetail extends Response {

        /** 产品子类 */
        @SerializedName("ProductId")
        private Integer productId;

        /** 配置大小 */
        @SerializedName("Multiple")
        private Integer multiple;

        /** 计费对象的资源ID */
        @SerializedName("BillItemId")
        private String billItemId;

        /** 资源有效期 */
        @SerializedName("PurchaseValue")
        private Integer purchaseValue;

        public Integer getProductId() {
            return productId;
        }

        public void setProductId(Integer productId) {
            this.productId = productId;
        }

        public Integer getMultiple() {
            return multiple;
        }

        public void setMultiple(Integer multiple) {
            this.multiple = multiple;
        }

        public String getBillItemId() {
            return billItemId;
        }

        public void setBillItemId(String billItemId) {
            this.billItemId = billItemId;
        }

        public Integer getPurchaseValue() {
            return purchaseValue;
        }

        public void setPurchaseValue(Integer purchaseValue) {
            this.purchaseValue = purchaseValue;
        }
    }

    public static class UnpaidOrderInfo extends Response {

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

        /** 购买量 */
        @SerializedName("Quantity")
        private String quantity;

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

        /** 资源短ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 折扣率 */
        @SerializedName("OriginalPrice")
        private String originalPrice;

        /** 配置详情 */
        @SerializedName("OrderDetail")
        private List<UnpaidOrderDetail> orderDetail;

        /** 金额 */
        @SerializedName("Amount")
        private Integer amount;

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

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
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

        public String getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
        }

        public List<UnpaidOrderDetail> getOrderDetail() {
            return orderDetail;
        }

        public void setOrderDetail(List<UnpaidOrderDetail> orderDetail) {
            this.orderDetail = orderDetail;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }
    }
}
