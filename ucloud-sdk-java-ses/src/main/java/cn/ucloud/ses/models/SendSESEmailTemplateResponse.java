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
package cn.ucloud.ses.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SendSESEmailTemplateResponse extends Response {

    /** 本次发送任务的唯一标识 */
    @SerializedName("SessionNo")
    private String sessionNo;

    /** 发送成功数 */
    @SerializedName("SuccessCount")
    private Integer successCount;

    /** 发送失败的收件人列表 */
    @SerializedName("FailContent")
    private List<FailedTargetEmail> failContent;

    public String getSessionNo() {
        return sessionNo;
    }

    public void setSessionNo(String sessionNo) {
        this.sessionNo = sessionNo;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public List<FailedTargetEmail> getFailContent() {
        return failContent;
    }

    public void setFailContent(List<FailedTargetEmail> failContent) {
        this.failContent = failContent;
    }

    public static class FailedTargetEmail extends Response {

        /** 收件人 */
        @SerializedName("To")
        private String to;

        /** 收件邮箱 */
        @SerializedName("EmailAddress")
        private String emailAddress;

        /** 抄送 */
        @SerializedName("Cc")
        private List<String> cc;

        /** 密送 */
        @SerializedName("Bcc")
        private List<String> bcc;

        /**
         * 模版变量,variableName{##}variableValue
         * 格式；仅使用模版发送（SendSESEmailTemplate）时返回，未使用模版发送（SendSESEmail）时不返回该字段
         */
        @SerializedName("TemplateVariableParams")
        private List<String> templateVariableParams;

        /** 失败原因 */
        @SerializedName("FailureReason")
        private String failureReason;

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public List<String> getCc() {
            return cc;
        }

        public void setCc(List<String> cc) {
            this.cc = cc;
        }

        public List<String> getBcc() {
            return bcc;
        }

        public void setBcc(List<String> bcc) {
            this.bcc = bcc;
        }

        public List<String> getTemplateVariableParams() {
            return templateVariableParams;
        }

        public void setTemplateVariableParams(List<String> templateVariableParams) {
            this.templateVariableParams = templateVariableParams;
        }

        public String getFailureReason() {
            return failureReason;
        }

        public void setFailureReason(String failureReason) {
            this.failureReason = failureReason;
        }
    }
}
