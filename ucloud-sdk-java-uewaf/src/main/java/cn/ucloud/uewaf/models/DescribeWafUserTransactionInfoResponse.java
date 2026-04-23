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

public class DescribeWafUserTransactionInfoResponse extends Response {

    /** 用户购买服务的详细信息，参考TransactionInfo */
    @SerializedName("TransactionInfo")
    private TransactionInfo transactionInfo;

    public TransactionInfo getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(TransactionInfo transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    public static class TransactionInfo extends Response {

        /** 资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 版本类型 */
        @SerializedName("Editon")
        private String editon;

        /** 服务到期时间 */
        @SerializedName("ExpireTime")
        private String expireTime;

        /** 付费类型 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 资源的唯一索引 */
        @SerializedName("TransactionId")
        private Integer transactionId;

        /** 资源订单号 */
        @SerializedName("TransactionNo")
        private String transactionNo;

        /** 是否购买了WAF */
        @SerializedName("HasWaf")
        private Boolean hasWaf;

        /** 是否已过期，有此字段即为已过期 */
        @SerializedName("Expired")
        private String expired;

        /** 主工作区 */
        @SerializedName("WorkZone")
        private String workZone;

        /** 部署区域，WorkZone为ULB时，显示为ULB id（列表） */
        @SerializedName("WorkRegions")
        private String workRegions;

        /** 服务是否生效中 */
        @SerializedName("Serving")
        private String serving;

        /** WorkZone 为ULB时候，显示对应ULB上的域名列表 */
        @SerializedName("Servers")
        private Object servers;

        /** 是否开启日志扩展包 */
        @SerializedName("LogStorage")
        private Integer logStorage;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getEditon() {
            return editon;
        }

        public void setEditon(String editon) {
            this.editon = editon;
        }

        public String getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(String expireTime) {
            this.expireTime = expireTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(Integer transactionId) {
            this.transactionId = transactionId;
        }

        public String getTransactionNo() {
            return transactionNo;
        }

        public void setTransactionNo(String transactionNo) {
            this.transactionNo = transactionNo;
        }

        public Boolean getHasWaf() {
            return hasWaf;
        }

        public void setHasWaf(Boolean hasWaf) {
            this.hasWaf = hasWaf;
        }

        public String getExpired() {
            return expired;
        }

        public void setExpired(String expired) {
            this.expired = expired;
        }

        public String getWorkZone() {
            return workZone;
        }

        public void setWorkZone(String workZone) {
            this.workZone = workZone;
        }

        public String getWorkRegions() {
            return workRegions;
        }

        public void setWorkRegions(String workRegions) {
            this.workRegions = workRegions;
        }

        public String getServing() {
            return serving;
        }

        public void setServing(String serving) {
            this.serving = serving;
        }

        public Object getServers() {
            return servers;
        }

        public void setServers(Object servers) {
            this.servers = servers;
        }

        public Integer getLogStorage() {
            return logStorage;
        }

        public void setLogStorage(Integer logStorage) {
            this.logStorage = logStorage;
        }
    }
}
