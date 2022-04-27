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

public class DescribeUGAInstanceResponse extends Response {

    /** 全球加速实例信息列表 */
    @SerializedName("UGAList")
    private List<UGAAInfo> ugaList;

    /** 符合条件的总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<UGAAInfo> getUGAList() {
        return ugaList;
    }

    public void setUGAList(List<UGAAInfo> ugaList) {
        this.ugaList = ugaList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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

    public static class UGAL7Forwarder extends Response {

        /** 接入端口 */
        @SerializedName("Port")
        private Integer port;

        /** 转发协议，枚举值["TCP"，"UDP"，"HTTPHTTP"，"HTTPSHTTP"，"HTTPSHTTPS"]。TCP和UDP代表四层转发，其余为七层转发 */
        @SerializedName("Protocol")
        private String protocol;

        /** RSPort，源站监听端口 */
        @SerializedName("RSPort")
        private Integer rsPort;

        /** 证书ID */
        @SerializedName("SSLId")
        private String sslId;

        /** 证书名称 */
        @SerializedName("SSLName")
        private String sslName;

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public Integer getRSPort() {
            return rsPort;
        }

        public void setRSPort(Integer rsPort) {
            this.rsPort = rsPort;
        }

        public String getSSLId() {
            return sslId;
        }

        public void setSSLId(String sslId) {
            this.sslId = sslId;
        }

        public String getSSLName() {
            return sslName;
        }

        public void setSSLName(String sslName) {
            this.sslName = sslName;
        }
    }

    public static class UGAL4Forwarder extends Response {

        /** 接入端口 */
        @SerializedName("Port")
        private Integer port;

        /** 转发协议，枚举值["TCP"，"UDP"，"HTTPHTTP"，"HTTPSHTTP"，"HTTPSHTTPS"]。TCP和UDP代表四层转发，其余为七层转发 */
        @SerializedName("Protocol")
        private String protocol;

        /** RSPort，源站监听端口 */
        @SerializedName("RSPort")
        private Integer rsPort;

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public Integer getRSPort() {
            return rsPort;
        }

        public void setRSPort(Integer rsPort) {
            this.rsPort = rsPort;
        }
    }

    public static class UGAATask extends Response {

        /** 接入端口 */
        @SerializedName("Port")
        private Integer port;

        /** 转发协议，枚举值["TCP"，"UDP"，"HTTPHTTP"，"HTTPSHTTP"，"HTTPSHTTPS"]。TCP和UDP代表四层转发，其余为七层转发 */
        @SerializedName("Protocol")
        private String protocol;

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }
    }

    public static class UPathSet extends Response {

        /** UPath名字 */
        @SerializedName("UPathName")
        private String uPathName;

        /** UPath 实例ID */
        @SerializedName("UPathId")
        private String uPathId;

        /** 带宽 Mbps, 1~800Mbps */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** 线路ID */
        @SerializedName("LineId")
        private String lineId;

        /** 线路起点中文名字，加速区域 */
        @SerializedName("LineFromName")
        private String lineFromName;

        /** 线路对端中文名字，源站区域 */
        @SerializedName("LineToName")
        private String lineToName;

        /** 线路起点英文代号，加速区域 */
        @SerializedName("LineFrom")
        private String lineFrom;

        /** 线路对端英文代号，源站区域 */
        @SerializedName("LineTo")
        private String lineTo;

        public String getUPathName() {
            return uPathName;
        }

        public void setUPathName(String uPathName) {
            this.uPathName = uPathName;
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

        public String getLineFrom() {
            return lineFrom;
        }

        public void setLineFrom(String lineFrom) {
            this.lineFrom = lineFrom;
        }

        public String getLineTo() {
            return lineTo;
        }

        public void setLineTo(String lineTo) {
            this.lineTo = lineTo;
        }
    }

    public static class UGAAInfo extends Response {

        /** 加速配置实例ID */
        @SerializedName("UGAId")
        private String ugaId;

        /** 加速域名，请在加速区域配置您的业务域名的CName记录值为加速域名 */
        @SerializedName("CName")
        private String cName;

        /** 加速配置名称 */
        @SerializedName("UGAName")
        private String ugaName;

        /** 源站IP列表，多个值由半角英文逗号相隔 */
        @SerializedName("IPList")
        private List<String> ipList;

        /** 源站域名 */
        @SerializedName("Domain")
        private String domain;

        /** 源站所在区域，加速实例在绑定线路后会自动设置该值。console页面上通过该值过滤加速实例可以绑定的upath实例。注意：缺少该值会导致在console上无法修改线路 */
        @SerializedName("Location")
        private String location;

        /** 绑定的加速线路 */
        @SerializedName("UPathSet")
        private List<UPathSet> uPathSet;

        /** 端口配置信息（不再维护，建议使用ForwarderSet） */
        @SerializedName("TaskSet")
        private List<UGAATask> taskSet;

        /** UGA 4层转发器配置，记录接入或回源端口，接入或回源协议信息 */
        @SerializedName("L4ForwarderSet")
        private List<UGAL4Forwarder> l4ForwarderSet;

        /** UGA 7层转发器配置，记录接入或回源端口，接入或回源协议信息 如绑定证书会返回证书ID */
        @SerializedName("L7ForwarderSet")
        private List<UGAL7Forwarder> l7ForwarderSet;

        /** 线路出口IP地址 */
        @SerializedName("OutPublicIpList")
        private List<OutPublicIpInfo> outPublicIpList;

        public String getUGAId() {
            return ugaId;
        }

        public void setUGAId(String ugaId) {
            this.ugaId = ugaId;
        }

        public String getCName() {
            return cName;
        }

        public void setCName(String cName) {
            this.cName = cName;
        }

        public String getUGAName() {
            return ugaName;
        }

        public void setUGAName(String ugaName) {
            this.ugaName = ugaName;
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

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public List<UPathSet> getUPathSet() {
            return uPathSet;
        }

        public void setUPathSet(List<UPathSet> uPathSet) {
            this.uPathSet = uPathSet;
        }

        public List<UGAATask> getTaskSet() {
            return taskSet;
        }

        public void setTaskSet(List<UGAATask> taskSet) {
            this.taskSet = taskSet;
        }

        public List<UGAL4Forwarder> getL4ForwarderSet() {
            return l4ForwarderSet;
        }

        public void setL4ForwarderSet(List<UGAL4Forwarder> l4ForwarderSet) {
            this.l4ForwarderSet = l4ForwarderSet;
        }

        public List<UGAL7Forwarder> getL7ForwarderSet() {
            return l7ForwarderSet;
        }

        public void setL7ForwarderSet(List<UGAL7Forwarder> l7ForwarderSet) {
            this.l7ForwarderSet = l7ForwarderSet;
        }

        public List<OutPublicIpInfo> getOutPublicIpList() {
            return outPublicIpList;
        }

        public void setOutPublicIpList(List<OutPublicIpInfo> outPublicIpList) {
            this.outPublicIpList = outPublicIpList;
        }
    }
}
