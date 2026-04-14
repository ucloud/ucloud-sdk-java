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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeCompShareImageShareAccountsResponse extends Response {

    /** 被共享的账号列表 */
    @SerializedName("AccountSet")
    private List<Projects> accountSet;

    public List<Projects> getAccountSet() {
        return accountSet;
    }

    public void setAccountSet(List<Projects> accountSet) {
        this.accountSet = accountSet;
    }

    public static class Projects extends Response {

        /** 账号昵称 */
        @SerializedName("AccountName")
        private String accountName;

        /** 账号Id */
        @SerializedName("AccountId")
        private String accountId;

        public String getAccountName() {
            return accountName;
        }

        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        public String getAccountId() {
            return accountId;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }
    }
}
