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

public class GetCompShareInstancePriceResponse extends Response {

    /** 价格详情列表 */
    @SerializedName("PriceDetail")
    private List<CompSharePriceDetail> priceDetail;

    /** 原价详情列表 */
    @SerializedName("OriginalPriceDetail")
    private List<CompSharePriceDetail> originalPriceDetail;

    /** 列表价详情列表 */
    @SerializedName("ListPriceDetail")
    private List<CompSharePriceDetail> listPriceDetail;

    public List<CompSharePriceDetail> getPriceDetail() {
        return priceDetail;
    }

    public void setPriceDetail(List<CompSharePriceDetail> priceDetail) {
        this.priceDetail = priceDetail;
    }

    public List<CompSharePriceDetail> getOriginalPriceDetail() {
        return originalPriceDetail;
    }

    public void setOriginalPriceDetail(List<CompSharePriceDetail> originalPriceDetail) {
        this.originalPriceDetail = originalPriceDetail;
    }

    public List<CompSharePriceDetail> getListPriceDetail() {
        return listPriceDetail;
    }

    public void setListPriceDetail(List<CompSharePriceDetail> listPriceDetail) {
        this.listPriceDetail = listPriceDetail;
    }

    public static class CompSharePriceDetail extends Response {

        /** 计费类型 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 实例价格 */
        @SerializedName("Instance")
        private Double instance;

        /** 磁盘价格 */
        @SerializedName("Disks")
        private Double disks;

        /** 镜像价格/Gpu/小时 */
        @SerializedName("CompShareImage")
        private Double compShareImage;

        /** 原价 */
        @SerializedName("OriginalPrice")
        private Double originalPrice;

        /** 列表价 */
        @SerializedName("ListPrice")
        private String listPrice;

        /** 主机折扣类型 1:夜间折扣 2:节日折扣 */
        @SerializedName("InstanceDiscountType")
        private Integer instanceDiscountType;

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Double getInstance() {
            return instance;
        }

        public void setInstance(Double instance) {
            this.instance = instance;
        }

        public Double getDisks() {
            return disks;
        }

        public void setDisks(Double disks) {
            this.disks = disks;
        }

        public Double getCompShareImage() {
            return compShareImage;
        }

        public void setCompShareImage(Double compShareImage) {
            this.compShareImage = compShareImage;
        }

        public Double getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
        }

        public String getListPrice() {
            return listPrice;
        }

        public void setListPrice(String listPrice) {
            this.listPrice = listPrice;
        }

        public Integer getInstanceDiscountType() {
            return instanceDiscountType;
        }

        public void setInstanceDiscountType(Integer instanceDiscountType) {
            this.instanceDiscountType = instanceDiscountType;
        }
    }
}
