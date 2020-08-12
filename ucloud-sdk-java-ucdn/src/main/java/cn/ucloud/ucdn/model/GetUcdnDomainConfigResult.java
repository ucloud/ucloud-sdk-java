package cn.ucloud.ucdn.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 批量获取加速域名配置 result
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 17:58
 */
public class GetUcdnDomainConfigResult extends BaseResponseResult {
    /**
     * 获取的域名信息，具体参考{@link DomainConfigInfo}
     */
    @SerializedName("DomainList")
    private List<DomainConfigInfo> domainList;

    public List<DomainConfigInfo> getDomainList() {
        return domainList;
    }

    public void setDomainList(List<DomainConfigInfo> domainList) {
        this.domainList = domainList;
    }
}
