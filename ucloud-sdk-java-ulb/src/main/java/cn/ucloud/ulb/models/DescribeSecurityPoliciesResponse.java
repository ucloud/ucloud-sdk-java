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
package cn.ucloud.ulb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeSecurityPoliciesResponse extends Response {

    /** 安全策略列表，每项参数详见SecurityPolicy */
    @SerializedName("DataSet")
    private List<SecurityPolicy> dataSet;

    /** 满足条件的安全策略总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<SecurityPolicy> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<SecurityPolicy> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class BindVServerInfo extends Response {

        /** 绑定的VServerId */
        @SerializedName("VServerId")
        private String vServerId;

        /** 绑定的VServer名称 */
        @SerializedName("VServerName")
        private String vServerName;

        /** VServer端口 */
        @SerializedName("Port")
        private Integer port;

        /** ULB的ID */
        @SerializedName("ULBId")
        private String ulbId;

        public String getVServerId() {
            return vServerId;
        }

        public void setVServerId(String vServerId) {
            this.vServerId = vServerId;
        }

        public String getVServerName() {
            return vServerName;
        }

        public void setVServerName(String vServerName) {
            this.vServerName = vServerName;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getULBId() {
            return ulbId;
        }

        public void setULBId(String ulbId) {
            this.ulbId = ulbId;
        }
    }

    public static class SecurityPolicy extends Response {

        /** 安全策略ID */
        @SerializedName("SecurityPolicyId")
        private String securityPolicyId;

        /** 安全策略名称 */
        @SerializedName("SecurityPolicyName")
        private String securityPolicyName;

        /** TLS最低版本 */
        @SerializedName("TLSVersion")
        private String tlsVersion;

        /** 加密套件 */
        @SerializedName("SSLCiphers")
        private List<String> sslCiphers;

        /** 安全策略类型 0：预定义 1：自定义 */
        @SerializedName("SecurityPolicyType")
        private Integer securityPolicyType;

        /** 关联的监听 */
        @SerializedName("VServerSet")
        private List<BindVServerInfo> vServerSet;

        public String getSecurityPolicyId() {
            return securityPolicyId;
        }

        public void setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
        }

        public String getSecurityPolicyName() {
            return securityPolicyName;
        }

        public void setSecurityPolicyName(String securityPolicyName) {
            this.securityPolicyName = securityPolicyName;
        }

        public String getTLSVersion() {
            return tlsVersion;
        }

        public void setTLSVersion(String tlsVersion) {
            this.tlsVersion = tlsVersion;
        }

        public List<String> getSSLCiphers() {
            return sslCiphers;
        }

        public void setSSLCiphers(List<String> sslCiphers) {
            this.sslCiphers = sslCiphers;
        }

        public Integer getSecurityPolicyType() {
            return securityPolicyType;
        }

        public void setSecurityPolicyType(Integer securityPolicyType) {
            this.securityPolicyType = securityPolicyType;
        }

        public List<BindVServerInfo> getVServerSet() {
            return vServerSet;
        }

        public void setVServerSet(List<BindVServerInfo> vServerSet) {
            this.vServerSet = vServerSet;
        }
    }
}
