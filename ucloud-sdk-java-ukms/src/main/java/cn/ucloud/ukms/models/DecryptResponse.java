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

public class DecryptResponse extends Response {

    /** 解密后的明文，Base64 编码。 */
    @SerializedName("Plaintext")
    private String plaintext;

    /** 密钥资源长 ID。 */
    @SerializedName("KeyId")
    private String keyId;

    /** 实际使用的解密算法。取值：SYMMETRIC_DEFAULT、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256。 */
    @SerializedName("EncryptionAlgorithm")
    private String encryptionAlgorithm;

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }
}
