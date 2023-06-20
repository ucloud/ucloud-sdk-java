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
package cn.ucloud.udi.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeMediaFunctionsResponse extends Response {

    /** 功能列表 */
    @SerializedName("Functions")
    private List<Function> functions;

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

    public static class Function extends Response {

        /** */
        @SerializedName("FunctionName")
        private String functionName;

        /** */
        @SerializedName("DisplayName")
        private String displayName;

        /** */
        @SerializedName("InputType")
        private String inputType;

        /** */
        @SerializedName("OutputType")
        private String outputType;

        /** */
        @SerializedName("SupportParams")
        private List<ParamOption> supportParams;

        public String getFunctionName() {
            return functionName;
        }

        public void setFunctionName(String functionName) {
            this.functionName = functionName;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getInputType() {
            return inputType;
        }

        public void setInputType(String inputType) {
            this.inputType = inputType;
        }

        public String getOutputType() {
            return outputType;
        }

        public void setOutputType(String outputType) {
            this.outputType = outputType;
        }

        public List<ParamOption> getSupportParams() {
            return supportParams;
        }

        public void setSupportParams(List<ParamOption> supportParams) {
            this.supportParams = supportParams;
        }
    }

    public static class ParamCustom extends Response {

        /** */
        @SerializedName("ParamName")
        private String paramName;

        /** */
        @SerializedName("ParamType")
        private String paramType;

        /** */
        @SerializedName("Max")
        private Integer max;

        /** */
        @SerializedName("Min")
        private Integer min;

        public String getParamName() {
            return paramName;
        }

        public void setParamName(String paramName) {
            this.paramName = paramName;
        }

        public String getParamType() {
            return paramType;
        }

        public void setParamType(String paramType) {
            this.paramType = paramType;
        }

        public Integer getMax() {
            return max;
        }

        public void setMax(Integer max) {
            this.max = max;
        }

        public Integer getMin() {
            return min;
        }

        public void setMin(Integer min) {
            this.min = min;
        }
    }

    public static class ParamOption extends Response {

        /** */
        @SerializedName("DisplayName")
        private String displayName;

        /** */
        @SerializedName("ParamName")
        private String paramName;

        /** */
        @SerializedName("OptionalValues")
        private List<String> optionalValues;

        /** */
        @SerializedName("Required")
        private Boolean required;

        /** */
        @SerializedName("WhenValueCustom")
        private List<ParamCustom> whenValueCustom;

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getParamName() {
            return paramName;
        }

        public void setParamName(String paramName) {
            this.paramName = paramName;
        }

        public List<String> getOptionalValues() {
            return optionalValues;
        }

        public void setOptionalValues(List<String> optionalValues) {
            this.optionalValues = optionalValues;
        }

        public Boolean getRequired() {
            return required;
        }

        public void setRequired(Boolean required) {
            this.required = required;
        }

        public List<ParamCustom> getWhenValueCustom() {
            return whenValueCustom;
        }

        public void setWhenValueCustom(List<ParamCustom> whenValueCustom) {
            this.whenValueCustom = whenValueCustom;
        }
    }
}
