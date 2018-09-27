package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 从VServer解绑SSL证书 结果类
 * @author: codezhang
 * @date: 2018-09-20 19:42
 **/

public class UnbindSSLParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 所绑定ULB实例ID
     */
    @NotEmpty(message = "ulbId can not be empty")
    @UcloudParam("ULBId")
    private String ulbId;


    /**
     * require 所绑定VServer实例ID
     */
    @NotEmpty(message = "vserverId can not be empty")
    @UcloudParam("VServerId")
    private String vserverId;

    /**
     * require SSL证书的Id
     */
    @UcloudParam("SSLId")
    @NotEmpty(message = "sslId can not be empty")
    private String sslId;


    public UnbindSSLParam(@NotEmpty(message = "region can not be empty") String region,
                        @NotEmpty(message = "ulbId can not be empty") String ulbId,
                        @NotEmpty(message = "vserverId can not be empty") String vserverId,
                        @NotEmpty(message = "sslId can not be empty") String sslId) {
        super("UnbindSSL");
        this.region = region;
        this.ulbId = ulbId;
        this.vserverId = vserverId;
        this.sslId = sslId;
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

    public String getVserverId() {
        return vserverId;
    }

    public void setVserverId(String vserverId) {
        this.vserverId = vserverId;
    }

    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
    }
}
