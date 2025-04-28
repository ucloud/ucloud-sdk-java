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

public class ListProjectsByLabelsResponse extends Response {

    /** 项目列表 */
    @SerializedName("Projects")
    private List<ListProjectsByLabelsProject> projects;

    public List<ListProjectsByLabelsProject> getProjects() {
        return projects;
    }

    public void setProjects(List<ListProjectsByLabelsProject> projects) {
        this.projects = projects;
    }

    public static class ListProjectsByLabelsProject extends Response {

        /** 项目id */
        @SerializedName("ProjectId")
        private String projectId;

        /** 项目名称 */
        @SerializedName("ProjectName")
        private String projectName;

        /** 资源类型列表 */
        @SerializedName("ResourceTypes")
        private List<String> resourceTypes;

        /** 禁用的资源类型列表 */
        @SerializedName("DisabledResourceTypes")
        private List<String> disabledResourceTypes;

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }

        public List<String> getResourceTypes() {
            return resourceTypes;
        }

        public void setResourceTypes(List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
        }

        public List<String> getDisabledResourceTypes() {
            return disabledResourceTypes;
        }

        public void setDisabledResourceTypes(List<String> disabledResourceTypes) {
            this.disabledResourceTypes = disabledResourceTypes;
        }
    }
}
