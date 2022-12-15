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
package cn.ucloud.upgsql.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateUPgSQLInstanceRequest extends Request {

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

    /** 实例名称，至少6位 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** PostgreSQL的版本，pg10.4:postgresql-10.4，pg13.4:postgresql-13.4 */
    @NotEmpty
    @UCloudParam("DBVersion")
    private String dbVersion;

    /** DB实例使用的配置参数组id */
    @NotEmpty
    @UCloudParam("ParamGroupID")
    private Integer paramGroupID;

    /** 管理员密码 */
    @NotEmpty
    @UCloudParam("AdminPassword")
    private String adminPassword;

    /** 端口默认为5432 */
    @NotEmpty
    @UCloudParam("Port")
    private Integer port;

    /** 磁盘空间(GB) */
    @NotEmpty
    @UCloudParam("DiskSpace")
    private String diskSpace;

    /** 机器配置类型，2核4G的机器:o.pgsql2m.medium */
    @NotEmpty
    @UCloudParam("MachineType")
    private String machineType;

    /** 子网ID */
    @NotEmpty
    @UCloudParam("SubnetID")
    private String subnetID;

    /** VPC的ID */
    @NotEmpty
    @UCloudParam("VPCID")
    private String vpcid;

    /** UDB实例模式类型, 可选值如下: "Normal": 普通版UDB实例 "HA": 高可用版UDB实例 默认是"Normal" */
    @UCloudParam("InstanceMode")
    private String instanceMode;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDBVersion() {
        return dbVersion;
    }

    public void setDBVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }

    public Integer getParamGroupID() {
        return paramGroupID;
    }

    public void setParamGroupID(Integer paramGroupID) {
        this.paramGroupID = paramGroupID;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(String diskSpace) {
        this.diskSpace = diskSpace;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }

    public String getVPCID() {
        return vpcid;
    }

    public void setVPCID(String vpcid) {
        this.vpcid = vpcid;
    }

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }
}
