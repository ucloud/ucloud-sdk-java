package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 获取SSL证书信息 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class DescribePathXSSLParam extends BaseRequestParam {
            /**
            * SSL证书的Id，不传获取项目下整个列表
            */
            @UcloudParam("SSLId")
                private String sSLId;


public DescribePathXSSLParam(                    String projectId
){
    super("DescribePathXSSL");
                this.projectId = projectId;
}


                public String getSSLId() {
                return this.sSLId;
                }

                public void setSSLId(String sSLId) {
                this.sSLId = sSLId;
                }



}