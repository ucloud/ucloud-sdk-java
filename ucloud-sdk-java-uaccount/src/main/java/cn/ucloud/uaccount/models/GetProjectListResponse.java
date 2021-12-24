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
package cn.ucloud.uaccount.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetProjectListResponse extends Response {

    /** 项目总数: false */
    @SerializedName("ProjectCount")
    private Integer projectCount;

    /** JSON格式的项目列表实例: false */
    @SerializedName("ProjectSet")
    private List<ProjectListInfo> projectSet;

    public Integer getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(Integer projectCount) {
        this.projectCount = projectCount;
    }

    public List<ProjectListInfo> getProjectSet() {
        return projectSet;
    }

    public void setProjectSet(List<ProjectListInfo> projectSet) {
        this.projectSet = projectSet;
    }

    public static class ProjectListInfo extends Response {

        /** 项目ID: false */
        @SerializedName("ProjectId")
        private String projectId;

        /** 项目名称: false */
        @SerializedName("ProjectName")
        private String projectName;

        /** 创建时间(Unix时间戳): false */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 是否为默认项目: false */
        @SerializedName("IsDefault")
        private Boolean isDefault;

        /** 项目下资源数量（已废弃，不建议使用）: false */
        @SerializedName("ResourceCount")
        private Integer resourceCount;

        /** 项目下成员数量: false */
        @SerializedName("MemberCount")
        private Integer memberCount;

        /** 父项目ID（已废弃）: false */
        @SerializedName("ParentId")
        private String parentId;

        /** 父项目名称（已废弃）: false */
        @SerializedName("ParentName")
        private String parentName;

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

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Boolean getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
        }

        public Integer getResourceCount() {
            return resourceCount;
        }

        public void setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
        }

        public Integer getMemberCount() {
            return memberCount;
        }

        public void setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public String getParentName() {
            return parentName;
        }

        public void setParentName(String parentName) {
            this.parentName = parentName;
        }
    }
}
