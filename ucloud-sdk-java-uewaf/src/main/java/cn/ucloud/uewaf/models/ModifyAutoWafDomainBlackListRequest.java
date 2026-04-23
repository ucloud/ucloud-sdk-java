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

public class ModifyAutoWafDomainBlackListRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 需要修改的自动拦截规则ID */
    @NotEmpty
    @UCloudParam("ID")
    private Integer id;

    /** 防御的域名，只能选择已添加的域名 */
    @NotEmpty
    @UCloudParam("FullDomain")
    private String fullDomain;

    /**
     * 攻击种类，默认统计所有攻击种类，可选值：all|protocol|xss|sql|loopholes|exec|webshell|eaa|infoleak|scan|cc|other等
     */
    @UCloudParam("AttackType")
    private String attackType;

    /** 检测到攻击后的动作， 默认为forbidden，支持captcha */
    @UCloudParam("ActionType")
    private String actionType;

    /** 规则生效后， 添加黑名单的过期时间，单位分钟， 0 长期有效，默认60分钟 */
    @UCloudParam("ExpireTime")
    private Integer expireTime;

    /** 攻击阈值，默认10个 */
    @UCloudParam("AttackCount")
    private Integer attackCount;

    /** 攻击统计区间，单位秒，默认60秒 */
    @UCloudParam("Interval")
    private Integer interval;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
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

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getAttackCount() {
        return attackCount;
    }

    public void setAttackCount(Integer attackCount) {
        this.attackCount = attackCount;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}
