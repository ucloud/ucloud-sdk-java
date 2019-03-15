package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : DescribeURedisSlowlog 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class URedisSlowlogSet  {
            /**
            * 查询发生的时间
            */
            @SerializedName("StartTime")
                private Integer startTime;
            /**
            * 查询消耗的时间
            */
            @SerializedName("SpendTime")
                private Integer spendTime;
            /**
            * 查询命令
            */
            @SerializedName("Command")
                private String command;


                public Integer getStartTime() {
                return this.startTime;
                }

                public void setStartTime(Integer startTime) {
                this.startTime = startTime;
                }
                public Integer getSpendTime() {
                return this.spendTime;
                }

                public void setSpendTime(Integer spendTime) {
                this.spendTime = spendTime;
                }
                public String getCommand() {
                return this.command;
                }

                public void setCommand(String command) {
                this.command = command;
                }


}