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
package cn.ucloud.uewaf.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeWafDomainCertificateInfoResponse extends Response {

    /** 证书数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 证书详情列表，参考DoaminCertificateInfo */
    @SerializedName("CertificateInfo")
    private List<DoaminCertificateInfo> certificateInfo;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<DoaminCertificateInfo> getCertificateInfo() {
        return certificateInfo;
    }

    public void setCertificateInfo(List<DoaminCertificateInfo> certificateInfo) {
        this.certificateInfo = certificateInfo;
    }

    public static class DoaminCertificateInfo extends Response {

        /** 证书ID */
        @SerializedName("CertificateID")
        private Integer certificateID;

        /** 证书名称 */
        @SerializedName("CertificateName")
        private String certificateName;

        /** 证书一级域名 */
        @SerializedName("Domain")
        private String domain;

        /** 证书入库时间，utc时间格式，如：2020-02-06T18:46:17+08:00 */
        @SerializedName("UploadTime")
        private String uploadTime;

        /** 过期时间 */
        @SerializedName("ExpireTime")
        private String expireTime;

        public Integer getCertificateID() {
            return certificateID;
        }

        public void setCertificateID(Integer certificateID) {
            this.certificateID = certificateID;
        }

        public String getCertificateName() {
            return certificateName;
        }

        public void setCertificateName(String certificateName) {
            this.certificateName = certificateName;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getUploadTime() {
            return uploadTime;
        }

        public void setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
        }

        public String getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(String expireTime) {
            this.expireTime = expireTime;
        }
    }
}
