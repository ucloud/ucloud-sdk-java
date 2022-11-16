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

public class DescribeUFSVolume2Response extends Response {

    
        
    /**
     * 文件系统总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
        
    /**
     * 文件系统详细信息列表
     */
    @SerializedName("DataSet")
    private List<UFSVolumeInfo2> dataSet;
        
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
    public List<UFSVolumeInfo2> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UFSVolumeInfo2> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class UFSVolumeInfo2 extends Response {
            
        
    /**
     * 文件系统名称
     */
    @SerializedName("VolumeName")
    private String volumeName;
        
    
        
    /**
     * 文件系统ID
     */
    @SerializedName("VolumeId")
    private String volumeId;
        
    
        
    /**
     * 当前文件系统已创建的挂载点数目
     */
    @SerializedName("TotalMountPointNum")
    private Integer totalMountPointNum;
        
    
        
    /**
     * 文件系统允许创建的最大挂载点数目
     */
    @SerializedName("MaxMountPointNum")
    private Integer maxMountPointNum;
        
    
        
    /**
     * 文件系统存储类型，枚举值，Basic表示容量型，Advanced表示性能型
     */
    @SerializedName("StorageType")
    private String storageType;
        
    
        
    /**
     * 文件系统协议，枚举值，NFSv3表示NFS V3协议，NFSv4表示NFS V4协议
     */
    @SerializedName("ProtocolType")
    private String protocolType;
        
    
        
    /**
     * 文件系统备注信息
     */
    @SerializedName("Remark")
    private String remark;
        
    
        
    /**
     * 文件系统所属业务组
     */
    @SerializedName("Tag")
    private String tag;
        
    
        
    /**
     * 文件系统创建时间（unix时间戳）
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 文件系统过期时间（unix时间戳）
     */
    @SerializedName("ExpiredTime")
    private Integer expiredTime;
        
    
        
    /**
     * 文件系统大小，单位GB
     */
    @SerializedName("Size")
    private Integer size;
        
    
        
    /**
     * 文件系统当前使用容量，单位GB
     */
    @SerializedName("UsedSize")
    private Integer usedSize;
        
    
        
    /**
     * 是否过期
     */
    @SerializedName("IsExpired")
    private String isExpired;
        
    
    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }
    
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
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
    
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }
    
    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public Integer getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
    }
    
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    
    public Integer getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
    }
    
    public String getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(String isExpired) {
        this.isExpired = isExpired;
    }
    
        }
}









