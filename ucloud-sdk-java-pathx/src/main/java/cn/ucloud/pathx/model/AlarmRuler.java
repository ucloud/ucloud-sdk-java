package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : 告警详情 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class AlarmRuler {
    /**
     * 告警策略ID
     */
    @SerializedName("AlarmStrategy")
    private String alarmStrategy;
    /**
     * 比较策略
     */
    @SerializedName("Compare")
    private String compare;
    /**
     * 联系组
     */
    @SerializedName("ContactGroupId")
    private Integer contactGroupId;
    /**
     * 告警项
     */
    @SerializedName("MetricName")
    private String metricName;
    /**
     * 触发阈值
     */
    @SerializedName("Threshold")
    private Integer threshold;
    /**
     * 触发次数
     */
    @SerializedName("TriggerCount")
    private Integer triggerCount;


    public String getAlarmStrategy() {
        return this.alarmStrategy;
    }

    public void setAlarmStrategy(String alarmStrategy) {
        this.alarmStrategy = alarmStrategy;
    }


    public String getCompare() {
        return this.compare;
    }

    public void setCompare(String compare) {
        this.compare = compare;
    }


    public Integer getContactGroupId() {
        return this.contactGroupId;
    }

    public void setContactGroupId(Integer contactGroupId) {
        this.contactGroupId = contactGroupId;
    }


    public String getMetricName() {
        return this.metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }


    public Integer getThreshold() {
        return this.threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }


    public Integer getTriggerCount() {
        return this.triggerCount;
    }

    public void setTriggerCount(Integer triggerCount) {
        this.triggerCount = triggerCount;
    }


}