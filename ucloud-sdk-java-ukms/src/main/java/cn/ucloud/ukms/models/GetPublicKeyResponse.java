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

import java.util.List;

public class GetPublicKeyResponse extends Response {

    /** 密钥 ID。 */
    @SerializedName("KeyId")
    private String keyId;

    /** PEM 或 DER 编码的公钥。 */
    @SerializedName("KmsPublicKey")
    private String kmsPublicKey;

    /**
     * 密钥规格。取值：SYMMETRIC_DEFAULT、RSA_2048、RSA_3072、RSA_4096、ECC_NIST_P256、ECC_NIST_P384、ECC_NIST_P521、HMAC_256、HMAC_384、HMAC_512。
     */
    @SerializedName("KeySpec")
    private String keySpec;

    /** 密钥用途。取值：ENCRYPT_DECRYPT、SIGN_VERIFY、GENERATE_VERIFY_MAC、KEY_AGREEMENT。 */
    @SerializedName("KeyUsage")
    private List<String> keyUsage;

    /**
     * 支持的签名算法列表。取值范围：RSASSA_PSS_SHA_256、RSASSA_PSS_SHA_384、RSASSA_PSS_SHA_512、RSASSA_PKCS1_V1_5_SHA_256、RSASSA_PKCS1_V1_5_SHA_384、RSASSA_PKCS1_V1_5_SHA_512、ECDSA_SHA_256、ECDSA_SHA_384、ECDSA_SHA_512。
     */
    @SerializedName("SigningAlgorithms")
    private List<String> signingAlgorithms;

    /** 支持的加密算法列表。取值范围：RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256。 */
    @SerializedName("EncryptionAlgorithms")
    private List<String> encryptionAlgorithms;

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKmsPublicKey() {
        return kmsPublicKey;
    }

    public void setKmsPublicKey(String kmsPublicKey) {
        this.kmsPublicKey = kmsPublicKey;
    }

    public String getKeySpec() {
        return keySpec;
    }

    public void setKeySpec(String keySpec) {
        this.keySpec = keySpec;
    }

    public List<String> getKeyUsage() {
        return keyUsage;
    }

    public void setKeyUsage(List<String> keyUsage) {
        this.keyUsage = keyUsage;
    }

    public List<String> getSigningAlgorithms() {
        return signingAlgorithms;
    }

    public void setSigningAlgorithms(List<String> signingAlgorithms) {
        this.signingAlgorithms = signingAlgorithms;
    }

    public List<String> getEncryptionAlgorithms() {
        return encryptionAlgorithms;
    }

    public void setEncryptionAlgorithms(List<String> encryptionAlgorithms) {
        this.encryptionAlgorithms = encryptionAlgorithms;
    }
}
