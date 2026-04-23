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
package cn.ucloud.uhadoop.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class AddUHadoopInstanceNodeRequest extends Request {

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

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("Zone")
    private String zone;

    /** 节点的角色，值为task|core|client之一 */
    @NotEmpty
    @UCloudParam("NodeRole")
    private String nodeRole;

    /** 机型，如：o.hadoop2m.medium， 可从GetUHadoopNodeType接口获取 */
    @NotEmpty
    @UCloudParam("NodeType")
    private String nodeType;

    /** 实例ID */
    @NotEmpty
    @UCloudParam("InstanceId")
    private String instanceId;

    /** 数据盘数量，非裸金属机型时必填 */
    @UCloudParam("DataDiskNum")
    private String dataDiskNum;

    /** 密码,NodeRole为client时必填 */
    @UCloudParam("Password")
    private String password;

    /** 系统盘容量,非裸金属机型必填 */
    @UCloudParam("BootDiskSize")
    private String bootDiskSize;

    /** 系统盘类型，非裸金属机型必填，例如：CLOUD_RSSD */
    @UCloudParam("BootDiskType")
    private String bootDiskType;

    /** 数据盘容量，非裸金属机型必填 */
    @UCloudParam("DataDiskSize")
    private String dataDiskSize;

    /** 数据盘类型，非裸金属机型必填，例如：CLOUD_RSSD */
    @UCloudParam("DataDiskType")
    private String dataDiskType;

    /** 节点数量,默认为1 */
    @UCloudParam("NodeCount")
    private Integer nodeCount;

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

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getDataDiskNum() {
        return dataDiskNum;
    }

    public void setDataDiskNum(String dataDiskNum) {
        this.dataDiskNum = dataDiskNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBootDiskSize() {
        return bootDiskSize;
    }

    public void setBootDiskSize(String bootDiskSize) {
        this.bootDiskSize = bootDiskSize;
    }

    public String getBootDiskType() {
        return bootDiskType;
    }

    public void setBootDiskType(String bootDiskType) {
        this.bootDiskType = bootDiskType;
    }

    public String getDataDiskSize() {
        return dataDiskSize;
    }

    public void setDataDiskSize(String dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
    }

    public String getDataDiskType() {
        return dataDiskType;
    }

    public void setDataDiskType(String dataDiskType) {
        this.dataDiskType = dataDiskType;
    }

    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }
}
