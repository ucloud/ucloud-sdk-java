package cn.ucloud.ubill.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author: codezhang
 * @date: 2020/2/13 11:35 上午
 * @describe: 订单信息
 **/
public class OrderInfo {

    /**
     * 订单号
     */
    @SerializedName("OrderNo")
    private String orderNo;

    /**
     * 创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;

    /**
     * 代金券代码
     */
    @SerializedName("CouponCode")
    private String couponCode;

    /**
     * 更新时间
     */
    @SerializedName("UpdateTime")
    private Integer updateTime;

    /**
     * 购买量
     */
    @SerializedName("Quantity")
    private String quantity;

    /**
     * 购买数量
     */
    @SerializedName("Count")
    private Integer count;

    /**
     * 订单起始时间
     */
    @SerializedName("StartTime")
    private Integer startTime;

    /**
     * 订单结束时间
     */
    @SerializedName("EndTime")
    private Integer endTime;

    /**
     * 交易号
     */
    @SerializedName("TradeNo")
    private String tradeNo;

    /**
     * 资源ID
     */
    @SerializedName("ResourceId")
    private String resourceId;

    /**
     * 订单类型
     */
    @SerializedName("OrderType")
    private String orderType;

    /**
     * 订单状态
     */
    @SerializedName("OrderState")
    private String orderState;

    /**
     * 产品类型
     */
    @SerializedName("ResourceType")
    private String resourceType;

    /**
     * 计费方式
     */
    @SerializedName("ChargeType")
    private String chargeType;

    /**
     * 发票ID
     */
    @SerializedName("Invoiced")
    private String invoiced;

    /**
     * 数据中心
     */
    @SerializedName("RegionId")
    private String regionId;

    /**
     * 区域
     */
    @SerializedName("AzGroup")
    private String azGroup;

    /**
     * 订单金额
     */
    @SerializedName("Amount")
    private String amount;

    /**
     * 真实金额
     */
    @SerializedName("AmountReal")
    private String amountReal;

    /**
     * 赠金
     */
    @SerializedName("AmountFree")
    private String amountFree;

    /**
     * 优惠券金额
     */
    @SerializedName("AmountCoupon")
    private String amountCoupon;

    /**
     * 项目ID
     */
    @SerializedName("ProjectName")
    private String projectName;

    /**
     * 配置详情
     */
    @SerializedName("OrderDetail")
    private List<OrderDetail> orderDetails;

    /**
     * 原配置详情
     */
    @SerializedName("OrderDetailOld")
    private List<OrderDetail> orderDetailOlds;

    /**
     * 原始价格
     */
    @SerializedName("OriginalPrice")
    private String originalPrice;

    /**
     * 折扣率
     */
    @SerializedName("DiscountRate")
    private String discountRate;


    @SerializedName("ResourceTag")
    private List<ResourceTag> resourceTags;


    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public List<ResourceTag> getResourceTags() {
        return resourceTags;
    }

    public void setResourceTags(List<ResourceTag> resourceTags) {
        this.resourceTags = resourceTags;
    }

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

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
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

    public String getInvoiced() {
        return invoiced;
    }

    public void setInvoiced(String invoiced) {
        this.invoiced = invoiced;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getAzGroup() {
        return azGroup;
    }

    public void setAzGroup(String azGroup) {
        this.azGroup = azGroup;
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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<OrderDetail> getOrderDetailOlds() {
        return orderDetailOlds;
    }

    public void setOrderDetailOlds(List<OrderDetail> orderDetailOlds) {
        this.orderDetailOlds = orderDetailOlds;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
