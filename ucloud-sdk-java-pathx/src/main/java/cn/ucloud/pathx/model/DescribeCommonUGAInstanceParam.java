package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 获取苹果加速通道信息 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
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


public DescribeCommonUGAInstanceParam(                    String projectId
                    ,String uGAType
){
    super("DescribeCommonUGAInstance");
                this.projectId = projectId;
                this.uGAType = uGAType;
}


                public String getUGAType() {
                return this.uGAType;
                }

                public void setUGAType(String uGAType) {
                this.uGAType = uGAType;
                }

                public String getUGAId() {
                return this.uGAId;
                }

                public void setUGAId(String uGAId) {
                this.uGAId = uGAId;
                }



}