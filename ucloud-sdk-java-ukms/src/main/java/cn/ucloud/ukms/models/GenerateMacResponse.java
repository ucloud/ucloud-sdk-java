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
package cn.ucloud.ukms.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class GenerateMacResponse extends Response {

    /** 针对指定消息生成的基于哈希的消息认证码 (HMAC)、HMAC KMS 密钥和 MAC 算法。 */
    @SerializedName("Mac")
    private String mac;

    /** 用于生成 HMAC 的 MAC 算法。 */
    @SerializedName("MacAlgorithm")
    private String macAlgorithm;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getMacAlgorithm() {
        return macAlgorithm;
    }

    public void setMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
    }
}
