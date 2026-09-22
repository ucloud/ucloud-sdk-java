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

    public static class ApiProtocols extends Response {

        /** 是否支持chat协议 */
        @SerializedName("ChatCompletions")
        private Boolean chatCompletions;

        /** 是否支持responses协议 */
        @SerializedName("Responses")
        private Boolean responses;

        /** 是否支持gemini协议 */
        @SerializedName("Gemini")
        private Boolean gemini;

        /** 是否支持Anthropic协议 */
        @SerializedName("Anthropic")
        private Boolean anthropic;

        public Boolean getChatCompletions() {
            return chatCompletions;
        }

        public void setChatCompletions(Boolean chatCompletions) {
            this.chatCompletions = chatCompletions;
        }

        public Boolean getResponses() {
            return responses;
        }

        public void setResponses(Boolean responses) {
            this.responses = responses;
        }

        public Boolean getGemini() {
            return gemini;
        }

        public void setGemini(Boolean gemini) {
            this.gemini = gemini;
        }

        public Boolean getAnthropic() {
            return anthropic;
        }

        public void setAnthropic(Boolean anthropic) {
            this.anthropic = anthropic;
        }
    }

    public static class InferenceRegionInfo extends Response {

        /** 地域代码: sg(新加坡)/us(美国)/hk(香港) */
        @SerializedName("RegionCode")
        private String regionCode;

        /** 地域名称: 新加坡/美国/香港 */
        @SerializedName("RegionName")
        private String regionName;

        /** 地域名称(英文): Singapore/United States/Hong Kong */
        @SerializedName("RegionNameEn")
        private String regionNameEn;

        /** 地域模型ID (例如: deepseek-v4-flash-sg) */
        @SerializedName("ModelId")
        private String modelId;

        /** 广场模型ID (umodel-xxx) */
        @SerializedName("SquareModelId")
        private String squareModelId;

        /** 状态: published(已发布)/unpublished(未发布) */
        @SerializedName("Status")
        private String status;

        public String getRegionCode() {
            return regionCode;
        }

        public void setRegionCode(String regionCode) {
            this.regionCode = regionCode;
        }

        public String getRegionName() {
            return regionName;
        }

        public void setRegionName(String regionName) {
            this.regionName = regionName;
        }

        public String getRegionNameEn() {
            return regionNameEn;
        }

        public void setRegionNameEn(String regionNameEn) {
            this.regionNameEn = regionNameEn;
        }

        public String getModelId() {
            return modelId;
        }

        public void setModelId(String modelId) {
            this.modelId = modelId;
        }

        public String getSquareModelId() {
            return squareModelId;
        }

        public void setSquareModelId(String squareModelId) {
            this.squareModelId = squareModelId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    public static class ModelCapabilities extends Response {

        /** 是否支持上下文缓存 */
        @SerializedName("ContextCaching")
        private Boolean contextCaching;

        /** 是否支持批量推理 */
        @SerializedName("BatchInference")
        private Boolean batchInference;

        /** 是否支持结构化输出 */
        @SerializedName("StructuredOutput")
        private Boolean structuredOutput;

        /** 是否支持函数调用 */
        @SerializedName("FunctionCall")
        private Boolean functionCall;

        /** 是否支持联网搜索 */
        @SerializedName("WebSearch")
        private Boolean webSearch;

        /** 是否支持知识库 */
        @SerializedName("KnowledgeBase")
        private Boolean knowledgeBase;

        /** 是否支持MCP */
        @SerializedName("Mcp")
        private Boolean mcp;

        /** 是否支持体验 */
        @SerializedName("Experience")
        private Boolean experience;

        public Boolean getContextCaching() {
            return contextCaching;
        }

        public void setContextCaching(Boolean contextCaching) {
            this.contextCaching = contextCaching;
        }

        public Boolean getBatchInference() {
            return batchInference;
        }

        public void setBatchInference(Boolean batchInference) {
            this.batchInference = batchInference;
        }

        public Boolean getStructuredOutput() {
            return structuredOutput;
        }

        public void setStructuredOutput(Boolean structuredOutput) {
            this.structuredOutput = structuredOutput;
        }

        public Boolean getFunctionCall() {
            return functionCall;
        }

        public void setFunctionCall(Boolean functionCall) {
            this.functionCall = functionCall;
        }

        public Boolean getWebSearch() {
            return webSearch;
        }

        public void setWebSearch(Boolean webSearch) {
            this.webSearch = webSearch;
        }

        public Boolean getKnowledgeBase() {
            return knowledgeBase;
        }

        public void setKnowledgeBase(Boolean knowledgeBase) {
            this.knowledgeBase = knowledgeBase;
        }

        public Boolean getMcp() {
            return mcp;
        }

        public void setMcp(Boolean mcp) {
            this.mcp = mcp;
        }

        public Boolean getExperience() {
            return experience;
        }

        public void setExperience(Boolean experience) {
            this.experience = experience;
        }
    }

    public static class ModelTypeMap extends Response {

        /** 文生文模型，true 表示是文生文模型，下同 */
        @SerializedName("TextGeneration")
        private Boolean textGeneration;

        /** 图生图模型 */
        @SerializedName("ImageToImage")
        private Boolean imageToImage;

        /** 文生图模型 */
        @SerializedName("TextToImage")
        private Boolean textToImage;

        /** 文生视频模型 */
        @SerializedName("TextToVideo")
        private Boolean textToVideo;

        /** 图生视频模型 */
        @SerializedName("ImageToVideo")
        private Boolean imageToVideo;

        /** 海外模型 */
        @SerializedName("Sensitive")
        private Boolean sensitive;

        /** 微调模型 */
        @SerializedName("Inference")
        private Boolean inference;

        public Boolean getTextGeneration() {
            return textGeneration;
        }

        public void setTextGeneration(Boolean textGeneration) {
            this.textGeneration = textGeneration;
        }

        public Boolean getImageToImage() {
            return imageToImage;
        }

        public void setImageToImage(Boolean imageToImage) {
            this.imageToImage = imageToImage;
        }

        public Boolean getTextToImage() {
            return textToImage;
        }

        public void setTextToImage(Boolean textToImage) {
            this.textToImage = textToImage;
        }

        public Boolean getTextToVideo() {
            return textToVideo;
        }

        public void setTextToVideo(Boolean textToVideo) {
            this.textToVideo = textToVideo;
        }

        public Boolean getImageToVideo() {
            return imageToVideo;
        }

        public void setImageToVideo(Boolean imageToVideo) {
            this.imageToVideo = imageToVideo;
        }

        public Boolean getSensitive() {
            return sensitive;
        }

        public void setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
        }

        public Boolean getInference() {
            return inference;
        }

        public void setInference(Boolean inference) {
            this.inference = inference;
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
        private Integer price;

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

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
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

        /** 一级分类 */
        @SerializedName("ModelCategory")
        private String modelCategory;

        /** 二级分类列表 */
        @SerializedName("ModelSubCategories")
        private String modelSubCategories;

        /** 是否关联有可用 batch 模型 */
        @SerializedName("IsHasBatch")
        private Boolean isHasBatch;

        /** 关联的 batch 模型名称 */
        @SerializedName("BatchName")
        private String batchName;

        /** 是否有关联的推理地域模型 */
        @SerializedName("IsHasInferenceRegions")
        private Boolean isHasInferenceRegions;

        /** 推理地域模型列表 */
        @SerializedName("InferenceRegions")
        private List<InferenceRegionInfo> inferenceRegions;

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

        /** 模型长度，单位 token */
        @SerializedName("MaxModelLen")
        private Integer maxModelLen;

        /** 模型长度，单位 K tokens */
        @SerializedName("MaxModelLenNew")
        private Integer maxModelLenNew;

        /** 最大输入token数 */
        @SerializedName("MaxInputTokens")
        private Integer maxInputTokens;

        /** 最大输出token数 */
        @SerializedName("MaxOutputTokens")
        private Integer maxOutputTokens;

        /** 模型类型映射 */
        @SerializedName("ModelTypeMap")
        private ModelTypeMap modelTypeMap;

        /** 模型类型 */
        @SerializedName("ModelType")
        private String modelType;

        /** 模型封面链接 */
        @SerializedName("CoverUrl")
        private String coverUrl;

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

        /** 模型能力详细映射 */
        @SerializedName("Capabilities")
        private ModelCapabilities capabilities;

        /** 模型额外标签 */
        @SerializedName("ExtraModelTags")
        private List<String> extraModelTags;

        /** api协议映射 */
        @SerializedName("ApiProtocols")
        private ApiProtocols apiProtocols;

        /** 输入模态 */
        @SerializedName("InputModalities")
        private List<String> inputModalities;

        /** 输出模态 */
        @SerializedName("OutputModalities")
        private List<String> outputModalities;

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

        public String getModelCategory() {
            return modelCategory;
        }

        public void setModelCategory(String modelCategory) {
            this.modelCategory = modelCategory;
        }

        public String getModelSubCategories() {
            return modelSubCategories;
        }

        public void setModelSubCategories(String modelSubCategories) {
            this.modelSubCategories = modelSubCategories;
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

        public Boolean getIsHasInferenceRegions() {
            return isHasInferenceRegions;
        }

        public void setIsHasInferenceRegions(Boolean isHasInferenceRegions) {
            this.isHasInferenceRegions = isHasInferenceRegions;
        }

        public List<InferenceRegionInfo> getInferenceRegions() {
            return inferenceRegions;
        }

        public void setInferenceRegions(List<InferenceRegionInfo> inferenceRegions) {
            this.inferenceRegions = inferenceRegions;
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

        public Integer getMaxModelLenNew() {
            return maxModelLenNew;
        }

        public void setMaxModelLenNew(Integer maxModelLenNew) {
            this.maxModelLenNew = maxModelLenNew;
        }

        public Integer getMaxInputTokens() {
            return maxInputTokens;
        }

        public void setMaxInputTokens(Integer maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
        }

        public Integer getMaxOutputTokens() {
            return maxOutputTokens;
        }

        public void setMaxOutputTokens(Integer maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
        }

        public ModelTypeMap getModelTypeMap() {
            return modelTypeMap;
        }

        public void setModelTypeMap(ModelTypeMap modelTypeMap) {
            this.modelTypeMap = modelTypeMap;
        }

        public String getModelType() {
            return modelType;
        }

        public void setModelType(String modelType) {
            this.modelType = modelType;
        }

        public String getCoverUrl() {
            return coverUrl;
        }

        public void setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
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

        public ModelCapabilities getCapabilities() {
            return capabilities;
        }

        public void setCapabilities(ModelCapabilities capabilities) {
            this.capabilities = capabilities;
        }

        public List<String> getExtraModelTags() {
            return extraModelTags;
        }

        public void setExtraModelTags(List<String> extraModelTags) {
            this.extraModelTags = extraModelTags;
        }

        public ApiProtocols getApiProtocols() {
            return apiProtocols;
        }

        public void setApiProtocols(ApiProtocols apiProtocols) {
            this.apiProtocols = apiProtocols;
        }

        public List<String> getInputModalities() {
            return inputModalities;
        }

        public void setInputModalities(List<String> inputModalities) {
            this.inputModalities = inputModalities;
        }

        public List<String> getOutputModalities() {
            return outputModalities;
        }

        public void setOutputModalities(List<String> outputModalities) {
            this.outputModalities = outputModalities;
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
