package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 绑定PathX SSL证书 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
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


public BindPathXSSLParam(                    String sSLId
                    ,String uGAId
){
    super("BindPathXSSL");
                this.sSLId = sSLId;
                this.uGAId = uGAId;
                // TODO 需要人工接入 BindPathXSSL =》 Port.n is required
}


                public String getSSLId() {
                return this.sSLId;
                }

                public void setSSLId(String sSLId) {
                this.sSLId = sSLId;
                }

                public String getUGAId() {
                return this.uGAId;
                }

                public void setUGAId(String uGAId) {
                this.uGAId = uGAId;
                }



}