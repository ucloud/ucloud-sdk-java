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

package cn.ucloud.vpc.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class GetNetworkAclTargetResourceResponse extends Response {

    
        
    /**
     * ACL规则应用目标资源列表，具体结构见下方TargetResourceInfo
     */
    @SerializedName("TargetResourceList")
    private List<TargetResourceInfo> targetResourceList;
        
    
        
    /**
     * ACL规则应用目标资源总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
    public List<TargetResourceInfo> getTargetResourceList() {
        return targetResourceList;
    }

    public void setTargetResourceList(List<TargetResourceInfo> targetResourceList) {
        this.targetResourceList = targetResourceList;
    }
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
        public static class TargetResourceInfo extends Response {
            
        
    /**
     * 子网ID
     */
    @SerializedName("SubnetworkId")
    private String subnetworkId;
        
    
        
    /**
     * 资源名称
     */
    @SerializedName("ResourceName")
    private String resourceName;
        
    
        
    /**
     * 资源ID
     */
    @SerializedName("ResourceId")
    private String resourceId;
        
    
        
    /**
     * 资源类型
     */
    @SerializedName("ResourceType")
    private Integer resourceType;
        
    
        
    /**
     * 资源绑定的虚拟网卡的名称
     */
    @SerializedName("SubResourceName")
    private String subResourceName;
        
    
        
    /**
     * 资源绑定的虚拟网卡的ID
     */
    @SerializedName("SubResourceId")
    private String subResourceId;
        
    
        
    /**
     * 资源绑定虚拟网卡的类型
     */
    @SerializedName("SubResourceType")
    private Integer subResourceType;
        
    
        
    /**
     * 资源内网IP
     */
    @SerializedName("PrivateIp")
    private String privateIp;
        
    
    public String getSubnetworkId() {
        return subnetworkId;
    }

    public void setSubnetworkId(String subnetworkId) {
        this.subnetworkId = subnetworkId;
    }
    
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }
    
    public String getSubResourceName() {
        return subResourceName;
    }

    public void setSubResourceName(String subResourceName) {
        this.subResourceName = subResourceName;
    }
    
    public String getSubResourceId() {
        return subResourceId;
    }

    public void setSubResourceId(String subResourceId) {
        this.subResourceId = subResourceId;
    }
    
    public Integer getSubResourceType() {
        return subResourceType;
    }

    public void setSubResourceType(Integer subResourceType) {
        this.subResourceType = subResourceType;
    }
    
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }
    
        }
}









