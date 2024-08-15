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

public class GetNewUcdnLogClientIpStatisticsResponse extends Response {

    /** 客户端ip数据集合。 */
    @SerializedName("ClientIpStatisticsList")
    private List<ClientIpStatisticsList> clientIpStatisticsList;

    public List<ClientIpStatisticsList> getClientIpStatisticsList() {
        return clientIpStatisticsList;
    }

    public void setClientIpStatisticsList(List<ClientIpStatisticsList> clientIpStatisticsList) {
        this.clientIpStatisticsList = clientIpStatisticsList;
    }

    public static class ClientIpStatisticsList extends Response {

        /** 流量单位字节 */
        @SerializedName("Flow")
        private Integer flow;

        /** 客户端IP */
        @SerializedName("IP")
        private String ip;

        /** 请求数 */
        @SerializedName("Requst")
        private Integer requst;

        /** 流量占比 */
        @SerializedName("FlowPercent")
        private Double flowPercent;

        /** 请求数占比 */
        @SerializedName("RequestPercent")
        private Double requestPercent;

        public Integer getFlow() {
            return flow;
        }

        public void setFlow(Integer flow) {
            this.flow = flow;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public Integer getRequst() {
            return requst;
        }

        public void setRequst(Integer requst) {
            this.requst = requst;
        }

        public Double getFlowPercent() {
            return flowPercent;
        }

        public void setFlowPercent(Double flowPercent) {
            this.flowPercent = flowPercent;
        }

        public Double getRequestPercent() {
            return requestPercent;
        }

        public void setRequestPercent(Double requestPercent) {
            this.requestPercent = requestPercent;
        }
    }
}
