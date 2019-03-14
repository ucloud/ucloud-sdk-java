package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取全球加速监控信息 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class GetPathXMetricResult extends BaseResponseResult {
    /**
     *
     */
    @SerializedName("DataSet")
    private List<MetricPeriod> dataSet;


}