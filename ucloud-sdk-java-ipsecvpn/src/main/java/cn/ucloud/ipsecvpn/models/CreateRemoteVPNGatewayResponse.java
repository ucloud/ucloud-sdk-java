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

public class CreateRemoteVPNGatewayResponse extends Response {

    /** 新建客户VPN网关的资源ID */
    @SerializedName("RemoteVPNGatewayId")
    private String remoteVPNGatewayId;

    public String getRemoteVPNGatewayId() {
        return remoteVPNGatewayId;
    }

    public void setRemoteVPNGatewayId(String remoteVPNGatewayId) {
        this.remoteVPNGatewayId = remoteVPNGatewayId;
    }
}
