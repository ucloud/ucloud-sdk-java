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
package cn.ucloud.label.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListLabelsResponse extends Response {

    /** 标签总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 标签数组 */
    @SerializedName("Labels")
    private List<ListLabelsLabel> labels;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ListLabelsLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<ListLabelsLabel> labels) {
        this.labels = labels;
    }

    public static class ListLabelsLabel extends Response {

        /** 标签键 */
        @SerializedName("Key")
        private String key;

        /** 标签值 */
        @SerializedName("Value")
        private String value;

        /** 资源数量 */
        @SerializedName("ResourceCount")
        private Integer resourceCount;

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

        public Integer getResourceCount() {
            return resourceCount;
        }

        public void setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
        }
    }
}
