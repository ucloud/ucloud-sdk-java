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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class SendSESEmailRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 邮件主题（长度 1~200 字符） */
    @NotEmpty
    @UCloudParam("Subject")
    private String subject;

    /** 发件人邮箱，配置地址：https://console.ucloud.cn/ses/email-config?tab=sender-list */
    @NotEmpty
    @UCloudParam("From")
    private String from;

    /** 收件人 */
    @NotEmpty
    @UCloudParam("To")
    private List<String> to;

    /** HTML 内容 （与Text二选一，长度上限 10,485,760个字符） */
    @UCloudParam("Html")
    private String html;

    /** 纯文本内容 （与Html二选一，长度上限 10,485,760个字符） */
    @UCloudParam("Text")
    private String text;

    /** 邮件预览文本 */
    @UCloudParam("PreHeader")
    private String preHeader;

    /** 发件人名称，不传或为空时，自动回落到该发件人在控制台配置的别名（Alias） */
    @UCloudParam("FromName")
    private String fromName;

    /** 抄送（抄送+密送总数量不能超过100） */
    @UCloudParam("Cc")
    private List<String> cc;

    /** 密送（抄送+密送总数量不能超过100） */
    @UCloudParam("Bcc")
    private List<String> bcc;

    /** */
    @UCloudParam("Attachments")
    private List<Attachments> attachments;

    /** */
    @UCloudParam("Headers")
    private List<Headers> headers;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPreHeader() {
        return preHeader;
    }

    public void setPreHeader(String preHeader) {
        this.preHeader = preHeader;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
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

    public List<Attachments> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachments> attachments) {
        this.attachments = attachments;
    }

    public List<Headers> getHeaders() {
        return headers;
    }

    public void setHeaders(List<Headers> headers) {
        this.headers = headers;
    }

    public static class Attachments extends Request {

        /** 附件文件名 */
        @UCloudParam("Filename")
        private String filename;

        /** MIME 类型，如： application/pdf */
        @UCloudParam("ContentType")
        private String contentType;

        /** 附件内容（Base64 编码），单次请求最多 10 个附件；总大小不超过 10MB */
        @UCloudParam("Data")
        private String data;

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }

    public static class Headers extends Request {

        /**
         * 邮件头名称，最多 20 个且仅允许字母、数字和 -（正则
         * ^[A-Za-z0-9-]+$）。禁止使用保留名称：From/To/Cc/Bcc/Subject/Reply-To/Content-Type/Mime-Version，以及
         * X-SES- 前缀（均不区分大小写）。
         */
        @UCloudParam("Name")
        private String name;

        /** 邮件头值 */
        @UCloudParam("Value")
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
