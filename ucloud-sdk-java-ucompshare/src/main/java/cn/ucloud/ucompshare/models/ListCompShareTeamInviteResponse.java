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

public class ListCompShareTeamInviteResponse extends Response {

    /** 成员信息列表 */
    @SerializedName("Invites")
    private List<CompShareTeamInviteInfo> invites;

    public List<CompShareTeamInviteInfo> getInvites() {
        return invites;
    }

    public void setInvites(List<CompShareTeamInviteInfo> invites) {
        this.invites = invites;
    }

    public static class CompShareTeamInviteInfo extends Response {

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
    }
}
