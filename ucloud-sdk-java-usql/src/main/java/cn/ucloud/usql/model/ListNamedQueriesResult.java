package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取命名查询列表 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListNamedQueriesResult extends BaseResponseResult {
    /**
     * API请求ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * 保存的SQL查询总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
    /**
     * 保存的SQL查询集合
     */
    @SerializedName("NamedQueries")
    private List<NamedQuery> namedQueries;


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


    public List<NamedQuery> getNamedQueries() {
        return this.namedQueries;
    }

    public void setNamedQueries(List<NamedQuery> namedQueries) {
        this.namedQueries = namedQueries;
    }


}