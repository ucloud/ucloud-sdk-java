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

public class UpdateNLBTargetsAttributeRequest extends Request {

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

    /** 负载均衡实例的ID */
    @NotEmpty
    @UCloudParam("NLBId")
    private String nlbId;

    /** 监听器的ID */
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

        /** 服务节点的ID */
        @UCloudParam("Id")
        private String id;

        /** 是否禁用服务节点 */
        @UCloudParam("Enabled")
        private Boolean enabled;

        /** 服务节点的权重。限定取值：[1-100]，默认值1；仅在加权轮询、加权最小连接数算法时有效 */
        @UCloudParam("Weight")
        private Integer weight;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }
    }
}
