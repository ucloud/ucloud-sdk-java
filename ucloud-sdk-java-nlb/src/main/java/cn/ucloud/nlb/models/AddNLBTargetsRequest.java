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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class AddNLBTargetsRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 负载均衡实例的ID。 */
    @NotEmpty
    @UCloudParam("NLBId")
    private String nlbId;

    /** 监听器的ID。 */
    @NotEmpty
    @UCloudParam("ListenerId")
    private String listenerId;

    /** */
    @UCloudParam("Targets")
    private List<Targets> targets;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getNLBId() {
        return nlbId;
    }

    public void setNLBId(String nlbId) {
        this.nlbId = nlbId;
    }

    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public List<Targets> getTargets() {
        return targets;
    }

    public void setTargets(List<Targets> targets) {
        this.targets = targets;
    }

    public static class Targets extends Request {

        /**
         * 服务节点的类型。限定枚举值："UHost" /
         * "UNI"/"UPM"/"IP"，默认值："UHost"；非IP类型，如果该资源有多个IP，将只能添加主IP；非IP类型，展示时，会显示相关资源信息，IP类型只展示IP信息。
         */
        @UCloudParam("ResourceType")
        private String resourceType;

        /** 服务节点的资源ID。在非IP类型时，必传 */
        @UCloudParam("ResourceId")
        private String resourceId;

        /** 服务节点的资源名称 */
        @UCloudParam("ResourceName")
        private String resourceName;

        /** 服务节点的VPC资源ID。在IP类型时，必传 */
        @UCloudParam("VPCId")
        private String vpcId;

        /** 服务节点的子网资源ID。 */
        @UCloudParam("SubnetId")
        private String subnetId;

        /** 服务节点的IP。在IP类型时，必传 */
        @UCloudParam("ResourceIP")
        private String resourceIP;

        /** 服务节点的端口，限定取值：[1-65535] */
        @UCloudParam("Port")
        private Integer port;

        /** 服务节点的权重。限定取值：[1-100]，默认值1；仅在加权轮询、加权最小连接数算法时有效 */
        @UCloudParam("Weight")
        private Integer weight;

        /** 服务节点是否启用 */
        @UCloudParam("Enabled")
        private Boolean enabled;

        /** 服务节点所在地域 */
        @UCloudParam("Region")
        private String region;

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

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    }
}
