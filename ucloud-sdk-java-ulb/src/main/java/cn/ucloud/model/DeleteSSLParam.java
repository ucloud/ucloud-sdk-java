package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 删除SSL证书 参数类
 * @author: codezhang
 * @date: 2018-09-20 19:22
 **/

public class DeleteSSLParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region ;

    /**
     * require SSL证书的ID
     */
    @UcloudParam("SSLId")
    @NotEmpty(message = "sslId can not be empty")
    private String sslId;

    public DeleteSSLParam( @NotEmpty(message = "region can not be empty") String region,
                           @NotEmpty(message = "sslId can not be empty") String sslId) {
        super("DeleteSSL");
        this.region = region;
        this.sslId = sslId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
    }
}
