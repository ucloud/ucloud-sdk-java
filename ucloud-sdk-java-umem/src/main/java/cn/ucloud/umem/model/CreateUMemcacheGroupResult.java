package cn.ucloud.umem.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
* @Description : 创建单机Memcache 结果类
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class CreateUMemcacheGroupResult extends BaseResponseResult {
            /**
            * 创建的组ID
            */
            @SerializedName("GroupId")
                private String groupId;


                public String getGroupId() {
                return this.groupId;
                }

                public void setGroupId(String groupId) {
                this.groupId = groupId;
                }


}