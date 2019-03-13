package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 增量插入白名单 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class InsertPathXWhitelistParam extends BaseRequestParam {
    /**
     * 实例ID，资源唯一标识
     */
    @UcloudParam("InstanceId")
    @NotEmpty(message = "instanceId can not be empty")
    private String instanceId;
    // TODO 需要人工接入 InsertPathXWhitelist =》 Whitelist.n


    public InsertPathXWhitelistParam(String projectId
            , String instanceId
    ) {
        super("InsertPathXWhitelist");
        this.projectId = projectId;
        this.instanceId = instanceId;
        // TODO 需要人工接入 InsertPathXWhitelist =》 Whitelist.n is required
    }


    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


}