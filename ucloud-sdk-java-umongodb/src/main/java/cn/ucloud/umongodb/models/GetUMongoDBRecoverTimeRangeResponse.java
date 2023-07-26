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

package cn.ucloud.umongodb.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class GetUMongoDBRecoverTimeRangeResponse extends Response {

    
        
    /**
     * 最早可回档时间点
     */
    @SerializedName("EarliestTime")
    private Integer earliestTime;
        
    
        
    /**
     * 最晚可回档时间点
     */
    @SerializedName("LatestTime")
    private Integer latestTime;
        
    
    public Integer getEarliestTime() {
        return earliestTime;
    }

    public void setEarliestTime(Integer earliestTime) {
        this.earliestTime = earliestTime;
    }
    
    public Integer getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(Integer latestTime) {
        this.latestTime = latestTime;
    }
    
}









