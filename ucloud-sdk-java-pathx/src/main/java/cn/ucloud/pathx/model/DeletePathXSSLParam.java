package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 删除PathX SSL证书 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class DeletePathXSSLParam extends BaseRequestParam {
            /**
            * SSL证书的ID
            */
            @UcloudParam("SSLId")
                    @NotEmpty(message = "sSLId can not be empty")
                private String sSLId;


public DeletePathXSSLParam(                    String projectId
                    ,String sSLId
){
    super("DeletePathXSSL");
                this.projectId = projectId;
                this.sSLId = sSLId;
}


                public String getSSLId() {
                return this.sSLId;
                }

                public void setSSLId(String sSLId) {
                this.sSLId = sSLId;
                }



}