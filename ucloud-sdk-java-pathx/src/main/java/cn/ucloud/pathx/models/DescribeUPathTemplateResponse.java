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

public class DescribeUPathTemplateResponse extends Response {

    
        
    /**
     * 监控模板详情
     */
    @SerializedName("DataSet")
    private List<AlarmRuler> dataSet;
        
    
    public List<AlarmRuler> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<AlarmRuler> dataSet) {
        this.dataSet = dataSet;
    }
    
        public static class AlarmRuler extends Response {
            
        
    /**
     * 收敛策略，可选范围 ['Exponential','Continuous','Once']，分别对应指数递增、连续告警、单次告警
     */
    @SerializedName("AlarmStrategy")
    private String alarmStrategy;
        
    
        
    /**
     * 告警探测周期，单位秒
     */
    @SerializedName("AlarmFrequency")
    private Integer alarmFrequency;
        
    
        
    /**
     * 比较策略，可选 ['GE','LE']  分别代表不小于和不大于
     */
    @SerializedName("Compare")
    private String compare;
        
    
        
    /**
     * 联系组ID
     */
    @SerializedName("ContactGroupId")
    private Integer contactGroupId;
        
    
        
    /**
     * 告警指标名称, 所有n的个数必须一致。目前仅允许以下四项：UpathNetworkOut:出向带宽，UpathNetworkIn:入向带宽，UpathNetworkOutUsage:出向带宽使用率，UpathNetworkInUsage:入向带宽使用率
     */
    @SerializedName("MetricName")
    private String metricName;
        
    
        
    /**
     * 告警阈值，带宽使用率的阈值范围是[50,100]的正整数，带宽告警阈值为1000000的倍数, 如大于2Mbps则告警 阈值应该传 2000000
     */
    @SerializedName("Threshold")
    private Integer threshold;
        
    
        
    /**
     * 告警触发周期（次数）
     */
    @SerializedName("TriggerCount")
    private Integer triggerCount;
        
    
        
    /**
     * 告警模板策略ID
     */
    @SerializedName("AlarmTemplateRuleId")
    private Integer alarmTemplateRuleId;
        
    
        
    /**
     * 资源类型
     */
    @SerializedName("ResourceType")
    private String resourceType;
        
    
    public String getAlarmStrategy() {
        return alarmStrategy;
    }

    public void setAlarmStrategy(String alarmStrategy) {
        this.alarmStrategy = alarmStrategy;
    }
    
    public Integer getAlarmFrequency() {
        return alarmFrequency;
    }

    public void setAlarmFrequency(Integer alarmFrequency) {
        this.alarmFrequency = alarmFrequency;
    }
    
    public String getCompare() {
        return compare;
    }

    public void setCompare(String compare) {
        this.compare = compare;
    }
    
    public Integer getContactGroupId() {
        return contactGroupId;
    }

    public void setContactGroupId(Integer contactGroupId) {
        this.contactGroupId = contactGroupId;
    }
    
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }
    
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }
    
    public Integer getTriggerCount() {
        return triggerCount;
    }

    public void setTriggerCount(Integer triggerCount) {
        this.triggerCount = triggerCount;
    }
    
    public Integer getAlarmTemplateRuleId() {
        return alarmTemplateRuleId;
    }

    public void setAlarmTemplateRuleId(Integer alarmTemplateRuleId) {
        this.alarmTemplateRuleId = alarmTemplateRuleId;
    }
    
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
        }
}









