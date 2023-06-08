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

package cn.ucloud.uhost.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class GetUHostRenewPriceResponse extends Response {

    
        
    /**
     * 价格列表
     */
    @SerializedName("PriceSet")
    private List<BasePriceSet> priceSet;
        
    
    public List<BasePriceSet> getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(List<BasePriceSet> priceSet) {
        this.priceSet = priceSet;
    }
    
        public static class BasePriceSet extends Response {
            
        
    /**
     * 计费类型
     */
    @SerializedName("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 价格，单位: 元，保留小数点后两位有效数字

     */
    @SerializedName("Price")
    private Double price;
        
    
        
    /**
     * 限时优惠的折前原价（即列表价乘以商务折扣后的单价）。

     */
    @SerializedName("OriginalPrice")
    private Double originalPrice;
        
    
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
    
        }
}









