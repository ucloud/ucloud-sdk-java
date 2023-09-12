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
package cn.ucloud.uewaf.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetWafRegionBlockRuleResponse extends Response {

    /** 规则数量 */
    @SerializedName("Count")
    private Integer count;

    /** 规则列表，参考RegionBlackInfo */
    @SerializedName("RuleList")
    private List<RegionBlackInfo> ruleList;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<RegionBlackInfo> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<RegionBlackInfo> ruleList) {
        this.ruleList = ruleList;
    }

    public static class RegionBlackInfo extends Response {

        /** 规则ID */
        @SerializedName("ID")
        private Integer id;

        /** 规则名称 */
        @SerializedName("Name")
        private String name;

        /** 所属域名 */
        @SerializedName("FullDomain")
        private String fullDomain;

        /** 执行动作 */
        @SerializedName("Action")
        private String action;

        /** 生效区域 */
        @SerializedName("Regions")
        private String regions;

        /** 规则描述 */
        @SerializedName("Description")
        private String description;

        /** 用户ID */
        @SerializedName("TopOrganizationId")
        private Integer topOrganizationId;

        /** 项目ID */
        @SerializedName("OrganizationId")
        private Integer organizationId;

        public Integer getID() {
            return id;
        }

        public void setID(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFullDomain() {
            return fullDomain;
        }

        public void setFullDomain(String fullDomain) {
            this.fullDomain = fullDomain;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getRegions() {
            return regions;
        }

        public void setRegions(String regions) {
            this.regions = regions;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getTopOrganizationId() {
            return topOrganizationId;
        }

        public void setTopOrganizationId(Integer topOrganizationId) {
            this.topOrganizationId = topOrganizationId;
        }

        public Integer getOrganizationId() {
            return organizationId;
        }

        public void setOrganizationId(Integer organizationId) {
            this.organizationId = organizationId;
        }
    }
}
