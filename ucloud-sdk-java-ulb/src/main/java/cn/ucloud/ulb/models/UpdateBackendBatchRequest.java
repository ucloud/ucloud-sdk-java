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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class UpdateBackendBatchRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 负载均衡资源ID */
    @NotEmpty
    @UCloudParam("ULBId")
    private String ulbId;

    /** */
    @UCloudParam("Attributes")
    private List<Attributes> attributes;

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

    public String getULBId() {
        return ulbId;
    }

    public void setULBId(String ulbId) {
        this.ulbId = ulbId;
    }

    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    public static class Attributes extends Request {

        /** 后端资源实例的ID(ULB后端ID，非资源自身ID) */
        @NotEmpty
        @UCloudParam("BackendId")
        private String backendId;

        /** 后端资源服务端口，取值范围[1-65535] */
        @UCloudParam("Port")
        private Integer port;

        /** 所添加的后端RS权重（在加权轮询算法下有效），取值范围[0-100]，默认为1 */
        @UCloudParam("Weight")
        private Integer weight;

        /** 后端实例状态开关 */
        @UCloudParam("Enabled")
        private Integer enabled;

        /** 是否为backup 0：主rs 1：备rs 默认为0 */
        @UCloudParam("IsBackup")
        private Integer isBackup;

        public String getBackendId() {
            return backendId;
        }

        public void setBackendId(String backendId) {
            this.backendId = backendId;
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

        public Integer getEnabled() {
            return enabled;
        }

        public void setEnabled(Integer enabled) {
            this.enabled = enabled;
        }

        public Integer getIsBackup() {
            return isBackup;
        }

        public void setIsBackup(Integer isBackup) {
            this.isBackup = isBackup;
        }
    }
}
