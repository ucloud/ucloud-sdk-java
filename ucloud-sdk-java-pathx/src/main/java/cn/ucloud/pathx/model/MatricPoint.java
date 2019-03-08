package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 某一时刻的监控数据 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class MatricPoint  {
            /**
            * 
            */
            @SerializedName("Timestamp")
                private Integer timestamp;
            /**
            * 
            */
            @SerializedName("Value")
                private Integer value;


                public Integer getTimestamp() {
                return this.timestamp;
                }

                public void setTimestamp(Integer timestamp) {
                this.timestamp = timestamp;
                }




                public Integer getValue() {
                return this.value;
                }

                public void setValue(Integer value) {
                this.value = value;
                }






}