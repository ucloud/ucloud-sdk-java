package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取全球运维通道流量统计数据 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetGlobalSSHTrafficResult extends BaseResponseResult {
    /**
     * 资源ID
     */
    @SerializedName("UGAId")
    private String uGAId;
    /**
     * 流量统计数据
     */
    @SerializedName("DataSet")
    private List<TrafficDaily> dataSet;


    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }


    public List<TrafficDaily> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<TrafficDaily> dataSet) {
        this.dataSet = dataSet;
    }


}