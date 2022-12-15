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
package cn.ucloud.udbproxy.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUDBProxyClientResponse extends Response {

    /** 代理ID */
    @SerializedName("UDBProxyID")
    private String udbProxyID;

    /** 代理节点客户端IP连接信息 */
    @SerializedName("NodeClientInfos")
    private List<NodeClientInfo> nodeClientInfos;

    public String getUDBProxyID() {
        return udbProxyID;
    }

    public void setUDBProxyID(String udbProxyID) {
        this.udbProxyID = udbProxyID;
    }

    public List<NodeClientInfo> getNodeClientInfos() {
        return nodeClientInfos;
    }

    public void setNodeClientInfos(List<NodeClientInfo> nodeClientInfos) {
        this.nodeClientInfos = nodeClientInfos;
    }

    public static class ClientInfo extends Response {

        /** 客户端连接IP */
        @SerializedName("IP")
        private String ip;

        /** 客户端连接IP数 */
        @SerializedName("Count")
        private Integer count;

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }

    public static class NodeClientInfo extends Response {

        /** 客户端IP连接信息 */
        @SerializedName("Records")
        private List<ClientInfo> records;

        /** 代理节点ID */
        @SerializedName("ID")
        private String id;

        /** 代理节点IP */
        @SerializedName("IP")
        private String ip;

        public List<ClientInfo> getRecords() {
            return records;
        }

        public void setRecords(List<ClientInfo> records) {
            this.records = records;
        }

        public String getID() {
            return id;
        }

        public void setID(String id) {
            this.id = id;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }
    }
}
