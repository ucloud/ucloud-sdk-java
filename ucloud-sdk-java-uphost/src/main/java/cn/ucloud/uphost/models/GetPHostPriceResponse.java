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

package cn.ucloud.uphost.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class GetPHostPriceResponse extends Response {

    
        
    /**
     * 价格列表 见 PHostPriceSet
     */
    @SerializedName("PriceSet")
    private List<PHostPriceSet> priceSet;
        
    
    public List<PHostPriceSet> getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(List<PHostPriceSet> priceSet) {
        this.priceSet = priceSet;
    }
    
        public static class PHostPriceSet extends Response {
            
        
    /**
     * Year/Month
     */
    @SerializedName("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 价格, 单位:元, 保留小数点后两位有效数字
     */
    @SerializedName("Price")
    private Double price;
        
    
        
    /**
     * 枚举值：phost=>为主机价格，如果是云盘包括了系统盘价格。cloudDisk=>所有数据盘价格，只是裸金属机型才返回此参数。
     */
    @SerializedName("Product")
    private String product;
        
    
        
    /**
     * 原价格, 单位:元, 保留小数点后两位有效数字
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
    
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
    
    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }
    
        }
}









