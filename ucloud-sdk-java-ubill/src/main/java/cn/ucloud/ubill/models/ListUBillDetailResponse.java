/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.ubill.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class ListUBillDetailResponse extends Response {

    
        
    /**
     * 账单明细数组
     */
    @SerializedName("Items")
    private List<BillDetailItem> items;
        
    
        
    /**
     * 账单明细总长度
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
    public List<BillDetailItem> getItems() {
        return items;
    }

    public void setItems(List<BillDetailItem> items) {
        this.items = items;
    }
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
        public static class BillDetailItem extends Response {
            
        
    /**
     * 订单总金额
     */
    @SerializedName("Amount")
    private String amount;
        
    
        
    /**
     * 现金账户支付
     */
    @SerializedName("AmountReal")
    private String amountReal;
        
    
        
    /**
     * 赠送金额抵扣
     */
    @SerializedName("AmountFree")
    private String amountFree;
        
    
        
    /**
     * 代金券抵扣
     */
    @SerializedName("AmountCoupon")
    private String amountCoupon;
        
    
        
    /**
     * 可用区
     */
    @SerializedName("AzGroupCName")
    private String azGroupCName;
        
    
        
    /**
     * 计费方式 (筛选项, 默认全部)。枚举值：\\ > Year:按年\\ > Month:按月 \\ > Day:按天 \\ > Dynamic:按时 \\ > Used:按量 \\ > Donate:赠送 \\ > Trial:试用 \\ > Post:后付费 \\ > Spot:抢占式
     */
    @SerializedName("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 创建时间（时间戳）
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 开始时间（时间戳）
     */
    @SerializedName("StartTime")
    private Integer startTime;
        
    
        
    /**
     * 结束时间（时间戳）
     */
    @SerializedName("EndTime")
    private Integer endTime;
        
    
        
    /**
     * 订单号
     */
    @SerializedName("OrderNo")
    private String orderNo;
        
    
        
    /**
     * 订单类型 (筛选项, 默认全部) 。枚举值：\\ > OT_BUY:新购 \\ > OT_RENEW:续费 \\ > OT_UPGRADE:升级 \\ > OT_DOWNGRADE:降级 \\ > OT_SUSPEND:结算 \\ > OT_ADDITIONAL:补单 \\ > OT_REFUND:删除 \\ > OT_POSTPAID_RENEW:过期 \\ > OT_POSTPAID_PAYMENT:后付费 \\ > OT_RECOVER:删除恢复
     */
    @SerializedName("OrderType")
    private String orderType;
        
    
        
    /**
     * 项目名称
     */
    @SerializedName("ProjectName")
    private String projectName;
        
    
        
    /**
     * 资源ID
     */
    @SerializedName("ResourceId")
    private String resourceId;
        
    
        
    /**
     * 产品类型。枚举值：\\ > uhost:云主机 \\ > udisk:普通云硬盘 \\ > udb:云数据库 \\ > eip:弹性IP \\ > ufile:对象存储 \\ > fortress_host:堡垒机 \\ > ufs:文件存储 \\ > waf:WEB应用防火墙 \\ > ues:弹性搜索 \\ > udisk_ssd:SSD云硬盘 \\ > rssd:RSSD云硬盘
     */
    @SerializedName("ResourceType")
    private String resourceType;
        
    
        
    /**
     * 产品类型代码
     */
    @SerializedName("ResourceTypeCode")
    private Integer resourceTypeCode;
        
    
        
    /**
     * 产品配置
     */
    @SerializedName("ItemDetails")
    private List<ItemDetail> itemDetails;
        
    
        
    /**
     * 资源标识
     */
    @SerializedName("ResourceExtendInfo")
    private List<ResourceExtendInfo> resourceExtendInfo;
        
    
        
    /**
     * 订单支付状态。枚举值：\\> 0:未支付 \\ > 1:已支付
     */
    @SerializedName("ShowHover")
    private Integer showHover;
        
    
        
    /**
     * 账户邮箱
     */
    @SerializedName("UserEmail")
    private String userEmail;
        
    
        
    /**
     * 账户名
     */
    @SerializedName("UserName")
    private String userName;
        
    
        
    /**
     * 账户昵称
     */
    @SerializedName("UserDisplayName")
    private String userDisplayName;
        
    
        
    /**
     * 是否为主账号。枚举值：\\ > 0:子账号 \\ > 1:主账号
     */
    @SerializedName("Admin")
    private Integer admin;
        
    
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
    
    public String getAzGroupCName() {
        return azGroupCName;
    }

    public void setAzGroupCName(String azGroupCName) {
        this.azGroupCName = azGroupCName;
    }
    
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
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
    
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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
    
    public Integer getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(Integer resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }
    
    public List<ItemDetail> getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(List<ItemDetail> itemDetails) {
        this.itemDetails = itemDetails;
    }
    
    public List<ResourceExtendInfo> getResourceExtendInfo() {
        return resourceExtendInfo;
    }

    public void setResourceExtendInfo(List<ResourceExtendInfo> resourceExtendInfo) {
        this.resourceExtendInfo = resourceExtendInfo;
    }
    
    public Integer getShowHover() {
        return showHover;
    }

    public void setShowHover(Integer showHover) {
        this.showHover = showHover;
    }
    
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }
    
    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }
    
        }
        public static class ItemDetail extends Response {
            
        
    /**
     * 产品小类名称
     */
    @SerializedName("ProductName")
    private String productName;
        
    
        
    /**
     * 产品小类规格
     */
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
        public static class ResourceExtendInfo extends Response {
            
        
    /**
     * 资源标识健
     */
    @SerializedName("KeyId")
    private String keyId;
        
    
        
    /**
     * 资源标识值
     */
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









