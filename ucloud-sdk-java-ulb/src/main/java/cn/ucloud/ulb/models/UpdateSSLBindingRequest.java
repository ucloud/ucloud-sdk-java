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

public class UpdateSSLBindingRequest extends Request {

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

    /** 监听器实例绑定的旧的证书 */
    @NotEmpty
    @UCloudParam("OldSSLId")
    private String oldSSLId;

    /** 监听器实例需要绑定的新的证书 */
    @NotEmpty
    @UCloudParam("NewSSLId")
    private String newSSLId;

    /**
     * 所操作LB实例ID（仅LoadBalancerId传参时，将更换该LB所有原证书为OldSSLId的绑定关系；LoadBalancerId和ListenerId都不传参则将更新该项目下所有原证书为OldSSLId的绑定关系）（LB指CLB或ALB）
     */
    @UCloudParam("LoadBalancerId")
    private String loadBalancerId;

    /**
     * 所操作监听器实例ID（仅ListenerId传参时，将更换该监听器所有原证书为OldSSLId的绑定关系；LoadBalancerId和ListenerId都不传参则将更新该项目下所有原证书为OldSSLId的绑定关系；若LoadBalancerId与ListenerId皆有传参，则会强校验ULB与Vsserver的所属关系，将更换该ulb下vserver所绑定的OldSSLId为NewSSLId）（监听器指VServer或Listener）
     */
    @UCloudParam("ListenerId")
    private String listenerId;

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

    public String getOldSSLId() {
        return oldSSLId;
    }

    public void setOldSSLId(String oldSSLId) {
        this.oldSSLId = oldSSLId;
    }

    public String getNewSSLId() {
        return newSSLId;
    }

    public void setNewSSLId(String newSSLId) {
        this.newSSLId = newSSLId;
    }

    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }
}
