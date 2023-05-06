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
package cn.ucloud.uhost.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUHostInstancePriceResponse extends Response {

    /** 价格列表 UHostPriceSet */
    @SerializedName("PriceSet")
    private List<UHostPriceSet> priceSet;

    public List<UHostPriceSet> getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(List<UHostPriceSet> priceSet) {
        this.priceSet = priceSet;
    }

    public static class PriceDetail extends Response {

        /** 主机价格 */
        @SerializedName("UHost")
        private Double uHost;

        /** 云盘价格 */
        @SerializedName("UDisk")
        private Double uDisk;

        /** 快照价格 */
        @SerializedName("Snapshot")
        private Double snapshot;

        /** 数据卷价格 */
        @SerializedName("Volume")
        private Double volume;

        public Double getUHost() {
            return uHost;
        }

        public void setUHost(Double uHost) {
            this.uHost = uHost;
        }

        public Double getUDisk() {
            return uDisk;
        }

        public void setUDisk(Double uDisk) {
            this.uDisk = uDisk;
        }

        public Double getSnapshot() {
            return snapshot;
        }

        public void setSnapshot(Double snapshot) {
            this.snapshot = snapshot;
        }

        public Double getVolume() {
            return volume;
        }

        public void setVolume(Double volume) {
            this.volume = volume;
        }
    }

    public static class UHostPriceSet extends Response {

        /** 计费类型。Year，Month，Dynamic */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 价格，单位: 元，保留小数点后两位有效数字 */
        @SerializedName("Price")
        private Double price;

        /** 限时优惠的折前原价（即列表价乘以商务折扣后的单价）。 */
        @SerializedName("OriginalPrice")
        private Double originalPrice;

        /** 产品列表价。 */
        @SerializedName("ListPrice")
        private Double listPrice;

        /** 价格详细信息（只有询价接口返回）。 */
        @SerializedName("PriceDetail")
        private PriceDetail priceDetail;

        /** 原价详细信息（只有询价接口返回）。 */
        @SerializedName("OriginalPriceDetail")
        private PriceDetail originalPriceDetail;

        /** 列表价详细信息（只有询价接口返回）。 */
        @SerializedName("ListPriceDetail")
        private PriceDetail listPriceDetail;

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Double getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
        }

        public Double getListPrice() {
            return listPrice;
        }

        public void setListPrice(Double listPrice) {
            this.listPrice = listPrice;
        }

        public PriceDetail getPriceDetail() {
            return priceDetail;
        }

        public void setPriceDetail(PriceDetail priceDetail) {
            this.priceDetail = priceDetail;
        }

        public PriceDetail getOriginalPriceDetail() {
            return originalPriceDetail;
        }

        public void setOriginalPriceDetail(PriceDetail originalPriceDetail) {
            this.originalPriceDetail = originalPriceDetail;
        }

        public PriceDetail getListPriceDetail() {
            return listPriceDetail;
        }

        public void setListPriceDetail(PriceDetail listPriceDetail) {
            this.listPriceDetail = listPriceDetail;
        }
    }
}
