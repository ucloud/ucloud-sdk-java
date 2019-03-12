package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;


/**
 * @Description : 获取加速线路信息 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DescribeUPathParam extends BaseRequestParam {
    /**
     * 不填 返回所填项目下所有的线路资源，填写则返回一个线路实例
     */
    @UcloudParam("UPathId")
    private String uPathId;


    public DescribeUPathParam(String projectId
    ) {
        super("DescribeUPath");
        this.projectId = projectId;
    }


    public String getuPathId() {
        return this.uPathId;
    }

    public void setuPathId(String uPathId) {
        this.uPathId = uPathId;
    }


}