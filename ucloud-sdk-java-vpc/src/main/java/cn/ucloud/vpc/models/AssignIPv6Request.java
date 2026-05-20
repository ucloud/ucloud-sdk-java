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
package cn.ucloud.vpc.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class AssignIPv6Request extends Request {

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

    /** 子网ID */
    @NotEmpty
    @UCloudParam("SubnetworkId")
    private String subnetworkId;

    /** 资源短ID */
    @NotEmpty
    @UCloudParam("ObjectId")
    private String objectId;

    /** vpc ID */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 实际资源短ID--pass产品实际ID */
    @UCloudParam("InstanceId")
    private String instanceId;

    /** 与InstanceID对应，实际资源大类ID--pass产品实际类型 */
    @UCloudParam("InstanceType")
    private Integer instanceType;

    /** 选填，资源的Mac */
    @UCloudParam("Mac")
    private String mac;

    /** 指定IP分配，与Count互斥 */
    @UCloudParam("IPv6Addresses")
    private List<String> iPv6Addresses;

    /** 指定数量分配，与IPv6Addresses互斥 */
    @UCloudParam("Count")
    private String count;

    /** IP属性：支持开启公网(Normal)、仅支持内网(Private)，默认Normal */
    @UCloudParam("Attribute")
    private String attribute;

    /** 指定网段分配IP */
    @UCloudParam("Segment")
    private String segment;

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

    public String getSubnetworkId() {
        return subnetworkId;
    }

    public void setSubnetworkId(String subnetworkId) {
        this.subnetworkId = subnetworkId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Integer getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(Integer instanceType) {
        this.instanceType = instanceType;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public List<String> getIPv6Addresses() {
        return iPv6Addresses;
    }

    public void setIPv6Addresses(List<String> iPv6Addresses) {
        this.iPv6Addresses = iPv6Addresses;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }
}
