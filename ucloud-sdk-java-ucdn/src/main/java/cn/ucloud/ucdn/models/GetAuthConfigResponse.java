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

public class GetAuthConfigResponse extends Response {

    /** 鉴权配置列表 */
    @SerializedName("AuthConfigs")
    private List<KwaiDomainAuthConfig> authConfigs;

    public List<KwaiDomainAuthConfig> getAuthConfigs() {
        return authConfigs;
    }

    public void setAuthConfigs(List<KwaiDomainAuthConfig> authConfigs) {
        this.authConfigs = authConfigs;
    }

    public static class KwaiAuthConfig extends Response {

        /** 类型 pkey / ksc / typeA */
        @SerializedName("Type")
        private String type;

        /** */
        @SerializedName("Keys")
        private List<KwaiAuthKv> keys;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<KwaiAuthKv> getKeys() {
            return keys;
        }

        public void setKeys(List<KwaiAuthKv> keys) {
            this.keys = keys;
        }
    }

    public static class KwaiAuthKv extends Response {

        /** key信息 */
        @SerializedName("Key")
        private String key;

        /** iv信息 */
        @SerializedName("Iv")
        private String iv;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getIv() {
            return iv;
        }

        public void setIv(String iv) {
            this.iv = iv;
        }
    }

    public static class KwaiDomainAuthConfig extends Response {

        /** 域名 */
        @SerializedName("Domain")
        private String domain;

        /** */
        @SerializedName("Config")
        private List<KwaiAuthConfig> config;

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public List<KwaiAuthConfig> getConfig() {
            return config;
        }

        public void setConfig(List<KwaiAuthConfig> config) {
            this.config = config;
        }
    }
}
