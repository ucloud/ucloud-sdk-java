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

package cn.ucloud.ucdn.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class GetUcdnTrafficV2Response extends Response {

    
        
    /**
     * 用户不同区域的流量信息, 具体结构参见TrafficSet部分
     */
    @SerializedName("TrafficSet")
    private List<TrafficSet> trafficSet;
        
    
    public List<TrafficSet> getTrafficSet() {
        return trafficSet;
    }

    public void setTrafficSet(List<TrafficSet> trafficSet) {
        this.trafficSet = trafficSet;
    }
    
        public static class TrafficSet extends Response {
            
        
    /**
     * 购买流量的区域, cn: 国内; abroad: 国外
     */
    @SerializedName("Areacode")
    private String areacode;
        
    
        
    /**
     * Areacode区域内总购买流量, 单位GB
     */
    @SerializedName("TrafficTotal")
    private Double trafficTotal;
        
    
        
    /**
     * Areacode区域内总剩余流量, 单位GB
     */
    @SerializedName("TrafficLeft")
    private Double trafficLeft;
        
    
        
    /**
     * Areacode区域内总使用流量, 单位GB
     */
    @SerializedName("TrafficUsed")
    private Double trafficUsed;
        
    
    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }
    
    public Double getTrafficTotal() {
        return trafficTotal;
    }

    public void setTrafficTotal(Double trafficTotal) {
        this.trafficTotal = trafficTotal;
    }
    
    public Double getTrafficLeft() {
        return trafficLeft;
    }

    public void setTrafficLeft(Double trafficLeft) {
        this.trafficLeft = trafficLeft;
    }
    
    public Double getTrafficUsed() {
        return trafficUsed;
    }

    public void setTrafficUsed(Double trafficUsed) {
        this.trafficUsed = trafficUsed;
    }
    
        }
}









