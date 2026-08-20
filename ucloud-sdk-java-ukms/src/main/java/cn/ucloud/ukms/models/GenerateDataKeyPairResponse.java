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

public class GenerateDataKeyPairResponse extends Response {

    /** 用于加密私钥的 KMS 密钥 */
    @SerializedName("KeyId")
    private String keyId;

    /** 生成的数据键对类型。 */
    @SerializedName("KeyPairSpec")
    private String keyPairSpec;

    /** 私钥的加密副本。 */
    @SerializedName("PrivateKeyCiphertextBlob")
    private String privateKeyCiphertextBlob;

    /** 私钥的明文副本。 */
    @SerializedName("PrivateKeyPlaintext")
    private String privateKeyPlaintext;

    /** 公钥（明文）。 */
    @SerializedName("DataPublicKey")
    private String dataPublicKey;

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyPairSpec() {
        return keyPairSpec;
    }

    public void setKeyPairSpec(String keyPairSpec) {
        this.keyPairSpec = keyPairSpec;
    }

    public String getPrivateKeyCiphertextBlob() {
        return privateKeyCiphertextBlob;
    }

    public void setPrivateKeyCiphertextBlob(String privateKeyCiphertextBlob) {
        this.privateKeyCiphertextBlob = privateKeyCiphertextBlob;
    }

    public String getPrivateKeyPlaintext() {
        return privateKeyPlaintext;
    }

    public void setPrivateKeyPlaintext(String privateKeyPlaintext) {
        this.privateKeyPlaintext = privateKeyPlaintext;
    }

    public String getDataPublicKey() {
        return dataPublicKey;
    }

    public void setDataPublicKey(String dataPublicKey) {
        this.dataPublicKey = dataPublicKey;
    }
}
