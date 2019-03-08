package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 创建UPath 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class CreateUPathResult extends BaseResponseResult {
            /**
            * 加速线路Id
            */
            @SerializedName("UPathId")
                private String uPathId;


                public String getUPathId() {
                return this.uPathId;
                }

                public void setUPathId(String uPathId) {
                this.uPathId = uPathId;
                }






}