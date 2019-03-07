package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取SSL证书信息 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class DescribePathXSSLResult extends BaseResponseResult {
    /**
     * SSL证书详细信息，具体结构见 PathXSLLSet
     */
    @SerializedName("DataSet")
    private List<PathXSSLSet> dataSet;


}