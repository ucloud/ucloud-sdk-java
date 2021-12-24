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
package cn.ucloud.ipsecvpn.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;

public class CreateVPNTunnelResponse extends Response {

    /** VPN隧道的资源ID: false */
    @SerializedName("VPNTunnelId")
    private String vpnTunnelId;

    public String getVPNTunnelId() {
        return vpnTunnelId;
    }

    public void setVPNTunnelId(String vpnTunnelId) {
        this.vpnTunnelId = vpnTunnelId;
    }
}