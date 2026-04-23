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
package cn.ucloud.ukafka.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateUKafkaInstanceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** kafka版本，支持的版本可通过ListUKafkaFrameworkVersion 接口返回字段的FrameworkVersions获取 */
    @NotEmpty
    @UCloudParam("FrameworkVersion")
    private String frameworkVersion;

    /** VPCID */
    @NotEmpty
    @UCloudParam("VPCId")
    private String vpcId;

    /** 子网 ID */
    @NotEmpty
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 付费方式 */
    @NotEmpty
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 机型，支持的机型可通过GetUKafkaNodeType 接口返回的InstanceTypeSet[].InstanceTypeName */
    @NotEmpty
    @UCloudParam("NodeType")
    private String nodeType;

    /** 数据盘大小。支持范围根据GetUKafkaNodeType 接口返回的InstanceTypeSet[].MaxDiskSize 和MinDiskSize获取 */
    @NotEmpty
    @UCloudParam("DiskSize")
    private Integer diskSize;

    /** 实例名，可自定义 */
    @NotEmpty
    @UCloudParam("InstanceName")
    private String instanceName;

    /** 业务组，默认Default */
    @UCloudParam("BusinessId")
    private String businessId;

    /** 实例数量，默认 1 */
    @UCloudParam("Quantity")
    private String quantity;

    /** 集群节点数量。默认 3 节点 */
    @UCloudParam("NodeCount")
    private Integer nodeCount;

    /** kafka 日志保存时间，支持范围[1,240]。默认 72 小时 */
    @UCloudParam("LogRetentionHours")
    private String logRetentionHours;

    /** 磁盘管理方式,支持值：NONE、CLEAN。默认值：NONE */
    @UCloudParam("DiskControllerType")
    private String diskControllerType;

    /** 磁盘清理阈值，支持范围[70,90]。DiskControllerType 为CLEAN 时必填。默认值 90 */
    @UCloudParam("DiskThreshold")
    private String diskThreshold;

    /** 是否开启安全组，支持"true","false"，默认 false */
    @UCloudParam("IsSecurityEnabled")
    private String isSecurityEnabled;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getFrameworkVersion() {
        return frameworkVersion;
    }

    public void setFrameworkVersion(String frameworkVersion) {
        this.frameworkVersion = frameworkVersion;
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

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public String getLogRetentionHours() {
        return logRetentionHours;
    }

    public void setLogRetentionHours(String logRetentionHours) {
        this.logRetentionHours = logRetentionHours;
    }

    public String getDiskControllerType() {
        return diskControllerType;
    }

    public void setDiskControllerType(String diskControllerType) {
        this.diskControllerType = diskControllerType;
    }

    public String getDiskThreshold() {
        return diskThreshold;
    }

    public void setDiskThreshold(String diskThreshold) {
        this.diskThreshold = diskThreshold;
    }

    public String getIsSecurityEnabled() {
        return isSecurityEnabled;
    }

    public void setIsSecurityEnabled(String isSecurityEnabled) {
        this.isSecurityEnabled = isSecurityEnabled;
    }
}
