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
package cn.ucloud.umem.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class DescribeUMemcacheUpgradePriceResponse extends Response {

    /** 价格 */
    @SerializedName("Price")
    private Integer price;

    /** 原价 */
    @SerializedName("OriginalPrice")
    private Integer originalPrice;

    /** 列表价格 */
    @SerializedName("ListPrice")
    private Integer listPrice;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getListPrice() {
        return listPrice;
    }

    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }
}
