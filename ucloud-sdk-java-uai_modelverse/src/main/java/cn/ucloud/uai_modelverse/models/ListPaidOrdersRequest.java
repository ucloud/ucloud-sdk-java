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
package cn.ucloud.uai_modelverse.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class ListPaidOrdersRequest extends Request {

    /** 查询开始时间（Unix 时间戳，秒级）。与 `EndTime` 同时提供时启用自定义周期查询；EndTime 必须大于 StartTime */
    @NotEmpty
    @UCloudParam("StartTime")
    private Integer startTime;

    /** 查询结束时间（Unix 时间戳，秒级）。需与 `StartTime` 同时提供 */
    @NotEmpty
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 页码，从1开始 */
    @NotEmpty
    @UCloudParam("Page")
    private Integer page;

    /** 每页数量（最小10，最大100） */
    @NotEmpty
    @UCloudParam("PageSize")
    private Integer pageSize;

    /** 资源ID数组（多选，可选） */
    @UCloudParam("ResourceIds")
    private List<String> resourceIds;

    /** 模型ID数组（多选，可选） */
    @UCloudParam("ModelIds")
    private List<String> modelIds;

    /** 计费单位数组（多选，可选） */
    @UCloudParam("PricingUnits")
    private List<Integer> pricingUnits;

    /** 订单类型数组（多选，可选） */
    @UCloudParam("OrderTypes")
    private List<Integer> orderTypes;

    /** 计费 SKU 列表（可选） */
    @UCloudParam("PricingSkus")
    private List<String> pricingSkus;

    /** 产品类型列表（多选，可选），枚举值：`modelverse`、`sandbox` */
    @UCloudParam("ProductCodes")
    private List<String> productCodes;

    /** 地域列表（多选，可选），参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Regions")
    private List<String> regions;

    /** 组织ID列表（可选） */
    @UCloudParam("OrganizationIds")
    private List<Integer> organizationIds;

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public List<String> getModelIds() {
        return modelIds;
    }

    public void setModelIds(List<String> modelIds) {
        this.modelIds = modelIds;
    }

    public List<Integer> getPricingUnits() {
        return pricingUnits;
    }

    public void setPricingUnits(List<Integer> pricingUnits) {
        this.pricingUnits = pricingUnits;
    }

    public List<Integer> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(List<Integer> orderTypes) {
        this.orderTypes = orderTypes;
    }

    public List<String> getPricingSkus() {
        return pricingSkus;
    }

    public void setPricingSkus(List<String> pricingSkus) {
        this.pricingSkus = pricingSkus;
    }

    public List<String> getProductCodes() {
        return productCodes;
    }

    public void setProductCodes(List<String> productCodes) {
        this.productCodes = productCodes;
    }

    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public List<Integer> getOrganizationIds() {
        return organizationIds;
    }

    public void setOrganizationIds(List<Integer> organizationIds) {
        this.organizationIds = organizationIds;
    }
}
