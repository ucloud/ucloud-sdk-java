package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取全球加速服务加速配置信息 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DescribeUGAInstanceResult extends BaseResponseResult {
    /**
     * 全球加速实例信息列表
     */
    @SerializedName("UGAList")
    private List<UGAAInfo> uGAList;


}