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

public class ListLabelsByResourceIdsResponse extends Response {

    /** 资源标签总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 资源标签数组 */
    @SerializedName("Labels")
    private List<ListLabelsByResourceIdsLabel> labels;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ListLabelsByResourceIdsLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<ListLabelsByResourceIdsLabel> labels) {
        this.labels = labels;
    }

    public static class ListLabelsByResourceIdsLabel extends Response {

        /** 资源id */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 标签键 */
        @SerializedName("Key")
        private String key;

        /** 标签值 */
        @SerializedName("Value")
        private String value;

        /** 标签类型，system：系统标签；custom：自定义标签 */
        @SerializedName("Category")
        private String category;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

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

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }
}
