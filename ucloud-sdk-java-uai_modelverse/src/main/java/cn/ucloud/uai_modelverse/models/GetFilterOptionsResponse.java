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

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetFilterOptionsResponse extends Response {

    /** 资源选项列表 */
    @SerializedName("ResourceIds")
    private List<FilterOptionAiBill> resourceIds;

    /** 模型选项列表 */
    @SerializedName("Models")
    private List<FilterOptionAiBill> models;

    /** 账单维度选项列表 */
    @SerializedName("Dimensions")
    private List<FilterOptionAiBill> dimensions;

    /** 计费单位选项列表 */
    @SerializedName("PricingUnits")
    private List<FilterOptionAiBill> pricingUnits;

    /** 地域选项列表 */
    @SerializedName("Regions")
    private List<FilterOptionAiBill> regions;

    /** 产品类型选项列表 */
    @SerializedName("ProductCodes")
    private List<FilterOptionAiBill> productCodes;

    /** 项目选项列表 */
    @SerializedName("Projects")
    private List<FilterOptionAiBill> projects;

    /** 计费 SKU 选项列表 */
    @SerializedName("PricingSKUs")
    private List<FilterOptionAiBill> pricingSKUs;

    /** 订单类型选项列表 */
    @SerializedName("OrderTypes")
    private List<FilterOptionAiBill> orderTypes;

    public List<FilterOptionAiBill> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<FilterOptionAiBill> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public List<FilterOptionAiBill> getModels() {
        return models;
    }

    public void setModels(List<FilterOptionAiBill> models) {
        this.models = models;
    }

    public List<FilterOptionAiBill> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<FilterOptionAiBill> dimensions) {
        this.dimensions = dimensions;
    }

    public List<FilterOptionAiBill> getPricingUnits() {
        return pricingUnits;
    }

    public void setPricingUnits(List<FilterOptionAiBill> pricingUnits) {
        this.pricingUnits = pricingUnits;
    }

    public List<FilterOptionAiBill> getRegions() {
        return regions;
    }

    public void setRegions(List<FilterOptionAiBill> regions) {
        this.regions = regions;
    }

    public List<FilterOptionAiBill> getProductCodes() {
        return productCodes;
    }

    public void setProductCodes(List<FilterOptionAiBill> productCodes) {
        this.productCodes = productCodes;
    }

    public List<FilterOptionAiBill> getProjects() {
        return projects;
    }

    public void setProjects(List<FilterOptionAiBill> projects) {
        this.projects = projects;
    }

    public List<FilterOptionAiBill> getPricingSKUs() {
        return pricingSKUs;
    }

    public void setPricingSKUs(List<FilterOptionAiBill> pricingSKUs) {
        this.pricingSKUs = pricingSKUs;
    }

    public List<FilterOptionAiBill> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(List<FilterOptionAiBill> orderTypes) {
        this.orderTypes = orderTypes;
    }

    public static class FilterOptionAiBill extends Response {

        /** 显示名称 */
        @SerializedName("Name")
        private String name;

        /** 值实际是interface */
        @SerializedName("Value")
        private Object value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }
}
