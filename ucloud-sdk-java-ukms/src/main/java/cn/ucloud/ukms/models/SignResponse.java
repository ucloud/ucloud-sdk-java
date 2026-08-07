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

public class SignResponse extends Response {

    /** 签名结果，Base64 编码。 */
    @SerializedName("SignatureResult")
    private String signatureResult;

    /** 密钥资源长 ID。 */
    @SerializedName("KeyId")
    private String keyId;

    /**
     * 实际使用的签名算法。取值：RSASSA_PSS_SHA_256、RSASSA_PSS_SHA_384、RSASSA_PSS_SHA_512、RSASSA_PKCS1_V1_5_SHA_256、RSASSA_PKCS1_V1_5_SHA_384、RSASSA_PKCS1_V1_5_SHA_512、ECDSA_SHA_256、ECDSA_SHA_384、ECDSA_SHA_512。
     */
    @SerializedName("SigningAlgorithm")
    private String signingAlgorithm;

    public String getSignatureResult() {
        return signatureResult;
    }

    public void setSignatureResult(String signatureResult) {
        this.signatureResult = signatureResult;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getSigningAlgorithm() {
        return signingAlgorithm;
    }

    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }
}
