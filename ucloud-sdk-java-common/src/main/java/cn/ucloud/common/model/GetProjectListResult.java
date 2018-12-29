package cn.ucloud.common.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取项目列表  结果类
 * @author: codezhang
 * @date: 2018-11-13 15:20
 **/

public class GetProjectListResult extends BaseResponseResult {

    private class Project {

        /**
         * 创建时间 时间戳
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * 是否是默认的项目
         */
        @SerializedName("IsDefault")
        private Boolean isDefault;

        /**
         * 成员数目
         */
        @SerializedName("MemberCount")
        private Integer memberCount;

        /**
         * 父项目ID
         */
        @SerializedName("ParentId")
        private String parentId;

        /**
         * 父项目名称
         */
        @SerializedName("ParentName")
        private String parentName;


        /**
         * 项目ID
         */
        @SerializedName("ProjectId")
        private String projectId;

        /**
         * 项目名称
         */
        @SerializedName("ProjectName")
        private String projectName;

        /**
         * 资源数目
         */
        @SerializedName("ResourceCount")
        private Integer resourceCount;


        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Boolean getDefault() {
            return isDefault;
        }

        public void setDefault(Boolean aDefault) {
            isDefault = aDefault;
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

        public Integer getResourceCount() {
            return resourceCount;
        }

        public void setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
        }

        @Override
        public String toString() {
            return "Project{" +
                    "createTime=" + createTime +
                    ", isDefault=" + isDefault +
                    ", memberCount=" + memberCount +
                    ", parentId='" + parentId + '\'' +
                    ", parentName='" + parentName + '\'' +
                    ", projectId='" + projectId + '\'' +
                    ", projectName='" + projectName + '\'' +
                    ", resourceCount=" + resourceCount +
                    '}';
        }
    }

    /**
     * 项目列表
     */
    @SerializedName("ProjectSet")
    private List<Project> projectList;

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }
}
