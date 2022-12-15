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

public class DescribeSupportCiphersResponse extends Response {

    /** 返回支持的TLS最低版本和加密套件，每项参数详见 TLSAndCiphers */
    @SerializedName("DataSet")
    private List<TLSAndCiphers> dataSet;

    public List<TLSAndCiphers> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<TLSAndCiphers> dataSet) {
        this.dataSet = dataSet;
    }

    public static class TLSAndCiphers extends Response {

        /** TLS最低版本 */
        @SerializedName("TLSVersion")
        private String tlsVersion;

        /** 加密套件 */
        @SerializedName("SSLCiphers")
        private List<String> sslCiphers;

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
    }
}
