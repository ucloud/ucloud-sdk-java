package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 实例白名单规则 模型类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class InstanceWhitelist  {
            /**
            * 实例ID
            */
            @SerializedName("InstanceId")
                private String instanceId;
            /**
            * 白名单规则列表
            */
            @SerializedName("RuleSet")
                private List<Whitelist> ruleSet;


                public String getInstanceId() {
                return this.instanceId;
                }

                public void setInstanceId(String instanceId) {
                this.instanceId = instanceId;
                }






}