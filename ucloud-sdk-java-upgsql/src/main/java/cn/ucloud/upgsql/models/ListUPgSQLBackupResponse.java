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

package cn.ucloud.upgsql.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class ListUPgSQLBackupResponse extends Response {

    
        
    /**
     * 备份信息列表.修参数
     */
    @SerializedName("DataSet")
    private List<UPgSQLBackup> dataSet;
        
    
        
    /**
     * 总个数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
    public List<UPgSQLBackup> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UPgSQLBackup> dataSet) {
        this.dataSet = dataSet;
    }
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
        public static class UPgSQLBackup extends Response {
            
        
    /**
     * 备份所在地域
     */
    @SerializedName("Region")
    private String region;
        
    
        
    /**
     * DB实例Id
     */
    @SerializedName("InstanceID")
    private String instanceID;
        
    
        
    /**
     * 备份id
     */
    @SerializedName("BackupID")
    private String backupID;
        
    
        
    /**
     * 备份名称
     */
    @SerializedName("BackupName")
    private String backupName;
        
    
        
    /**
     * 备份时间(Unix时间戳)
     */
    @SerializedName("BackupStartTime")
    private Integer backupStartTime;
        
    
        
    /**
     * 备份文件大小(字节)
     */
    @SerializedName("BackupSize")
    private Integer backupSize;
        
    
        
    /**
     * 备份类型，手动或者自动
     */
    @SerializedName("BackupType")
    private Integer backupType;
        
    
        
    /**
     * 备份状态 (Backuping：备份中,Success:备份成功, Failed:备份失败, Expired:备份过期)
     */
    @SerializedName("State")
    private String state;
        
    
        
    /**
     * 备份完成时间(Unix时间戳)
     */
    @SerializedName("BackupEndTime")
    private Integer backupEndTime;
        
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }
    
    public String getBackupID() {
        return backupID;
    }

    public void setBackupID(String backupID) {
        this.backupID = backupID;
    }
    
    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }
    
    public Integer getBackupStartTime() {
        return backupStartTime;
    }

    public void setBackupStartTime(Integer backupStartTime) {
        this.backupStartTime = backupStartTime;
    }
    
    public Integer getBackupSize() {
        return backupSize;
    }

    public void setBackupSize(Integer backupSize) {
        this.backupSize = backupSize;
    }
    
    public Integer getBackupType() {
        return backupType;
    }

    public void setBackupType(Integer backupType) {
        this.backupType = backupType;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public Integer getBackupEndTime() {
        return backupEndTime;
    }

    public void setBackupEndTime(Integer backupEndTime) {
        this.backupEndTime = backupEndTime;
    }
    
        }
}









