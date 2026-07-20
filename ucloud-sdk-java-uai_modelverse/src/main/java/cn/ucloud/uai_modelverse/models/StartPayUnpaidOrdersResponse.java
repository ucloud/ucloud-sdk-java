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
package cn.ucloud.uai_modelverse.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class StartPayUnpaidOrdersResponse extends Response {

    /** 支付成功数量 */
    @SerializedName("SuccessCount")
    private Integer successCount;

    /** 支付失败数量 */
    @SerializedName("FailureCount")
    private Integer failureCount;

    /** 支付结果 */
    @SerializedName("Results")
    private PayResult results;

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public Integer getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }

    public PayResult getResults() {
        return results;
    }

    public void setResults(PayResult results) {
        this.results = results;
    }

    public static class PayResult extends Response {

        /** 订单号 */
        @SerializedName("OrderNo")
        private String orderNo;

        /** 是否支付成功 */
        @SerializedName("Success")
        private Boolean success;

        /** 失败原因（成功时为空） */
        @SerializedName("Reason")
        private String reason;

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }
}
