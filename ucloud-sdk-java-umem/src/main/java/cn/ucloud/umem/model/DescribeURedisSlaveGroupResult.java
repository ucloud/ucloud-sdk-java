package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 查询主备Redis关联Slave 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeURedisSlaveGroupResult extends BaseResponseResult {
            /**
            * 组的总的节点个数
            */
            @SerializedName("TotalCount")
                private Integer totalCount;
            /**
            * 组列表 参见 URedisSlaveGroupSet
            */
            @SerializedName("DataSet")
                private List<URedisSlaveGroupSet> dataSet;


                public Integer getTotalCount() {
                return this.totalCount;
                }

                public void setTotalCount(Integer totalCount) {
                this.totalCount = totalCount;
                }



                public List<URedisSlaveGroupSet> getDataSet() {
                return this.dataSet;
                }

                public void setDataSet(List<URedisSlaveGroupSet> dataSet) {
                this.dataSet = dataSet;
                }


}