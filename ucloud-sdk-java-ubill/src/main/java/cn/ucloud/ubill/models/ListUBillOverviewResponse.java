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
package cn.ucloud.ubill.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUBillOverviewResponse extends Response {

    /** 账单总览数据总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 已入账订单总额（已入账时显示） */
    @SerializedName("TotalPaidAmount")
    private String totalPaidAmount;

    /** 现金账户扣款总额 （已入账时显示） */
    @SerializedName("TotalPaidAmountReal")
    private String totalPaidAmountReal;

    /** 待入账订单总额（待入账时显示） */
    @SerializedName("TotalUnpaidAmount")
    private String totalUnpaidAmount;

    /** 账单聚合数据 */
    @SerializedName("Items")
    private List<BillOverviewItem> items;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getTotalPaidAmount() {
        return totalPaidAmount;
    }

    public void setTotalPaidAmount(String totalPaidAmount) {
        this.totalPaidAmount = totalPaidAmount;
    }

    public String getTotalPaidAmountReal() {
        return totalPaidAmountReal;
    }

    public void setTotalPaidAmountReal(String totalPaidAmountReal) {
        this.totalPaidAmountReal = totalPaidAmountReal;
    }

    public String getTotalUnpaidAmount() {
        return totalUnpaidAmount;
    }

    public void setTotalUnpaidAmount(String totalUnpaidAmount) {
        this.totalUnpaidAmount = totalUnpaidAmount;
    }

    public List<BillOverviewItem> getItems() {
        return items;
    }

    public void setItems(List<BillOverviewItem> items) {
        this.items = items;
    }

    public static class BillOverviewItem extends Response {

        /** 账单维度, product 按产品维度聚合,project 按项目维度聚合，user 按子账号维度聚合 */
        @SerializedName("Dimension")
        private String dimension;

        /** 订单总金额 */
        @SerializedName("Amount")
        private String amount;

        /** 代金券抵扣（已入账时显示） */
        @SerializedName("AmountCoupon")
        private String amountCoupon;

        /** 赠送金额抵扣（已入账时显示） */
        @SerializedName("AmountFree")
        private String amountFree;

        /** 现金账户支付（已入账时显示） */
        @SerializedName("AmountReal")
        private String amountReal;

        /** 产品分类 （账单维度按产品筛选时显示） */
        @SerializedName("ProductCategory")
        private String productCategory;

        /** 产品类型 （账单维度按产品筛选时显示） */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 产品类型代码（账单维度按产品筛选时显示） */
        @SerializedName("ResourceTypeCode")
        private Integer resourceTypeCode;

        /** 项目名称（账单维度按项目筛选时显示） */
        @SerializedName("ProjectName")
        private String projectName;

        /** 账户邮箱（账单维度按子账号筛选时显示） */
        @SerializedName("UserEmail")
        private String userEmail;

        /** 账户名 （账单维度按子账号筛选时显示） */
        @SerializedName("UserName")
        private String userName;

        /** 账户昵称（账单维度按子账号筛选时显示） */
        @SerializedName("UserDisplayName")
        private String userDisplayName;

        /** 该账户是否为主账号，1 主账号，0 子账号（账单维度按子账号筛选时显示） */
        @SerializedName("Admin")
        private Integer admin;

        public String getDimension() {
            return dimension;
        }

        public void setDimension(String dimension) {
            this.dimension = dimension;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getAmountCoupon() {
            return amountCoupon;
        }

        public void setAmountCoupon(String amountCoupon) {
            this.amountCoupon = amountCoupon;
        }

        public String getAmountFree() {
            return amountFree;
        }

        public void setAmountFree(String amountFree) {
            this.amountFree = amountFree;
        }

        public String getAmountReal() {
            return amountReal;
        }

        public void setAmountReal(String amountReal) {
            this.amountReal = amountReal;
        }

        public String getProductCategory() {
            return productCategory;
        }

        public void setProductCategory(String productCategory) {
            this.productCategory = productCategory;
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

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
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
}
