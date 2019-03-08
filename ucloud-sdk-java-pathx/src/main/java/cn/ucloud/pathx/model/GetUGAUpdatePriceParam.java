package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
* @Description : 获取UGA更新价格 参数类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class GetUGAUpdatePriceParam extends BaseRequestParam {
            /**
            * 
            */
            @UcloudParam("UPathNum")
                    @NotNull(message ="uPathNum can not be null")
                private Integer uPathNum;
            /**
            * 
            */
            @UcloudParam("ResourceId")
                private String resourceId;


public GetUGAUpdatePriceParam(                    String projectId
                    ,Integer uPathNum
){
    super("GetUGAUpdatePrice");
                this.projectId = projectId;
                this.uPathNum = uPathNum;
}


                public Integer getUPathNum() {
                return this.uPathNum;
                }

                public void setUPathNum(Integer uPathNum) {
                this.uPathNum = uPathNum;
                }

                public String getResourceId() {
                return this.resourceId;
                }

                public void setResourceId(String resourceId) {
                this.resourceId = resourceId;
                }



}