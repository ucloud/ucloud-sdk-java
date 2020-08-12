package cn.ucloud.ucdn.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取域名预取开启状态 param
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/12 12:18
 */
public class GetUcdnDomainPrefetchEnableParam extends BaseRequestParam {
    /**
     * 域名ID，创建加速域名时生成。
     */
    @UcloudParam("DomainId")
    @NotEmpty(message = "DomainId can not be empty")
    private String domainId;

    public GetUcdnDomainPrefetchEnableParam(@NotEmpty(message = "DomainId can not be empty") String domainId) {
        super("GetUcdnDomainPrefetchEnable");
        this.domainId = domainId;
    }
}
