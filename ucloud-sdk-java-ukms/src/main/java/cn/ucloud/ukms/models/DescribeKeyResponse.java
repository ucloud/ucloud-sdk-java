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

public class DescribeKeyResponse extends Response {

    /** 密钥元数据。 */
    @SerializedName("KeyMetadata")
    private KeyMetadata keyMetadata;

    public KeyMetadata getKeyMetadata() {
        return keyMetadata;
    }

    public void setKeyMetadata(KeyMetadata keyMetadata) {
        this.keyMetadata = keyMetadata;
    }

    public static class KeyMetadata extends Response {

        /** 密钥所属项目的对外别名，格式为 org-xxx。该值由项目数字 ID 解析得到，可能因项目别名查询失败而为空。 */
        @SerializedName("ProjectId")
        private String projectId;

        /** 密钥资源长 ID。 */
        @SerializedName("KeyId")
        private String keyId;

        /** 创建时间，Unix 时间戳。 */
        @SerializedName("CreationDate")
        private Integer creationDate;

        /** 是否启用。取值：true、false。 */
        @SerializedName("Enabled")
        private String enabled;

        /** 密钥用途。取值：ENCRYPT_DECRYPT、SIGN_VERIFY、GENERATE_VERIFY_MAC、KEY_AGREEMENT。 */
        @SerializedName("KeyUsage")
        private List<String> keyUsage;

        /** 密钥对外状态。取值：Enabled、Disabled、PendingDeletion、PendingImport、Unavailable。 */
        @SerializedName("KeyState")
        private String keyState;

        /** 密钥材料来源。取值：UCLOUD_KMS、EXTERNAL；当前 CreateKey 仅支持 UCLOUD_KMS。 */
        @SerializedName("Origin")
        private String origin;

        /**
         * 密钥规格。取值：SYMMETRIC_DEFAULT、RSA_2048、RSA_3072、RSA_4096、ECC_NIST_P256、ECC_NIST_P384、ECC_NIST_P521、HMAC_256、HMAC_384、HMAC_512。
         */
        @SerializedName("KeySpec")
        private String keySpec;

        /** 是否开启删除保护。取值：true、false。 */
        @SerializedName("DeletionProtection")
        private String deletionProtection;

        /** 当前密钥版本。 */
        @SerializedName("KeyVersion")
        private Integer keyVersion;

        /** 密钥所属的 UKMS 实例资源 ID。 */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 密钥描述。 */
        @SerializedName("Description")
        private String description;

        /** 计划删除时间，Unix 时间戳。 */
        @SerializedName("DeletionDate")
        private Integer deletionDate;

        /** 密钥所属组织的数字 ID，来源于密钥关联的资源交易记录。 */
        @SerializedName("OrganizationId")
        private Integer organizationId;

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

        public Integer getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(Integer creationDate) {
            this.creationDate = creationDate;
        }

        public String getEnabled() {
            return enabled;
        }

        public void setEnabled(String enabled) {
            this.enabled = enabled;
        }

        public List<String> getKeyUsage() {
            return keyUsage;
        }

        public void setKeyUsage(List<String> keyUsage) {
            this.keyUsage = keyUsage;
        }

        public String getKeyState() {
            return keyState;
        }

        public void setKeyState(String keyState) {
            this.keyState = keyState;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getKeySpec() {
            return keySpec;
        }

        public void setKeySpec(String keySpec) {
            this.keySpec = keySpec;
        }

        public String getDeletionProtection() {
            return deletionProtection;
        }

        public void setDeletionProtection(String deletionProtection) {
            this.deletionProtection = deletionProtection;
        }

        public Integer getKeyVersion() {
            return keyVersion;
        }

        public void setKeyVersion(Integer keyVersion) {
            this.keyVersion = keyVersion;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getDeletionDate() {
            return deletionDate;
        }

        public void setDeletionDate(Integer deletionDate) {
            this.deletionDate = deletionDate;
        }

        public Integer getOrganizationId() {
            return organizationId;
        }

        public void setOrganizationId(Integer organizationId) {
            this.organizationId = organizationId;
        }
    }
}
