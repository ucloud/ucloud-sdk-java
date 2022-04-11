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
package cn.ucloud.uaccount.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;

public class GetNetworkMaskResponse extends Response {

    /** 接口返回数据 */
    @SerializedName("Data")
    private NetworkMask data;

    public NetworkMask getData() {
        return data;
    }

    public void setData(NetworkMask data) {
        this.data = data;
    }

    public static class NetworkMask extends Response {

        /** API调用网络掩码，默认空字符串，不限制登录IP，多个IP以英文逗号分隔。 */
        @SerializedName("APINetworkMask")
        private String apiNetworkMask;

        /** 登录网络掩码，默认空字符串，不限制登录IP，多个IP以英文逗号分隔。 */
        @SerializedName("LoginNetworkMask")
        private String loginNetworkMask;

        public String getAPINetworkMask() {
            return apiNetworkMask;
        }

        public void setAPINetworkMask(String apiNetworkMask) {
            this.apiNetworkMask = apiNetworkMask;
        }

        public String getLoginNetworkMask() {
            return loginNetworkMask;
        }

        public void setLoginNetworkMask(String loginNetworkMask) {
            this.loginNetworkMask = loginNetworkMask;
        }
    }
}
