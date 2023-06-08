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

package cn.ucloud.unet.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeFirewallResponse extends Response {

    
        
    /**
     * 获取的防火墙组详细信息 参见 FirewallDataSet
     */
    @SerializedName("DataSet")
    private List<FirewallDataSet> dataSet;
        
    
        
    /**
     * 防火墙资源数量
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
    public List<FirewallDataSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<FirewallDataSet> dataSet) {
        this.dataSet = dataSet;
    }
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
        public static class FirewallDataSet extends Response {
            
        
    /**
     * 防火墙ID
     */
    @SerializedName("FWId")
    private String fwId;
        
    
        
    /**
     * 安全组ID（即将废弃）
     */
    @SerializedName("GroupId")
    private String groupId;
        
    
        
    /**
     * 防火墙名称
     */
    @SerializedName("Name")
    private String name;
        
    
        
    /**
     * 防火墙业务组
     */
    @SerializedName("Tag")
    private String tag;
        
    
        
    /**
     * 防火墙备注
     */
    @SerializedName("Remark")
    private String remark;
        
    
        
    /**
     * 防火墙绑定资源数量
     */
    @SerializedName("ResourceCount")
    private Integer resourceCount;
        
    
        
    /**
     * 防火墙组创建时间，格式为Unix Timestamp
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 防火墙组类型，枚举值为： "user defined", 用户自定义防火墙； "recommend web", 默认Web防火墙； "recommend non web", 默认非Web防火墙
     */
    @SerializedName("Type")
    private String type;
        
    
        
    /**
     * 防火墙组中的规则列表，参见 FirewallRuleSet
     */
    @SerializedName("Rule")
    private List<FirewallRuleSet> rule;
        
    
    public String getFWId() {
        return fwId;
    }

    public void setFWId(String fwId) {
        this.fwId = fwId;
    }
    
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    public Integer getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public List<FirewallRuleSet> getRule() {
        return rule;
    }

    public void setRule(List<FirewallRuleSet> rule) {
        this.rule = rule;
    }
    
        }
        public static class FirewallRuleSet extends Response {
            
        
    /**
     * 源地址
     */
    @SerializedName("SrcIP")
    private String srcIP;
        
    
        
    /**
     * 优先级
     */
    @SerializedName("Priority")
    private String priority;
        
    
        
    /**
     * 协议类型
     */
    @SerializedName("ProtocolType")
    private String protocolType;
        
    
        
    /**
     * 目标端口
     */
    @SerializedName("DstPort")
    private String dstPort;
        
    
        
    /**
     * 防火墙动作
     */
    @SerializedName("RuleAction")
    private String ruleAction;
        
    
        
    /**
     * 防火墙规则备注
     */
    @SerializedName("Remark")
    private String remark;
        
    
    public String getSrcIP() {
        return srcIP;
    }

    public void setSrcIP(String srcIP) {
        this.srcIP = srcIP;
    }
    
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }
    
    public String getDstPort() {
        return dstPort;
    }

    public void setDstPort(String dstPort) {
        this.dstPort = dstPort;
    }
    
    public String getRuleAction() {
        return ruleAction;
    }

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
        }
}









