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

public class UpdateNetworkAclEntryRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html): false */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html): false */
    @UCloudParam("ProjectId")
    private String projectId;

    /** ACL的ID: false */
    @NotEmpty
    @UCloudParam("AclId")
    private String aclId;

    /** 需要更新的Entry Id: false */
    @NotEmpty
    @UCloudParam("EntryId")
    private String entryId;

    /** Entry的优先级，对于同样的Direction来说，不能重复: false */
    @NotEmpty
    @UCloudParam("Priority")
    private Integer priority;

    /** 出向或者入向（“Ingress”, "Egress"): false */
    @NotEmpty
    @UCloudParam("Direction")
    private String direction;

    /** 针对的协议规则: false */
    @NotEmpty
    @UCloudParam("IpProtocol")
    private String ipProtocol;

    /** IPv4段的CIDR表示: false */
    @NotEmpty
    @UCloudParam("CidrBlock")
    private String cidrBlock;

    /** 针对的端口范围: false */
    @NotEmpty
    @UCloudParam("PortRange")
    private String portRange;

    /** 规则的行为("Accept", "Reject"): false */
    @NotEmpty
    @UCloudParam("EntryAction")
    private String entryAction;

    /** 描述: false */
    @UCloudParam("Description")
    private String description;

    /** 应用目标类型。0代表“子网内全部资源”， 1代表“子网内指定资源”。默认为0: false */
    @UCloudParam("TargetType")
    private Integer targetType;

    /** 应用目标资源列表。默认为全部资源生效。TargetType为0时不用填写该值: false */
    @UCloudParam("TargetResourceIds")
    private List<String> targetResourceIds;

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

    public String getAclId() {
        return aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getIpProtocol() {
        return ipProtocol;
    }

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public String getCidrBlock() {
        return cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getPortRange() {
        return portRange;
    }

    public void setPortRange(String portRange) {
        this.portRange = portRange;
    }

    public String getEntryAction() {
        return entryAction;
    }

    public void setEntryAction(String entryAction) {
        this.entryAction = entryAction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public List<String> getTargetResourceIds() {
        return targetResourceIds;
    }

    public void setTargetResourceIds(List<String> targetResourceIds) {
        this.targetResourceIds = targetResourceIds;
    }
}
