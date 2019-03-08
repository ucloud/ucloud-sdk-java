package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 获取入口白名单列表 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class DescribePathXWhitelistResult extends BaseResponseResult {
            /**
            * 实例白名单规则列表
            */
            @SerializedName("WhitelistSet")
                private List<InstanceWhitelist> whitelistSet;




}