/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class DescribeTeamMemberUnpaidOrderCountRequest extends Request {

    /** 起始时间，需使用时间戳 */
    @NotEmpty
    @UCloudParam("BeginTime")
    private Integer beginTime;

    /** 结束时间，需使用时间戳，结束时间需大于起始时间 */
    @NotEmpty
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 团队ID */
    @NotEmpty
    @UCloudParam("TeamId")
    private Integer teamId;

    /** 虚拟账号公司ID */
    @NotEmpty
    @UCloudParam("VirtualCompanyId")
    private Integer virtualCompanyId;

    /** 组织ID */
    @UCloudParam("OrganizationId")
    private Integer organizationId;

    /** 资源ID */
    @UCloudParam("ResourceIds")
    private String resourceIds;

    /** 产品类型 */
    @UCloudParam("ResourceTypes")
    private Integer resourceTypes;

    /** 订单类型 */
    @UCloudParam("OrderTypes")
    private List<String> orderTypes;

    /** 订单状态 */
    @UCloudParam("OrderStates")
    private List<String> orderStates;

    /** 付费方式 */
    @UCloudParam("ChargeTypes")
    private List<String> chargeTypes;

    /** 可用区 */
    @UCloudParam("Regions")
    private List<Integer> regions;

    /** 交易流水号 */
    @UCloudParam("TransactionNos")
    private List<String> transactionNos;

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getVirtualCompanyId() {
        return virtualCompanyId;
    }

    public void setVirtualCompanyId(Integer virtualCompanyId) {
        this.virtualCompanyId = virtualCompanyId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
    }

    public Integer getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(Integer resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public List<String> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(List<String> orderTypes) {
        this.orderTypes = orderTypes;
    }

    public List<String> getOrderStates() {
        return orderStates;
    }

    public void setOrderStates(List<String> orderStates) {
        this.orderStates = orderStates;
    }

    public List<String> getChargeTypes() {
        return chargeTypes;
    }

    public void setChargeTypes(List<String> chargeTypes) {
        this.chargeTypes = chargeTypes;
    }

    public List<Integer> getRegions() {
        return regions;
    }

    public void setRegions(List<Integer> regions) {
        this.regions = regions;
    }

    public List<String> getTransactionNos() {
        return transactionNos;
    }

    public void setTransactionNos(List<String> transactionNos) {
        this.transactionNos = transactionNos;
    }
}
