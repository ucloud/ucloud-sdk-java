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

package cn.ucloud.pathx.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class GetUGA3MetricResponse extends Response {

    
        
    /**
     * 监控数据结果集
     */
    @SerializedName("DataSet")
    private UGA3Metric dataSet;
        
    
    public UGA3Metric getDataSet() {
        return dataSet;
    }

    public void setDataSet(UGA3Metric dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class MatricPoint extends Response {
            
        
    /**
     * 时间戳 
     */
    @SerializedName("Timestamp")
    private Integer timestamp;
        
    
        
    /**
     * 监控点数值
     */
    @SerializedName("Value")
    private Integer value;
        
    
    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }
    
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    
        }
        public static class UGA3Metric extends Response {
            
        
    /**
     * 出向带宽
     */
    @SerializedName("NetworkOut")
    private List<MatricPoint> networkOut;
        
    
        
    /**
     * 入向带宽
     */
    @SerializedName("NetworkIn")
    private List<MatricPoint> networkIn;
        
    
        
    /**
     * 出向带宽使用率
     */
    @SerializedName("NetworkOutUsage")
    private List<MatricPoint> networkOutUsage;
        
    
        
    /**
     * 入向带宽使用率
     */
    @SerializedName("NetworkInUsage")
    private List<MatricPoint> networkInUsage;
        
    
        
    /**
     * 子线路出口带宽
     */
    @SerializedName("NetworkOutSubline")
    private List<MatricPoint> networkOutSubline;
        
    
        
    /**
     * 子线路入口带宽
     */
    @SerializedName("NetworkInSubline")
    private List<MatricPoint> networkInSubline;
        
    
        
    /**
     * 线路平均延迟
     */
    @SerializedName("Delay")
    private List<MatricPoint> delay;
        
    
        
    /**
     * 子线路延迟
     */
    @SerializedName("DelaySubline")
    private List<MatricPoint> delaySubline;
        
    
        
    /**
     * 延迟提升
     */
    @SerializedName("DelayPromote")
    private List<MatricPoint> delayPromote;
        
    
        
    /**
     * 子线路延迟提升
     */
    @SerializedName("DelayPromoteSubline")
    private List<MatricPoint> delayPromoteSubline;
        
    
        
    /**
     * 当前连接数
     */
    @SerializedName("ConnectCount")
    private List<MatricPoint> connectCount;
        
    
        
    /**
     * 子线路当前连接数
     */
    @SerializedName("ConnectCountSubline")
    private List<MatricPoint> connectCountSubline;
        
    
    public List<MatricPoint> getNetworkOut() {
        return networkOut;
    }

    public void setNetworkOut(List<MatricPoint> networkOut) {
        this.networkOut = networkOut;
    }
    
    public List<MatricPoint> getNetworkIn() {
        return networkIn;
    }

    public void setNetworkIn(List<MatricPoint> networkIn) {
        this.networkIn = networkIn;
    }
    
    public List<MatricPoint> getNetworkOutUsage() {
        return networkOutUsage;
    }

    public void setNetworkOutUsage(List<MatricPoint> networkOutUsage) {
        this.networkOutUsage = networkOutUsage;
    }
    
    public List<MatricPoint> getNetworkInUsage() {
        return networkInUsage;
    }

    public void setNetworkInUsage(List<MatricPoint> networkInUsage) {
        this.networkInUsage = networkInUsage;
    }
    
    public List<MatricPoint> getNetworkOutSubline() {
        return networkOutSubline;
    }

    public void setNetworkOutSubline(List<MatricPoint> networkOutSubline) {
        this.networkOutSubline = networkOutSubline;
    }
    
    public List<MatricPoint> getNetworkInSubline() {
        return networkInSubline;
    }

    public void setNetworkInSubline(List<MatricPoint> networkInSubline) {
        this.networkInSubline = networkInSubline;
    }
    
    public List<MatricPoint> getDelay() {
        return delay;
    }

    public void setDelay(List<MatricPoint> delay) {
        this.delay = delay;
    }
    
    public List<MatricPoint> getDelaySubline() {
        return delaySubline;
    }

    public void setDelaySubline(List<MatricPoint> delaySubline) {
        this.delaySubline = delaySubline;
    }
    
    public List<MatricPoint> getDelayPromote() {
        return delayPromote;
    }

    public void setDelayPromote(List<MatricPoint> delayPromote) {
        this.delayPromote = delayPromote;
    }
    
    public List<MatricPoint> getDelayPromoteSubline() {
        return delayPromoteSubline;
    }

    public void setDelayPromoteSubline(List<MatricPoint> delayPromoteSubline) {
        this.delayPromoteSubline = delayPromoteSubline;
    }
    
    public List<MatricPoint> getConnectCount() {
        return connectCount;
    }

    public void setConnectCount(List<MatricPoint> connectCount) {
        this.connectCount = connectCount;
    }
    
    public List<MatricPoint> getConnectCountSubline() {
        return connectCountSubline;
    }

    public void setConnectCountSubline(List<MatricPoint> connectCountSubline) {
        this.connectCountSubline = connectCountSubline;
    }
    
        }
}









