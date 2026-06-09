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
    private List<FilterOptionString> resourceIds;

    /** 模型选项列表 */
    @SerializedName("Models")
    private List<FilterOptionString> models;

    /** 账单维度选项列表 */
    @SerializedName("Dimensions")
    private List<FilterOptionString> dimensions;

    /** 计费单位选项列表 */
    @SerializedName("PricingUnits")
    private List<FilterOptionInteger> pricingUnits;

    /** 地域选项列表 */
    @SerializedName("Regions")
    private List<FilterOptionString> regions;

    /** 产品类型选项列表 */
    @SerializedName("ProductCodes")
    private List<FilterOptionString> productCodes;

    /** 项目选项列表 */
    @SerializedName("Projects")
    private List<FilterOptionInteger> projects;

    /** 计费 SKU 选项列表 */
    @SerializedName("PricingSKUs")
    private List<FilterOptionString> pricingSKUs;

    /** 订单类型选项列表 */
    @SerializedName("OrderTypes")
    private List<FilterOptionInteger> orderTypes;

    public List<FilterOptionString> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<FilterOptionString> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public List<FilterOptionString> getModels() {
        return models;
    }

    public void setModels(List<FilterOptionString> models) {
        this.models = models;
    }

    public List<FilterOptionString> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<FilterOptionString> dimensions) {
        this.dimensions = dimensions;
    }

    public List<FilterOptionInteger> getPricingUnits() {
        return pricingUnits;
    }

    public void setPricingUnits(List<FilterOptionInteger> pricingUnits) {
        this.pricingUnits = pricingUnits;
    }

    public List<FilterOptionString> getRegions() {
        return regions;
    }

    public void setRegions(List<FilterOptionString> regions) {
        this.regions = regions;
    }

    public List<FilterOptionString> getProductCodes() {
        return productCodes;
    }

    public void setProductCodes(List<FilterOptionString> productCodes) {
        this.productCodes = productCodes;
    }

    public List<FilterOptionInteger> getProjects() {
        return projects;
    }

    public void setProjects(List<FilterOptionInteger> projects) {
        this.projects = projects;
    }

    public List<FilterOptionString> getPricingSKUs() {
        return pricingSKUs;
    }

    public void setPricingSKUs(List<FilterOptionString> pricingSKUs) {
        this.pricingSKUs = pricingSKUs;
    }

    public List<FilterOptionInteger> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(List<FilterOptionInteger> orderTypes) {
        this.orderTypes = orderTypes;
    }

    public static class FilterOptionInteger extends Response {

        /** 显示名称 */
        @SerializedName("Name")
        private String name;

        /** 值 */
        @SerializedName("Value")
        private Integer value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

    public static class FilterOptionString extends Response {

        /** 显示名称 */
        @SerializedName("Name")
        private String name;

        /** 值 */
        @SerializedName("Value")
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
