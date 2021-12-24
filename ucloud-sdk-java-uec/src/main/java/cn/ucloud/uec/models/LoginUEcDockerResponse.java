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
package cn.ucloud.uec.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;

public class LoginUEcDockerResponse extends Response {

    /** 返回的token: false */
    @SerializedName("SessionId")
    private String sessionId;

    /** 登录地址: false */
    @SerializedName("Link")
    private String link;

    /** 登录端口: false */
    @SerializedName("LinkPort")
    private Integer linkPort;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getLinkPort() {
        return linkPort;
    }

    public void setLinkPort(Integer linkPort) {
        this.linkPort = linkPort;
    }
}
