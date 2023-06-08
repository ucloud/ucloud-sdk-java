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

package cn.ucloud.vpc.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeNATGWPolicyResponse extends Response {

    
        
    /**
     * 满足条件的转发策略总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
        
    /**
     * 查到的NATGW 转发策略的详细信息
     */
    @SerializedName("DataSet")
    private List<NATGWPolicyDataSet> dataSet;
        
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
    public List<NATGWPolicyDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<NATGWPolicyDataSet> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class NATGWPolicyDataSet extends Response {
            
        
    /**
     * NAT网关Id
     */
    @SerializedName("NATGWId")
    private String natgwId;
        
    
        
    /**
     * 转发策略Id
     */
    @SerializedName("PolicyId")
    private String policyId;
        
    
        
    /**
     * 协议类型
     */
    @SerializedName("Protocol")
    private String protocol;
        
    
        
    /**
     * 端口转发前端EIP
     */
    @SerializedName("SrcEIP")
    private String srcEIP;
        
    
        
    /**
     * 端口转发前端EIP Id
     */
    @SerializedName("SrcEIPId")
    private String srcEIPId;
        
    
        
    /**
     * 源端口
     */
    @SerializedName("SrcPort")
    private String srcPort;
        
    
        
    /**
     * 目的地址
     */
    @SerializedName("DstIP")
    private String dstIP;
        
    
        
    /**
     * 目的端口
     */
    @SerializedName("DstPort")
    private String dstPort;
        
    
        
    /**
     * 转发策略名称
     */
    @SerializedName("PolicyName")
    private String policyName;
        
    
    public String getNATGWId() {
        return natgwId;
    }

    public void setNATGWId(String natgwId) {
        this.natgwId = natgwId;
    }
    
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }
    
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    public String getSrcEIP() {
        return srcEIP;
    }

    public void setSrcEIP(String srcEIP) {
        this.srcEIP = srcEIP;
    }
    
    public String getSrcEIPId() {
        return srcEIPId;
    }

    public void setSrcEIPId(String srcEIPId) {
        this.srcEIPId = srcEIPId;
    }
    
    public String getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(String srcPort) {
        this.srcPort = srcPort;
    }
    
    public String getDstIP() {
        return dstIP;
    }

    public void setDstIP(String dstIP) {
        this.dstIP = dstIP;
    }
    
    public String getDstPort() {
        return dstPort;
    }

    public void setDstPort(String dstPort) {
        this.dstPort = dstPort;
    }
    
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
        }
}









