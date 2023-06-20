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
package cn.ucloud.ucdn.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetCertificateV2Response extends Response {

    /** 证书数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 证书信息列表 */
    @SerializedName("CertList")
    private List<CertList> certList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<CertList> getCertList() {
        return certList;
    }

    public void setCertList(List<CertList> certList) {
        this.certList = certList;
    }

    public static class CertList extends Response {

        /** 证书名 */
        @SerializedName("CertName")
        private String certName;

        /** 通用名 */
        @SerializedName("CommonName")
        private String commonName;

        /** dns名称 */
        @SerializedName("DnsName")
        private String dnsName;

        /** 证书开始时间 */
        @SerializedName("BeginTime")
        private Integer beginTime;

        /** 证书获取时间 */
        @SerializedName("EndTime")
        private Integer endTime;

        /** 已配置域名个数 */
        @SerializedName("DomainCount")
        private Integer domainCount;

        /** 证书内容 */
        @SerializedName("UserCert")
        private String userCert;

        /** ca证内容 */
        @SerializedName("CaCert")
        private String caCert;

        /** 已配置的域名列表 */
        @SerializedName("Domains")
        private List<String> domains;

        public String getCertName() {
            return certName;
        }

        public void setCertName(String certName) {
            this.certName = certName;
        }

        public String getCommonName() {
            return commonName;
        }

        public void setCommonName(String commonName) {
            this.commonName = commonName;
        }

        public String getDnsName() {
            return dnsName;
        }

        public void setDnsName(String dnsName) {
            this.dnsName = dnsName;
        }

        public Integer getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(Integer beginTime) {
            this.beginTime = beginTime;
        }

        public Integer getEndTime() {
            return endTime;
        }

        public void setEndTime(Integer endTime) {
            this.endTime = endTime;
        }

        public Integer getDomainCount() {
            return domainCount;
        }

        public void setDomainCount(Integer domainCount) {
            this.domainCount = domainCount;
        }

        public String getUserCert() {
            return userCert;
        }

        public void setUserCert(String userCert) {
            this.userCert = userCert;
        }

        public String getCaCert() {
            return caCert;
        }

        public void setCaCert(String caCert) {
            this.caCert = caCert;
        }

        public List<String> getDomains() {
            return domains;
        }

        public void setDomains(List<String> domains) {
            this.domains = domains;
        }
    }
}
