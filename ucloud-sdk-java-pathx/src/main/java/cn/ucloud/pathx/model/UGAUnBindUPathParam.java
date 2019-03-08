package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : UGA与UPath解绑 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class UGAUnBindUPathParam extends BaseRequestParam {
            /**
            * UGA ID
            */
            @UcloudParam("UGAId")
                    @NotEmpty(message = "uGAId can not be empty")
                private String uGAId;
            /**
            * 加速线路id
            */
            @UcloudParam("UPathId")
                    @NotEmpty(message = "uPathId can not be empty")
                private String uPathId;


public UGAUnBindUPathParam(                    String projectId
                    ,String uGAId
                    ,String uPathId
){
    super("UGAUnBindUPath");
                this.projectId = projectId;
                this.uGAId = uGAId;
                this.uPathId = uPathId;
}


                public String getUGAId() {
                return this.uGAId;
                }

                public void setUGAId(String uGAId) {
                this.uGAId = uGAId;
                }

                public String getUPathId() {
                return this.uPathId;
                }

                public void setUPathId(String uPathId) {
                this.uPathId = uPathId;
                }



}