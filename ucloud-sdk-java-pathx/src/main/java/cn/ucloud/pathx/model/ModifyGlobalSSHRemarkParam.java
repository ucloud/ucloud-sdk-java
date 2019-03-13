package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 修改GlobalSSH备注 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class ModifyGlobalSSHRemarkParam extends BaseRequestParam {
    /**
     * 实例ID,资源唯一标识
     */
    @UcloudParam("InstanceId")
    @NotEmpty(message = "instanceId can not be empty")
    private String instanceId;
    /**
     * 备注信息，不填默认为空字符串
     */
    @UcloudParam("Remark")
    private String remark;


    public ModifyGlobalSSHRemarkParam(String projectId
            , String instanceId
    ) {
        super("ModifyGlobalSSHRemark");
        this.projectId = projectId;
        this.instanceId = instanceId;
    }


    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}