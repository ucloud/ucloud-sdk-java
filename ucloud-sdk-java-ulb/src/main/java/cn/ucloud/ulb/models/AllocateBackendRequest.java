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

package cn.ucloud.ulb.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class AllocateBackendRequest extends Request {

    
        
    /**
     * 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist)
     */
    @NotEmpty
    @UCloudParam("Region")
    private String region;
        
    
        
    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;
        
    
        
    /**
     * 负载均衡实例的ID
     */
    @NotEmpty
    @UCloudParam("ULBId")
    private String ulbId;
        
    
        
    /**
     * VServer实例的ID
     */
    @NotEmpty
    @UCloudParam("VServerId")
    private String vServerId;
        
    
        
    /**
     * 所添加的后端资源的类型，枚举值：UHost -> 云主机；UNI -> 虚拟网卡；UPM -> 物理云主机； UDHost -> 私有专区主机；UDocker -> 容器；UHybrid->混合云主机；CUBE->Cube，USDP->智能大数据平台；默认值为UHost。报文转发模式不支持UDocker、UHybrid、CUBE
     */
    @NotEmpty
    @UCloudParam("ResourceType")
    private String resourceType;
        
    
        
    /**
     * 所添加的后端资源的资源ID
     */
    @NotEmpty
    @UCloudParam("ResourceId")
    private String resourceId;
        
    
        
    /**
     * 所添加的后端服务器的资源实例IP，当ResourceType 为 UHybrid 时有效，且必填
     */
    @UCloudParam("ResourceIP")
    private String resourceIP;
        
    
        
    /**
     * 所添加的后端服务器所在的vpc，当ResourceType 为 UHybrid 时有效，且必填
     */
    @UCloudParam("VPCId")
    private String vpcId;
        
    
        
    /**
     * 所添加的后端服务器所在的子网，当ResourceType 为 UHybrid 时有效，且必填
     */
    @UCloudParam("SubnetId")
    private String subnetId;
        
    
        
    /**
     * 所添加的后端资源服务端口，取值范围[1-65535]，默认80
     */
    @UCloudParam("Port")
    private Integer port;
        
    
        
    /**
     * 所添加的后端RS权重（在加权轮询算法下有效），取值范围[1-100]，默认为1
     */
    @UCloudParam("Weight")
    private Integer weight;
        
    
        
    /**
     * 后端实例状态开关，枚举值： 1：启用； 0：禁用 默认为启用
     */
    @UCloudParam("Enabled")
    private Integer enabled;
        
    
        
    /**
     * rs是否为backup，默认为0
0：普通rs
1：backup的rs
     */
    @UCloudParam("IsBackup")
    private Integer isBackup;
        
    
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
    
    public String getULBId() {
        return ulbId;
    }

    public void setULBId(String ulbId) {
        this.ulbId = ulbId;
    }
    
    public String getVServerId() {
        return vServerId;
    }

    public void setVServerId(String vServerId) {
        this.vServerId = vServerId;
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
    
    public String getResourceIP() {
        return resourceIP;
    }

    public void setResourceIP(String resourceIP) {
        this.resourceIP = resourceIP;
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
    
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
    
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
    
    public Integer getIsBackup() {
        return isBackup;
    }

    public void setIsBackup(Integer isBackup) {
        this.isBackup = isBackup;
    }
    
}









