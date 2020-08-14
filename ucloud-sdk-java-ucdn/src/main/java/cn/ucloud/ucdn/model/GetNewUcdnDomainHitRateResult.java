package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取域名命中率 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 16:35
 */
public class GetNewUcdnDomainHitRateResult extends BaseResponseResult {
    /**
     * 请求数实例表。
     */
    @SerializedName("HitRateList")
    private List<HitRateInfo> hitRateList;

    public List<HitRateInfo> getHitRateList() {
        return hitRateList;
    }

    public void setHitRateList(List<HitRateInfo> hitRateList) {
        this.hitRateList = hitRateList;
    }
}
