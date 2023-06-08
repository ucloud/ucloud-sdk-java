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

package cn.ucloud.udb.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeUDBSplittingInfoResponse extends Response {

    
        
    
        
    /**
     * 可用区
     */
    @SerializedName("Zone")
    private String zone;
        
    
        
    /**
     * DB实例ID
     */
    @SerializedName("MasterDBId")
    private String masterDBId;
        
    
        
    /**
     * 读写分离IP
     */
    @SerializedName("RWIP")
    private String rwip;
        
    
        
    /**
     * 时间阈值
     */
    @SerializedName("DelayThreshold")
    private Integer delayThreshold;
        
    
        
    /**
     * 端口号
     */
    @SerializedName("Port")
    private Integer port;
        
    
        
    /**
     * 读写分离策略
     */
    @SerializedName("ReadModel")
    private String readModel;
        
    
        
    /**
     * 数据库版本
     */
    @SerializedName("DBTypeId")
    private String dbTypeId;
        
    
        
    /**
     * 读写分离状态
     */
    @SerializedName("RWState")
    private String rwState;
        
    
        
    /**
     * 读写分离从库信息
     */
    @SerializedName("DataSet")
    private List<UDBRWSplittingSet> dataSet;
        
    
        
    
        
    
    
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    
    public String getMasterDBId() {
        return masterDBId;
    }

    public void setMasterDBId(String masterDBId) {
        this.masterDBId = masterDBId;
    }
    
    public String getRWIP() {
        return rwip;
    }

    public void setRWIP(String rwip) {
        this.rwip = rwip;
    }
    
    public Integer getDelayThreshold() {
        return delayThreshold;
    }

    public void setDelayThreshold(Integer delayThreshold) {
        this.delayThreshold = delayThreshold;
    }
    
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
    
    public String getReadModel() {
        return readModel;
    }

    public void setReadModel(String readModel) {
        this.readModel = readModel;
    }
    
    public String getDBTypeId() {
        return dbTypeId;
    }

    public void setDBTypeId(String dbTypeId) {
        this.dbTypeId = dbTypeId;
    }
    
    public String getRWState() {
        return rwState;
    }

    public void setRWState(String rwState) {
        this.rwState = rwState;
    }
    
    public List<UDBRWSplittingSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDBRWSplittingSet> dataSet) {
        this.dataSet = dataSet;
    }
    
    
    
        public static class UDBRWSplittingSet extends Response {
            
        
    /**
     * DB实例ID
     */
    @SerializedName("DBId")
    private String dbId;
        
    
        
    /**
     * 主库/从库
     */
    @SerializedName("Role")
    private String role;
        
    
        
    /**
     * DBIP
     */
    @SerializedName("VirtualIP")
    private String virtualIP;
        
    
        
    /**
     * 读写分离比重
     */
    @SerializedName("ReadWeight")
    private Integer readWeight;
        
    
        
    /**
     * DB状态
     */
    @SerializedName("State")
    private String state;
        
    
    public String getDBId() {
        return dbId;
    }

    public void setDBId(String dbId) {
        this.dbId = dbId;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String getVirtualIP() {
        return virtualIP;
    }

    public void setVirtualIP(String virtualIP) {
        this.virtualIP = virtualIP;
    }
    
    public Integer getReadWeight() {
        return readWeight;
    }

    public void setReadWeight(Integer readWeight) {
        this.readWeight = readWeight;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
        }
}









