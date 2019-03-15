package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 获取UMem列表 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeUMemResult extends BaseResponseResult {
            /**
            * 根据过滤条件得到的总数
            */
            @SerializedName("TotalCount")
                private Integer totalCount;
            /**
            * UMem实例列表, 详细参见UMemDataSet
            */
            @SerializedName("DataSet")
                private List<UMemDataSet> dataSet;


                public Integer getTotalCount() {
                return this.totalCount;
                }

                public void setTotalCount(Integer totalCount) {
                this.totalCount = totalCount;
                }



                public List<UMemDataSet> getDataSet() {
                return this.dataSet;
                }

                public void setDataSet(List<UMemDataSet> dataSet) {
                this.dataSet = dataSet;
                }


}