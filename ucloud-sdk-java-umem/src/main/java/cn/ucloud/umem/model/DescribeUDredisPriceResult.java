package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 获取高性能UMem实例价格信息 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeUDredisPriceResult extends BaseResponseResult {
            /**
            * 价格 参数见 UDredisPriceSet
            */
            @SerializedName("DataSet")
                private List<UDredisPriceSet> dataSet;





                public List<UDredisPriceSet> getDataSet() {
                return this.dataSet;
                }

                public void setDataSet(List<UDredisPriceSet> dataSet) {
                this.dataSet = dataSet;
                }


}