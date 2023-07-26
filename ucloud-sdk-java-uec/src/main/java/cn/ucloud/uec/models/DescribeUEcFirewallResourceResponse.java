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

package cn.ucloud.uec.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeUEcFirewallResourceResponse extends Response {

    
        
    /**
     * 资源列表，详情参见ResourceInfo
     */
    @SerializedName("ResourceSet")
    private List<ResourceInfo> resourceSet;
        
    
        
    /**
     * 资源总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
    public List<ResourceInfo> getResourceSet() {
        return resourceSet;
    }

    public void setResourceSet(List<ResourceInfo> resourceSet) {
        this.resourceSet = resourceSet;
    }
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
        public static class ResourceInfo extends Response {
            
        
    /**
     * 资源Id
     */
    @SerializedName("ResourceId")
    private String resourceId;
        
    
        
    /**
     * 节点公网Ip列表
     */
    @SerializedName("PublicIpList")
    private List<String> publicIpList;
        
    
        
    /**
     * 节点名称
     */
    @SerializedName("Name")
    private String name;
        
    
        
    /**
     * 节点状态，1部署中，2待启动，3启动中，4运行中，5正在停止，6已停止，7正在更新，8正在重启，9正在删除， 10已经删除,11异常
     */
    @SerializedName("State")
    private Integer state;
        
    
        
    /**
     * 节点备注
     */
    @SerializedName("Remark")
    private String remark;
        
    
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    public List<String> getPublicIpList() {
        return publicIpList;
    }

    public void setPublicIpList(List<String> publicIpList) {
        this.publicIpList = publicIpList;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
        }
}









