package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 获取域名预取开启状态 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/12 12:20
 */
public class GetUcdnDomainPrefetchEnableResult extends BaseResponseResult {
    /**
     * 0表示该域名未开启预取，1表示该域名已开启预取
     */
    @SerializedName("Enable")
    private Integer enable;

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}
