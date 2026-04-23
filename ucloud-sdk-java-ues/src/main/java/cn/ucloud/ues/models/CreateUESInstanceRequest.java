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
package cn.ucloud.ues.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreateUESInstanceRequest extends Request {

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

    /** 实例名称 */
    @NotEmpty
    @UCloudParam("InstanceName")
    private String instanceName;

    /** 节点配置标识, 支持的机型可通过GetUESNodeConf NodeConfList[].NodeConf */
    @NotEmpty
    @UCloudParam("NodeConf")
    private String nodeConf;

    /** VPCID标识 */
    @NotEmpty
    @UCloudParam("VPCId")
    private String vpcId;

    /** 子网ID标识 */
    @NotEmpty
    @UCloudParam("SubnetId")
    private String subnetId;

    /** Kibana节点配置, 支持的机型可通过GetUESNodeConf NodeConfList[].NodeConf */
    @NotEmpty
    @UCloudParam("KibanaNodeConf")
    private String kibanaNodeConf;

    /** Kibana节点磁盘类型 */
    @NotEmpty
    @UCloudParam("KibanaNodeDiskConf")
    private String kibanaNodeDiskConf;

    /** 应用服务版本号，支持的类型通过GetUESAppVersion AppVersionList[].AppVersion */
    @NotEmpty
    @UCloudParam("AppVersion")
    private String appVersion;

    /** 磁盘类型 */
    @NotEmpty
    @UCloudParam("NodeDiskConf")
    private String nodeDiskConf;

    /** 节点个数，默认数目为3 */
    @UCloudParam("NodeSize")
    private Integer nodeSize;

    /** 节点磁盘大小，默认为100G */
    @UCloudParam("NodeDiskSize")
    private Integer nodeDiskSize;

    /** elasticsearch 服务用户名称，默认为elastic；OpenSearch 服务用户名称，固定为admin */
    @UCloudParam("ServiceUserName")
    private String serviceUserName;

    /** 服务用户密码，默认为changeme */
    @UCloudParam("ServicePasswd")
    private String servicePasswd;

    /** 应用名称，支持的类型通过GetUESAppVersion AppVersionList[].AppName, 默认为elasticsearch */
    @UCloudParam("AppName")
    private String appName;

    /** 备注，默认为空 */
    @UCloudParam("Remark")
    private String remark;

    /** 计费类型，默认为Month */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 计费长度，默认为1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 主节点类型标示，支持的机型可通过GetUESNodeConf NodeConfList[].NodeConf, 默认为空 */
    @UCloudParam("MasterConf")
    private String masterConf;

    /** 业务组ID标识 */
    @UCloudParam("BusinessId")
    private String businessId;

    /** Coordinating节点机型配置，, 支持的机型可通过GetUESNodeConf NodeConfList[].NodeConf, 默认为空 */
    @UCloudParam("CoordinatingNodeConf")
    private String coordinatingNodeConf;

    /** Coordinating节点数量 */
    @UCloudParam("CoordinatingNodeSize")
    private Integer coordinatingNodeSize;

    /** Coordinating节点磁盘类型 */
    @UCloudParam("CoordinatingNodeDiskConf")
    private String coordinatingNodeDiskConf;

    /** 是否开启安全组，默认为false */
    @UCloudParam("IsSecGroup")
    private Boolean isSecGroup;

    /** 安全组ID，开启安全组必填，至多可以同时绑定5个安全组 */
    @UCloudParam("SecGroupIds")
    private List<String> secGroupIds;

    /** 是否为多可用区，默认为false */
    @UCloudParam("IsMultiZone")
    private Boolean isMultiZone;

    /** 多可用区名称，默认空数组 [] */
    @UCloudParam("MultiZones")
    private List<String> multiZones;

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

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getNodeConf() {
        return nodeConf;
    }

    public void setNodeConf(String nodeConf) {
        this.nodeConf = nodeConf;
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

    public String getKibanaNodeConf() {
        return kibanaNodeConf;
    }

    public void setKibanaNodeConf(String kibanaNodeConf) {
        this.kibanaNodeConf = kibanaNodeConf;
    }

    public String getKibanaNodeDiskConf() {
        return kibanaNodeDiskConf;
    }

    public void setKibanaNodeDiskConf(String kibanaNodeDiskConf) {
        this.kibanaNodeDiskConf = kibanaNodeDiskConf;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getNodeDiskConf() {
        return nodeDiskConf;
    }

    public void setNodeDiskConf(String nodeDiskConf) {
        this.nodeDiskConf = nodeDiskConf;
    }

    public Integer getNodeSize() {
        return nodeSize;
    }

    public void setNodeSize(Integer nodeSize) {
        this.nodeSize = nodeSize;
    }

    public Integer getNodeDiskSize() {
        return nodeDiskSize;
    }

    public void setNodeDiskSize(Integer nodeDiskSize) {
        this.nodeDiskSize = nodeDiskSize;
    }

    public String getServiceUserName() {
        return serviceUserName;
    }

    public void setServiceUserName(String serviceUserName) {
        this.serviceUserName = serviceUserName;
    }

    public String getServicePasswd() {
        return servicePasswd;
    }

    public void setServicePasswd(String servicePasswd) {
        this.servicePasswd = servicePasswd;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getMasterConf() {
        return masterConf;
    }

    public void setMasterConf(String masterConf) {
        this.masterConf = masterConf;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getCoordinatingNodeConf() {
        return coordinatingNodeConf;
    }

    public void setCoordinatingNodeConf(String coordinatingNodeConf) {
        this.coordinatingNodeConf = coordinatingNodeConf;
    }

    public Integer getCoordinatingNodeSize() {
        return coordinatingNodeSize;
    }

    public void setCoordinatingNodeSize(Integer coordinatingNodeSize) {
        this.coordinatingNodeSize = coordinatingNodeSize;
    }

    public String getCoordinatingNodeDiskConf() {
        return coordinatingNodeDiskConf;
    }

    public void setCoordinatingNodeDiskConf(String coordinatingNodeDiskConf) {
        this.coordinatingNodeDiskConf = coordinatingNodeDiskConf;
    }

    public Boolean getIsSecGroup() {
        return isSecGroup;
    }

    public void setIsSecGroup(Boolean isSecGroup) {
        this.isSecGroup = isSecGroup;
    }

    public List<String> getSecGroupIds() {
        return secGroupIds;
    }

    public void setSecGroupIds(List<String> secGroupIds) {
        this.secGroupIds = secGroupIds;
    }

    public Boolean getIsMultiZone() {
        return isMultiZone;
    }

    public void setIsMultiZone(Boolean isMultiZone) {
        this.isMultiZone = isMultiZone;
    }

    public List<String> getMultiZones() {
        return multiZones;
    }

    public void setMultiZones(List<String> multiZones) {
        this.multiZones = multiZones;
    }
}
