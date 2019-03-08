package cn.ucloud.pathx.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 创建苹果审核加速通道 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class CreateCommonUGAInstanceResult extends BaseResponseResult {
            /**
            * 全球加速ID
            */
            @SerializedName("UGAId")
                private String uGAId;
            /**
            * 全球加速cname
            */
            @SerializedName("CName")
                private String cName;


                public String getUGAId() {
                return this.uGAId;
                }

                public void setUGAId(String uGAId) {
                this.uGAId = uGAId;
                }




                public String getCName() {
                return this.cName;
                }

                public void setCName(String cName) {
                this.cName = cName;
                }






}