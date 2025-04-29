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

public class ListResourcesByLabelsResponse extends Response {

    /** 资源总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 资源列表 */
    @SerializedName("Resources")
    private List<ListResourcesByLabelsResource> resources;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ListResourcesByLabelsResource> getResources() {
        return resources;
    }

    public void setResources(List<ListResourcesByLabelsResource> resources) {
        this.resources = resources;
    }

    public static class ListResourcesByLabelsLabel extends Response {

        /** 标签键 */
        @SerializedName("Key")
        private String key;

        /** 标签值 */
        @SerializedName("Value")
        private String value;

        /** 标签类型，system：系统标签；custom：自定义标签 */
        @SerializedName("Category")
        private String category;

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

    public static class ListResourcesByLabelsResource extends Response {

        /** 项目id */
        @SerializedName("ProjectId")
        private String projectId;

        /** 资源id */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 项目名称 */
        @SerializedName("ProjectName")
        private String projectName;

        /** 资源类型 */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 标签数组 */
        @SerializedName("Labels")
        private List<ListResourcesByLabelsLabel> labels;

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public List<ListResourcesByLabelsLabel> getLabels() {
            return labels;
        }

        public void setLabels(List<ListResourcesByLabelsLabel> labels) {
            this.labels = labels;
        }
    }
}
