/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.ipsecvpn.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class CreateRemoteVPNGatewayResponse extends Response {

    
        
    /**
     * 新建客户VPN网关的资源ID
     */
    @SerializedName("RemoteVPNGatewayId")
    private String remoteVPNGatewayId;
        
    
    public String getRemoteVPNGatewayId() {
        return remoteVPNGatewayId;
    }

    public void setRemoteVPNGatewayId(String remoteVPNGatewayId) {
        this.remoteVPNGatewayId = remoteVPNGatewayId;
    }
    
}









