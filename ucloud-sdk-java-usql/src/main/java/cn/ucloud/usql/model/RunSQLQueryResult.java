package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 运行SQL查询 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class RunSQLQueryResult extends BaseResponseResult {
    /**
     * API请求ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * 新建的SQL查询任务的ID
     */
    @SerializedName("QueryId")
    private String queryId;


    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getQueryId() {
        return this.queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }


}