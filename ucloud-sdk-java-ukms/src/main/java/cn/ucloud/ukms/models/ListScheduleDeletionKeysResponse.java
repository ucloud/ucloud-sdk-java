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

public class ListScheduleDeletionKeysResponse extends Response {

    /** 主密钥信息组成的列表 */
    @SerializedName("Objects")
    private List<CMK> objects;

    /** 操作结果 */
    @SerializedName("Status")
    private String status;

    /** 请求唯一标识符 */
    @SerializedName("RequestUuid")
    private String requestUuid;

    /** 符合条件的总数, 不同于Limit */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<CMK> getObjects() {
        return objects;
    }

    public void setObjects(List<CMK> objects) {
        this.objects = objects;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestUuid() {
        return requestUuid;
    }

    public void setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class CMK extends Response {

        /** CMK 的唯一标识符 */
        @SerializedName("KeyId")
        private String keyId;

        /** 密钥类型，仅支持UCloudManagedKeys、CustomerManagedKeys。默认值CustomerManagedKeys */
        @SerializedName("Type")
        private String type;

        /** 对密钥的描述说明 */
        @SerializedName("Description")
        private String description;

        /** 是否启用 */
        @SerializedName("Enabled")
        private Boolean enabled;

        /** 创建时间 时间戳 */
        @SerializedName("CreatedTime")
        private Integer createdTime;

        /** 最后修改时间 时间戳 */
        @SerializedName("LastModifiedTime")
        private Integer lastModifiedTime;

        /** 别名，与CMK一一对应 */
        @SerializedName("Alias")
        private String alias;

        /** 计划删除时间 时间戳 */
        @SerializedName("PlanDeleteTime")
        private Integer planDeleteTime;

        public String getKeyId() {
            return keyId;
        }

        public void setKeyId(String keyId) {
            this.keyId = keyId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Integer getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(Integer createdTime) {
            this.createdTime = createdTime;
        }

        public Integer getLastModifiedTime() {
            return lastModifiedTime;
        }

        public void setLastModifiedTime(Integer lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public Integer getPlanDeleteTime() {
            return planDeleteTime;
        }

        public void setPlanDeleteTime(Integer planDeleteTime) {
            this.planDeleteTime = planDeleteTime;
        }
    }
}
