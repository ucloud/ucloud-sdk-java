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


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class DescribeWafAttackDetailListInfoRequest extends Request {

    /** 项目ID，不填表示默认项目 */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 页面偏移 */
    @NotEmpty
    @UCloudParam("Offset")
    private Integer offset;

    /** 每页数量限制 */
    @NotEmpty
    @UCloudParam("Limit")
    private Integer limit;

    /** 时间单位；可选项：Hour|Day|Week|Month|Custom；默认Hour */
    @UCloudParam("TimeType")
    private String timeType;

    /**
     * 攻击类型["scan", "loopholes", "xss", "cc", "sql", "exec", "webshell", "infoleak", "eaa",
     * "protocol", "other"]
     */
    @UCloudParam("AttackType")
    private String attackType;

    /** 风险级别 */
    @UCloudParam("RiskRank")
    private String riskRank;

    /** 匹配动作，拦截、放行、告警 */
    @UCloudParam("ActionType")
    private String actionType;

    /** 自定义开始时间戳 */
    @UCloudParam("BeginTime")
    private Integer beginTime;

    /** 自定义结束时间戳 */
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 要查询的域名，为空时查询所有 */
    @UCloudParam("FullDomain")
    private String fullDomain;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public String getRiskRank() {
        return riskRank;
    }

    public void setRiskRank(String riskRank) {
        this.riskRank = riskRank;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getFullDomain() {
        return fullDomain;
    }

    public void setFullDomain(String fullDomain) {
        this.fullDomain = fullDomain;
    }
}
