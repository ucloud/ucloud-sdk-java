package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取历史SQL查询列表 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListSQLQueriesResult extends BaseResponseResult {
    /**
     * API请求ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * 历史SQL查询总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
    /**
     * SQL查询集合
     */
    @SerializedName("Queries")
    private List<QuerySummary> queries;


    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    public List<QuerySummary> getQueries() {
        return this.queries;
    }

    public void setQueries(List<QuerySummary> queries) {
        this.queries = queries;
    }


}