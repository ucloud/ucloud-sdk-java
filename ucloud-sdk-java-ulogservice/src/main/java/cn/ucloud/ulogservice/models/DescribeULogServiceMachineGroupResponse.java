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
package cn.ucloud.ulogservice.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeULogServiceMachineGroupResponse extends Response {

    /** 机器组信息 */
    @SerializedName("MachineGroup")
    private MachineInfo machineGroup;

    public MachineInfo getMachineGroup() {
        return machineGroup;
    }

    public void setMachineGroup(MachineInfo machineGroup) {
        this.machineGroup = machineGroup;
    }

    public static class LogAgent extends Response {

        /** 主机标签 */
        @SerializedName("Label")
        private String label;

        /** 主机IP */
        @SerializedName("HostIp")
        private String hostIp;

        /** logagent id */
        @SerializedName("InstanceId")
        private String instanceId;

        /** LogAgent版本 */
        @SerializedName("AgentVersion")
        private String agentVersion;

        /** logagent状态，NORMAL：正常，OFFLINE： 离线 */
        @SerializedName("Status")
        private String status;

        /** 离线时间，单位是ms */
        @SerializedName("OffLineTime")
        private String offLineTime;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getHostIp() {
            return hostIp;
        }

        public void setHostIp(String hostIp) {
            this.hostIp = hostIp;
        }

        public String getInstanceId() {
            return instanceId;
        }

        public void setInstanceId(String instanceId) {
            this.instanceId = instanceId;
        }

        public String getAgentVersion() {
            return agentVersion;
        }

        public void setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getOffLineTime() {
            return offLineTime;
        }

        public void setOffLineTime(String offLineTime) {
            this.offLineTime = offLineTime;
        }
    }

    public static class MachineInfo extends Response {

        /** 机器组ID */
        @SerializedName("Id")
        private Integer id;

        /** 机器组名称 */
        @SerializedName("Name")
        private String name;

        /** 机器组类型，取值有：LABEL和IP */
        @SerializedName("Type")
        private String type;

        /** LogAgent信息，数组类型 */
        @SerializedName("LogAgents")
        private LogAgent logAgents;

        /** 机器组标签，数组类型 */
        @SerializedName("Labels")
        private List<String> labels;

        /** 机器组Ip，数组类型 */
        @SerializedName("Ips")
        private String ips;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public LogAgent getLogAgents() {
            return logAgents;
        }

        public void setLogAgents(LogAgent logAgents) {
            this.logAgents = logAgents;
        }

        public List<String> getLabels() {
            return labels;
        }

        public void setLabels(List<String> labels) {
            this.labels = labels;
        }

        public String getIps() {
            return ips;
        }

        public void setIps(String ips) {
            this.ips = ips;
        }
    }
}
