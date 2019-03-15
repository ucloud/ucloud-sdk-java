package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 检查机房整体资源情况 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CheckRegionResourceResult extends BaseResponseResult {
    /**
     * 总体资源，见RegionsResourceSet
     */
    @SerializedName("Regions")
    private List<String> regions;


    public List<String> getRegions() {
        return this.regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }


}