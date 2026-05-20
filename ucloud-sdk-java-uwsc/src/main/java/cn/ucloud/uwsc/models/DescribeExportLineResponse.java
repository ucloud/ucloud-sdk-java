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
package cn.ucloud.uwsc.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeExportLineResponse extends Response {

    /** 线路信息 */
    @SerializedName("LineInfos")
    private List<LineInfo> lineInfos;

    public List<LineInfo> getLineInfos() {
        return lineInfos;
    }

    public void setLineInfos(List<LineInfo> lineInfos) {
        this.lineInfos = lineInfos;
    }

    public static class LineInfo extends Response {

        /** 名称 */
        @SerializedName("Name")
        private String name;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 线路资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 线路资源ID对应的加速线路ID */
        @SerializedName("InstanceId")
        private String instanceId;

        /** 带宽大小(Mbps) */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** 付费方式(按月、按年等) */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 计费方式(固定带宽: fixed-bw；流量计费：traffic) */
        @SerializedName("PayMode")
        private String payMode;

        /** 入口地域 */
        @SerializedName("FromRegion")
        private String fromRegion;

        /** 入口地域名称 */
        @SerializedName("FromRegionName")
        private String fromRegionName;

        /** 出口地域 */
        @SerializedName("ToRegion")
        private String toRegion;

        /** 出口地域名称 */
        @SerializedName("ToRegionName")
        private String toRegionName;

        /** */
        @SerializedName("IP")
        private List<String> ip;

        /** 线路是否绑定CPE；"1"：已绑定；"0"未绑定 */
        @SerializedName("Status")
        private String status;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 到期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 线路绑定的CPE资源ID */
        @SerializedName("CPEIds")
        private List<String> cpeIds;

        /** 套餐类型 */
        @SerializedName("PkgType")
        private String pkgType;

        /** IP类型 */
        @SerializedName("IpType")
        private String ipType;

        /** 是否过期(normal/expire) */
        @SerializedName("InstanceStatus")
        private String instanceStatus;

        /** */
        @SerializedName("Socks")
        private SocksInfo socks;

        /** 源IP地址 */
        @SerializedName("Source")
        private List<String> source;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getInstanceId() {
            return instanceId;
        }

        public void setInstanceId(String instanceId) {
            this.instanceId = instanceId;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getPayMode() {
            return payMode;
        }

        public void setPayMode(String payMode) {
            this.payMode = payMode;
        }

        public String getFromRegion() {
            return fromRegion;
        }

        public void setFromRegion(String fromRegion) {
            this.fromRegion = fromRegion;
        }

        public String getFromRegionName() {
            return fromRegionName;
        }

        public void setFromRegionName(String fromRegionName) {
            this.fromRegionName = fromRegionName;
        }

        public String getToRegion() {
            return toRegion;
        }

        public void setToRegion(String toRegion) {
            this.toRegion = toRegion;
        }

        public String getToRegionName() {
            return toRegionName;
        }

        public void setToRegionName(String toRegionName) {
            this.toRegionName = toRegionName;
        }

        public List<String> getIP() {
            return ip;
        }

        public void setIP(List<String> ip) {
            this.ip = ip;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public List<String> getCPEIds() {
            return cpeIds;
        }

        public void setCPEIds(List<String> cpeIds) {
            this.cpeIds = cpeIds;
        }

        public String getPkgType() {
            return pkgType;
        }

        public void setPkgType(String pkgType) {
            this.pkgType = pkgType;
        }

        public String getIpType() {
            return ipType;
        }

        public void setIpType(String ipType) {
            this.ipType = ipType;
        }

        public String getInstanceStatus() {
            return instanceStatus;
        }

        public void setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
        }

        public SocksInfo getSocks() {
            return socks;
        }

        public void setSocks(SocksInfo socks) {
            this.socks = socks;
        }

        public List<String> getSource() {
            return source;
        }

        public void setSource(List<String> source) {
            this.source = source;
        }
    }

    public static class SocksInfo extends Response {

        /** */
        @SerializedName("Addr")
        private String addr;

        /** */
        @SerializedName("Port")
        private Integer port;

        /** */
        @SerializedName("Account")
        private String account;

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }
    }
}
