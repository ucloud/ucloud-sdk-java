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

public class ListAliasesResponse extends Response {

    /** 别名总数。 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 别名列表，每项为 AliasInfo。 */
    @SerializedName("Aliases")
    private List<AliasInfo> aliases;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<AliasInfo> getAliases() {
        return aliases;
    }

    public void setAliases(List<AliasInfo> aliases) {
        this.aliases = aliases;
    }

    public static class AliasInfo extends Response {

        /** 别名，含 alias/ 前缀。 */
        @SerializedName("AliasName")
        private String aliasName;

        /** 别名指向的密钥资源长 ID。 */
        @SerializedName("TargetKeyId")
        private String targetKeyId;

        /** 创建时间，Unix 时间戳。 */
        @SerializedName("CreationDate")
        private Integer creationDate;

        /** 最后更新时间，Unix 时间戳。 */
        @SerializedName("LastUpdatedDate")
        private Integer lastUpdatedDate;

        public String getAliasName() {
            return aliasName;
        }

        public void setAliasName(String aliasName) {
            this.aliasName = aliasName;
        }

        public String getTargetKeyId() {
            return targetKeyId;
        }

        public void setTargetKeyId(String targetKeyId) {
            this.targetKeyId = targetKeyId;
        }

        public Integer getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(Integer creationDate) {
            this.creationDate = creationDate;
        }

        public Integer getLastUpdatedDate() {
            return lastUpdatedDate;
        }

        public void setLastUpdatedDate(Integer lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
        }
    }
}
