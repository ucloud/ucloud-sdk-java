package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 删除苹果加速通道 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DeleteCommonUGAInstanceParam extends BaseRequestParam {
    /**
     * 全球加速实例ID
     */
    @UcloudParam("UGAId")
    @NotEmpty(message = "uGAId can not be empty")
    private String uGAId;
    /**
     * AppStore: 苹果审核加速, GlobalSSH: 全球运维通道
     */
    @UcloudParam("UGAType")
    @NotEmpty(message = "uGAType can not be empty")
    private String uGAType;


    public DeleteCommonUGAInstanceParam(String projectId
            , String uGAId
            , String uGAType
    ) {
        super("DeleteCommonUGAInstance");
        this.projectId = projectId;
        this.uGAId = uGAId;
        this.uGAType = uGAType;
    }


    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }

    public String getuGAType() {
        return this.uGAType;
    }

    public void setuGAType(String uGAType) {
        this.uGAType = uGAType;
    }


}