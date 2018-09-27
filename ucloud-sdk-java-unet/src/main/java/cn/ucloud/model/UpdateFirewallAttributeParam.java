package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 15:51
 */
public class UpdateFirewallAttributeParam extends BaseRequestParam {
    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 防火墙ID，默认为返回所有防火墙
     */
    @NotEmpty(message = "fwId can not be empty")
    @UcloudParam("FWId")
    private String fwId;

    /**
     * require 防火墙名称，默认为空，为空则不做修改。Name,Tag,Remark必须填写1个及以上
     */
    @UcloudParam("Name")
    private String name;

    /**
     * require 防火墙业务组，默认为空，为空则不做修改。Name,Tag,Remark必须填写1个及以上
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * require 防火墙备注，默认为空，为空则不做修改。Name,Tag,Remark必须填写1个及以上
     */
    @UcloudParam("Remark")
    private String remark;

    public UpdateFirewallAttributeParam(@NotEmpty(message = "region can not be empty") String region,
                                        @NotEmpty(message = "fwId can not be empty") String fwId) {
        super("UpdateFirewallAttribute");
        this.region = region;
        this.fwId = fwId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getFwId() {
        return fwId;
    }

    public void setFwId(String fwId) {
        this.fwId = fwId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
