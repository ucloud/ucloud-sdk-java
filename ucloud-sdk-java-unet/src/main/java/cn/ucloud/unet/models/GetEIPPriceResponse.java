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
package cn.ucloud.unet.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetEIPPriceResponse extends Response {

    /** 弹性IP价格详情 详情见 EIPPriceDetailSet: false */
    @SerializedName("PriceSet")
    private List<EIPPriceDetailSet> priceSet;

    public List<EIPPriceDetailSet> getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(List<EIPPriceDetailSet> priceSet) {
        this.priceSet = priceSet;
    }

    public static class EIPPriceDetailSet extends Response {

        /** 弹性IP付费方式: false */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 购买弹性IP的实际价格, 单位"元": false */
        @SerializedName("Price")
        private Double price;

        /** 弹性IP的原价，单位“元”: false */
        @SerializedName("OriginalPrice")
        private Double originalPrice;

        /** 资源有效期, 以Unix Timestamp表示: false */
        @SerializedName("PurchaseValue")
        private Integer purchaseValue;

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

        public Integer getPurchaseValue() {
            return purchaseValue;
        }

        public void setPurchaseValue(Integer purchaseValue) {
            this.purchaseValue = purchaseValue;
        }
    }
}
