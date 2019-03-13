package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 运行SQL查询 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class RunSQLQueryParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 数据库名称
     */
    @UcloudParam("DatabaseName")
    @NotEmpty(message = "databaseName can not be empty")
    private String databaseName;
    /**
     * SQL查询语句
     */
    @UcloudParam("QueryString")
    @NotEmpty(message = "queryString can not be empty")
    private String queryString;


    public RunSQLQueryParam(String region
            , String databaseName
            , String queryString
    ) {
        super("RunSQLQuery");
        this.region = region;
        this.databaseName = databaseName;
        this.queryString = queryString;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }


}