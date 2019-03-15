package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 获取苹果加速通道信息 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DescribeCommonUGAInstanceParam extends BaseRequestParam {
    /**
     * AppStore: 苹果审核加速, GlobalSSH: 全球运维通道
     */
    @UcloudParam("UGAType")
    @NotEmpty(message = "uGAType can not be empty")
    private String uGAType;
    /**
     * 全球加速实例ID
     */
    @UcloudParam("UGAId")
    private String uGAId;


    public DescribeCommonUGAInstanceParam(String projectId
            , String uGAType
    ) {
        super("DescribeCommonUGAInstance");
        this.projectId = projectId;
        this.uGAType = uGAType;
    }


    public String getuGAType() {
        return this.uGAType;
    }

    public void setuGAType(String uGAType) {
        this.uGAType = uGAType;
    }

    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }


}