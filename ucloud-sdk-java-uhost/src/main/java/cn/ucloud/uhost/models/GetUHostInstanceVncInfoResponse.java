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
package cn.ucloud.uhost.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GetUHostInstanceVncInfoResponse extends Response {

    /** UHost实例ID */
    @SerializedName("UHostId")
    private String uHostId;

    /** Vnc登录IP */
    @SerializedName("VncIP")
    private String vncIP;

    /** Vnc登录端口 */
    @SerializedName("VncPort")
    private Integer vncPort;

    /** Vnc 登录密码 */
    @SerializedName("VncPassword")
    private String vncPassword;

    public String getUHostId() {
        return uHostId;
    }

    public void setUHostId(String uHostId) {
        this.uHostId = uHostId;
    }

    public String getVncIP() {
        return vncIP;
    }

    public void setVncIP(String vncIP) {
        this.vncIP = vncIP;
    }

    public Integer getVncPort() {
        return vncPort;
    }

    public void setVncPort(Integer vncPort) {
        this.vncPort = vncPort;
    }

    public String getVncPassword() {
        return vncPassword;
    }

    public void setVncPassword(String vncPassword) {
        this.vncPassword = vncPassword;
    }
}
