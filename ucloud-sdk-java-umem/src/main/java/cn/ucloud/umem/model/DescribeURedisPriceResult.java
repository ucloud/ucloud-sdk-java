package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 取uredis价格信息 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisPriceResult extends BaseResponseResult {
    /**
     * 价格 参数见 UMemPriceSet
     */
    @SerializedName("DataSet")
    private List<URedisPriceSet> dataSet;


    public List<URedisPriceSet> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<URedisPriceSet> dataSet) {
        this.dataSet = dataSet;
    }


}