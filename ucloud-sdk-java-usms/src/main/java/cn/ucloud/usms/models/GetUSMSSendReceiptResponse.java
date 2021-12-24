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
package cn.ucloud.usms.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetUSMSSendReceiptResponse extends Response {

    /** 回执信息集合: false */
    @SerializedName("Data")
    private List<ReceiptPerSession> data;

    public List<ReceiptPerSession> getData() {
        return data;
    }

    public void setData(List<ReceiptPerSession> data) {
        this.data = data;
    }

    public static class ReceiptPerSession extends Response {

        /** 发送短信时返回的SessionNo: false */
        @SerializedName("SessionNo")
        private String sessionNo;

        /** 每个手机号的短信回执信息集合: false */
        @SerializedName("ReceiptSet")
        private List<ReceiptPerPhone> receiptSet;

        public String getSessionNo() {
            return sessionNo;
        }

        public void setSessionNo(String sessionNo) {
            this.sessionNo = sessionNo;
        }

        public List<ReceiptPerPhone> getReceiptSet() {
            return receiptSet;
        }

        public void setReceiptSet(List<ReceiptPerPhone> receiptSet) {
            this.receiptSet = receiptSet;
        }
    }

    public static class ReceiptPerPhone extends Response {

        /** 手机号码: false */
        @SerializedName("Phone")
        private String phone;

        /** 消耗短信条数: false */
        @SerializedName("CostCount")
        private Integer costCount;

        /**
         * 回执结果，枚举值：\\ > 发送成功: 代表成功 \\ > Success: 代表成功 \\ > 发送失败: 代表失败 \\ > Fail: 代表失败 \\ > 状态未知:
         * 代表未知 \\ > Unknow: 代表未知: false
         */
        @SerializedName("ReceiptResult")
        private String receiptResult;

        /** 状态报告编码: false */
        @SerializedName("ReceiptCode")
        private String receiptCode;

        /** 回执结果描述: false */
        @SerializedName("ReceiptDesc")
        private String receiptDesc;

        /** 回执返回时间: false */
        @SerializedName("ReceiptTime")
        private Integer receiptTime;

        /** 自定义的业务标识ID，字符串: false */
        @SerializedName("UserId")
        private String userId;

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Integer getCostCount() {
            return costCount;
        }

        public void setCostCount(Integer costCount) {
            this.costCount = costCount;
        }

        public String getReceiptResult() {
            return receiptResult;
        }

        public void setReceiptResult(String receiptResult) {
            this.receiptResult = receiptResult;
        }

        public String getReceiptCode() {
            return receiptCode;
        }

        public void setReceiptCode(String receiptCode) {
            this.receiptCode = receiptCode;
        }

        public String getReceiptDesc() {
            return receiptDesc;
        }

        public void setReceiptDesc(String receiptDesc) {
            this.receiptDesc = receiptDesc;
        }

        public Integer getReceiptTime() {
            return receiptTime;
        }

        public void setReceiptTime(Integer receiptTime) {
            this.receiptTime = receiptTime;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
}
