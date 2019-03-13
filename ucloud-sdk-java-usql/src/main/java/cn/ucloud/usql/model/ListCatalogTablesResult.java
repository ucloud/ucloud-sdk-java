package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取数据库中所有表 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListCatalogTablesResult extends BaseResponseResult {
    /**
     * 请求ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * 数据表总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
    /**
     * 该数据库中数据表的集合
     */
    @SerializedName("Tables")
    private List<Tables> tables;


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


    public List<Tables> getTables() {
        return this.tables;
    }

    public void setTables(List<Tables> tables) {
        this.tables = tables;
    }


}