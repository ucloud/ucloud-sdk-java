package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 删除UPath 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class DeleteUPathParam extends BaseRequestParam {
            /**
            * 加速线路id
            */
            @UcloudParam("UPathId")
                    @NotEmpty(message = "uPathId can not be empty")
                private String uPathId;


public DeleteUPathParam(                    String projectId
                    ,String uPathId
){
    super("DeleteUPath");
                this.projectId = projectId;
                this.uPathId = uPathId;
}


                public String getUPathId() {
                return this.uPathId;
                }

                public void setUPathId(String uPathId) {
                this.uPathId = uPathId;
                }



}