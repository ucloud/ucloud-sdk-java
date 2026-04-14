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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetCompShareTeamInfoResponse extends Response {

    /** 团队信息 */
    @SerializedName("Team")
    private CompShareTeamDetailInfo team;

    /** 团队关系数组 */
    @SerializedName("TeamRelation")
    private List<TeamRelation> teamRelation;

    public CompShareTeamDetailInfo getTeam() {
        return team;
    }

    public void setTeam(CompShareTeamDetailInfo team) {
        this.team = team;
    }

    public List<TeamRelation> getTeamRelation() {
        return teamRelation;
    }

    public void setTeamRelation(List<TeamRelation> teamRelation) {
        this.teamRelation = teamRelation;
    }

    public static class CompShareTeamDetailInfo extends Response {

        /** 团队Id */
        @SerializedName("Id")
        private Integer id;

        /** 团队名称 */
        @SerializedName("Name")
        private String name;

        /** 管理者公司Id */
        @SerializedName("CompanyId")
        private Integer companyId;

        /** 团队简介 */
        @SerializedName("Description")
        private String description;

        /** 删除状态 0: 未删除 1: 已删除 */
        @SerializedName("Deleted")
        private Integer deleted;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCompanyId() {
            return companyId;
        }

        public void setCompanyId(Integer companyId) {
            this.companyId = companyId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getDeleted() {
            return deleted;
        }

        public void setDeleted(Integer deleted) {
            this.deleted = deleted;
        }
    }

    public static class TeamRelation extends Response {

        /** 团队ID */
        @SerializedName("TeamId")
        private Integer teamId;

        /** 团队名称 */
        @SerializedName("TeamName")
        private String teamName;

        /** 成员公司Id */
        @SerializedName("UserCompanyId")
        private Integer userCompanyId;

        /** 虚拟账号公司Id */
        @SerializedName("VirtualCompanyId")
        private Integer virtualCompanyId;

        /** 邀请状态：Pending（待同意）、Joined（已加入）、Rejected（拒绝）、Canceled（取消） */
        @SerializedName("Status")
        private String status;

        /** 备注名称 */
        @SerializedName("RemarkName")
        private String remarkName;

        /** 邀请时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 已分配金额 */
        @SerializedName("AllocateAmount")
        private Integer allocateAmount;

        /** 余额 */
        @SerializedName("AvailableAmount")
        private Integer availableAmount;

        public Integer getTeamId() {
            return teamId;
        }

        public void setTeamId(Integer teamId) {
            this.teamId = teamId;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public Integer getUserCompanyId() {
            return userCompanyId;
        }

        public void setUserCompanyId(Integer userCompanyId) {
            this.userCompanyId = userCompanyId;
        }

        public Integer getVirtualCompanyId() {
            return virtualCompanyId;
        }

        public void setVirtualCompanyId(Integer virtualCompanyId) {
            this.virtualCompanyId = virtualCompanyId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getRemarkName() {
            return remarkName;
        }

        public void setRemarkName(String remarkName) {
            this.remarkName = remarkName;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getAllocateAmount() {
            return allocateAmount;
        }

        public void setAllocateAmount(Integer allocateAmount) {
            this.allocateAmount = allocateAmount;
        }

        public Integer getAvailableAmount() {
            return availableAmount;
        }

        public void setAvailableAmount(Integer availableAmount) {
            this.availableAmount = availableAmount;
        }
    }
}
