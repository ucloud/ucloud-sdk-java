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

public class ListKeysResponse extends Response {

    /** 密钥信息数组，每项为 DEK/ListKeys item。 */
    @SerializedName("Data")
    private List<DEK> data;

    /** 符合条件的总数，不同于 Limit。 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<DEK> getData() {
        return data;
    }

    public void setData(List<DEK> data) {
        this.data = data;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class DEK extends Response {

        /** 对外主密钥 ID（ukms_key_info.key_id）。 */
        @SerializedName("KeyId")
        private String keyId;

        /**
         * 密钥规格。取值：SYMMETRIC_DEFAULT、RSA_2048、RSA_3072、RSA_4096、ECC_NIST_P256、ECC_NIST_P384、ECC_NIST_P521、HMAC_256、HMAC_384、HMAC_512。
         */
        @SerializedName("KeySpec")
        private String keySpec;

        /** 按 KeySpec 派生的密钥用途。取值：ENCRYPT_DECRYPT、SIGN_VERIFY、GENERATE_VERIFY_MAC、KEY_AGREEMENT。 */
        @SerializedName("KeyUsage")
        private List<String> keyUsage;

        /** 密钥来源，由 Origin 派生。取值：ucloud、import。当前 CreateKey 仅支持 ucloud。 */
        @SerializedName("Origin")
        private String origin;

        /** 数据库密钥状态。常见取值：Active、Deactivated、PendingDeletion。 */
        @SerializedName("Status")
        private String status;

        /** 创建时间，Unix 时间戳。 */
        @SerializedName("CreatedTime")
        private Integer createdTime;

        /** 更新时间，Unix 时间戳。 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** 是否已开启自动轮转；未配置或已关闭均为 false */
        @SerializedName("KeyRotationEnabled")
        private Boolean keyRotationEnabled;

        /** 自动轮转周期(天)；未开启时为 0 */
        @SerializedName("RotationPeriodInDays")
        private Integer rotationPeriodInDays;

        /** 密钥所属的 UKMS 实例资源 ID。 */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 密钥描述。 */
        @SerializedName("Description")
        private String description;

        /** 计划删除时间，Unix 时间戳。 */
        @SerializedName("PlanDeleteTime")
        private Integer planDeleteTime;

        /** 下次自动轮转时间（Unix 时间戳，秒）；仅在已开启自动轮转时返回。 */
        @SerializedName("NextRotationDate")
        private Integer nextRotationDate;

        public String getKeyId() {
            return keyId;
        }

        public void setKeyId(String keyId) {
            this.keyId = keyId;
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

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(Integer createdTime) {
            this.createdTime = createdTime;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public Boolean getKeyRotationEnabled() {
            return keyRotationEnabled;
        }

        public void setKeyRotationEnabled(Boolean keyRotationEnabled) {
            this.keyRotationEnabled = keyRotationEnabled;
        }

        public Integer getRotationPeriodInDays() {
            return rotationPeriodInDays;
        }

        public void setRotationPeriodInDays(Integer rotationPeriodInDays) {
            this.rotationPeriodInDays = rotationPeriodInDays;
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

        public Integer getPlanDeleteTime() {
            return planDeleteTime;
        }

        public void setPlanDeleteTime(Integer planDeleteTime) {
            this.planDeleteTime = planDeleteTime;
        }

        public Integer getNextRotationDate() {
            return nextRotationDate;
        }

        public void setNextRotationDate(Integer nextRotationDate) {
            this.nextRotationDate = nextRotationDate;
        }
    }
}
