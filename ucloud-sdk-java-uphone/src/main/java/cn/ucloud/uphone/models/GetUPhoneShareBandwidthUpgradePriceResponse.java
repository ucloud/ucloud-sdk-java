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
package cn.ucloud.uphone.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetUPhoneShareBandwidthUpgradePriceResponse extends Response {

    /** 规格调整差价。单位: 元，保留小数点后两位有效数字 */
    @SerializedName("Price")
    private Double price;

    /** 限时优惠的折前原价（即列表价乘以商务折扣后的单价） */
    @SerializedName("OriginalPrice")
    private Double originalPrice;

    /** 产品列表价 */
    @SerializedName("ListPrice")
    private Double listPrice;

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
}
