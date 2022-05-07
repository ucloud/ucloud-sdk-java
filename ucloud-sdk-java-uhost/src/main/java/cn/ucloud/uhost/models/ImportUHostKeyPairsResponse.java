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

public class ImportUHostKeyPairsResponse extends Response {

    /** 密钥对名称 */
    @SerializedName("KeyPairName")
    private String keyPairName;

    /** 密钥对标识 */
    @SerializedName("KeyPairId")
    private String keyPairId;

    /** 密钥对指纹。根据RFC4716定义的公钥指纹格式，采用MD5信息摘要算法。算法处理的具体信息格式：`ProjectIdKeyPairId|PublicKeyBody`。 */
    @SerializedName("KeyPairFingerPrint")
    private String keyPairFingerPrint;

    public String getKeyPairName() {
        return keyPairName;
    }

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    public String getKeyPairId() {
        return keyPairId;
    }

    public void setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
    }

    public String getKeyPairFingerPrint() {
        return keyPairFingerPrint;
    }

    public void setKeyPairFingerPrint(String keyPairFingerPrint) {
        this.keyPairFingerPrint = keyPairFingerPrint;
    }
}
