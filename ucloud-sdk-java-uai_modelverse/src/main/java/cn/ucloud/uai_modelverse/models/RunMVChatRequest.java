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
package cn.ucloud.uai_modelverse.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class RunMVChatRequest extends Request {

    /**
     * 按时间从老到新传输对话列表集合，需要与Content一一对应 Role为本条信息作者的角色，枚举值为user 或 assistant - user 指用户角色输入的信息 -
     * assistant 指模型返回的信息
     */
    @NotEmpty
    @UCloudParam("Role")
    private List<String> role;

    /** 按时间从老到新传输对话列表集合，需要与Role一一对应 Content为本条信息的具体内容 */
    @NotEmpty
    @UCloudParam("Content")
    private List<String> content;

    /** 应用 ID */
    @NotEmpty
    @UCloudParam("AppID")
    private String appID;

    /** 会话 ID (不填写默认创建新会话) */
    @UCloudParam("SessionID")
    private Integer sessionID;

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public Integer getSessionID() {
        return sessionID;
    }

    public void setSessionID(Integer sessionID) {
        this.sessionID = sessionID;
    }
}
