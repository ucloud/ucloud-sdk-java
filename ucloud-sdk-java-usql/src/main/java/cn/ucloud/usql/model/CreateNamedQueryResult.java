package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 创建命名SQL查询 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class CreateNamedQueryResult extends BaseResponseResult {
    /**
     * API查询ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * 保存的SQL查询ID
     */
    @SerializedName("NamedQueryId")
    private String namedQueryId;
    /**
     * 保存的SQL查询名称
     */
    @SerializedName("QueryName")
    private String queryName;


    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getNamedQueryId() {
        return this.namedQueryId;
    }

    public void setNamedQueryId(String namedQueryId) {
        this.namedQueryId = namedQueryId;
    }

    public String getQueryName() {
        return this.queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }


}