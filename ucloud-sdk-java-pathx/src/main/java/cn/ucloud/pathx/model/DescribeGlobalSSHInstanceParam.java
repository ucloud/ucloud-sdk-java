package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 获取GlobalSSH实例列表 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class DescribeGlobalSSHInstanceParam extends BaseRequestParam {
            /**
            * 实例ID，资源唯一标识
            */
            @UcloudParam("InstanceId")
                private String instanceId;


public DescribeGlobalSSHInstanceParam(                    String projectId
){
    super("DescribeGlobalSSHInstance");
                this.projectId = projectId;
}


                public String getInstanceId() {
                return this.instanceId;
                }

                public void setInstanceId(String instanceId) {
                this.instanceId = instanceId;
                }



}