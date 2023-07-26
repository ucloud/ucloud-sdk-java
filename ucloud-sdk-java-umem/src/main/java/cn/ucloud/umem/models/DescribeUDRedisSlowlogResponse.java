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

public class DescribeUDRedisSlowlogResponse extends Response {

    
        
    /**
     * 总条目数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
        
    
        
    /**
     * 条目数据
     */
    @SerializedName("DataSet")
    private List<UDRedisSlowlogSet> dataSet;
        
    
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    
    public List<UDRedisSlowlogSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UDRedisSlowlogSet> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class UDRedisSlowlogSet extends Response {
            
        
    /**
     * 查询发生的时间
     */
    @SerializedName("StartTime")
    private Integer startTime;
        
    
        
    /**
     * 查询消耗的时间
     */
    @SerializedName("SpendTime")
    private Integer spendTime;
        
    
        
    /**
     * 查询命令
     */
    @SerializedName("Command")
    private String command;
        
    
        
    /**
     * 分片id
     */
    @SerializedName("BlockId")
    private String blockId;
        
    
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }
    
    public Integer getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(Integer spendTime) {
        this.spendTime = spendTime;
    }
    
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
    
    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }
    
        }
}









