package cn.ucloud.censor.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description : UAI安全审查请求的具体分布信息
 * @Author : codezhang
 * @Date : 2019-04-18 17:23
 **/
public class UAICensorDetailRequestInfo {

    /**
     * 开始时间，Unix时间戳形式
     */
    @SerializedName("BeginTime")
    private Long beginTime;

    /**
     * 结束时间，Unix时间戳形式
     */
    @SerializedName("EndTime")
    private Long endTime;

    /**
     * 总请求数
     */
    @SerializedName("TotalRequest")
    private Integer totalRequest;

    /**
     * 成功请求数
     */
    @SerializedName("SuccRequest")
    private Integer successRequest;

    /**
     * 失败请求数
     */
    @SerializedName("FailRequest")
    private Integer failedRequest;

    /**
     * 请求最大耗时（单位ms）
     */
    @SerializedName("MaxRequestTime")
    private Integer maxRequestTime;

    /**
     * 请求最小耗时（单位ms）
     */
    @SerializedName("MinRequestTime")
    private Integer minRequestTime;

    /**
     * 请求平均耗时（单位ms）
     */
    @SerializedName("AvgRequestTime")
    private Integer avgRequestTime;
}
