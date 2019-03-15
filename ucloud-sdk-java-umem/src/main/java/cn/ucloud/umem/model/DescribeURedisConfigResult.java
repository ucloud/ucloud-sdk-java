package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 查询主备Redis所有配置文件 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisConfigResult extends BaseResponseResult {
    /**
     * 根据过滤条件得到的总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
    /**
     * 配置文件列表 参见 URedisConfigSet
     */
    @SerializedName("DataSet")
    private List<URedisConfigSet> dataSet;


    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    public List<URedisConfigSet> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<URedisConfigSet> dataSet) {
        this.dataSet = dataSet;
    }


}