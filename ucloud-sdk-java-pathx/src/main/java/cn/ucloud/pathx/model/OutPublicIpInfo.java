package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 出口IP信息 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class OutPublicIpInfo  {
            /**
            * 
            */
            @SerializedName("IP")
                private String iP;
            /**
            * 
            */
            @SerializedName("Area")
                private String area;


                public String getIP() {
                return this.iP;
                }

                public void setIP(String iP) {
                this.iP = iP;
                }




                public String getArea() {
                return this.area;
                }

                public void setArea(String area) {
                this.area = area;
                }






}