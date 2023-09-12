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
package cn.ucloud.uewaf.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeWafAttackDetailListInfoResponse extends Response {

    /** 攻击详情列表，参考WafAttack */
    @SerializedName("DetailList")
    private List<WafAttack> detailList;

    /** 攻击详情总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<WafAttack> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<WafAttack> detailList) {
        this.detailList = detailList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class WafAlert extends Response {

        /** 规则描述 */
        @SerializedName("Description")
        private String description;

        /** 匹配规则ID */
        @SerializedName("Id")
        private Integer id;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
    }

    public static class WafAttack extends Response {

        /** 区域 */
        @SerializedName("Region")
        private String region;

        /** 协议 */
        @SerializedName("Protocol")
        private String protocol;

        /** 服务器名称 */
        @SerializedName("ServerName")
        private String serverName;

        /** 目标IP地址 */
        @SerializedName("DestIp")
        private String destIp;

        /** 端口 */
        @SerializedName("Port")
        private String port;

        /** 告警匹配信息，参考WafAlert */
        @SerializedName("Alerts")
        private List<WafAlert> alerts;

        /** 攻击类型 */
        @SerializedName("Attack")
        private String attack;

        /** 请求方法 */
        @SerializedName("Method")
        private String method;

        /** 是否误报 */
        @SerializedName("FalsePositive")
        private Boolean falsePositive;

        /** 风险等级 */
        @SerializedName("RiskRank")
        private String riskRank;

        /** 攻击时间戳 */
        @SerializedName("TimeStamp")
        private Integer timeStamp;

        /** 主机名 */
        @SerializedName("Host")
        private String host;

        /** 引用地址 */
        @SerializedName("Referer")
        private String referer;

        /** 攻击次数 */
        @SerializedName("Count")
        private Integer count;

        /** URI */
        @SerializedName("Uri")
        private String uri;

        /** 客户端 */
        @SerializedName("Client")
        private String client;

        /** 工作模式 */
        @SerializedName("Mode")
        private String mode;

        /** 匹配动作 */
        @SerializedName("Action")
        private String action;

        /** 用户代理 */
        @SerializedName("UA")
        private String ua;

        /** 参数 */
        @SerializedName("Args")
        private String args;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getServerName() {
            return serverName;
        }

        public void setServerName(String serverName) {
            this.serverName = serverName;
        }

        public String getDestIp() {
            return destIp;
        }

        public void setDestIp(String destIp) {
            this.destIp = destIp;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public List<WafAlert> getAlerts() {
            return alerts;
        }

        public void setAlerts(List<WafAlert> alerts) {
            this.alerts = alerts;
        }

        public String getAttack() {
            return attack;
        }

        public void setAttack(String attack) {
            this.attack = attack;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public Boolean getFalsePositive() {
            return falsePositive;
        }

        public void setFalsePositive(Boolean falsePositive) {
            this.falsePositive = falsePositive;
        }

        public String getRiskRank() {
            return riskRank;
        }

        public void setRiskRank(String riskRank) {
            this.riskRank = riskRank;
        }

        public Integer getTimeStamp() {
            return timeStamp;
        }

        public void setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getReferer() {
            return referer;
        }

        public void setReferer(String referer) {
            this.referer = referer;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public String getClient() {
            return client;
        }

        public void setClient(String client) {
            this.client = client;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getUA() {
            return ua;
        }

        public void setUA(String ua) {
            this.ua = ua;
        }

        public String getArgs() {
            return args;
        }

        public void setArgs(String args) {
            this.args = args;
        }
    }
}
