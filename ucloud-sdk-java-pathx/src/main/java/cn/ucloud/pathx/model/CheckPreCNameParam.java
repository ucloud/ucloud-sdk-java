package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : （deprecated）检查三级域名合法性和唯一性 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class CheckPreCNameParam extends BaseRequestParam {
    /**
     * 三级域名前缀
     */
    @UcloudParam("PreCName")
    @NotEmpty(message = "preCName can not be empty")
    private String preCName;
    /**
     * 产品类型，用于区别不同产品使用的CName的域名
     */
    @UcloudParam("UGAType")
    @NotEmpty(message = "uGAType can not be empty")
    private String uGAType;


    public CheckPreCNameParam(String preCName
            , String uGAType
    ) {
        super("CheckPreCName");
        this.preCName = preCName;
        this.uGAType = uGAType;
    }


    public String getPreCName() {
        return this.preCName;
    }

    public void setPreCName(String preCName) {
        this.preCName = preCName;
    }

    public String getUGAType() {
        return this.uGAType;
    }

    public void setUGAType(String uGAType) {
        this.uGAType = uGAType;
    }


}