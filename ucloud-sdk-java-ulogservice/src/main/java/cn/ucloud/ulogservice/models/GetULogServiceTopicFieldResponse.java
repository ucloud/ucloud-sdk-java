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
package cn.ucloud.ulogservice.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetULogServiceTopicFieldResponse extends Response {

    /** 索引字段数据，是一个数组 */
    @SerializedName("Data")
    private List<TopicField> data;

    public List<TopicField> getData() {
        return data;
    }

    public void setData(List<TopicField> data) {
        this.data = data;
    }

    public static class TopicField extends Response {

        /** 索引名称 */
        @SerializedName("FieldName")
        private String fieldName;

        /** 索引类型，可取的值有: long, double, text */
        @SerializedName("FieldType")
        private String fieldType;

        /** 是否保留字段，true表示保留字段，false表示非保留字段 */
        @SerializedName("IsReserved")
        private Boolean isReserved;

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
        }

        public String getFieldType() {
            return fieldType;
        }

        public void setFieldType(String fieldType) {
            this.fieldType = fieldType;
        }

        public Boolean getIsReserved() {
            return isReserved;
        }

        public void setIsReserved(Boolean isReserved) {
            this.isReserved = isReserved;
        }
    }
}
