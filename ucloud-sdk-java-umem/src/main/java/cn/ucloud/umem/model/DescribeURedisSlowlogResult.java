package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 查询URedis慢日志 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisSlowlogResult extends BaseResponseResult {
    /**
     * 总条目数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
    /**
     * 条目数据
     */
    @SerializedName("DataSet")
    private List<URedisSlowlogSet> dataSet;


    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    public List<URedisSlowlogSet> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<URedisSlowlogSet> dataSet) {
        this.dataSet = dataSet;
    }


}