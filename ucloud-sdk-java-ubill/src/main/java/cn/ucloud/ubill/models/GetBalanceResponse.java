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
package cn.ucloud.ubill.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;

public class GetBalanceResponse extends Response {

    /** 账户余额信息: false */
    @SerializedName("AccountInfo")
    private AccountInfo accountInfo;

    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }

    public static class AccountInfo extends Response {

        /** 冻结账户金额: false */
        @SerializedName("AmountFreeze")
        private String amountFreeze;

        /** 信用账户余额: false */
        @SerializedName("AmountCredit")
        private String amountCredit;

        /** 赠送账户余额: false */
        @SerializedName("AmountFree")
        private String amountFree;

        /** 账户余额: false */
        @SerializedName("Amount")
        private String amount;

        /** 账户可用余额: false */
        @SerializedName("AmountAvailable")
        private String amountAvailable;

        public String getAmountFreeze() {
            return amountFreeze;
        }

        public void setAmountFreeze(String amountFreeze) {
            this.amountFreeze = amountFreeze;
        }

        public String getAmountCredit() {
            return amountCredit;
        }

        public void setAmountCredit(String amountCredit) {
            this.amountCredit = amountCredit;
        }

        public String getAmountFree() {
            return amountFree;
        }

        public void setAmountFree(String amountFree) {
            this.amountFree = amountFree;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getAmountAvailable() {
            return amountAvailable;
        }

        public void setAmountAvailable(String amountAvailable) {
            this.amountAvailable = amountAvailable;
        }
    }
}
