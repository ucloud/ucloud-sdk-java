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

public class DescribeUDBTypeResponse extends Response {

    
        
    /**
     * DB类型列表 参数见 UDBTypeSet
     */
    @SerializedName("DataSet")
    private List<UDBTypeSet> dataSet;
        
    
    public List<UDBTypeSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDBTypeSet> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class UDBTypeSet extends Response {
            
        
    /**
     * DB类型id，mysql/mongodb按版本细分各有一个id, 目前id的取值范围为[1,7],数值对应的版本如下： 1：mysql-5.5，2：mysql-5.1，3：percona-5.5 4：mongodb-2.4，5：mongodb-2.6，6：mysql-5.6， 7：percona-5.6
     */
    @SerializedName("DBTypeId")
    private String dbTypeId;
        
    
    public String getDBTypeId() {
        return dbTypeId;
    }

    public void setDBTypeId(String dbTypeId) {
        this.dbTypeId = dbTypeId;
    }
    
        }
}









