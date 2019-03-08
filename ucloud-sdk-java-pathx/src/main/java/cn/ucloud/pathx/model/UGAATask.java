package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 用户在UGAA实例下配置的多端口任务 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class UGAATask  {
            /**
            * 端口
            */
            @SerializedName("Port")
                private Integer port;
            /**
            * 协议Tcp/Udp
            */
            @SerializedName("Protocol")
                private String protocol;


                public Integer getPort() {
                return this.port;
                }

                public void setPort(Integer port) {
                this.port = port;
                }




                public String getProtocol() {
                return this.protocol;
                }

                public void setProtocol(String protocol) {
                this.protocol = protocol;
                }






}