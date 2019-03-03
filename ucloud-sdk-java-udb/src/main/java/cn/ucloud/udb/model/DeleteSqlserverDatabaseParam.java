package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 删除sqlserver高可用镜像数据库 参数类
 * @Author : codezhang
 * @Date : 2019-03-03 15:07
 **/
public class DeleteSqlserverDatabaseParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * DB实例Id,该值可以通过DescribeUDBInstance获取
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * sqlserver创建数据库的名字
     */
    @NotEmpty(message = "dbName can not be empty")
    @UcloudParam("DBName")
    private String dbName;

    public DeleteSqlserverDatabaseParam(@NotEmpty(message = "region can not be empty") String region,
                                        @NotEmpty(message = "dbId can not be empty") String dbId,
                                        @NotEmpty(message = "dbName can not be empty") String dbName) {
        super("DeleteSqlserverDatabase");
        this.region = region;
        this.dbId = dbId;
        this.dbName = dbName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String toString() {
        return "DeleteSqlserverDatabaseParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbId='" + dbId + '\'' +
                ", dbName='" + dbName + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
