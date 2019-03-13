package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取GlobalSSH出入带宽数据 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetGlobalSSHMetricResult extends BaseResponseResult {
    /**
     * 相关指标，如带宽等
     */
    @SerializedName("Metrics")
    private List<GlobalSSHMetric> metrics;


}