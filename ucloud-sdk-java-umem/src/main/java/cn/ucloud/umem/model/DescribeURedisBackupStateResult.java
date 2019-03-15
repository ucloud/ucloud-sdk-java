package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 查询备份状态 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DescribeURedisBackupStateResult extends BaseResponseResult {
            /**
            * 备份状态
            */
            @SerializedName("State")
                private String state;


                public String getState() {
                return this.state;
                }

                public void setState(String state) {
                this.state = state;
                }


}