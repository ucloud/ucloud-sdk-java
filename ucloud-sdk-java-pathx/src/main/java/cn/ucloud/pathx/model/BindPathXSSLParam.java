package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 绑定PathX SSL证书 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class BindPathXSSLParam extends BaseRequestParam {
    /**
     * 证书ID
     */
    @UcloudParam("SSLId")
    @NotEmpty(message = "sSLId can not be empty")
    private String sSLId;
    /**
     * UGA实例ID
     */
    @UcloudParam("UGAId")
    @NotEmpty(message = "uGAId can not be empty")
    private String uGAId;
    // TODO 需要人工接入 BindPathXSSL =》 Port.n


    public BindPathXSSLParam(String sSLId
            , String uGAId
    ) {
        super("BindPathXSSL");
        this.sSLId = sSLId;
        this.uGAId = uGAId;
        // TODO 需要人工接入 BindPathXSSL =》 Port.n is required
    }


    public String getsSLId() {
        return this.sSLId;
    }

    public void setsSLId(String sSLId) {
        this.sSLId = sSLId;
    }

    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }


}