package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 显示主备Redis配置文件参数信息 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisConfigParamResult extends BaseResponseResult {
    /**
     * 用户名下总的备份个数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
    /**
     * 配置文件参数列表 参见 URedisConfigParamSet
     */
    @SerializedName("DataSet")
    private List<URedisConfigParamSet> dataSet;


    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    public List<URedisConfigParamSet> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<URedisConfigParamSet> dataSet) {
        this.dataSet = dataSet;
    }


}