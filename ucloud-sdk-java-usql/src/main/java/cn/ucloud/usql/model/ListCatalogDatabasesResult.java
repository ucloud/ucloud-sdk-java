package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取数据库列表 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListCatalogDatabasesResult extends BaseResponseResult {
    /**
     * 请求ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * 数据库总数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;
    /**
     * 数据库名称列表
     */
    @SerializedName("DatabaseNames")
    private List<String> databaseNames;


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

    public List<String> getDatabaseNames() {
        return this.databaseNames;
    }

    public void setDatabaseNames(List<String> databaseNames) {
        this.databaseNames = databaseNames;
    }


}