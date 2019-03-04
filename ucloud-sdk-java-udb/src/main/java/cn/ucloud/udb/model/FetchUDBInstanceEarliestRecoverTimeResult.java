package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 获取UDB最早可回档的时间点 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 17:26
 **/
public class FetchUDBInstanceEarliestRecoverTimeResult extends BaseResponseResult {

    /**
     * 获取最早可回档时间点
     */
    @SerializedName("EarliestTime")
    private Integer earliestTime;

    public Integer getEarliestTime() {
        return earliestTime;
    }

    public void setEarliestTime(Integer earliestTime) {
        this.earliestTime = earliestTime;
    }

    @Override
    public String toString() {
        return "FetchUDBInstanceEarliestRecoverTimeResult{" +
                "earliestTime=" + earliestTime +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
