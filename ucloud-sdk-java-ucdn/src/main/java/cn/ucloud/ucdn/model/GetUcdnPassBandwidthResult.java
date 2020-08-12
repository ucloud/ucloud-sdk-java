package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取回源带宽数据（按时间分类） result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 15:42
 */
public class GetUcdnPassBandwidthResult extends BaseResponseResult {
    /**
     * 带宽信息列表，参见{@link BandwidthInfoDetail}
     */
    @SerializedName("BandwidthDetail")
    private List<BandwidthInfoDetail> bandwidthDetail;

    public List<BandwidthInfoDetail> getBandwidthDetail() {
        return bandwidthDetail;
    }

    public void setBandwidthDetail(List<BandwidthInfoDetail> bandwidthDetail) {
        this.bandwidthDetail = bandwidthDetail;
    }
}
