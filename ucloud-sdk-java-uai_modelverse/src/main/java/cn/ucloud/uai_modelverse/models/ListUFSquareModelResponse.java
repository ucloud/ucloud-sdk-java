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

public class ListUFSquareModelResponse extends Response {

    /** 总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 广场模型 */
    @SerializedName("SquareModels")
    private List<SquareModel> squareModels;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<SquareModel> getSquareModels() {
        return squareModels;
    }

    public void setSquareModels(List<SquareModel> squareModels) {
        this.squareModels = squareModels;
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

    public static class Pricing extends Response {

        /** 输出定价 */
        @SerializedName("Completion")
        private Double completion;

        /** 提示词定价 */
        @SerializedName("Prompt")
        private Double prompt;

        /** 生图定价 */
        @SerializedName("Image")
        private Double image;

        /** 生视频定价 */
        @SerializedName("Video")
        private String video;

        /** 币种 */
        @SerializedName("Currency")
        private String currency;

        /** 单位（中文），如“次” “百万” */
        @SerializedName("Unit")
        private String unit;

        /** 单位（English），如“Time” “Million” */
        @SerializedName("UnitEn")
        private String unitEn;

        public Double getCompletion() {
            return completion;
        }

        public void setCompletion(Double completion) {
            this.completion = completion;
        }

        public Double getPrompt() {
            return prompt;
        }

        public void setPrompt(Double prompt) {
            this.prompt = prompt;
        }

        public Double getImage() {
            return image;
        }

        public void setImage(Double image) {
            this.image = image;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
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
    }

    public static class SquareModel extends Response {

        /** 关联的 batch 模型广场id */
        @SerializedName("BatchSquareModelId")
        private String batchSquareModelId;

        /** 是否关联有可用 batch 模型 */
        @SerializedName("IsHasBatch")
        private Boolean isHasBatch;

        /** 关联的 batch 模型名称 */
        @SerializedName("BatchName")
        private String batchName;

        /** 制造商 */
        @SerializedName("Manufacturer")
        private String manufacturer;

        /** 主键 */
        @SerializedName("Id")
        private String id;

        /** 名称 */
        @SerializedName("Name")
        private String name;

        /** 简要描述 */
        @SerializedName("SimpleDescribe")
        private String simpleDescribe;

        /** 详细描述 */
        @SerializedName("Describe")
        private String describe;

        /** 语言 */
        @SerializedName("Language")
        private List<String> language;

        /** 模型长度 */
        @SerializedName("MaxModelLen")
        private Integer maxModelLen;

        /** 模型类型 */
        @SerializedName("ModelType")
        private String modelType;

        /** HuggingFace 更新时间 */
        @SerializedName("HfUpdateTime")
        private Integer hfUpdateTime;

        /** 创建时间 */
        @SerializedName("CreateAt")
        private Integer createAt;

        /** 更新时间 */
        @SerializedName("UpdateAt")
        private Integer updateAt;

        /** 模型能力 */
        @SerializedName("SupportedCapabilities")
        private List<String> supportedCapabilities;

        /** 图标 */
        @SerializedName("Icon")
        private String icon;

        /** 定价策略 */
        @SerializedName("Pricing")
        private Pricing pricing;

        /** 价格阶梯（有序数组） */
        @SerializedName("Tiers")
        private List<PriceTier> tiers;

        public String getBatchSquareModelId() {
            return batchSquareModelId;
        }

        public void setBatchSquareModelId(String batchSquareModelId) {
            this.batchSquareModelId = batchSquareModelId;
        }

        public Boolean getIsHasBatch() {
            return isHasBatch;
        }

        public void setIsHasBatch(Boolean isHasBatch) {
            this.isHasBatch = isHasBatch;
        }

        public String getBatchName() {
            return batchName;
        }

        public void setBatchName(String batchName) {
            this.batchName = batchName;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSimpleDescribe() {
            return simpleDescribe;
        }

        public void setSimpleDescribe(String simpleDescribe) {
            this.simpleDescribe = simpleDescribe;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }

        public List<String> getLanguage() {
            return language;
        }

        public void setLanguage(List<String> language) {
            this.language = language;
        }

        public Integer getMaxModelLen() {
            return maxModelLen;
        }

        public void setMaxModelLen(Integer maxModelLen) {
            this.maxModelLen = maxModelLen;
        }

        public String getModelType() {
            return modelType;
        }

        public void setModelType(String modelType) {
            this.modelType = modelType;
        }

        public Integer getHfUpdateTime() {
            return hfUpdateTime;
        }

        public void setHfUpdateTime(Integer hfUpdateTime) {
            this.hfUpdateTime = hfUpdateTime;
        }

        public Integer getCreateAt() {
            return createAt;
        }

        public void setCreateAt(Integer createAt) {
            this.createAt = createAt;
        }

        public Integer getUpdateAt() {
            return updateAt;
        }

        public void setUpdateAt(Integer updateAt) {
            this.updateAt = updateAt;
        }

        public List<String> getSupportedCapabilities() {
            return supportedCapabilities;
        }

        public void setSupportedCapabilities(List<String> supportedCapabilities) {
            this.supportedCapabilities = supportedCapabilities;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public Pricing getPricing() {
            return pricing;
        }

        public void setPricing(Pricing pricing) {
            this.pricing = pricing;
        }

        public List<PriceTier> getTiers() {
            return tiers;
        }

        public void setTiers(List<PriceTier> tiers) {
            this.tiers = tiers;
        }
    }
}
