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

import java.util.List;

public class ListUhostsecCommonLoginIpResponse extends Response {

    /** IP白名单列表 */
    @SerializedName("Infos")
    private List<IP> infos;

    public List<IP> getInfos() {
        return infos;
    }

    public void setInfos(List<IP> infos) {
        this.infos = infos;
    }

    public static class IP extends Response {

        /** IP */
        @SerializedName("IP")
        private String ip;

        /** ID */
        @SerializedName("ID")
        private String id;

        /** 操作账号 */
        @SerializedName("Account")
        private String account;

        /** 添加时间 */
        @SerializedName("CreateTime")
        private String createTime;

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public String getID() {
            return id;
        }

        public void setID(String id) {
            this.id = id;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }
    }
}
