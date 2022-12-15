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

package cn.ucloud.udisk.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeUDiskSnapshotResponse extends Response {

    
        
    /**
     * JSON 格式的Snapshot列表, 详细参见 UDiskSnapshotSet
     */
    @SerializedName("DataSet")
    private List<UDiskSnapshotSet> dataSet;
        
    
        
    /**
     * 根据过滤条件得到的总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
    public List<UDiskSnapshotSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDiskSnapshotSet> dataSet) {
        this.dataSet = dataSet;
    }
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
        public static class UDiskSnapshotSet extends Response {
            
        
    /**
     * 可用区
     */
    @SerializedName("Zone")
    private String zone;
        
    
        
    /**
     * 快照Id
     */
    @SerializedName("SnapshotId")
    private String snapshotId;
        
    
        
    /**
     * 快照名称
     */
    @SerializedName("Name")
    private String name;
        
    
        
    /**
     * 快照的源UDisk的Id
     */
    @SerializedName("UDiskId")
    private String uDiskId;
        
    
        
    /**
     * 快照的源UDisk的Name
     */
    @SerializedName("UDiskName")
    private String uDiskName;
        
    
        
    /**
     * 创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 容量单位GB
     */
    @SerializedName("Size")
    private Integer size;
        
    
        
    /**
     * 快照状态，Normal:正常,Failed:失败,Creating:制作中
     */
    @SerializedName("Status")
    private String status;
        
    
        
    /**
     * 磁盘类型，0：普通数据盘；1：普通系统盘；2：SSD数据盘；3：SSD系统盘；4：RSSD数据盘；5：RSSD系统盘。
     */
    @SerializedName("DiskType")
    private Integer diskType;
        
    
        
    /**
     * 【已废弃】过期时间
     */
    @SerializedName("ExpiredTime")
    private Integer expiredTime;
        
    
        
    /**
     * 快照描述
     */
    @SerializedName("Comment")
    private String comment;
        
    
        
    /**
     * 对应磁盘是否处于可用状态
     */
    @SerializedName("IsUDiskAvailable")
    private Boolean isUDiskAvailable;
        
    
        
    /**
     * 快照版本
     */
    @SerializedName("Version")
    private String version;
        
    
        
    /**
     * 对应磁盘制作快照时所挂载的主机
     */
    @SerializedName("UHostId")
    private String uHostId;
        
    
        
    /**
     * 是否是加密盘快照，是:"Yes", 否:"No"
     */
    @SerializedName("UKmsMode")
    private String uKmsMode;
        
    
        
    /**
     * 该快照的cmk id
     */
    @SerializedName("CmkId")
    private String cmkId;
        
    
        
    /**
     * 该快照的密文密钥
     */
    @SerializedName("DataKey")
    private String dataKey;
        
    
        
    /**
     * 该快照cmk的状态, Enabled(正常)，Disabled(失效)，Deleted(删除)，NoCmkId(非加密盘)
     */
    @SerializedName("CmkIdStatus")
    private String cmkIdStatus;
        
    
        
    /**
     * cmk id 别名
     */
    @SerializedName("CmkIdAlias")
    private String cmkIdAlias;
        
    
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getUDiskId() {
        return uDiskId;
    }

    public void setUDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
    }
    
    public String getUDiskName() {
        return uDiskName;
    }

    public void setUDiskName(String uDiskName) {
        this.uDiskName = uDiskName;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Integer getDiskType() {
        return diskType;
    }

    public void setDiskType(Integer diskType) {
        this.diskType = diskType;
    }
    
    public Integer getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
    }
    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public Boolean getIsUDiskAvailable() {
        return isUDiskAvailable;
    }

    public void setIsUDiskAvailable(Boolean isUDiskAvailable) {
        this.isUDiskAvailable = isUDiskAvailable;
    }
    
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
    public String getUHostId() {
        return uHostId;
    }

    public void setUHostId(String uHostId) {
        this.uHostId = uHostId;
    }
    
    public String getUKmsMode() {
        return uKmsMode;
    }

    public void setUKmsMode(String uKmsMode) {
        this.uKmsMode = uKmsMode;
    }
    
    public String getCmkId() {
        return cmkId;
    }

    public void setCmkId(String cmkId) {
        this.cmkId = cmkId;
    }
    
    public String getDataKey() {
        return dataKey;
    }

    public void setDataKey(String dataKey) {
        this.dataKey = dataKey;
    }
    
    public String getCmkIdStatus() {
        return cmkIdStatus;
    }

    public void setCmkIdStatus(String cmkIdStatus) {
        this.cmkIdStatus = cmkIdStatus;
    }
    
    public String getCmkIdAlias() {
        return cmkIdAlias;
    }

    public void setCmkIdAlias(String cmkIdAlias) {
        this.cmkIdAlias = cmkIdAlias;
    }
    
        }
}









