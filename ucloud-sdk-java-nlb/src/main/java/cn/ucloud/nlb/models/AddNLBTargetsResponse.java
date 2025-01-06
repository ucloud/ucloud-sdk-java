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
package cn.ucloud.nlb.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddNLBTargetsResponse extends Response {

    /** */
    @SerializedName("Targets")
    private List<Target> targets;

    public List<Target> getTargets() {
        return targets;
    }

    public void setTargets(List<Target> targets) {
        this.targets = targets;
    }

    public static class Target extends Response {

        /** 服务节点所在地域 */
        @SerializedName("Region")
        private String region;

        /** 服务节点的类型 */
        @SerializedName("ResourceType")
        private String resourceType;

        /** 服务节点的资源ID。在非IP类型时，必传 */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 服务节点的资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        /** 服务节点的VPC资源ID。在IP类型时，必传 */
        @SerializedName("VPCId")
        private String vpcId;

        /** 服务节点的子网资源ID。在IP类型时，必传 */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 服务节点的IP。在IP类型时，必传 */
        @SerializedName("ResourceIP")
        private String resourceIP;

        /** 服务节点的端口 */
        @SerializedName("Port")
        private Integer port;

        /** 服务节点的权重。支持更新 */
        @SerializedName("Weight")
        private Integer weight;

        /** 服务节点是否开启 */
        @SerializedName("Enabled")
        private Boolean enabled;

        /** 服务节点的标识 ID 说明： 添加服务节点的时候无需传 更新服务节点属性时必传 */
        @SerializedName("Id")
        private String id;

        /** 服务节点的健康检查状态 说明： 描述服务节点信息时显示 限定枚举值："Healthy"/"Unhealthy" */
        @SerializedName("State")
        private String state;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

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

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
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
