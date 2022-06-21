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
package cn.ucloud.pathx.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUPathResponse extends Response {

    /** 线路信息数组 */
    @SerializedName("UPathSet")
    private List<UPathInfo> uPathSet;

    public List<UPathInfo> getUPathSet() {
        return uPathSet;
    }

    public void setUPathSet(List<UPathInfo> uPathSet) {
        this.uPathSet = uPathSet;
    }

    public static class PathXUGAInfo extends Response {

        /** 加速配置ID */
        @SerializedName("UGAId")
        private String ugaId;

        /** 源站IP列表，多个值由半角英文逗号相隔 */
        @SerializedName("IPList")
        private List<String> ipList;

        /** 源站域名 */
        @SerializedName("Domain")
        private String domain;

        public String getUGAId() {
            return ugaId;
        }

        public void setUGAId(String ugaId) {
            this.ugaId = ugaId;
        }

        public List<String> getIPList() {
            return ipList;
        }

        public void setIPList(List<String> ipList) {
            this.ipList = ipList;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }
    }

    public static class UPathInfo extends Response {

        /** 是否为后付费实例 */
        @SerializedName("PostPaid")
        private Boolean postPaid;

        /** 计费模式，默认为Month 按月收费,可选范围['Month','Year','Dynamic'] */
        @SerializedName("ChargeType")
        private String chargeType;

        /** UPath实例名字 */
        @SerializedName("Name")
        private String name;

        /** UPath加速线路实例ID */
        @SerializedName("UPathId")
        private String uPathId;

        /** 带宽，单位Mbps */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** 选择的线路 */
        @SerializedName("LineId")
        private String lineId;

        /** 与该UPath绑定的UGA列表 */
        @SerializedName("UGAList")
        private List<PathXUGAInfo> ugaList;

        /** UPath创建的时间，10位时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** UPath的过期时间，10位时间戳 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 线路入口名称 */
        @SerializedName("LineFromName")
        private String lineFromName;

        /** 线路出口名称 */
        @SerializedName("LineToName")
        private String lineToName;

        /** 线路出口IP数组 */
        @SerializedName("OutPublicIpList")
        private List<OutPublicIpInfo> outPublicIpList;

        public Boolean getPostPaid() {
            return postPaid;
        }

        public void setPostPaid(Boolean postPaid) {
            this.postPaid = postPaid;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUPathId() {
            return uPathId;
        }

        public void setUPathId(String uPathId) {
            this.uPathId = uPathId;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getLineId() {
            return lineId;
        }

        public void setLineId(String lineId) {
            this.lineId = lineId;
        }

        public List<PathXUGAInfo> getUGAList() {
            return ugaList;
        }

        public void setUGAList(List<PathXUGAInfo> ugaList) {
            this.ugaList = ugaList;
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

        public String getLineFromName() {
            return lineFromName;
        }

        public void setLineFromName(String lineFromName) {
            this.lineFromName = lineFromName;
        }

        public String getLineToName() {
            return lineToName;
        }

        public void setLineToName(String lineToName) {
            this.lineToName = lineToName;
        }

        public List<OutPublicIpInfo> getOutPublicIpList() {
            return outPublicIpList;
        }

        public void setOutPublicIpList(List<OutPublicIpInfo> outPublicIpList) {
            this.outPublicIpList = outPublicIpList;
        }
    }

    public static class OutPublicIpInfo extends Response {

        /** 线路回源节点EIP */
        @SerializedName("IP")
        private String ip;

        /** 线路回源节点机房代号 */
        @SerializedName("Area")
        private String area;

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }
    }
}
