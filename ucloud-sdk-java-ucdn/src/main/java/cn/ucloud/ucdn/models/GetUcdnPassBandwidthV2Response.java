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

package cn.ucloud.ucdn.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class GetUcdnPassBandwidthV2Response extends Response {

    
        
    /**
     * 回源带宽数据
     */
    @SerializedName("BandwidthList")
    private List<BandwidthInfoDetail> bandwidthList;
        
    
    public List<BandwidthInfoDetail> getBandwidthList() {
        return bandwidthList;
    }

    public void setBandwidthList(List<BandwidthInfoDetail> bandwidthList) {
        this.bandwidthList = bandwidthList;
    }
    
        public static class BandwidthInfoDetail extends Response {
            
        
    /**
     * 宽获取的时间点。格式：时间戳
     */
    @SerializedName("Time")
    private Integer time;
        
    
        
    /**
     * 返回值带宽值数据。
     */
    @SerializedName("Bandwidth")
    private Double bandwidth;
        
    
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
    
    public Double getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Double bandwidth) {
        this.bandwidth = bandwidth;
    }
    
        }
}









