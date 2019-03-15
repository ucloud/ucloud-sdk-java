package cn.ucloud.usql.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 创建数据库 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class CreateCatalogDatabaseParam extends BaseRequestParam {
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
     * 数据库描述
     */
    @UcloudParam("DatabaseDescription")
    private String databaseDescription;


    public CreateCatalogDatabaseParam(String region
            , String databaseName
    ) {
        super("CreateCatalogDatabase");
        this.region = region;
        this.databaseName = databaseName;
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

    public String getDatabaseDescription() {
        return this.databaseDescription;
    }

    public void setDatabaseDescription(String databaseDescription) {
        this.databaseDescription = databaseDescription;
    }


}