package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 获取入口白名单列表 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class DescribePathXWhitelistParam extends BaseRequestParam {
            /**
            * 实例ID, 不填返回项目下全部实例配置的白名单规则
            */
            @UcloudParam("InstanceId")
                private String instanceId;


public DescribePathXWhitelistParam(                    String projectId
){
    super("DescribePathXWhitelist");
                this.projectId = projectId;
}


                public String getInstanceId() {
                return this.instanceId;
                }

                public void setInstanceId(String instanceId) {
                this.instanceId = instanceId;
                }



}