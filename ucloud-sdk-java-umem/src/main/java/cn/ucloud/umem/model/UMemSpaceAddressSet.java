package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : DescribeUMemSpace 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class UMemSpaceAddressSet  {
            /**
            * UMem实例访问IP
            */
            @SerializedName("IP")
                private String iP;
            /**
            * UMem实例访问Port
            */
            @SerializedName("Port")
                private Integer port;


                public String getiP() {
                return this.iP;
                }

                public void setiP(String iP) {
                this.iP = iP;
                }
                public Integer getPort() {
                return this.port;
                }

                public void setPort(Integer port) {
                this.port = port;
                }


}