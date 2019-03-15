package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 获取命名SQL查询 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetNamedQueryResult extends BaseResponseResult {
    /**
     * API请求ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * SQL查询名称
     */
    @SerializedName("QueryName")
    private String queryName;
    /**
     * SQL查询描述
     */
    @SerializedName("QueryDescription")
    private String queryDescription;
    /**
     * SQL查询语句
     */
    @SerializedName("QueryString")
    private String queryString;
    /**
     * SQL查询保存时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
    /**
     * SQL查询ID
     */
    @SerializedName("NamedQueryId")
    private Integer namedQueryId;


    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    public String getQueryDescription() {
        return this.queryDescription;
    }

    public void setQueryDescription(String queryDescription) {
        this.queryDescription = queryDescription;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getNamedQueryId() {
        return this.namedQueryId;
    }

    public void setNamedQueryId(Integer namedQueryId) {
        this.namedQueryId = namedQueryId;
    }


}