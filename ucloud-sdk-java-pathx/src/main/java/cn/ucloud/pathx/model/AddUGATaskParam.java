package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 添加加速配置端口 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class AddUGATaskParam extends BaseRequestParam {
            /**
            * 全球加速实例ID
            */
            @UcloudParam("UGAId")
                    @NotEmpty(message = "uGAId can not be empty")
                private String uGAId;
            // TODO 需要人工接入 AddUGATask =》 TCP.n
            // TODO 需要人工接入 AddUGATask =》 UDP.n
            // TODO 需要人工接入 AddUGATask =》 HTTP.n
            // TODO 需要人工接入 AddUGATask =》 HTTPS.n


public AddUGATaskParam(                    String projectId
                    ,String uGAId
){
    super("AddUGATask");
                this.projectId = projectId;
                this.uGAId = uGAId;
}


                public String getUGAId() {
                return this.uGAId;
                }

                public void setUGAId(String uGAId) {
                this.uGAId = uGAId;
                }



}