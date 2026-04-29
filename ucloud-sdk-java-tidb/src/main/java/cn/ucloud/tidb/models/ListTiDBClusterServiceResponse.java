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
package cn.ucloud.tidb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListTiDBClusterServiceResponse extends Response {

    /** 集群列表 */
    @SerializedName("Data")
    private List<UTiDBServiceData> data;

    public List<UTiDBServiceData> getData() {
        return data;
    }

    public void setData(List<UTiDBServiceData> data) {
        this.data = data;
    }

    public static class UTiDBServiceData extends Response {

        /** grafana地址 */
        @SerializedName("GrafanaUrl")
        private String grafanaUrl;

        /** 集群ID */
        @SerializedName("Id")
        private String id;

        /** 集群名称 */
        @SerializedName("Name")
        private String name;

        /** 集群ip */
        @SerializedName("Ip")
        private String ip;

        /** 集群端口 */
        @SerializedName("Port")
        private Integer port;

        /** 集群状态 */
        @SerializedName("State")
        private String state;

        /** 集群TiFlash服务状态 */
        @SerializedName("TiFlashState")
        private String tiFlashState;

        /** 集群Binlog服务状态 */
        @SerializedName("BinlogState")
        private String binlogState;

        /** 自动备份状态 */
        @SerializedName("AutoBackup")
        private String autoBackup;

        /** 私有网Id */
        @SerializedName("VPCId")
        private String vpcId;

        /** 子网ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 集群版本 */
        @SerializedName("Version")
        private String version;

        /** 容灾类型 */
        @SerializedName("DTType")
        private Integer dtType;

        /** Dashboard地址 */
        @SerializedName("DashboardUrl")
        private String dashboardUrl;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        public String getGrafanaUrl() {
            return grafanaUrl;
        }

        public void setGrafanaUrl(String grafanaUrl) {
            this.grafanaUrl = grafanaUrl;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getTiFlashState() {
            return tiFlashState;
        }

        public void setTiFlashState(String tiFlashState) {
            this.tiFlashState = tiFlashState;
        }

        public String getBinlogState() {
            return binlogState;
        }

        public void setBinlogState(String binlogState) {
            this.binlogState = binlogState;
        }

        public String getAutoBackup() {
            return autoBackup;
        }

        public void setAutoBackup(String autoBackup) {
            this.autoBackup = autoBackup;
        }

        public String getVPCId() {
            return vpcId;
        }

        public void setVPCId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getSubnetId() {
            return subnetId;
        }

        public void setSubnetId(String subnetId) {
            this.subnetId = subnetId;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Integer getDTType() {
            return dtType;
        }

        public void setDTType(Integer dtType) {
            this.dtType = dtType;
        }

        public String getDashboardUrl() {
            return dashboardUrl;
        }

        public void setDashboardUrl(String dashboardUrl) {
            this.dashboardUrl = dashboardUrl;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }
    }
}
