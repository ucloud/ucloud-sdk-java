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


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeUDPNResponse extends Response {

    
        
    /**
     * 查询到的总数量
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
        
    /**
     * UDPN详情
     */
    @SerializedName("DataSet")
    private List<UDPNData> dataSet;
        
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
    public List<UDPNData> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDPNData> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class UDPNData extends Response {
            
        
    /**
     * UDPN 资源短 ID
     */
    @SerializedName("UDPNId")
    private String udpnId;
        
    
        
    /**
     * 可用区域 1
     */
    @SerializedName("Peer1")
    private String peer1;
        
    
        
    /**
     * 可用区域 2
     */
    @SerializedName("Peer2")
    private String peer2;
        
    
        
    /**
     * 计费类型
     */
    @SerializedName("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 带宽
     */
    @SerializedName("Bandwidth")
    private Integer bandwidth;
        
    
        
    /**
     * unix 时间戳 创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * unix 时间戳 到期时间
     */
    @SerializedName("ExpireTime")
    private Integer expireTime;
        
    
    public String getUDPNId() {
        return udpnId;
    }

    public void setUDPNId(String udpnId) {
        this.udpnId = udpnId;
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
    
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
    
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }
    
        }
}









