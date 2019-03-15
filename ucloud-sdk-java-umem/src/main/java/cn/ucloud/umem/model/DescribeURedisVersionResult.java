package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 获取主Redis可用版本 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeURedisVersionResult extends BaseResponseResult {
            /**
            * 组列表 参见 URedisVersionSet
            */
            @SerializedName("DataSet")
                private List<URedisVersionSet> dataSet;
            /**
            * 总版本个数
            */
            @SerializedName("TotalCount")
                private Integer totalCount;





                public List<URedisVersionSet> getDataSet() {
                return this.dataSet;
                }

                public void setDataSet(List<URedisVersionSet> dataSet) {
                this.dataSet = dataSet;
                }
                public Integer getTotalCount() {
                return this.totalCount;
                }

                public void setTotalCount(Integer totalCount) {
                this.totalCount = totalCount;
                }


}