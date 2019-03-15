package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取价格 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeUMemPriceResult extends BaseResponseResult {
    /**
     * 价格 参数见 UMemPriceSet
     */
    @SerializedName("DataSet")
    private List<UMemPriceSet> dataSet;


    public List<UMemPriceSet> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<UMemPriceSet> dataSet) {
        this.dataSet = dataSet;
    }


}