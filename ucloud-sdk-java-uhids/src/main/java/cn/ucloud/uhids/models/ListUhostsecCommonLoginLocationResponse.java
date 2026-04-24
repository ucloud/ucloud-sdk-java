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

public class ListUhostsecCommonLoginLocationResponse extends Response {

    /** 公共登录地列表 */
    @SerializedName("Infos")
    private List<CommonLoginLocationInfo> infos;

    public List<CommonLoginLocationInfo> getInfos() {
        return infos;
    }

    public void setInfos(List<CommonLoginLocationInfo> infos) {
        this.infos = infos;
    }

    public static class CommonLoginLocationInfo extends Response {

        /** 国家 */
        @SerializedName("Country")
        private String country;

        /** 省份 */
        @SerializedName("Province")
        private String province;

        /** 城市 */
        @SerializedName("City")
        private String city;

        /** 账号 */
        @SerializedName("Account")
        private String account;

        /** 创建/修改时间 */
        @SerializedName("CreateTime")
        private String createTime;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
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
