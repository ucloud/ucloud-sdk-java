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

public class EncryptRequest extends Request {

    /** 项目ID。不填写为默认项目，子账号必须填写。 */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 地域。参见地域和可用区列表。 */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 密钥资源长 ID、ARN 或别名。 */
    @NotEmpty
    @UCloudParam("KeyId")
    private String keyId;

    /** 待加密明文，Base64 编码。 */
    @NotEmpty
    @UCloudParam("Plaintext")
    private String plaintext;

    /** 加密上下文，JSON Object。 */
    @UCloudParam("EncryptionContext")
    private Object encryptionContext;

    /** UKMS 实例资源 ID。 */
    @UCloudParam("ResourceId")
    private String resourceId;

    /**
     * 加密算法。可选值：SYMMETRIC_DEFAULT、RSAES_OAEP_SHA_1、RSAES_OAEP_SHA_256；对称密钥默认 SYMMETRIC_DEFAULT，RSA
     * 默认 RSAES_OAEP_SHA_256。
     */
    @UCloudParam("EncryptionAlgorithm")
    private String encryptionAlgorithm;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public Object getEncryptionContext() {
        return encryptionContext;
    }

    public void setEncryptionContext(Object encryptionContext) {
        this.encryptionContext = encryptionContext;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }
}
