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

package cn.ucloud.unet.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeFirewallResourceResponse extends Response {

    
        
    /**
     * 资源列表，见 ResourceSet
     */
    @SerializedName("ResourceSet")
    private List<ResourceSet> resourceSet;
        
    
        
    /**
     * 绑定资源总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
    public List<ResourceSet> getResourceSet() {
        return resourceSet;
    }

    public void setResourceSet(List<ResourceSet> resourceSet) {
        this.resourceSet = resourceSet;
    }
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
        public static class ResourceSet extends Response {
            
        
    /**
     * 可用区
     */
    @SerializedName("Zone")
    private Integer zone;
        
    
        
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
     * 资源绑定的虚拟网卡的类型，“uni”，虚拟网卡。
     */
    @SerializedName("SubResourceType")
    private String subResourceType;
        
    
        
    /**
     * 名称
     */
    @SerializedName("Name")
    private String name;
        
    
        
    /**
     * 内网IP
     */
    @SerializedName("PrivateIP")
    private String privateIP;
        
    
        
    /**
     * 备注
     */
    @SerializedName("Remark")
    private String remark;
        
    
        
    /**
     * 绑定该防火墙的资源id
     */
    @SerializedName("ResourceID")
    private String resourceID;
        
    
        
    /**
     * 绑定防火墙组的资源类型。"unatgw"，NAT网关； "uhost"，云主机； "upm"，物理云主机； "hadoophost"，hadoop节点； "fortresshost"，堡垒机； "udhost"，私有专区主机；"udockhost"，容器；"dbaudit"，数据库审计，“uni”，虚拟网卡。
     */
    @SerializedName("ResourceType")
    private String resourceType;
        
    
        
    /**
     * 状态
     */
    @SerializedName("Status")
    private Integer status;
        
    
        
    /**
     * 业务组
     */
    @SerializedName("Tag")
    private String tag;
        
    
    public Integer getZone() {
        return zone;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
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
    
    public String getSubResourceType() {
        return subResourceType;
    }

    public void setSubResourceType(String subResourceType) {
        this.subResourceType = subResourceType;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPrivateIP() {
        return privateIP;
    }

    public void setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }
    
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
        }
}









