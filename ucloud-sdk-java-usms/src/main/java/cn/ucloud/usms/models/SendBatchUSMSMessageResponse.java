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

public class SendBatchUSMSMessageResponse extends Response {

    /** 本次提交发送任务的唯一ID，可根据该值查询本次发送的短信列表。注：成功提交短信数大于0时，才返回该字段 */
    @SerializedName("SessionNo")
    private String sessionNo;

    /** 本次请求Uuid */
    @SerializedName("ReqUuid")
    private String reqUuid;

    /** 成功提交短信（未拆分）条数 */
    @SerializedName("SuccessCount")
    private Integer successCount;

    /** 未发送成功的详情，返回码非0时该字段有效，可根据该字段数据重发 */
    @SerializedName("FailContent")
    private List<BatchInfo> failContent;

    public String getSessionNo() {
        return sessionNo;
    }

    public void setSessionNo(String sessionNo) {
        this.sessionNo = sessionNo;
    }

    public String getReqUuid() {
        return reqUuid;
    }

    public void setReqUuid(String reqUuid) {
        this.reqUuid = reqUuid;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public List<BatchInfo> getFailContent() {
        return failContent;
    }

    public void setFailContent(List<BatchInfo> failContent) {
        this.failContent = failContent;
    }

    public static class BatchInfo extends Response {

        /** 模板ID */
        @SerializedName("TemplateId")
        private String templateId;

        /** 签名 */
        @SerializedName("SigContent")
        private String sigContent;

        /** 具体号码信息 */
        @SerializedName("Target")
        private List<FailPhoneDetail> target;

        /** 未能成功发送的详情。注：模板/签名检验失败时，该字段有效 */
        @SerializedName("FailureDetails")
        private String failureDetails;

        public String getTemplateId() {
            return templateId;
        }

        public void setTemplateId(String templateId) {
            this.templateId = templateId;
        }

        public String getSigContent() {
            return sigContent;
        }

        public void setSigContent(String sigContent) {
            this.sigContent = sigContent;
        }

        public List<FailPhoneDetail> getTarget() {
            return target;
        }

        public void setTarget(List<FailPhoneDetail> target) {
            this.target = target;
        }

        public String getFailureDetails() {
            return failureDetails;
        }

        public void setFailureDetails(String failureDetails) {
            this.failureDetails = failureDetails;
        }
    }

    public static class FailPhoneDetail extends Response {

        /** 模板参数 */
        @SerializedName("TemplateParams")
        private List<String> templateParams;

        /** 手机号 */
        @SerializedName("Phone")
        private String phone;

        /** 扩展号码 */
        @SerializedName("ExtendCode")
        private String extendCode;

        /** 用户自定义ID */
        @SerializedName("UserId")
        private String userId;

        /** 发送失败原因。注：若模板/签名校验失败，该字段为空 */
        @SerializedName("FailureDetails")
        private String failureDetails;

        public List<String> getTemplateParams() {
            return templateParams;
        }

        public void setTemplateParams(List<String> templateParams) {
            this.templateParams = templateParams;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getExtendCode() {
            return extendCode;
        }

        public void setExtendCode(String extendCode) {
            this.extendCode = extendCode;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getFailureDetails() {
            return failureDetails;
        }

        public void setFailureDetails(String failureDetails) {
            this.failureDetails = failureDetails;
        }
    }
}
