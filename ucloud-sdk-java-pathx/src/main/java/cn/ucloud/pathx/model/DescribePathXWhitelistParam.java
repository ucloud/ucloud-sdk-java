package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;


/**
 * @Description : 获取入口白名单列表 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DescribePathXWhitelistParam extends BaseRequestParam {
    /**
     * 实例ID, 不填返回项目下全部实例配置的白名单规则
     */
    @UcloudParam("InstanceId")
    private String instanceId;


    public DescribePathXWhitelistParam(String projectId
    ) {
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