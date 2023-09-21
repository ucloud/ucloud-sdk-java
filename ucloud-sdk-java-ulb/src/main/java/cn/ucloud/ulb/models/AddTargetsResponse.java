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
package cn.ucloud.ulb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddTargetsResponse extends Response {

    /** 服务节点信息 */
    @SerializedName("Targets")
    private List<TargetSet> targets;

    public List<TargetSet> getTargets() {
        return targets;
    }

    public void setTargets(List<TargetSet> targets) {
        this.targets = targets;
    }

    public static class TargetSet extends Response {

        /**
         * 服务节点的类型。限定枚举值：UHost -> 云主机，UNI -> 虚拟网卡，UPM -> 物理云主机，IP -> IP类型； 默认值："UHost"；
         * 非IP类型，如果该资源有多个IP，将只能添加主IP； 非IP类型，展示时，会显示相关资源信息，IP类型只展示IP信息。
         * 在相关资源被删除时，非IP类型会把相关资源从lb中剔除，IP类型不保证这个逻辑
         */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 服务节点的资源ID。在非IP类型时，必传 */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 服务节点的VPC资源ID。在IP类型时，必传 */
        @SerializedName("VPCId")
        private String vpcId;

        /** 服务节点的子网资源ID。在IP类型时，必传 */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 服务节点的IP。在IP类型时，必传 */
        @SerializedName("ResourceIP")
        private String resourceIP;

        /** 服务节点的端口。限定取值：[1-65535]； 默认值：80 */
        @SerializedName("Port")
        private Integer port;

        /** 服务节点的权重。限定取值：[1-100]； 仅在加权轮询算法时有效； 默认值：1 */
        @SerializedName("Weight")
        private Integer weight;

        /** 服务节点是否启用。 默认值：true */
        @SerializedName("Enabled")
        private Boolean enabled;

        /** 服务节点是否为备节点。 默认值：false */
        @SerializedName("IsBackup")
        private Boolean isBackup;

        /** 服务节点的标识ID。 */
        @SerializedName("Id")
        private String id;

        /** 服务节点的健康检查状态。限定枚举值：Healthy -> 健康，Unhealthy -> 不健康 */
        @SerializedName("State")
        private String state;

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
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

        public String getResourceIP() {
            return resourceIP;
        }

        public void setResourceIP(String resourceIP) {
            this.resourceIP = resourceIP;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Boolean getIsBackup() {
            return isBackup;
        }

        public void setIsBackup(Boolean isBackup) {
            this.isBackup = isBackup;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
