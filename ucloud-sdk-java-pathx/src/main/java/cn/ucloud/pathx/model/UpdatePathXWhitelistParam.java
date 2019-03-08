package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 添加或更新入口白名单 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class UpdatePathXWhitelistParam extends BaseRequestParam {
            /**
            * 实例ID，资源唯一标识
            */
            @UcloudParam("InstanceId")
                    @NotEmpty(message = "instanceId can not be empty")
                private String instanceId;
            // TODO 需要人工接入 UpdatePathXWhitelist =》 Whitelist.n


public UpdatePathXWhitelistParam(                    String projectId
                    ,String instanceId
){
    super("UpdatePathXWhitelist");
                this.projectId = projectId;
                this.instanceId = instanceId;
}


                public String getInstanceId() {
                return this.instanceId;
                }

                public void setInstanceId(String instanceId) {
                this.instanceId = instanceId;
                }



}