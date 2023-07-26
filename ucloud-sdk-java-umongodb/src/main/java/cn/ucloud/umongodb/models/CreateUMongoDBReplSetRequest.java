/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.umongodb.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class CreateUMongoDBReplSetRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 副本集实例名称，至少6位
     */
    @NotEmpty
    @UCloudParam("Name")
    private String name;
        
    
        
    /**
     * 副本集的Mongodb的版本，例如MongoDB_3_6, MongoDB_4_2
     */
    @NotEmpty
    @UCloudParam("DBVersion")
    private String dbVersion;
        
    
        
    /**
     * 管理员密码
     */
    @NotEmpty
    @UCloudParam("AdminPassword")
    private String adminPassword;
        
    
        
    /**
     * 磁盘空间(GB)
     */
    @NotEmpty
    @UCloudParam("DiskSpace")
    private Integer diskSpace;
        
    
        
    /**
     * 机型配置
     */
    @NotEmpty
    @UCloudParam("MachineTypeId")
    private String machineTypeId;
        
    
        
    /**
     * 副本集节点数量
     */
    @NotEmpty
    @UCloudParam("NodeCount")
    private Integer nodeCount;
        
    
        
    /**
     * mongo服务端口
     */
    @UCloudParam("ListenPort")
    private Integer listenPort;
        
    
        
    /**
     * 子网ID
     */
    @UCloudParam("SubnetId")
    private String subnetId;
        
    
        
    /**
     * VPC的ID
     */
    @UCloudParam("VPCId")
    private String vpcId;
        
    
        
    /**
     * 实例所在的业务组名称
     */
    @UCloudParam("Tag")
    private String tag;
        
    
        
    /**
     * 付费方式：Year， Month， Dynamic，Trial，默认: Month
     */
    @UCloudParam("ChargeType")
    private String chargeType;
        
    
        
    /**
     * 购买时长，默认值1
     */
    @UCloudParam("Quantity")
    private Integer quantity;
        
    
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
    
    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
    
    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }
    
    public String getMachineTypeId() {
        return machineTypeId;
    }

    public void setMachineTypeId(String machineTypeId) {
        this.machineTypeId = machineTypeId;
    }
    
    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }
    
    public Integer getListenPort() {
        return listenPort;
    }

    public void setListenPort(Integer listenPort) {
        this.listenPort = listenPort;
    }
    
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
    
}









