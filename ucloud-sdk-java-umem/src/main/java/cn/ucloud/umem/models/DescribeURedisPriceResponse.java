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

package cn.ucloud.umem.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeURedisPriceResponse extends Response {

    
        
    /**
     * 价格 参数见 UMemPriceSet
     */
    @SerializedName("DataSet")
    private List<URedisPriceSet> dataSet;
        
    
    public List<URedisPriceSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<URedisPriceSet> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class URedisPriceSet extends Response {
            
        
    /**
     * 原价
     */
    @SerializedName("OriginalPrice")
    private Integer originalPrice;
        
    
        
    /**
     * Year， Month， Dynamic，Trial
     */
    @SerializedName("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 产品列表价
     */
    @SerializedName("ListPrice")
    private Integer listPrice;
        
    
        
    /**
     * 总价格
     */
    @SerializedName("Price")
    private Integer price;
        
    
    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }
    
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
    
    public Integer getListPrice() {
        return listPrice;
    }

    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }
    
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    
        }
}









