package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取全球加速服务加速配置信息 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DescribeUGAInstanceResult extends BaseResponseResult {
    /**
     * 全球加速实例信息列表
     */
    @SerializedName("UGAList")
    private List<UGAAInfo> uGAList;

    /**
     * 总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;


    public List<UGAAInfo> getuGAList() {
        return this.uGAList;
    }

    public void setuGAList(List<UGAAInfo> uGAList) {
        this.uGAList = uGAList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}