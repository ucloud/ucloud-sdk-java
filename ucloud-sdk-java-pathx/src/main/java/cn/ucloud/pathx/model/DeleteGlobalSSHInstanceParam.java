package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 删除GlobalSSH实例 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class DeleteGlobalSSHInstanceParam extends BaseRequestParam {
            /**
            * 实例Id,资源的唯一标识
            */
            @UcloudParam("InstanceId")
                    @NotEmpty(message = "instanceId can not be empty")
                private String instanceId;


public DeleteGlobalSSHInstanceParam(                    String projectId
                    ,String instanceId
){
    super("DeleteGlobalSSHInstance");
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