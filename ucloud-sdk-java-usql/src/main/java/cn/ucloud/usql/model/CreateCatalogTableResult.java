package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;


/**
 * @Description : 创建表 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class CreateCatalogTableResult extends BaseResponseResult {
    /**
     * API请求的ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * 新数据表所属数据库名称
     */
    @SerializedName("DatabaseName")
    private String databaseName;
    /**
     * 新数据表的名称
     */
    @SerializedName("TableName")
    private String tableName;


    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


}