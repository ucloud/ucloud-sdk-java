package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取数据表的参数列表 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListCatalogTablePropertiesResult extends BaseResponseResult {
    /**
     * API请求ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * 数据库名称
     */
    @SerializedName("DatabaseName")
    private String databaseName;
    /**
     * 数据表名称
     */
    @SerializedName("TableName")
    private String tableName;
    /**
     * 数据表属性列表
     */
    @SerializedName("TableProperties")
    private List<Property> tableProperties;


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

    public List<Property> getTableProperties() {
        return tableProperties;
    }

    public void setTableProperties(List<Property> tableProperties) {
        this.tableProperties = tableProperties;
    }
}