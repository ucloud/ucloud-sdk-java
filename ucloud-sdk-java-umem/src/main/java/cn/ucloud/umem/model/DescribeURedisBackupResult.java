package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 查询主备redis备份 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeURedisBackupResult extends BaseResponseResult {
            /**
            * 用户名下总的备份个数
            */
            @SerializedName("TotalCount")
                private Integer totalCount;
            /**
            * 备份列表 参见 URedisBackupSet
            */
            @SerializedName("DataSet")
                private List<URedisBackupSet> dataSet;


                public Integer getTotalCount() {
                return this.totalCount;
                }

                public void setTotalCount(Integer totalCount) {
                this.totalCount = totalCount;
                }



                public List<URedisBackupSet> getDataSet() {
                return this.dataSet;
                }

                public void setDataSet(List<URedisBackupSet> dataSet) {
                this.dataSet = dataSet;
                }


}