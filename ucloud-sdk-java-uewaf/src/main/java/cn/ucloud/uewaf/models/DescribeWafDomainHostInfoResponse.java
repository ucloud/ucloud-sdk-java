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

public class DescribeWafDomainHostInfoResponse extends Response {

    /** 域名总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 域名信息列表，参考HostStatausInfo */
    @SerializedName("DomainHostList")
    private List<HostStatausInfo> domainHostList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<HostStatausInfo> getDomainHostList() {
        return domainHostList;
    }

    public void setDomainHostList(List<HostStatausInfo> domainHostList) {
        this.domainHostList = domainHostList;
    }

    public static class DomainStatus extends Response {

        /** 部署区域 */
        @SerializedName("Region")
        private String region;

        /** 协议 */
        @SerializedName("Scheme")
        private String scheme;

        /** 状态信息 */
        @SerializedName("Status")
        private String status;

        /** 原始状态信息 */
        @SerializedName("RawStatus")
        private String rawStatus;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getScheme() {
            return scheme;
        }

        public void setScheme(String scheme) {
            this.scheme = scheme;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getRawStatus() {
            return rawStatus;
        }

        public void setRawStatus(String rawStatus) {
            this.rawStatus = rawStatus;
        }
    }

    public static class HostStatausInfo extends Response {

        /** 域名 */
        @SerializedName("FullDomain")
        private String fullDomain;

        /** 工作模式 */
        @SerializedName("WorkMode")
        private String workMode;

        /** 域名记录ID */
        @SerializedName("RecordId")
        private Integer recordId;

        /** 证书ID */
        @SerializedName("CertificateID")
        private Integer certificateID;

        /** CNAME记录值 */
        @SerializedName("Cname")
        private String cname;

        /** 部署区域 */
        @SerializedName("WorkRegions")
        private String workRegions;

        /** 是否开启CC防护 */
        @SerializedName("AntiCC")
        private String antiCC;

        /** 是否开启网页防篡改 */
        @SerializedName("Assurance")
        private String assurance;

        /** 创建时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 源站IP地址信息，参考SrcIPInfo */
        @SerializedName("SrcIPInfo")
        private List<SrcIPInfo> srcIPInfo;

        /** http是否重定向 */
        @SerializedName("HTTPRedirection")
        private String httpRedirection;

        /** 是否开启HTTPS offload, YES - 是 */
        @SerializedName("HTTPBack")
        private String httpBack;

        /** http状态描述，WAF主动探测结果 */
        @SerializedName("HttpStatus")
        private String httpStatus;

        /** http异常信息，WAF主动探测结果 */
        @SerializedName("HttpException")
        private String httpException;

        /** https状态，WAF主动探测结果 */
        @SerializedName("HttpsStatus")
        private String httpsStatus;

        /** https异常描述，WAF主动探测结果 */
        @SerializedName("HttpsException")
        private String httpsException;

        /** 是否独享IP地址 */
        @SerializedName("UniqueIP")
        private String uniqueIP;

        /** 真实IP头部 */
        @SerializedName("RealIPHeader")
        private String realIPHeader;

        /** 攻击次数 */
        @SerializedName("AttackCount")
        private Integer attackCount;

        /** WAF探测域名状态信息，参考DomainStatus，ULB版本无效 */
        @SerializedName("DomainStatus")
        private List<DomainStatus> domainStatus;

        /** 域名有效性，ULB版本有效，其他版本无效，为1时表示域名正常接入，为0 时表示域名已从ULB删除，WAF仅保留历史记录 */
        @SerializedName("Status")
        private Integer status;

        public String getFullDomain() {
            return fullDomain;
        }

        public void setFullDomain(String fullDomain) {
            this.fullDomain = fullDomain;
        }

        public String getWorkMode() {
            return workMode;
        }

        public void setWorkMode(String workMode) {
            this.workMode = workMode;
        }

        public Integer getRecordId() {
            return recordId;
        }

        public void setRecordId(Integer recordId) {
            this.recordId = recordId;
        }

        public Integer getCertificateID() {
            return certificateID;
        }

        public void setCertificateID(Integer certificateID) {
            this.certificateID = certificateID;
        }

        public String getCname() {
            return cname;
        }

        public void setCname(String cname) {
            this.cname = cname;
        }

        public String getWorkRegions() {
            return workRegions;
        }

        public void setWorkRegions(String workRegions) {
            this.workRegions = workRegions;
        }

        public String getAntiCC() {
            return antiCC;
        }

        public void setAntiCC(String antiCC) {
            this.antiCC = antiCC;
        }

        public String getAssurance() {
            return assurance;
        }

        public void setAssurance(String assurance) {
            this.assurance = assurance;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public List<SrcIPInfo> getSrcIPInfo() {
            return srcIPInfo;
        }

        public void setSrcIPInfo(List<SrcIPInfo> srcIPInfo) {
            this.srcIPInfo = srcIPInfo;
        }

        public String getHTTPRedirection() {
            return httpRedirection;
        }

        public void setHTTPRedirection(String httpRedirection) {
            this.httpRedirection = httpRedirection;
        }

        public String getHTTPBack() {
            return httpBack;
        }

        public void setHTTPBack(String httpBack) {
            this.httpBack = httpBack;
        }

        public String getHttpStatus() {
            return httpStatus;
        }

        public void setHttpStatus(String httpStatus) {
            this.httpStatus = httpStatus;
        }

        public String getHttpException() {
            return httpException;
        }

        public void setHttpException(String httpException) {
            this.httpException = httpException;
        }

        public String getHttpsStatus() {
            return httpsStatus;
        }

        public void setHttpsStatus(String httpsStatus) {
            this.httpsStatus = httpsStatus;
        }

        public String getHttpsException() {
            return httpsException;
        }

        public void setHttpsException(String httpsException) {
            this.httpsException = httpsException;
        }

        public String getUniqueIP() {
            return uniqueIP;
        }

        public void setUniqueIP(String uniqueIP) {
            this.uniqueIP = uniqueIP;
        }

        public String getRealIPHeader() {
            return realIPHeader;
        }

        public void setRealIPHeader(String realIPHeader) {
            this.realIPHeader = realIPHeader;
        }

        public Integer getAttackCount() {
            return attackCount;
        }

        public void setAttackCount(Integer attackCount) {
            this.attackCount = attackCount;
        }

        public List<DomainStatus> getDomainStatus() {
            return domainStatus;
        }

        public void setDomainStatus(List<DomainStatus> domainStatus) {
            this.domainStatus = domainStatus;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }
    }

    public static class SrcIPInfo extends Response {

        /** 协议 */
        @SerializedName("Proto")
        private String proto;

        /** 源IP地址 */
        @SerializedName("SrcIP")
        private String srcIP;

        /** 源端口 */
        @SerializedName("Port")
        private List<Integer> port;

        /** URI */
        @SerializedName("URI")
        private String uri;

        public String getProto() {
            return proto;
        }

        public void setProto(String proto) {
            this.proto = proto;
        }

        public String getSrcIP() {
            return srcIP;
        }

        public void setSrcIP(String srcIP) {
            this.srcIP = srcIP;
        }

        public List<Integer> getPort() {
            return port;
        }

        public void setPort(List<Integer> port) {
            this.port = port;
        }

        public String getURI() {
            return uri;
        }

        public void setURI(String uri) {
            this.uri = uri;
        }
    }
}
