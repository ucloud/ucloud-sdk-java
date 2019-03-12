package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 删除PathX SSL证书 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DeletePathXSSLParam extends BaseRequestParam {
    /**
     * SSL证书的ID
     */
    @UcloudParam("SSLId")
    @NotEmpty(message = "sSLId can not be empty")
    private String sSLId;


    public DeletePathXSSLParam(String projectId
            , String sSLId
    ) {
        super("DeletePathXSSL");
        this.projectId = projectId;
        this.sSLId = sSLId;
    }


    public String getsSLId() {
        return this.sSLId;
    }

    public void setsSLId(String sSLId) {
        this.sSLId = sSLId;
    }


}