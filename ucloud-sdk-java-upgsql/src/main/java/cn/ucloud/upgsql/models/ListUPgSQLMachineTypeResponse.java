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

public class ListUPgSQLMachineTypeResponse extends Response {

    
        
    /**
     * 
     */
    @SerializedName("DataSet")
    private List<PgSQLMachineType> dataSet;
        
    
    public List<PgSQLMachineType> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<PgSQLMachineType> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class PgSQLMachineType extends Response {
            
        
    /**
     * 机器类型ID
     */
    @SerializedName("ID")
    private String id;
        
    
        
    /**
     * 格式为nCmG,n代表cpu核数，m代表内存大小(GB)
     */
    @SerializedName("Description")
    private String description;
        
    
        
    /**
     * cpu核数
     */
    @SerializedName("Cpu")
    private Integer cpu;
        
    
        
    /**
     * 内存用量(GB) 
     */
    @SerializedName("Memory")
    private Integer memory;
        
    
        
    /**
     * 机器类型，N/O
     */
    @SerializedName("Os")
    private String os;
        
    
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }
    
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }
    
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    
        }
}









