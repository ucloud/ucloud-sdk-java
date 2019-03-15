package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 获取Memcache可用版本 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeUMemcacheVersionResult extends BaseResponseResult {
            /**
            * 组列表, 参见 UMemcacheVersionSet
            */
            @SerializedName("DataSet")
                private List<UMemcacheVersionSet> dataSet;
            /**
            * 总版本个数
            */
            @SerializedName("TotalCount")
                private Integer totalCount;





                public List<UMemcacheVersionSet> getDataSet() {
                return this.dataSet;
                }

                public void setDataSet(List<UMemcacheVersionSet> dataSet) {
                this.dataSet = dataSet;
                }
                public Integer getTotalCount() {
                return this.totalCount;
                }

                public void setTotalCount(Integer totalCount) {
                this.totalCount = totalCount;
                }


}