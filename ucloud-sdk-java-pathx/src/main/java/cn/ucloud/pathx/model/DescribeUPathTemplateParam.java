package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 查询UPath的监控模板 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DescribeUPathTemplateParam extends BaseRequestParam {
    /**
     * 加速线路ID
     */
    @UcloudParam("UPathId")
    @NotEmpty(message = "uPathId can not be empty")
    private String uPathId;


    public DescribeUPathTemplateParam(String projectId
            , String uPathId
    ) {
        super("DescribeUPathTemplate");
        this.projectId = projectId;
        this.uPathId = uPathId;
    }


    public String getuPathId() {
        return this.uPathId;
    }

    public void setuPathId(String uPathId) {
        this.uPathId = uPathId;
    }


}