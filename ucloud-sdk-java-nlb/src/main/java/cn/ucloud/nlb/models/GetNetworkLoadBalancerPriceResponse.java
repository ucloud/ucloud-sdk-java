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
package cn.ucloud.nlb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetNetworkLoadBalancerPriceResponse extends Response {

    /** */
    @SerializedName("Prices")
    private List<PriceDetail> prices;

    public List<PriceDetail> getPrices() {
        return prices;
    }

    public void setPrices(List<PriceDetail> prices) {
        this.prices = prices;
    }

    public static class PriceDetail extends Response {

        /** 负载均衡付费方式 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 购买负载均衡的实际价格，单位“元” */
        @SerializedName("Price")
        private Double price;

        /** 用户折后价，单位“元”。CustomPrice=OriginalPrice*用户折扣 */
        @SerializedName("CustomPrice")
        private Double customPrice;

        /** 购买负载均衡的原价，单位“元” */
        @SerializedName("OriginalPrice")
        private Double originalPrice;

        /** 资源有效期，以Unix Timestamp表示 */
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

        public Double getCustomPrice() {
            return customPrice;
        }

        public void setCustomPrice(Double customPrice) {
            this.customPrice = customPrice;
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
