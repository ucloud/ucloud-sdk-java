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

public class DescribeUGA3InstanceResponse extends Response {

    /** 全球加速实例信息列表 */
    @SerializedName("ForwardInstanceInfos")
    private List<ForwardInfo> forwardInstanceInfos;

    /** 符合条件的总数 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<ForwardInfo> getForwardInstanceInfos() {
        return forwardInstanceInfos;
    }

    public void setForwardInstanceInfos(List<ForwardInfo> forwardInstanceInfos) {
        this.forwardInstanceInfos = forwardInstanceInfos;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class AccelerationAreaInfos extends Response {

        /** 加速区code */
        @SerializedName("AccelerationArea")
        private String accelerationArea;

        /** 加速节点信息 */
        @SerializedName("AccelerationNodes")
        private List<SrcAreaInfo> accelerationNodes;

        public String getAccelerationArea() {
            return accelerationArea;
        }

        public void setAccelerationArea(String accelerationArea) {
            this.accelerationArea = accelerationArea;
        }

        public List<SrcAreaInfo> getAccelerationNodes() {
            return accelerationNodes;
        }

        public void setAccelerationNodes(List<SrcAreaInfo> accelerationNodes) {
            this.accelerationNodes = accelerationNodes;
        }
    }

    public static class ForwardInfo extends Response {

        /** 加速配置ID */
        @SerializedName("InstanceId")
        private String instanceId;

        /** 加速域名 */
        @SerializedName("CName")
        private String cName;

        /** 加速实例名称 */
        @SerializedName("Name")
        private String name;

        /** 加速大区代码 */
        @SerializedName("AccelerationArea")
        private String accelerationArea;

        /** 加速大区名称 */
        @SerializedName("AccelerationAreaName")
        private String accelerationAreaName;

        /** 加速节点列表 */
        @SerializedName("AccelerationAreaInfos")
        private List<AccelerationAreaInfos> accelerationAreaInfos;

        /** 回源出口IP地址 */
        @SerializedName("EgressIpList")
        private List<OutPublicIpInfo> egressIpList;

        /** 购买的带宽值 */
        @SerializedName("Bandwidth")
        private Integer bandwidth;

        /** 源站中文名 */
        @SerializedName("OriginArea")
        private String originArea;

        /** 源站AreaCode */
        @SerializedName("OriginAreaCode")
        private String originAreaCode;

        /** 资源创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 资源过期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 计费方式 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 端口列表 */
        @SerializedName("PortSets")
        private List<ForwardTask> portSets;

        /** 源站IP列表，多个值由半角英文逗号相隔 */
        @SerializedName("IPList")
        private List<String> ipList;

        /** 源站域名 */
        @SerializedName("Domain")
        private String domain;

        public String getInstanceId() {
            return instanceId;
        }

        public void setInstanceId(String instanceId) {
            this.instanceId = instanceId;
        }

        public String getCName() {
            return cName;
        }

        public void setCName(String cName) {
            this.cName = cName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAccelerationArea() {
            return accelerationArea;
        }

        public void setAccelerationArea(String accelerationArea) {
            this.accelerationArea = accelerationArea;
        }

        public String getAccelerationAreaName() {
            return accelerationAreaName;
        }

        public void setAccelerationAreaName(String accelerationAreaName) {
            this.accelerationAreaName = accelerationAreaName;
        }

        public List<AccelerationAreaInfos> getAccelerationAreaInfos() {
            return accelerationAreaInfos;
        }

        public void setAccelerationAreaInfos(List<AccelerationAreaInfos> accelerationAreaInfos) {
            this.accelerationAreaInfos = accelerationAreaInfos;
        }

        public List<OutPublicIpInfo> getEgressIpList() {
            return egressIpList;
        }

        public void setEgressIpList(List<OutPublicIpInfo> egressIpList) {
            this.egressIpList = egressIpList;
        }

        public Integer getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getOriginArea() {
            return originArea;
        }

        public void setOriginArea(String originArea) {
            this.originArea = originArea;
        }

        public String getOriginAreaCode() {
            return originAreaCode;
        }

        public void setOriginAreaCode(String originAreaCode) {
            this.originAreaCode = originAreaCode;
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

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public List<ForwardTask> getPortSets() {
            return portSets;
        }

        public void setPortSets(List<ForwardTask> portSets) {
            this.portSets = portSets;
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

    public static class ForwardTask extends Response {

        /**
         * 转发协议，枚举值["TCP"，"UDP"，"HTTPHTTP"，"HTTPSHTTP"，"HTTPSHTTPS"，"WSWS"，"WSSWS"，"WSSWSS"]。TCP和UDP代表四层转发，其余为七层转发。
         */
        @SerializedName("Protocol")
        private String protocol;

        /** 源站服务器监听的端口号 */
        @SerializedName("RSPort")
        private Integer rsPort;

        /** 加速端口 */
        @SerializedName("Port")
        private Integer port;

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

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
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

    public static class SrcAreaInfo extends Response {

        /** AreaCode ,城市机场代码 */
        @SerializedName("AreaCode")
        private String areaCode;

        /** AreaCode对应城市名 */
        @SerializedName("Area")
        private String area;

        /** 国旗Emoji */
        @SerializedName("FlagEmoji")
        private String flagEmoji;

        /** 国旗Unicode */
        @SerializedName("FlagUnicode")
        private String flagUnicode;

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getFlagEmoji() {
            return flagEmoji;
        }

        public void setFlagEmoji(String flagEmoji) {
            this.flagEmoji = flagEmoji;
        }

        public String getFlagUnicode() {
            return flagUnicode;
        }

        public void setFlagUnicode(String flagUnicode) {
            this.flagUnicode = flagUnicode;
        }
    }
}
