package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 解绑PathX SSL 证书 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class UnBindPathXSSLParam extends BaseRequestParam {
            /**
            * UGA实例ID。
            */
            @UcloudParam("UGAId")
                    @NotEmpty(message = "uGAId can not be empty")
                private String uGAId;
            /**
            * SSL证书ID。
            */
            @UcloudParam("SSLId")
                    @NotEmpty(message = "sSLId can not be empty")
                private String sSLId;
            // TODO 需要人工接入 UnBindPathXSSL =》 Port.n


public UnBindPathXSSLParam(                    String uGAId
                    ,String sSLId
){
    super("UnBindPathXSSL");
                this.uGAId = uGAId;
                this.sSLId = sSLId;
                // TODO 需要人工接入 UnBindPathXSSL =》 Port.n is required
}


                public String getUGAId() {
                return this.uGAId;
                }

                public void setUGAId(String uGAId) {
                this.uGAId = uGAId;
                }

                public String getSSLId() {
                return this.sSLId;
                }

                public void setSSLId(String sSLId) {
                this.sSLId = sSLId;
                }



}