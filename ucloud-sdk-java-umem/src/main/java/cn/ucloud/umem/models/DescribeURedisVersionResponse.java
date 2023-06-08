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

package cn.ucloud.umem.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeURedisVersionResponse extends Response {

    
        
    /**
     * 组列表 参见 URedisVersionSet
     */
    @SerializedName("DataSet")
    private List<URedisVersionSet> dataSet;
        
    
        
    /**
     * 总版本个数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
    public List<URedisVersionSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<URedisVersionSet> dataSet) {
        this.dataSet = dataSet;
    }
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
        public static class URedisVersionSet extends Response {
            
        
    /**
     * Redis版本
     */
    @SerializedName("Version")
    private String version;
        
    
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
        }
}









