package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;


/**
 * @Description : 获取全球加速服务加速配置信息 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DescribeUGAInstanceParam extends BaseRequestParam {
    /**
     * 全球加速实例ID
     */
    @UcloudParam("UGAAId")
    private String uGAAId;


    public DescribeUGAInstanceParam(String projectId
    ) {
        super("DescribeUGAInstance");
        this.projectId = projectId;
    }


    public String getuGAAId() {
        return this.uGAAId;
    }

    public void setuGAAId(String uGAAId) {
        this.uGAAId = uGAAId;
    }


}