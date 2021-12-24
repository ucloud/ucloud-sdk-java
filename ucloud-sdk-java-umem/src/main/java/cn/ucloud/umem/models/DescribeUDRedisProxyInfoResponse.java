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
package cn.ucloud.umem.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeUDRedisProxyInfoResponse extends Response {

    /** 代理数据集: false */
    @SerializedName("DataSet")
    private List<UDRedisProxyInfo> dataSet;

    public List<UDRedisProxyInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDRedisProxyInfo> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UDRedisProxyInfo extends Response {

        /** 代理资源id: false */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 代理id: false */
        @SerializedName("ProxyId")
        private String proxyId;

        /** 代理ip: false */
        @SerializedName("Vip")
        private String vip;

        /** 代理状态: false */
        @SerializedName("State")
        private String state;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getProxyId() {
            return proxyId;
        }

        public void setProxyId(String proxyId) {
            this.proxyId = proxyId;
        }

        public String getVip() {
            return vip;
        }

        public void setVip(String vip) {
            this.vip = vip;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
