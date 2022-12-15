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

package cn.ucloud.udpn.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class GetUDPNPriceRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 专线可用区1，支持地域：北京二：cn-bj2, 上海二：cn-sh2, 广东：cn-gd, 亚太： hk, 上海一：cn-sh1, 法兰克福：ge-fra, 新加坡：sg, 洛杉矶：us-la， 华盛顿：us-ws， 东京：jpn-tky
     */
    @NotEmpty
    @UCloudParam("Peer1")
    private String peer1;
        
    
        
    /**
     * 专线可用区2，支持地域：北京二：cn-bj2, 上海二：cn-sh2, 广东：cn-gd, 亚太： hk, 上海一：cn-sh1, 法兰克福：ge-fra, 新加坡：sg, 洛杉矶：us-la， 华盛顿：us-ws， 东京：jpn-tky
     */
    @NotEmpty
    @UCloudParam("Peer2")
    private String peer2;
        
    
        
    /**
     * 带宽信息
     */
    @NotEmpty
    @UCloudParam("Bandwidth")
    private Integer bandwidth;
        
    
        
    /**
     * 计费类型
     */
    @UCloudParam("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 购买时长
     */
    @UCloudParam("Quantity")
    private Integer quantity;
        
    
        
    /**
     * PayMode，枚举值，Bandwidth：带宽；Traffic：流量  默认不填写：带宽
     */
    @UCloudParam("PayMode")
    private String payMode;
        
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getPeer1() {
        return peer1;
    }

    public void setPeer1(String peer1) {
        this.peer1 = peer1;
    }
    
    public String getPeer2() {
        return peer2;
    }

    public void setPeer2(String peer2) {
        this.peer2 = peer2;
    }
    
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }
    
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
    
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }
    
}









