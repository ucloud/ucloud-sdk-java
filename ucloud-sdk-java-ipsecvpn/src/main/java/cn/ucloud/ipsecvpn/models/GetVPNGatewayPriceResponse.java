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

package cn.ucloud.ipsecvpn.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class GetVPNGatewayPriceResponse extends Response {

    
        
    /**
     * 获取的VPN网关价格信息列表，每项参数详见 VPNGatewayPriceSet
     */
    @SerializedName("PriceSet")
    private List<VPNGatewayPriceSet> priceSet;
        
    
    public List<VPNGatewayPriceSet> getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(List<VPNGatewayPriceSet> priceSet) {
        this.priceSet = priceSet;
    }
    
        public static class VPNGatewayPriceSet extends Response {
            
        
    /**
     * VPN网关付费方式
     */
    @SerializedName("ChargeType")
    private String chargeType;
        
    
        
    /**
     * VPN网关价格, 单位"元"
     */
    @SerializedName("Price")
    private Double price;
        
    
        
    /**
     * 资源有效期, 以Unix Timestamp表示
     */
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
    
    public Integer getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(Integer purchaseValue) {
        this.purchaseValue = purchaseValue;
    }
    
        }
}









