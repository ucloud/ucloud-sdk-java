package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 获取GlobalSSH覆盖的地区列表 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class DescribeGlobalSSHAreaParam extends BaseRequestParam {
            /**
            * 机房地域代号，如hk、 us-ca、 us-ws等。不填默认为空，返回所有支持地区。
            */
            @UcloudParam("Region")
                private String region;


public DescribeGlobalSSHAreaParam(){
    super("DescribeGlobalSSHArea");
}


                public String getRegion() {
                return this.region;
                }

                public void setRegion(String region) {
                this.region = region;
                }



}