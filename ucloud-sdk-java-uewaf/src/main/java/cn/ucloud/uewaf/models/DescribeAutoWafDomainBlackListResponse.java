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

public class DescribeAutoWafDomainBlackListResponse extends Response {

    /** 自动拦截策略列表，参考AutoWafDomainBlackList */
    @SerializedName("Rows")
    private List<AutoWafDomainBlackList> rows;

    /** 自动拦截策略数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<AutoWafDomainBlackList> getRows() {
        return rows;
    }

    public void setRows(List<AutoWafDomainBlackList> rows) {
        this.rows = rows;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class AutoWafDomainBlackList extends Response {

        /** 规则ID */
        @SerializedName("Id")
        private Integer id;

        /** 规则所属域名 */
        @SerializedName("FullDomain")
        private String fullDomain;

        /** 攻击类型 */
        @SerializedName("AttackType")
        private String attackType;

        /** 防御模式 */
        @SerializedName("ActionType")
        private String actionType;

        /** 攻击数量 */
        @SerializedName("AttackCount")
        private Integer attackCount;

        /** 攻击统计区间，单位:秒 */
        @SerializedName("IntervalTime")
        private Integer intervalTime;

        /** 攻击过期区间，单位:秒 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 启用状态;1表示启用,0表示禁用 */
        @SerializedName("Enable")
        private Integer enable;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getFullDomain() {
            return fullDomain;
        }

        public void setFullDomain(String fullDomain) {
            this.fullDomain = fullDomain;
        }

        public String getAttackType() {
            return attackType;
        }

        public void setAttackType(String attackType) {
            this.attackType = attackType;
        }

        public String getActionType() {
            return actionType;
        }

        public void setActionType(String actionType) {
            this.actionType = actionType;
        }

        public Integer getAttackCount() {
            return attackCount;
        }

        public void setAttackCount(Integer attackCount) {
            this.attackCount = attackCount;
        }

        public Integer getIntervalTime() {
            return intervalTime;
        }

        public void setIntervalTime(Integer intervalTime) {
            this.intervalTime = intervalTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public Integer getEnable() {
            return enable;
        }

        public void setEnable(Integer enable) {
            this.enable = enable;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }
    }
}
