package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 修改GlobalSSH端口 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class ModifyGlobalSSHPortParam extends BaseRequestParam {
    /**
     * 实例ID,资源唯一标识
     */
    @UcloudParam("InstanceId")
    @NotEmpty(message = "instanceId can not be empty")
    private String instanceId;
    /**
     * 调整后的SSH登陆端口
     */
    @UcloudParam("Port")
    @NotNull(message = "port can not be null")
    private Integer port;


    public ModifyGlobalSSHPortParam(String projectId
            , String instanceId
            , Integer port
    ) {
        super("ModifyGlobalSSHPort");
        this.projectId = projectId;
        this.instanceId = instanceId;
        this.port = port;
    }


    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }


}