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
package cn.ucloud.unet.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class BindEIPRequest extends Request {

    /** 地域 */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写 */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 弹性IP的资源Id */
    @NotEmpty
    @UCloudParam("EIPId")
    private String eipId;

    /**
     * 弹性IP请求绑定的资源类型, 枚举值为: uhost: 云主机; ulb, 负载均衡器 upm: 物理机; hadoophost:
     * 大数据集群;fortresshost：堡垒机；udockhost：容器；udhost：私有专区主机；natgw：natgw；udb：udb；vpngw：ipsec
     * vpn；ucdr：云灾备；dbaudit：数据库审计；uni：虚拟网卡；cube，Cube容器。如果EIP为普通带宽计费，且带宽值高于2G，则只允许绑定在快杰型云主机和ULB
     */
    @NotEmpty
    @UCloudParam("ResourceType")
    private String resourceType;

    /** 弹性IP请求绑定的资源ID */
    @NotEmpty
    @UCloudParam("ResourceId")
    private String resourceId;

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

    public String getEIPId() {
        return eipId;
    }

    public void setEIPId(String eipId) {
        this.eipId = eipId;
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
}
