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
package cn.ucloud.ulb.models;


import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;

public class CreateULBResponse extends Response {

    /** 负载均衡实例的Id */
    @SerializedName("ULBId")
    private String ulbId;

    /** IPv6地址Id */
    @SerializedName("IPv6AddressId")
    private String iPv6AddressId;

    public String getULBId() {
        return ulbId;
    }

    public void setULBId(String ulbId) {
        this.ulbId = ulbId;
    }

    public String getIPv6AddressId() {
        return iPv6AddressId;
    }

    public void setIPv6AddressId(String iPv6AddressId) {
        this.iPv6AddressId = iPv6AddressId;
    }
}
