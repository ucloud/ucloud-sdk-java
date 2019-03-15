package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import cn.ucloud.uhost.json.MetricAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-15 15:56
 **/

public class GetMetricResult extends BaseResponseResult {

    public static class MetricValue {

        @SerializedName("Timestamp")
        private Integer timeStamp;

        @SerializedName("Value")
        private Integer value;

        public Integer getTimeStamp() {
            return timeStamp;
        }

        public void setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

    @SerializedName("DataSets")
    private Map<String, List<MetricValue>> metrics = new HashMap<>();

    public Map<String, List<MetricValue>> getMetrics() {
        return metrics;
    }

    public void setMetrics(Map<String, List<MetricValue>> metrics) {
        this.metrics = metrics;
    }
}
