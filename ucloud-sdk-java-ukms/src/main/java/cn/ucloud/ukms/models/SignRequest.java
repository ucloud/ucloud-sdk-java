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


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class SignRequest extends Request {

    /** 地域。参见地域和可用区列表。 */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子账号必须填写。 */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 密钥资源长 ID、ARN 或别名。 */
    @NotEmpty
    @UCloudParam("KeyId")
    private String keyId;

    /** 待签名消息，Base64 编码，最大 4096 字节。 */
    @NotEmpty
    @UCloudParam("SigningMessage")
    private String signingMessage;

    /**
     * 签名算法。可选值：RSASSA_PSS_SHA_256、RSASSA_PSS_SHA_384、RSASSA_PSS_SHA_512、RSASSA_PKCS1_V1_5_SHA_256、RSASSA_PKCS1_V1_5_SHA_384、RSASSA_PKCS1_V1_5_SHA_512、ECDSA_SHA_256、ECDSA_SHA_384、ECDSA_SHA_512；须与密钥
     * KeySpec 匹配。
     */
    @NotEmpty
    @UCloudParam("SigningAlgorithm")
    private String signingAlgorithm;

    /** UKMS 实例资源 ID。 */
    @UCloudParam("ResourceId")
    private String resourceId;

    /** 消息类型。可选值：RAW、DIGEST；默认 RAW。 */
    @UCloudParam("MessageType")
    private String messageType;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getSigningMessage() {
        return signingMessage;
    }

    public void setSigningMessage(String signingMessage) {
        this.signingMessage = signingMessage;
    }

    public String getSigningAlgorithm() {
        return signingAlgorithm;
    }

    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
