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

package cn.ucloud.ufs.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeUFSVolumeMountpointResponse extends Response {

    
        
    /**
     * 
     */
    @SerializedName("DataSet")
    private List<MountPointInfo> dataSet;
        
    
        
    /**
     * 目前的挂载点总数
     */
    @SerializedName("TotalMountPointNum")
    private Integer totalMountPointNum;
        
    
        
    /**
     * 文件系统能创建的最大挂载点数目
     */
    @SerializedName("MaxMountPointNum")
    private Integer maxMountPointNum;
        
    
    public List<MountPointInfo> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<MountPointInfo> dataSet) {
        this.dataSet = dataSet;
    }
    
    public Integer getTotalMountPointNum() {
        return totalMountPointNum;
    }

    public void setTotalMountPointNum(Integer totalMountPointNum) {
        this.totalMountPointNum = totalMountPointNum;
    }
    
    public Integer getMaxMountPointNum() {
        return maxMountPointNum;
    }

    public void setMaxMountPointNum(Integer maxMountPointNum) {
        this.maxMountPointNum = maxMountPointNum;
    }
    
        public static class MountPointInfo extends Response {
            
        
    /**
     * 挂载点名称
     */
    @SerializedName("MountPointName")
    private String mountPointName;
        
    
        
    /**
     * Vpc ID
     */
    @SerializedName("VpcId")
    private String vpcId;
        
    
        
    /**
     * Subnet ID
     */
    @SerializedName("SubnetId")
    private String subnetId;
        
    
        
    /**
     * ${挂载点IP}:/
     */
    @SerializedName("MountPointIp")
    private String mountPointIp;
        
    
        
    /**
     * 文件系统创建时间（unix时间戳）
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * Subnet ID + 网段的形式，方便前端展示
     */
    @SerializedName("SubnetDescription")
    private String subnetDescription;
        
    
    public String getMountPointName() {
        return mountPointName;
    }

    public void setMountPointName(String mountPointName) {
        this.mountPointName = mountPointName;
    }
    
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    public String getMountPointIp() {
        return mountPointIp;
    }

    public void setMountPointIp(String mountPointIp) {
        this.mountPointIp = mountPointIp;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public String getSubnetDescription() {
        return subnetDescription;
    }

    public void setSubnetDescription(String subnetDescription) {
        this.subnetDescription = subnetDescription;
    }
    
        }
}









