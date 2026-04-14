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

public class ListCompShareTeamResponse extends Response {

    /** 团队信息数组 */
    @SerializedName("Teams")
    private List<CompShareTeamInfo> teams;

    public List<CompShareTeamInfo> getTeams() {
        return teams;
    }

    public void setTeams(List<CompShareTeamInfo> teams) {
        this.teams = teams;
    }

    public static class CompShareTeamInfo extends Response {

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

        /** 成员数量 */
        @SerializedName("MemberCount")
        private Integer memberCount;

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

        public Integer getMemberCount() {
            return memberCount;
        }

        public void setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
        }
    }
}
