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

public class DescribeSecurityPoliciesV2Response extends Response {

    /** 安全策略列表，每项参数详见SecurityPolicyInfo */
    @SerializedName("DataSet")
    private List<SecurityPolicyInfo> dataSet;

    /** 满足条件的安全策略总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<SecurityPolicyInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<SecurityPolicyInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class SecurityPolicyInfo extends Response {

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
        @SerializedName("Relations")
        private List<SecurityPolicyRelation> relations;

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

        public List<SecurityPolicyRelation> getRelations() {
            return relations;
        }

        public void setRelations(List<SecurityPolicyRelation> relations) {
            this.relations = relations;
        }
    }

    public static class SecurityPolicyRelation extends Response {

        /** 负载均衡实例的ID */
        @SerializedName("LoadBalancerId")
        private String loadBalancerId;

        /** 监听器的ID */
        @SerializedName("ListenerId")
        private String listenerId;

        /** 监听器的名称 */
        @SerializedName("ListenerName")
        private String listenerName;

        /** 监听端口 */
        @SerializedName("ListenerPort")
        private Integer listenerPort;

        public String getLoadBalancerId() {
            return loadBalancerId;
        }

        public void setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
        }

        public String getListenerId() {
            return listenerId;
        }

        public void setListenerId(String listenerId) {
            this.listenerId = listenerId;
        }

        public String getListenerName() {
            return listenerName;
        }

        public void setListenerName(String listenerName) {
            this.listenerName = listenerName;
        }

        public Integer getListenerPort() {
            return listenerPort;
        }

        public void setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
        }
    }
}
