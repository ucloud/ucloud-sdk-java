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

public class QueryUSMSSignatureResponse extends Response {

    /** 签名信息 */
    @SerializedName("Data")
    private OutSignature data;

    public OutSignature getData() {
        return data;
    }

    public void setData(OutSignature data) {
        this.data = data;
    }

    public static class OutSignature extends Response {

        /** 短信签名ID */
        @SerializedName("SigId")
        private String sigId;

        /** 短信签名内容 */
        @SerializedName("SigContent")
        private String sigContent;

        /** 签名状态，0-待审核 1-审核中 2-审核通过 3-审核未通过 4-被禁用 */
        @SerializedName("Status")
        private Integer status;

        /** 短信签名未通过审核原因 */
        @SerializedName("ErrDesc")
        private String errDesc;

        public String getSigId() {
            return sigId;
        }

        public void setSigId(String sigId) {
            this.sigId = sigId;
        }

        public String getSigContent() {
            return sigContent;
        }

        public void setSigContent(String sigContent) {
            this.sigContent = sigContent;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getErrDesc() {
            return errDesc;
        }

        public void setErrDesc(String errDesc) {
            this.errDesc = errDesc;
        }
    }
}
