package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 获取高性能UMem内存空间列表 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeUDredisSpaceResult extends BaseResponseResult {
            /**
            * JSON 格式的UMem内存空间实例列表, 详细参见 UDredisSpaceSet
            */
            @SerializedName("DataSet")
                private List<UDredisSpaceSet> dataSet;
            /**
            * 根据过滤条件得到的总数
            */
            @SerializedName("TotalCount")
                private Integer totalCount;





                public List<UDredisSpaceSet> getDataSet() {
                return this.dataSet;
                }

                public void setDataSet(List<UDredisSpaceSet> dataSet) {
                this.dataSet = dataSet;
                }
                public Integer getTotalCount() {
                return this.totalCount;
                }

                public void setTotalCount(Integer totalCount) {
                this.totalCount = totalCount;
                }


}