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

public class GetUFSquareModelPricesResponse extends Response {

    /** 匹配模型的价格信息 */
    @SerializedName("Models")
    private List<ModelPriceGroup> models;

    /** 总条数用于翻页 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<ModelPriceGroup> getModels() {
        return models;
    }

    public void setModels(List<ModelPriceGroup> models) {
        this.models = models;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class ModelPriceGroup extends Response {

        /** 制造商 */
        @SerializedName("Manufacturer")
        private String manufacturer;

        /** 模型名称 */
        @SerializedName("ModelName")
        private String modelName;

        /** ModelId */
        @SerializedName("ModelId")
        private String modelId;

        /** 价格阶梯（有序数组） */
        @SerializedName("Tiers")
        private List<PriceTier> tiers;

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public String getModelId() {
            return modelId;
        }

        public void setModelId(String modelId) {
            this.modelId = modelId;
        }

        public List<PriceTier> getTiers() {
            return tiers;
        }

        public void setTiers(List<PriceTier> tiers) {
            this.tiers = tiers;
        }
    }

    public static class PriceRate extends Response {

        /** 收费项描述英文描述 */
        @SerializedName("ChargeItemDescriptionEn")
        private String chargeItemDescriptionEn;

        /** 货币单位 */
        @SerializedName("Currency")
        private String currency;

        /** 计价单位 */
        @SerializedName("Unit")
        private String unit;

        /** 计价单位英文 */
        @SerializedName("UnitEn")
        private String unitEn;

        /** 收费项：input/output/thinking/tool... */
        @SerializedName("ChargeItem")
        private String chargeItem;

        /** 收费项描述 */
        @SerializedName("ChargeItemDescription")
        private String chargeItemDescription;

        /** 价格 */
        @SerializedName("Price")
        private String price;

        public String getChargeItemDescriptionEn() {
            return chargeItemDescriptionEn;
        }

        public void setChargeItemDescriptionEn(String chargeItemDescriptionEn) {
            this.chargeItemDescriptionEn = chargeItemDescriptionEn;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getUnitEn() {
            return unitEn;
        }

        public void setUnitEn(String unitEn) {
            this.unitEn = unitEn;
        }

        public String getChargeItem() {
            return chargeItem;
        }

        public void setChargeItem(String chargeItem) {
            this.chargeItem = chargeItem;
        }

        public String getChargeItemDescription() {
            return chargeItemDescription;
        }

        public void setChargeItemDescription(String chargeItemDescription) {
            this.chargeItemDescription = chargeItemDescription;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }

    public static class PriceTier extends Response {

        /** 该档位下的收费列表（有序数组） */
        @SerializedName("Rates")
        private List<PriceRate> rates;

        /** 档位描述（例如 "标准上下文 32k"） */
        @SerializedName("DescriptionEn")
        private String descriptionEn;

        /** 档位/条件（例如 "32k"、"128k"） */
        @SerializedName("Condition")
        private String condition;

        /** 档位描述（例如 "标准上下文 32k"） */
        @SerializedName("Description")
        private String description;

        public List<PriceRate> getRates() {
            return rates;
        }

        public void setRates(List<PriceRate> rates) {
            this.rates = rates;
        }

        public String getDescriptionEn() {
            return descriptionEn;
        }

        public void setDescriptionEn(String descriptionEn) {
            this.descriptionEn = descriptionEn;
        }

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
