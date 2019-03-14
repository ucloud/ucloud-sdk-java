package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 查询UPath的监控模板 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DescribeUPathTemplateResult extends BaseResponseResult {
    /**
     * 监控模板详情
     */
    @SerializedName("DataSet")
    private List<AlarmRuler> dataSet;


}