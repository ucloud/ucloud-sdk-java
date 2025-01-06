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
package cn.ucloud.ufile.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUFileSSLCertResponse extends Response {

    /** 证书列表 */
    @SerializedName("DataSet")
    private List<UFileSSLCert> dataSet;

    public List<UFileSSLCert> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UFileSSLCert> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UFileSSLCert extends Response {

        /** 域名 */
        @SerializedName("Domain")
        private String domain;

        /** SSL证书内容，和域名对应 */
        @SerializedName("Certificate")
        private String certificate;

        /** SSL证书对应的私钥 */
        @SerializedName("CertificateKey")
        private String certificateKey;

        /** SSL证书名称 */
        @SerializedName("CertificateName")
        private String certificateName;

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getCertificate() {
            return certificate;
        }

        public void setCertificate(String certificate) {
            this.certificate = certificate;
        }

        public String getCertificateKey() {
            return certificateKey;
        }

        public void setCertificateKey(String certificateKey) {
            this.certificateKey = certificateKey;
        }

        public String getCertificateName() {
            return certificateName;
        }

        public void setCertificateName(String certificateName) {
            this.certificateName = certificateName;
        }
    }
}
