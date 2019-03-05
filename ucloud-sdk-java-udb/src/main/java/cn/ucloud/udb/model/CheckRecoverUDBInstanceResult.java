package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 核查db是否可以使用回档功能 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 11:56
 **/
public class CheckRecoverUDBInstanceResult extends BaseResponseResult {

    /**
     * 核查db是否可以使用回档功能
     */
    @SerializedName("LastestTime")
    private Integer lastestTime;

    public Integer getLastestTime() {
        return lastestTime;
    }

    public void setLastestTime(Integer lastestTime) {
        this.lastestTime = lastestTime;
    }
}
