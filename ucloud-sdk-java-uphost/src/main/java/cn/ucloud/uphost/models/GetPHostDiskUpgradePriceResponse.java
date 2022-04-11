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
package cn.ucloud.uphost.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;

public class GetPHostDiskUpgradePriceResponse extends Response {

    /** 升级差价。精度为小数点后2位。 */
    @SerializedName("Price")
    private Double price;

    /** 升价差价原价。精度为小数点后2位。 */
    @SerializedName("OriginalPrice")
    private Double originalPrice;

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
}
