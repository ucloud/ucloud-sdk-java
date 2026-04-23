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

public class GetAttachedDiskUpgradePriceResponse extends Response {

    /** 升级差价。精度为小数点后2位。 */
    @SerializedName("Price")
    private Double price;

    /** 用户折后价。精度为小数点后2位。 */
    @SerializedName("OriginalPrice")
    private Double originalPrice;

    /** 原价。精度为小数点后2位。 */
    @SerializedName("ListPrice")
    private Double listPrice;

    /** 升级价格详情，精度为小数点后2位。 */
    @SerializedName("PriceDetail")
    private DiskUpgradePriceDetail priceDetail;

    /** 用户折后价详情，精度为小数点后2位。 */
    @SerializedName("OriginalPriceDetail")
    private DiskUpgradePriceDetail originalPriceDetail;

    /** 原价详情，精度为小数点后2位。 */
    @SerializedName("ListPriceDetail")
    private DiskUpgradePriceDetail listPriceDetail;

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

    public DiskUpgradePriceDetail getPriceDetail() {
        return priceDetail;
    }

    public void setPriceDetail(DiskUpgradePriceDetail priceDetail) {
        this.priceDetail = priceDetail;
    }

    public DiskUpgradePriceDetail getOriginalPriceDetail() {
        return originalPriceDetail;
    }

    public void setOriginalPriceDetail(DiskUpgradePriceDetail originalPriceDetail) {
        this.originalPriceDetail = originalPriceDetail;
    }

    public DiskUpgradePriceDetail getListPriceDetail() {
        return listPriceDetail;
    }

    public void setListPriceDetail(DiskUpgradePriceDetail listPriceDetail) {
        this.listPriceDetail = listPriceDetail;
    }

    public static class DiskUpgradePriceDetail extends Response {

        /** 磁盘的价格 */
        @SerializedName("UDisk")
        private Double uDisk;

        /** 快照的价格 */
        @SerializedName("Snapshot")
        private Double snapshot;

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
    }
}
