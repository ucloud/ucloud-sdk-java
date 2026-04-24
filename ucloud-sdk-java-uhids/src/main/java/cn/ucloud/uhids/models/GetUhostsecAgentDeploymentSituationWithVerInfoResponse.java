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
package cn.ucloud.uhids.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUhostsecAgentDeploymentSituationWithVerInfoResponse extends Response {

    /** 主机信息 */
    @SerializedName("InfoList")
    private List<HostAgentStatusInfo> infoList;

    /** 主机总数 */
    @SerializedName("TotalNum")
    private Integer totalNum;

    /** 已安装UHIDS的主机数 */
    @SerializedName("InstallNum")
    private Integer installNum;

    /** 未安装UHIDS的主机数 */
    @SerializedName("UninstallNum")
    private Integer uninstallNum;

    public List<HostAgentStatusInfo> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<HostAgentStatusInfo> infoList) {
        this.infoList = infoList;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getInstallNum() {
        return installNum;
    }

    public void setInstallNum(Integer installNum) {
        this.installNum = installNum;
    }

    public Integer getUninstallNum() {
        return uninstallNum;
    }

    public void setUninstallNum(Integer uninstallNum) {
        this.uninstallNum = uninstallNum;
    }

    public static class HostAgentStatusInfo extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 主机IP列表 */
        @SerializedName("Ip")
        private List<String> ip;

        /** uhost资源短ID */
        @SerializedName("UHostId")
        private String uHostId;

        /** UHIDS的Agent识别ID */
        @SerializedName("AgentId")
        private String agentId;

        /** 是否已经安装 */
        @SerializedName("Installed")
        private Boolean installed;

        /** 此主机当前UHIDS版本信息 */
        @SerializedName("NowVer")
        private Integer nowVer;

        /** 用户设置此主机UHIDS版本信息 */
        @SerializedName("SetVer")
        private Integer setVer;

        /** uhost的备注名 */
        @SerializedName("HostName")
        private String hostName;

        /** 网卡信息列表 */
        @SerializedName("NICs")
        private List<NIC> niCs;

        /** 系统版本 */
        @SerializedName("OsName")
        private String osName;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public List<String> getIp() {
            return ip;
        }

        public void setIp(List<String> ip) {
            this.ip = ip;
        }

        public String getUHostId() {
            return uHostId;
        }

        public void setUHostId(String uHostId) {
            this.uHostId = uHostId;
        }

        public String getAgentId() {
            return agentId;
        }

        public void setAgentId(String agentId) {
            this.agentId = agentId;
        }

        public Boolean getInstalled() {
            return installed;
        }

        public void setInstalled(Boolean installed) {
            this.installed = installed;
        }

        public Integer getNowVer() {
            return nowVer;
        }

        public void setNowVer(Integer nowVer) {
            this.nowVer = nowVer;
        }

        public Integer getSetVer() {
            return setVer;
        }

        public void setSetVer(Integer setVer) {
            this.setVer = setVer;
        }

        public String getHostName() {
            return hostName;
        }

        public void setHostName(String hostName) {
            this.hostName = hostName;
        }

        public List<NIC> getNICs() {
            return niCs;
        }

        public void setNICs(List<NIC> niCs) {
            this.niCs = niCs;
        }

        public String getOsName() {
            return osName;
        }

        public void setOsName(String osName) {
            this.osName = osName;
        }
    }

    public static class NIC extends Response {

        /** 网卡ip */
        @SerializedName("IP")
        private String ip;

        /** 网卡mac */
        @SerializedName("Mac")
        private String mac;

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }
    }
}
