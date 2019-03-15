package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取全球加速监控信息 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetPathXMetricResult extends BaseResponseResult {
    /**
     *
     */
    @SerializedName("DataSet")
    private List<MetricPeriod> dataSet;


    public List<MetricPeriod> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<MetricPeriod> dataSet) {
        this.dataSet = dataSet;
    }


}