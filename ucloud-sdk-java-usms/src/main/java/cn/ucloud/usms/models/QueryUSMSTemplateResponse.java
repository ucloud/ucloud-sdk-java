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

public class QueryUSMSTemplateResponse extends Response {

    /** 短信模板明细信息，各字段说明详见OutTemplate: false */
    @SerializedName("Data")
    private OutTemplate data;

    public OutTemplate getData() {
        return data;
    }

    public void setData(OutTemplate data) {
        this.data = data;
    }

    public static class OutTemplate extends Response {

        /** 短信模板ID: false */
        @SerializedName("TemplateId")
        private String templateId;

        /** 模板类型，选项：1-验证码类 2-通知类 3-会员推广类: false */
        @SerializedName("Purpose")
        private Integer purpose;

        /** 短信模板名称: false */
        @SerializedName("TemplateName")
        private String templateName;

        /** 短信模板内容: false */
        @SerializedName("Template")
        private String template;

        /** 退订信息；一般填写方式“回T退订”，当purpose为3（也即会员推广类）时，为必填项: false */
        @SerializedName("UnsubscribeInfo")
        private String unsubscribeInfo;

        /** 短信模板状态；状态说明：0-待审核，1-审核中，2-审核通过，3-审核未通过，4-被禁用: false */
        @SerializedName("Status")
        private Integer status;

        /** 模板说明: false */
        @SerializedName("Remark")
        private String remark;

        /** 审核失败原因: false */
        @SerializedName("ErrDesc")
        private String errDesc;

        /** 创建时间: false */
        @SerializedName("CreateTime")
        private Integer createTime;

        public String getTemplateId() {
            return templateId;
        }

        public void setTemplateId(String templateId) {
            this.templateId = templateId;
        }

        public Integer getPurpose() {
            return purpose;
        }

        public void setPurpose(Integer purpose) {
            this.purpose = purpose;
        }

        public String getTemplateName() {
            return templateName;
        }

        public void setTemplateName(String templateName) {
            this.templateName = templateName;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public String getUnsubscribeInfo() {
            return unsubscribeInfo;
        }

        public void setUnsubscribeInfo(String unsubscribeInfo) {
            this.unsubscribeInfo = unsubscribeInfo;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getErrDesc() {
            return errDesc;
        }

        public void setErrDesc(String errDesc) {
            this.errDesc = errDesc;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }
    }
}
