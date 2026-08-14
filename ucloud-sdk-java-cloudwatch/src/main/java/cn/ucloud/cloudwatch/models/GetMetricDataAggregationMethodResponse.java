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
package cn.ucloud.cloudwatch.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetMetricDataAggregationMethodResponse extends Response {

    /** 获取指标数据聚合方式返回结果 */
    @SerializedName("Data")
    private GetMetricDataAggregationMethodResp data;

    public GetMetricDataAggregationMethodResp getData() {
        return data;
    }

    public void setData(GetMetricDataAggregationMethodResp data) {
        this.data = data;
    }

    public static class GetMetricDataAggregationMethodResp extends Response {

        /** 聚合方式列表 */
        @SerializedName("List")
        private List<MetricDataAggregationMethod> list;

        public List<MetricDataAggregationMethod> getList() {
            return list;
        }

        public void setList(List<MetricDataAggregationMethod> list) {
            this.list = list;
        }
    }

    public static class MetricDataAggregationMethod extends Response {

        /** 标签 */
        @SerializedName("Label")
        private String label;

        /** 值 */
        @SerializedName("Value")
        private String value;

        /** 是否是默认方式 */
        @SerializedName("IsDefault")
        private Boolean isDefault;

        /** 描述 */
        @SerializedName("Description")
        private String description;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Boolean getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
