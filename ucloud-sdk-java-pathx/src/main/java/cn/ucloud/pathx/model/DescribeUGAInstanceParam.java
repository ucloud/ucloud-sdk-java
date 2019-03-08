package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 获取全球加速服务加速配置信息 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class DescribeUGAInstanceParam extends BaseRequestParam {
            /**
            * 全球加速实例ID
            */
            @UcloudParam("UGAAId")
                private String uGAAId;


public DescribeUGAInstanceParam(                    String projectId
){
    super("DescribeUGAInstance");
                this.projectId = projectId;
}


                public String getUGAAId() {
                return this.uGAAId;
                }

                public void setUGAAId(String uGAAId) {
                this.uGAAId = uGAAId;
                }



}