package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 删除表 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class DeleteCatalogTableParam extends BaseRequestParam {
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
     * 所要删除的表名称
     */
    @UcloudParam("TableName")
    @NotEmpty(message = "tableName can not be empty")
    private String tableName;


    public DeleteCatalogTableParam(String region
            , String databaseName
            , String tableName
    ) {
        super("DeleteCatalogTable");
        this.region = region;
        this.databaseName = databaseName;
        this.tableName = tableName;
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

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


}