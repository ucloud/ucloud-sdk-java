package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取全球加速线路信息 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class DescribePathXLineConfigResult extends BaseResponseResult {
    /**
     * UGAA线路列表
     */
    @SerializedName("LineSet")
    private List<UGAALine> lineSet;


}