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
package cn.ucloud.upgsql.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUPgSQLParamTemplateResponse extends Response {

    /** 参数列表 */
    @SerializedName("Data")
    private List<Param> data;

    public List<Param> getData() {
        return data;
    }

    public void setData(List<Param> data) {
        this.data = data;
    }

    public static class Param extends Response {

        /** 参数Key */
        @SerializedName("Key")
        private String key;

        /** 参数值 */
        @SerializedName("Value")
        private String value;

        /** 值类型 */
        @SerializedName("ValueType")
        private Integer valueType;

        /** 允许的值 */
        @SerializedName("AllowedVal")
        private String allowedVal;

        /** 允许类型 */
        @SerializedName("ApplyType")
        private Integer applyType;

        /** 是否可以修改 */
        @SerializedName("Modifiable")
        private Boolean modifiable;

        /** 参数格式类型 */
        @SerializedName("FormatType")
        private Integer formatType;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Integer getValueType() {
            return valueType;
        }

        public void setValueType(Integer valueType) {
            this.valueType = valueType;
        }

        public String getAllowedVal() {
            return allowedVal;
        }

        public void setAllowedVal(String allowedVal) {
            this.allowedVal = allowedVal;
        }

        public Integer getApplyType() {
            return applyType;
        }

        public void setApplyType(Integer applyType) {
            this.applyType = applyType;
        }

        public Boolean getModifiable() {
            return modifiable;
        }

        public void setModifiable(Boolean modifiable) {
            this.modifiable = modifiable;
        }

        public Integer getFormatType() {
            return formatType;
        }

        public void setFormatType(Integer formatType) {
            this.formatType = formatType;
        }
    }
}
