package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除负载均衡 参数类
 * @author: codezhang
 * @date: 2018-09-19 11:30
 **/

public class DeleteULBParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 负载均衡实例的ID
     */
    @NotEmpty(message = "ulbId can not be empty")
    @UcloudParam("ULBId")
    private String ulbId;

    /**
     * 删除ulb时是否释放绑定的EIP，
     * false标识只解绑EIP，
     * true表示会释放绑定的EIP，默认是false
     */
    @UcloudParam("ReleaseEip")
    private Boolean releaseEip;

    public DeleteULBParam( @NotEmpty(message = "region can not be empty") String region,
                           @NotEmpty(message = "ulbId can not be empty") String ulbId) {
        super("DeleteULB");
        this.region = region;
        this.ulbId = ulbId;
    }

    public Boolean getReleaseEip() {
        return releaseEip;
    }

    public void setReleaseEip(Boolean releaseEip) {
        this.releaseEip = releaseEip;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUlbId() {
        return ulbId;
    }

    public void setUlbId(String ulbId) {
        this.ulbId = ulbId;
    }
}
