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

public class ListUPgSQLVersionResponse extends Response {

    
        
    /**
     * postgresql版本信息
     */
    @SerializedName("DataSet")
    private List<PgSQLVersion> dataSet;
        
    
    public List<PgSQLVersion> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<PgSQLVersion> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class PgSQLVersion extends Response {
            
        
    /**
     * PgSQL版本
     */
    @SerializedName("DBVersion")
    private String dbVersion;
        
    
        
    /**
     * 2位二进制控制是否开放单点和高可用，前一位控制单点是否开放，后一位控制高可用，例如"01"代表只开放高可用，"10"代表只开放单点，"11"代表全开放 
     */
    @SerializedName("Available")
    private String available;
        
    
    public String getDBVersion() {
        return dbVersion;
    }

    public void setDBVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }
    
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
    
        }
}









