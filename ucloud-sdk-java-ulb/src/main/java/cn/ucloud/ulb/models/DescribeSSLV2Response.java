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

public class DescribeSSLV2Response extends Response {

    /** 满足条件的SSL证书总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** SSL证书详细信息，具体结构见SSLInfo */
    @SerializedName("DataSet")
    private List<SSLInfo> dataSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<SSLInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<SSLInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public static class SSLInfo extends Response {

        /** SSL证书的Id */
        @SerializedName("SSLId")
        private String sslId;

        /** SSL证书的名字 */
        @SerializedName("SSLName")
        private String sslName;

        /** SSL证书类型，暂时只有 Pem 一种类型 */
        @SerializedName("SSLType")
        private String sslType;

        /** SSL证书的内容 */
        @SerializedName("SSLContent")
        private String sslContent;

        /** SSL证书的创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** SSL证书的HASH值 */
        @SerializedName("HashValue")
        private String hashValue;

        /** SSL绑定ULB和ALB的关系 */
        @SerializedName("Relations")
        private List<SSLRelation> relations;

        /** SSL证书来源，SSL证书来源，0代表证书来自于ULB平台，1代表证书来自于USSL平台 */
        @SerializedName("SSLSource")
        private Integer sslSource;

        /** USSL证书平台的编号,只有当SSLSource为1时才出现 */
        @SerializedName("USSLId")
        private String usslId;

        /** USSL证书平台的域名,只有当SSLSource为1时才出现 */
        @SerializedName("Domains")
        private String domains;

        /** 证书颁发时间,只有当SSLSource为1时才出现 */
        @SerializedName("NotBefore")
        private Integer notBefore;

        /** 证书过期时间,只有当SSLSource为1时才出现 */
        @SerializedName("NotAfter")
        private Integer notAfter;

        public String getSSLId() {
            return sslId;
        }

        public void setSSLId(String sslId) {
            this.sslId = sslId;
        }

        public String getSSLName() {
            return sslName;
        }

        public void setSSLName(String sslName) {
            this.sslName = sslName;
        }

        public String getSSLType() {
            return sslType;
        }

        public void setSSLType(String sslType) {
            this.sslType = sslType;
        }

        public String getSSLContent() {
            return sslContent;
        }

        public void setSSLContent(String sslContent) {
            this.sslContent = sslContent;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getHashValue() {
            return hashValue;
        }

        public void setHashValue(String hashValue) {
            this.hashValue = hashValue;
        }

        public List<SSLRelation> getRelations() {
            return relations;
        }

        public void setRelations(List<SSLRelation> relations) {
            this.relations = relations;
        }

        public Integer getSSLSource() {
            return sslSource;
        }

        public void setSSLSource(Integer sslSource) {
            this.sslSource = sslSource;
        }

        public String getUSSLId() {
            return usslId;
        }

        public void setUSSLId(String usslId) {
            this.usslId = usslId;
        }

        public String getDomains() {
            return domains;
        }

        public void setDomains(String domains) {
            this.domains = domains;
        }

        public Integer getNotBefore() {
            return notBefore;
        }

        public void setNotBefore(Integer notBefore) {
            this.notBefore = notBefore;
        }

        public Integer getNotAfter() {
            return notAfter;
        }

        public void setNotAfter(Integer notAfter) {
            this.notAfter = notAfter;
        }
    }

    public static class SSLRelation extends Response {

        /** 负载均衡实例的ID */
        @SerializedName("LoadBalancerId")
        private String loadBalancerId;

        /** 负载均衡实例的名称 */
        @SerializedName("LoadBalancerName")
        private String loadBalancerName;

        /** 监听器的ID */
        @SerializedName("ListenerId")
        private String listenerId;

        /** 监听器的名称 */
        @SerializedName("ListenerName")
        private String listenerName;

        /** 是否为监听器默认SSL证书 */
        @SerializedName("IsDefault")
        private Boolean isDefault;

        public String getLoadBalancerId() {
            return loadBalancerId;
        }

        public void setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
        }

        public String getLoadBalancerName() {
            return loadBalancerName;
        }

        public void setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
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

        public Boolean getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
        }
    }
}
