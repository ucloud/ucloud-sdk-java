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
package cn.ucloud.sts.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class AssumeRoleRequest extends Request {

    /** 要扮演的 IAM 角色URN。 */
    @NotEmpty
    @UCloudParam("RoleUrn")
    private String roleUrn;

    /** 角色会话名称。格式允许 字母、数字、下划线（_）、连字符（-）、英文（.）组成的 1-64 位字符。 */
    @NotEmpty
    @UCloudParam("RoleSessionName")
    private String roleSessionName;

    /** Token有效期，单位：秒。最小值 900，最大值受限于角色配置的最大会话时间。 */
    @UCloudParam("DurationSeconds")
    private Integer durationSeconds;

    /** 为STS Token额外添加的一个权限策略，进一步限制STS Token的权限。 */
    @UCloudParam("Policy")
    private String policy;

    public String getRoleUrn() {
        return roleUrn;
    }

    public void setRoleUrn(String roleUrn) {
        this.roleUrn = roleUrn;
    }

    public String getRoleSessionName() {
        return roleSessionName;
    }

    public void setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
    }

    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }
}
