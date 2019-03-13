package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取SQL查询结果 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetSQLQueryDataResult extends BaseResponseResult {
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
     * 下一批数据记录的偏移位置
     */
    @SerializedName("Marker")
    private String marker;
    /**
     * 结果数据的字段列表，类型是字符串的集合
     */
    @SerializedName("Header")
    private List<String> header;
    /**
     * 结果数据集合， 数组中每一项代表1条记录。
     */
    @SerializedName("Rows")
    private List<String> rows;
    /**
     * 查询类型，有SELECT， CREATE_TABLE等多种SQL类型
     */
    @SerializedName("QueryType")
    private String queryType;


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

    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public List<String> getHeader() {
        return this.header;
    }

    public void setHeader(List<String> header) {
        this.header = header;
    }

    public List<String> getRows() {
        return this.rows;
    }

    public void setRows(List<String> rows) {
        this.rows = rows;
    }

    public String getQueryType() {
        return this.queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }


}