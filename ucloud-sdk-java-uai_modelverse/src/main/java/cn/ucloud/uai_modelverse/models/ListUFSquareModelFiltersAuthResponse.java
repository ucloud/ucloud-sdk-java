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

public class ListUFSquareModelFiltersAuthResponse extends Response {

    /** 模型类型筛选（一级/二级分类树） */
    @SerializedName("ModalTypes")
    private List<FilterOption> modalTypes;

    /** 厂商选项 */
    @SerializedName("Manufacturers")
    private List<FilterOption> manufacturers;

    /** 最大上下文长度选项 */
    @SerializedName("MaxModelLens")
    private List<FilterOption> maxModelLens;

    /** 能力选项 */
    @SerializedName("Capabilities")
    private List<FilterOption> capabilities;

    /** 输入模态选项 */
    @SerializedName("InputModalities")
    private List<FilterOption> inputModalities;

    /** 输出模态选项 */
    @SerializedName("OutputModalities")
    private List<FilterOption> outputModalities;

    /** API协议选项 */
    @SerializedName("ApiProtocols")
    private List<FilterOption> apiProtocols;

    /** 推理地域选项 */
    @SerializedName("InferenceRegions")
    private List<FilterOption> inferenceRegions;

    /** 模型状态选项 */
    @SerializedName("IsComingOffline")
    private List<FilterOption> isComingOffline;

    public List<FilterOption> getModalTypes() {
        return modalTypes;
    }

    public void setModalTypes(List<FilterOption> modalTypes) {
        this.modalTypes = modalTypes;
    }

    public List<FilterOption> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<FilterOption> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public List<FilterOption> getMaxModelLens() {
        return maxModelLens;
    }

    public void setMaxModelLens(List<FilterOption> maxModelLens) {
        this.maxModelLens = maxModelLens;
    }

    public List<FilterOption> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<FilterOption> capabilities) {
        this.capabilities = capabilities;
    }

    public List<FilterOption> getInputModalities() {
        return inputModalities;
    }

    public void setInputModalities(List<FilterOption> inputModalities) {
        this.inputModalities = inputModalities;
    }

    public List<FilterOption> getOutputModalities() {
        return outputModalities;
    }

    public void setOutputModalities(List<FilterOption> outputModalities) {
        this.outputModalities = outputModalities;
    }

    public List<FilterOption> getApiProtocols() {
        return apiProtocols;
    }

    public void setApiProtocols(List<FilterOption> apiProtocols) {
        this.apiProtocols = apiProtocols;
    }

    public List<FilterOption> getInferenceRegions() {
        return inferenceRegions;
    }

    public void setInferenceRegions(List<FilterOption> inferenceRegions) {
        this.inferenceRegions = inferenceRegions;
    }

    public List<FilterOption> getIsComingOffline() {
        return isComingOffline;
    }

    public void setIsComingOffline(List<FilterOption> isComingOffline) {
        this.isComingOffline = isComingOffline;
    }

    public static class FilterOption extends Response {

        /** */
        @SerializedName("Children")
        private String children;

        /** 显示标签 */
        @SerializedName("Label")
        private String label;

        /** 英文标签 */
        @SerializedName("LabelEn")
        private String labelEn;

        /** 枚举值 */
        @SerializedName("Value")
        private String value;

        public String getChildren() {
            return children;
        }

        public void setChildren(String children) {
            this.children = children;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getLabelEn() {
            return labelEn;
        }

        public void setLabelEn(String labelEn) {
            this.labelEn = labelEn;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
