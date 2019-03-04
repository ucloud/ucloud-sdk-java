package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 获取某DB类型的所有监控项 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 17:42
 **/
public class ListMonitorItemsResult extends BaseResponseResult {

    public static class MetricInfo {

        /**
         * 指标名称
         */
        @SerializedName("MetricName")
        private String metricName;

        /**
         * 单位
         */
        @SerializedName("Unit")
        private String unit;

        /**
         * 单位转换因子（1000/1024）
         */
        @SerializedName("ConversionFactor")
        private String conversionFactor;

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
        private Boolean supportAlarm;

        /**
         * 告警设置范围
         */
        @SerializedName("AlarmRange")
        private String alarmRange;

        /**
         * 数据上报频率
         */
        @SerializedName("Frequency")
        private String frequency;

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

        public String getConversionFactor() {
            return conversionFactor;
        }

        public void setConversionFactor(String conversionFactor) {
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

        public Boolean getSupportAlarm() {
            return supportAlarm;
        }

        public void setSupportAlarm(Boolean supportAlarm) {
            this.supportAlarm = supportAlarm;
        }

        public String getAlarmRange() {
            return alarmRange;
        }

        public void setAlarmRange(String alarmRange) {
            this.alarmRange = alarmRange;
        }

        public String getFrequency() {
            return frequency;
        }

        public void setFrequency(String frequency) {
            this.frequency = frequency;
        }

        public List<String> getCompareOption() {
            return compareOption;
        }

        public void setCompareOption(List<String> compareOption) {
            this.compareOption = compareOption;
        }

        @Override
        public String toString() {
            return "MetricInfo{" +
                    "metricName='" + metricName + '\'' +
                    ", unit='" + unit + '\'' +
                    ", conversionFactor='" + conversionFactor + '\'' +
                    ", type='" + type + '\'' +
                    ", metricGroup='" + metricGroup + '\'' +
                    ", supportAlarm=" + supportAlarm +
                    ", alarmRange='" + alarmRange + '\'' +
                    ", frequency='" + frequency + '\'' +
                    ", compareOption=" + compareOption +
                    '}';
        }
    }

    /**
     * 指标信息集合  MetricInfo
     */
    @SerializedName("DateSet")
    private List<MetricInfo> metricInfos;

    public List<MetricInfo> getMetricInfos() {
        return metricInfos;
    }

    public void setMetricInfos(List<MetricInfo> metricInfos) {
        this.metricInfos = metricInfos;
    }

    @Override
    public String toString() {
        return "ListMonitorItemsResult{" +
                "metricInfos=" + metricInfos +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
