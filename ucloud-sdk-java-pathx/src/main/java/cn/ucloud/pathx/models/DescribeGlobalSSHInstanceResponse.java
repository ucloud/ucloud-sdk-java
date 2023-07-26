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

package cn.ucloud.pathx.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeGlobalSSHInstanceResponse extends Response {

    
        
    /**
     * GlobalSSH实例列表，实例的属性参考GlobalSSHInfo模型
     */
    @SerializedName("InstanceSet")
    private List<GlobalSSHInfo> instanceSet;
        
    
    public List<GlobalSSHInfo> getInstanceSet() {
        return instanceSet;
    }

    public void setInstanceSet(List<GlobalSSHInfo> instanceSet) {
        this.instanceSet = instanceSet;
    }
    
        public static class GlobalSSHInfo extends Response {
            
        
    /**
     * 实例ID，资源唯一标识
     */
    @SerializedName("InstanceId")
    private String instanceId;
        
    
        
    /**
     * 枚举值：["Enterprise","Basic","Free","Welfare"], 分别代表企业版，基础版本，免费版本，较早的公测免费版
     */
    @SerializedName("InstanceType")
    private String instanceType;
        
    
        
    /**
     * GlobalSSH分配的加速域名。
     */
    @SerializedName("AcceleratingDomain")
    private String acceleratingDomain;
        
    
        
    /**
     * 被SSH访问的IP所在地区
     */
    @SerializedName("Area")
    private String area;
        
    
        
    /**
     * 被SSH访问的源站 IPv4地址。
     */
    @SerializedName("TargetIP")
    private String targetIP;
        
    
        
    /**
     * 备注信息
     */
    @SerializedName("Remark")
    private String remark;
        
    
        
    /**
     * 源站服务器监听的SSH端口，windows系统为RDP端口
     */
    @SerializedName("Port")
    private Integer port;
        
    
        
    /**
     * InstanceType等于Free时，由系统自动分配，不等于源站Port值。InstanceType不等于Free时，与源站Port值相同。
     */
    @SerializedName("GlobalSSHPort")
    private Integer globalSSHPort;
        
    
        
    /**
     * 支付周期，如Month,Year,Dynamic等
     */
    @SerializedName("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 资源创建时间戳
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 资源过期时间戳
     */
    @SerializedName("ExpireTime")
    private Integer expireTime;
        
    
        
    /**
     * 是否过期
     */
    @SerializedName("Expire")
    private Boolean expire;
        
    
        
    /**
     * 是否开启EIP IPV6 接入,Flase:未开启
     */
    @SerializedName("IPV6Access")
    private Boolean ipv6Access;
        
    
        
    /**
     * GlobalSSH分配的其他可用加速域名列表
     */
    @SerializedName("ExtraDomain")
    private List<String> extraDomain;
        
    
        
    /**
     * globalssh Ultimate带宽包大小
     */
    @SerializedName("BandwidthPackage")
    private Integer bandwidthPackage;
        
    
        
    /**
     * InstanceType为Basic版本时，需要展示具体分配的转发机房
     */
    @SerializedName("ForwardRegion")
    private String forwardRegion;
        
    
        
    /**
     * 加速域名当前可用性检测结果 HashMap 结构 0表示可用, 1 表示有污染 
     */
    @SerializedName("DomainStatus")
    private Object domainStatus;
        
    
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    public String getAcceleratingDomain() {
        return acceleratingDomain;
    }

    public void setAcceleratingDomain(String acceleratingDomain) {
        this.acceleratingDomain = acceleratingDomain;
    }
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public String getTargetIP() {
        return targetIP;
    }

    public void setTargetIP(String targetIP) {
        this.targetIP = targetIP;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
    
    public Integer getGlobalSSHPort() {
        return globalSSHPort;
    }

    public void setGlobalSSHPort(Integer globalSSHPort) {
        this.globalSSHPort = globalSSHPort;
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
    
    public Boolean getExpire() {
        return expire;
    }

    public void setExpire(Boolean expire) {
        this.expire = expire;
    }
    
    public Boolean getIPV6Access() {
        return ipv6Access;
    }

    public void setIPV6Access(Boolean ipv6Access) {
        this.ipv6Access = ipv6Access;
    }
    
    public List<String> getExtraDomain() {
        return extraDomain;
    }

    public void setExtraDomain(List<String> extraDomain) {
        this.extraDomain = extraDomain;
    }
    
    public Integer getBandwidthPackage() {
        return bandwidthPackage;
    }

    public void setBandwidthPackage(Integer bandwidthPackage) {
        this.bandwidthPackage = bandwidthPackage;
    }
    
    public String getForwardRegion() {
        return forwardRegion;
    }

    public void setForwardRegion(String forwardRegion) {
        this.forwardRegion = forwardRegion;
    }
    
    public Object getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(Object domainStatus) {
        this.domainStatus = domainStatus;
    }
    
        }
}









