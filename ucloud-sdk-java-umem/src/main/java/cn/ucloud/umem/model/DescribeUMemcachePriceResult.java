package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 获取umemcache组价格 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeUMemcachePriceResult extends BaseResponseResult {
            /**
            * 价格列表, 参见 UMemcachePriceSet
            */
            @SerializedName("DataSet")
                private List<UMemcachePriceSet> dataSet;





                public List<UMemcachePriceSet> getDataSet() {
                return this.dataSet;
                }

                public void setDataSet(List<UMemcachePriceSet> dataSet) {
                this.dataSet = dataSet;
                }


}