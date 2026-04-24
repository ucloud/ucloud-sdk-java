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
package cn.ucloud.uhids.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class QueryNewestUpdateTimeResponse extends Response {

    /** 数据最新更新时间 */
    @SerializedName("Result")
    private DataSignatureNewestUpdateTime result;

    public DataSignatureNewestUpdateTime getResult() {
        return result;
    }

    public void setResult(DataSignatureNewestUpdateTime result) {
        this.result = result;
    }

    public static class DataSignatureNewestUpdateTime extends Response {

        /** 木马样本最新更新时间 */
        @SerializedName("Torojan")
        private String torojan;

        /** web基线最新更新时间 */
        @SerializedName("WebBase")
        private String webBase;

        /** Webshell最新更新时间 */
        @SerializedName("Webshell")
        private String webshell;

        /** 漏洞最新更新时间 */
        @SerializedName("Vul")
        private String vul;

        /** 登录流水最新更新时间 */
        @SerializedName("Login")
        private String login;

        public String getTorojan() {
            return torojan;
        }

        public void setTorojan(String torojan) {
            this.torojan = torojan;
        }

        public String getWebBase() {
            return webBase;
        }

        public void setWebBase(String webBase) {
            this.webBase = webBase;
        }

        public String getWebshell() {
            return webshell;
        }

        public void setWebshell(String webshell) {
            this.webshell = webshell;
        }

        public String getVul() {
            return vul;
        }

        public void setVul(String vul) {
            this.vul = vul;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }
    }
}
