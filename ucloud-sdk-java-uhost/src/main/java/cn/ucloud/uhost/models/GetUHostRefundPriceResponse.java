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
package cn.ucloud.uhost.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUHostRefundPriceResponse extends Response {

    /** 主机删除扣除费用详情 */
    @SerializedName("RefundPriceSet")
    private List<UHostRefundPriceSet> refundPriceSet;

    public List<UHostRefundPriceSet> getRefundPriceSet() {
        return refundPriceSet;
    }

    public void setRefundPriceSet(List<UHostRefundPriceSet> refundPriceSet) {
        this.refundPriceSet = refundPriceSet;
    }

    public static class UHostRefundPriceSet extends Response {

        /** UHost实例ID */
        @SerializedName("UHostId")
        private String uHostId;

        /** 实例操作结果的错误码。0为成功 */
        @SerializedName("Code")
        private Integer code;

        /** 当 Code 非 0 时提供详细的描述信息 */
        @SerializedName("Message")
        private String message;

        /** 实例的删除退费金额 */
        @SerializedName("RefundPrice")
        private Double refundPrice;

        public String getUHostId() {
            return uHostId;
        }

        public void setUHostId(String uHostId) {
            this.uHostId = uHostId;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Double getRefundPrice() {
            return refundPrice;
        }

        public void setRefundPrice(Double refundPrice) {
            this.refundPrice = refundPrice;
        }
    }
}
