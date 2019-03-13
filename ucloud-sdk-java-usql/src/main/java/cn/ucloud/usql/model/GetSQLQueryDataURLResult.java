package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 获取SQL查询结果下载地址 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetSQLQueryDataURLResult extends BaseResponseResult {
    /**
     * API请求ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * SQL查询ID
     */
    @SerializedName("QueryId")
    private String queryId;
    /**
     * SQL查询结果下载URL地址
     */
    @SerializedName("QueryDataURL")
    private String queryDataURL;


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

    public String getQueryDataURL() {
        return this.queryDataURL;
    }

    public void setQueryDataURL(String queryDataURL) {
        this.queryDataURL = queryDataURL;
    }


}