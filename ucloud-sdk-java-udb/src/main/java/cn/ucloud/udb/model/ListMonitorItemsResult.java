package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import cn.ucloud.udb.json.AlarmRangeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取某DB类型的所有监控项 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 17:42
 **/
public class ListMonitorItemsResult extends BaseResponseResult {

    public static class AlarmRange{

        @SerializedName("min")
        private Integer min;

        @SerializedName("max")
        private Integer max;

        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Integer getMin() {
            return min;
        }

        public void setMin(Integer min) {
            this.min = min;
        }

        public Integer getMax() {
            return max;
        }

        public void setMax(Integer max) {
            this.max = max;
        }
    }

    public static class MetricInfo {

        /**
         * 指标名称
         */
        @SerializedName("MetricName")
        private String metricName;

        /**
         * 指标ID
         */
        @SerializedName("MetricId")
        private Integer metricId;

        /**
         * 单位
         */
        @SerializedName("Unit")
        private String unit;

        /**
         * 单位转换因子（1000/1024）
         */
        @SerializedName("ConversionFactor")
        private Integer conversionFactor;

        /**
         * 数据类型
         */
        @SerializedName("Type")
        private String type;

        /**
         * 指标组名称，相同指标组前端可合并一张图显示
         */
        @SerializedName("MetricGroup")
        private String metricGroup;

        /**
         * 是否支持告警
         */
        @SerializedName("SupportAlarm")
        private String supportAlarm;

        /**
         * 告警设置范围
         */
        @JsonAdapter(value = AlarmRangeAdapter.class)
        @SerializedName("AlarmRange")
        private AlarmRange alarmRange;

        /**
         * 数据上报频率
         */
        @SerializedName("Frequency")
        private Integer frequency;

        /**
         * 比较参数，可选GE,LE
         */
        @SerializedName("CompareOption")
        private List<String> compareOption;

        public String getMetricName() {
            return metricName;
        }

        public void setMetricName(String metricName) {
            this.metricName = metricName;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Integer getConversionFactor() {
            return conversionFactor;
        }

        public void setConversionFactor(Integer conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getMetricGroup() {
            return metricGroup;
        }

        public void setMetricGroup(String metricGroup) {
            this.metricGroup = metricGroup;
        }

        public Integer getMetricId() {
            return metricId;
        }

        public void setMetricId(Integer metricId) {
            this.metricId = metricId;
        }

        public String getSupportAlarm() {
            return supportAlarm;
        }

        public void setSupportAlarm(String supportAlarm) {
            this.supportAlarm = supportAlarm;
        }

        public AlarmRange getAlarmRange() {
            return alarmRange;
        }

        public void setAlarmRange(AlarmRange alarmRange) {
            this.alarmRange = alarmRange;
        }

        public Integer getFrequency() {
            return frequency;
        }

        public void setFrequency(Integer frequency) {
            this.frequency = frequency;
        }

        public List<String> getCompareOption() {
            return compareOption;
        }

        public void setCompareOption(List<String> compareOption) {
            this.compareOption = compareOption;
        }

    }

    /**
     * 指标信息集合  MetricInfo
     */
    @SerializedName("DataSet")
    private List<MetricInfo> metricInfos;

    public List<MetricInfo> getMetricInfos() {
        return metricInfos;
    }

    public void setMetricInfos(List<MetricInfo> metricInfos) {
        this.metricInfos = metricInfos;
    }

}
