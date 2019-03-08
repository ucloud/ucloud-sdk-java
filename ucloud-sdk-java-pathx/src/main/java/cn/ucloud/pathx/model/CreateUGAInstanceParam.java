package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 创建全球加速配置项 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class CreateUGAInstanceParam extends BaseRequestParam {
            /**
            * 加速实例名称
            */
            @UcloudParam("Name")
                    @NotEmpty(message = "name can not be empty")
                private String name;
            /**
            * 加速源IP，多个IP用逗号隔开(,)隔开;IPList和Domain二选一必填
            */
            @UcloudParam("IPList")
                private String iPList;
            /**
            * 加速源域名;IPList和Domain二选一必填
            */
            @UcloudParam("Domain")
                private String domain;
            // TODO 需要人工接入 CreateUGAInstance =》 TCP.n
            // TODO 需要人工接入 CreateUGAInstance =》 UDP.n
            // TODO 需要人工接入 CreateUGAInstance =》 HTTP.n
            // TODO 需要人工接入 CreateUGAInstance =》 HTTPS.n


public CreateUGAInstanceParam(                    String projectId
                    ,String name
){
    super("CreateUGAInstance");
                this.projectId = projectId;
                this.name = name;
}


                public String getName() {
                return this.name;
                }

                public void setName(String name) {
                this.name = name;
                }

                public String getIPList() {
                return this.iPList;
                }

                public void setIPList(String iPList) {
                this.iPList = iPList;
                }

                public String getDomain() {
                return this.domain;
                }

                public void setDomain(String domain) {
                this.domain = domain;
                }



}