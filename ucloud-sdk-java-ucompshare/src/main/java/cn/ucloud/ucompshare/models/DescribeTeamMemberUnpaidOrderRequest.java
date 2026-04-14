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

public class DescribeTeamMemberUnpaidOrderRequest extends Request {

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

    /** 团队虚拟账号ID */
    @NotEmpty
    @UCloudParam("VirtualCompanyId")
    private Integer virtualCompanyId;

    /** 返回数据长度，默认为25，最大100 */
    @UCloudParam("Limit")
    private Integer limit;

    /** 列表起始位置偏移量，默认为0 */
    @UCloudParam("Offset")
    private Integer offset;

    /** 可用区 */
    @UCloudParam("Regions")
    private List<Integer> regions;

    /** 产品类型 */
    @UCloudParam("ResourceTypes")
    private List<Integer> resourceTypes;

    /** 订单类型 */
    @UCloudParam("OrderTypes")
    private List<String> orderTypes;

    /** 付费方式 */
    @UCloudParam("ChargeTypes")
    private List<String> chargeTypes;

    /** 订单状态 */
    @UCloudParam("OrderStates")
    private List<String> orderStates;

    /** 订单号 */
    @UCloudParam("OrderNos")
    private List<String> orderNos;

    /** 资源ID */
    @UCloudParam("ResourceIds")
    private List<String> resourceIds;

    /** 排序参数 */
    @UCloudParam("OrderBy")
    private String orderBy;

    /** 排序方式 */
    @UCloudParam("OrderDir")
    private String orderDir;

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

    public List<Integer> getRegions() {
        return regions;
    }

    public void setRegions(List<Integer> regions) {
        this.regions = regions;
    }

    public List<Integer> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<Integer> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public List<String> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(List<String> orderTypes) {
        this.orderTypes = orderTypes;
    }

    public List<String> getChargeTypes() {
        return chargeTypes;
    }

    public void setChargeTypes(List<String> chargeTypes) {
        this.chargeTypes = chargeTypes;
    }

    public List<String> getOrderStates() {
        return orderStates;
    }

    public void setOrderStates(List<String> orderStates) {
        this.orderStates = orderStates;
    }

    public List<String> getOrderNos() {
        return orderNos;
    }

    public void setOrderNos(List<String> orderNos) {
        this.orderNos = orderNos;
    }

    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderDir() {
        return orderDir;
    }

    public void setOrderDir(String orderDir) {
        this.orderDir = orderDir;
    }
}
