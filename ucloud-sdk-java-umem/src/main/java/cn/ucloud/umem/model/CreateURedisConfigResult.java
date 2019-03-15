package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 创建URedis自定义配置文件 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class CreateURedisConfigResult extends BaseResponseResult {
            /**
            * 配置文件ID
            */
            @SerializedName("ConfigId")
                private String configId;


                public String getConfigId() {
                return this.configId;
                }

                public void setConfigId(String configId) {
                this.configId = configId;
                }


}