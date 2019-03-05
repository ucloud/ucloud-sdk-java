package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @Description : 获取UDB错误日志或慢查询日志 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 14:09
 **/
public class DescribeUDBInstanceLogResult extends BaseResponseResult {

    /**
     * 查询到的日志内容，一段纯文本
     */
    @SerializedName("Log")
    private String log;

    /**
     * 此次查询到的日志的下一个时间，用于下一次轮询时的BeginTime参数；如果日志查询结束则返回为空，前端结束查询
     */
    @SerializedName("NextTime")
    private String nextTime;

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getNextTime() {
        return nextTime;
    }

    public void setNextTime(String nextTime) {
        this.nextTime = nextTime;
    }

}
