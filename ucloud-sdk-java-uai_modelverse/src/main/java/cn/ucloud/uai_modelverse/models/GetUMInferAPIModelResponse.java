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

public class GetUMInferAPIModelResponse extends Response {

    /** 模型名称的字符串列表 */
    @SerializedName("Data")
    private List<UMinferAPIModel> data;

    public List<UMinferAPIModel> getData() {
        return data;
    }

    public void setData(List<UMinferAPIModel> data) {
        this.data = data;
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

        /** 币种 */
        @SerializedName("Currency")
        private String currency;

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

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }
    }

    public static class UMinferAPIModel extends Response {

        /** 使用OpenAI接口调用时，填入的 model值 */
        @SerializedName("ServedModelName")
        private String servedModelName;

        /** id */
        @SerializedName("Id")
        private String id;

        /** 名称 */
        @SerializedName("Name")
        private String name;

        /** 描述 */
        @SerializedName("SimpleDescribe")
        private String simpleDescribe;

        /** 语言 */
        @SerializedName("Language")
        private List<String> language;

        /** 图标链接 */
        @SerializedName("Icon")
        private String icon;

        /** 模型价格 */
        @SerializedName("Pricing")
        private Pricing pricing;

        /** 创建时间 */
        @SerializedName("CreateAt")
        private Integer createAt;

        /** 更新时间 */
        @SerializedName("UpdateAt")
        private Integer updateAt;

        public String getServedModelName() {
            return servedModelName;
        }

        public void setServedModelName(String servedModelName) {
            this.servedModelName = servedModelName;
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

        public List<String> getLanguage() {
            return language;
        }

        public void setLanguage(List<String> language) {
            this.language = language;
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
    }
}
