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

package cn.ucloud.ubill.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class ListUBillDetailRequest extends Request {

    
        
    /**
     * 账期，YYYY-MM，比如2021-08，只支持2018-05之后的查询
     */
    @NotEmpty
    @UCloudParam("BillingCycle")
    private String billingCycle;
        
    
        
    /**
     * 项目名称 (筛选项, 默认全部)	
     */
    @UCloudParam("ProjectName")
    private String projectName;
        
    
        
    /**
     * 资源ID(筛选项, 默认全部)	
支持多筛选，多筛选请在请求参数中添加多个字段
例
ResourceIds.0: uhost-bzgf1gh5，
ResourceIds.1: uhost-gu1xpspa，

     */
    @UCloudParam("ResourceIds")
    private List<String> resourceIds;
        
    
        
    /**
     * 订单类型 (筛选项, 默认全部) 。枚举值：\\ > OT_BUY:新购 \\ > OT_RENEW:续费 \\ > OT_UPGRADE:升级 \\ > OT_DOWNGRADE:降级 \\ > OT_SUSPEND:结算 \\ > OT_ADDITIONAL:补单 \\ > OT_REFUND:删除 \\ > OT_POSTPAID_RENEW:过期 \\ > OT_POSTPAID_PAYMENT:后付费 \\ > OT_RECOVER:删除恢复 
     */
    @UCloudParam("OrderType")
    private String orderType;
        
    
        
    /**
     * 计费方式 (筛选项, 默认全部)。枚举值：\\ > Year:按年\\ > Month:按月 \\ > Day:按天 \\ > Dynamic:按时  \\ > Used:按量 \\ > Donate:赠送 \\ > Trial:试用  \\ > Post:后付费  \\ > Spot:抢占式
     */
    @UCloudParam("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 是否显示0元订单 (0 不显示, 1 显示, 默认0)
     */
    @UCloudParam("ShowZero")
    private Integer showZero;
        
    
        
    /**
     * 支付状态 (筛选项, 1:仅显示未支付订单; 2:仅显示已支付订单; 0:两者都显示)	
     */
    @UCloudParam("PaidState")
    private Integer paidState;
        
    
        
    /**
     * 用户邮箱，可以根据用户邮箱来进行筛选
     */
    @UCloudParam("UserEmail")
    private String userEmail;
        
    
        
    /**
     * 每页数量，默认值25，最大值：100。
     */
    @UCloudParam("Limit")
    private Integer limit;
        
    
        
    /**
     * 数据偏移量 (默认0)	
     */
    @UCloudParam("Offset")
    private Integer offset;
        
    
        
    /**
     * 产品类型 (筛选项, 默认全部),
支持多筛选，多筛选请在请求参数中添加多个字段。枚举值：\\ > uhost:云主机 \\ > udisk:普通云硬盘 \\ > udb:云数据库 \\ > eip:弹性IP \\ > ufile:对象存储 \\ > fortress_host:堡垒机 \\ > ufs:文件存储 \\ > waf:WEB应用防火墙 \\ > ues:弹性搜索 \\ > udisk_ssd:SSD云硬盘 \\ > rssd:RSSD云硬盘
     */
    @UCloudParam("ResourceTypes")
    private List<String> resourceTypes;
        
    
    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }
    
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }
    
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
    
    public Integer getShowZero() {
        return showZero;
    }

    public void setShowZero(Integer showZero) {
        this.showZero = showZero;
    }
    
    public Integer getPaidState() {
        return paidState;
    }

    public void setPaidState(Integer paidState) {
        this.paidState = paidState;
    }
    
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    
    public List<String> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }
    
}









