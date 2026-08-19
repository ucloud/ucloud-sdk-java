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
package cn.ucloud.sandbox.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetSandboxSiteResponse extends Response {

    /** 站点 */
    @SerializedName("Site")
    private Site site;

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public static class Site extends Response {

        /** 名称 */
        @SerializedName("Name")
        private String name;

        /** 是否就绪 */
        @SerializedName("Ready")
        private Boolean ready;

        /** 站点ID */
        @SerializedName("ID")
        private String id;

        /** 沙箱ID */
        @SerializedName("SandboxID")
        private String sandboxID;

        /** 站点访问地址 */
        @SerializedName("Host")
        private String host;

        /** 站点Key ID */
        @SerializedName("KeyID")
        private String keyID;

        /** 更新时间 */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /** 访问码 */
        @SerializedName("AccessCode")
        private String accessCode;

        /** 连接密钥 */
        @SerializedName("ConnectKey")
        private String connectKey;

        /** 站点环境变量。格式：key=value */
        @SerializedName("Envs")
        private List<String> envs;

        /** 自定义域名 */
        @SerializedName("CustomDomain")
        private String customDomain;

        /** 自定义域名签发状态 */
        @SerializedName("CustomDomainStatus")
        private String customDomainStatus;

        /** 自定义域名签发错误信息 */
        @SerializedName("CustomDomainError")
        private String customDomainError;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getReady() {
            return ready;
        }

        public void setReady(Boolean ready) {
            this.ready = ready;
        }

        public String getID() {
            return id;
        }

        public void setID(String id) {
            this.id = id;
        }

        public String getSandboxID() {
            return sandboxID;
        }

        public void setSandboxID(String sandboxID) {
            this.sandboxID = sandboxID;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getKeyID() {
            return keyID;
        }

        public void setKeyID(String keyID) {
            this.keyID = keyID;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public String getAccessCode() {
            return accessCode;
        }

        public void setAccessCode(String accessCode) {
            this.accessCode = accessCode;
        }

        public String getConnectKey() {
            return connectKey;
        }

        public void setConnectKey(String connectKey) {
            this.connectKey = connectKey;
        }

        public List<String> getEnvs() {
            return envs;
        }

        public void setEnvs(List<String> envs) {
            this.envs = envs;
        }

        public String getCustomDomain() {
            return customDomain;
        }

        public void setCustomDomain(String customDomain) {
            this.customDomain = customDomain;
        }

        public String getCustomDomainStatus() {
            return customDomainStatus;
        }

        public void setCustomDomainStatus(String customDomainStatus) {
            this.customDomainStatus = customDomainStatus;
        }

        public String getCustomDomainError() {
            return customDomainError;
        }

        public void setCustomDomainError(String customDomainError) {
            this.customDomainError = customDomainError;
        }
    }
}
