package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 获取GlobalSSH覆盖的地区列表 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class DescribeGlobalSSHAreaResult extends BaseResponseResult {
            /**
            * 支持GlobalSSH的地区
            */
            @SerializedName("AreaSet")
                private List<GlobalSSHArea> areaSet;




}