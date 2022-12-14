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

public class DescribeVPNGatewayResponse extends Response {

    
        
    /**
     * 满足条件的VPN网关总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
        
    /**
     * 获取的VPN网关信息列表，每项参数详见 VPNGatewayDataSet
     */
    @SerializedName("DataSet")
    private List<VPNGatewayDataSet> dataSet;
        
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
    public List<VPNGatewayDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<VPNGatewayDataSet> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class VPNGatewayDataSet extends Response {
            
        
    /**
     * 网关Id
     */
    @SerializedName("VPNGatewayId")
    private String vpnGatewayId;
        
    
        
    /**
     * 网关名字
     */
    @SerializedName("VPNGatewayName")
    private String vpnGatewayName;
        
    
        
    /**
     * 网关业务组
     */
    @SerializedName("Tag")
    private String tag;
        
    
        
    /**
     * 网关备注
     */
    @SerializedName("Remark")
    private String remark;
        
    
        
    /**
     * 所属VPCId
     */
    @SerializedName("VPCId")
    private String vpcId;
        
    
        
    /**
     * 所属VPC名字
     */
    @SerializedName("VPCName")
    private String vpcName;
        
    
        
    /**
     * 付费类型
     */
    @SerializedName("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 到期时间
     */
    @SerializedName("ExpireTime")
    private Integer expireTime;
        
    
        
    /**
     * 是否自动续费
     */
    @SerializedName("AutoRenew")
    private String autoRenew;
        
    
        
    /**
     * 网关类型
     */
    @SerializedName("Grade")
    private String grade;
        
    
        
    /**
     * 绑定EIP的IP地址
     */
    @SerializedName("EIP")
    private String eip;
        
    
        
    /**
     * EIP类型
     */
    @SerializedName("EIPType")
    private String eipType;
        
    
        
    /**
     * EIPID
     */
    @SerializedName("EIPId")
    private String eipId;
        
    
    public String getVPNGatewayId() {
        return vpnGatewayId;
    }

    public void setVPNGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    public String getVPNGatewayName() {
        return vpnGatewayName;
    }

    public void setVPNGatewayName(String vpnGatewayName) {
        this.vpnGatewayName = vpnGatewayName;
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    public String getVPCName() {
        return vpcName;
    }

    public void setVPCName(String vpcName) {
        this.vpcName = vpcName;
    }
    
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
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
    
    public String getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
    }
    
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public String getEIP() {
        return eip;
    }

    public void setEIP(String eip) {
        this.eip = eip;
    }
    
    public String getEIPType() {
        return eipType;
    }

    public void setEIPType(String eipType) {
        this.eipType = eipType;
    }
    
    public String getEIPId() {
        return eipId;
    }

    public void setEIPId(String eipId) {
        this.eipId = eipId;
    }
    
        }
}









