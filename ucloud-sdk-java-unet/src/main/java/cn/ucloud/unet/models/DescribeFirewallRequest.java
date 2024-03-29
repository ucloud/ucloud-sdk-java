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

public class DescribeFirewallRequest extends Request {

    /** 地域 */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写 */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 防火墙ID，默认为返回所有防火墙 */
    @UCloudParam("FWId")
    private String fwId;

    /**
     * 绑定防火墙的资源类型，仅获取资源对应防火墙信息时需要。枚举值为："unatgw"，NAT网关； "uhost"，云主机； "upm"，物理云主机；
     * "hadoophost"，hadoop节点； "fortresshost"，堡垒机；
     * "udhost"，私有专区主机；"udockhost"，容器；"dbaudit"，数据库审计；”uni“，虚拟网卡；“cube”，Cube容器实例；“ulb”，负载均衡实例。
     */
    @UCloudParam("ResourceType")
    private String resourceType;

    /** 绑定防火墙组的资源ID。 */
    @UCloudParam("ResourceId")
    private String resourceId;

    /** 返回数据长度，默认为20，最大10000000 */
    @UCloudParam("Limit")
    private Integer limit;

    /** 列表起始位置偏移量，默认为0 */
    @UCloudParam("Offset")
    private Integer offset;

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

    public String getFWId() {
        return fwId;
    }

    public void setFWId(String fwId) {
        this.fwId = fwId;
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

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
