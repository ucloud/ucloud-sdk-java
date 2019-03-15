package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : DescribeUMemcacheVersion 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class UMemcacheVersionSet  {
            /**
            * Memcached版本
            */
            @SerializedName("Version")
                private String version;


                public String getVersion() {
                return this.version;
                }

                public void setVersion(String version) {
                this.version = version;
                }


}